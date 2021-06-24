package tratamentosArray;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import enums.statusPedido;
import exceptions.PedidoException;
import exceptions.RegraException;
import pacote_classes.Pedido;

public class TratamentosPedidos {
	
	static int cont = 0;
	private TratamentosPedidos() {}
	
	public static final List<Pedido> listaPedidos = new ArrayList<>();
	
	public static List<Pedido> getListaPedidos() {
		return listaPedidos;
	}
	
	public static void imprimirListaPedidos() {
		for(Pedido pedidos : listaPedidos) {
			JOptionPane.showMessageDialog(null, pedidos.printPedido(), "Dados do Pedido", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public static void insertPedido() {
		var idCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id do cliente relacionado ao pedido: "));
		Double desconto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o desconto do pedido:"));
		
		var pedido = new Pedido();
		pedido.setId(cont);
		cont++;
		pedido.setIdCliente(idCliente);
		pedido.setDesconto(desconto);
		pedido.setStatus();
		
	
		
		listaPedidos.add(pedido);
	}
	
	public static Pedido buscaPedido(int idPedido) {
		for(Pedido pedidos : listaPedidos) {
			if(pedidos.getId() == idPedido) {
				return pedidos;
			}
		}
		throw new PedidoException();
	}
	
	public static boolean verificaPedido(int idPedido) {
		for(Pedido pedidos : listaPedidos) {
			if(pedidos.getId() == idPedido) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean verificaClientePedido(int idCliente) {
		for(Pedido pedidos : listaPedidos) {
			if(pedidos.getIdCliente() == idCliente) {
				return true;
			}
		}
		return false;
	}
	
	
	
	public static void updatePedido(int idPedido){
		Pedido pedido;
		pedido = buscaPedido(idPedido);
		
		if(pedido.getStatus() != statusPedido.FINALIZADO) {
			var idCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o novo id de cliente relacionado ao pedido: "));
			Double desconto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o novo desconto do pedido:"));
			
			pedido.setIdCliente(idCliente);
			pedido.setDesconto(desconto);
			pedido.setStatus();
			pedido.getListaItemPedido().clear();
		} else {
			throw new RegraException("Nao se pode atualizar um pedido ja finalizado.");
		}
		
	}
	
	public static void updateStatus(int idPedido) {
		var pedido = buscaPedido(idPedido);
		String novoStatus = JOptionPane.showInputDialog(null, "1 - Alterar status para Finalizado\n2 - Alterar status para Aprovado\n3 - Alterar status para Aguardando Aprovacao");
		pedido.mudarStatus(novoStatus);
		
	}
	
	public static void deletePedido(int idPedido) {
		var pedido = buscaPedido(idPedido);
		if(!pedido.getStatus().equals(statusPedido.FINALIZADO)) {
			throw new RegraException("Somente pedidos finalizados podem ser deletados.\nAltere o status do mesmo");
		} else {
			listaPedidos.remove(pedido);
		}
	}
	
	
	public static void adicionaItem(int idPedido) {
		var pedido = buscaPedido(idPedido);
		pedido.adicionaItem();
		
	}
	
	public static void updateItem(int idPedido) {
		var idItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id do item do pedido a ser atualizado: "));
		var pedido = buscaPedido(idPedido);
		pedido.uptadeItem(idItem);
	}
	
	public static void deletaItem(int idPedido) {
		var idItem = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id do item do pedido a ser apagado: "));
		var pedido = buscaPedido(idPedido);
		pedido.deletaItem(idItem);
	}
	
	
	

}
