package tratamentosArray;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import exceptions.InvalidNumberException;
import exceptions.RegraException;
import pacote_classes.Cliente;

public class TratamentosCliente {
	
	
	private TratamentosCliente() {}
	
	public static final List<Cliente> listaClientes = new ArrayList<>();
	
	
	private static String  fraseErro = "Cliente não existe.";
	
	public static List<Cliente> getListaClientes(){
		
		return listaClientes;
	}
	
	public static void imprimeListaCliente() {
		for(Cliente clientes : listaClientes) {
			JOptionPane.showMessageDialog(null, clientes.printCliente(), "Dados dos Clientes", JOptionPane.INFORMATION_MESSAGE);
		}
	}


	public static void insertCliente() {
		String razaoSocial = JOptionPane.showInputDialog(null, "Digite a razao social do cliente:");
		String fantasia = JOptionPane.showInputDialog(null, "Digite o nome fantasia do cliente caso houver:");
		String logradouro = JOptionPane.showInputDialog(null, "Digite a cidade do cliente:");
		var numero = JOptionPane.showInputDialog(null, "Digite o numero da residencia do cliente:");
		int numeroK;
		if(numero.matches("[0-9]*")) {
			 numeroK = Integer.parseInt(numero);
			
		} else {
			throw new InvalidNumberException();
		}
		
		String quadra = JOptionPane.showInputDialog(null, "Digite a quadra do cliente:");
		String lote = JOptionPane.showInputDialog(null, "Digite o lote do cliente:");
		String bairro = JOptionPane.showInputDialog(null, "Digite o bairro do cliente:");
		String uf = JOptionPane.showInputDialog(null, "Digite a UF do estado do cliente:");
		
		var cliente = new Cliente(razaoSocial, fantasia, logradouro, numeroK, quadra, lote, bairro, uf);
		
		listaClientes.add(cliente);
		
	}
	
	
	public static void deleteCliente(int idCl){
		
		if(!TratamentosPedidos.verificaClientePedido(idCl)) {
			listaClientes.remove(getCliente(idCl));
		} else {
			throw new RegraException("So e possivel apagar um cliente que nao possui pedidos relacionados.");
		}
	
	}
	
	public static void uptadeCliente(int idCl){
				Cliente cl;
				cl = getCliente(idCl);
				
				
				String razaoSocial = JOptionPane.showInputDialog(null, "Digite a nova razao social do cliente:");
				String fantasia = JOptionPane.showInputDialog(null, "Digite o novo nome fantasia do cliente caso houver:");
				String logradouro = JOptionPane.showInputDialog(null, "Digite a nova cidade do cliente:");
				var numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o  novo numero da residencia do cliente:"));
				String quadra = JOptionPane.showInputDialog(null, "Digite a nova quadra do cliente:");
				String lote = JOptionPane.showInputDialog(null, "Digite o novo lote do cliente:");
				String bairro = JOptionPane.showInputDialog(null, "Digite o novo bairro do cliente:");
				String uf = JOptionPane.showInputDialog(null, "Digite a nova UF do estado do cliente:");
				
				cl.setRazaoSocial(razaoSocial);
				cl.setFantasia(fantasia);
				cl.setLogradouro(logradouro);
				cl.setNumero(numero);
				cl.setQuadra(quadra);
				cl.setLote(lote);
				cl.setBairro(bairro);
				cl.setUf(uf);
		
		
		
	}
	
	public static String showCliente(int idCl) {
		for(Cliente cl : listaClientes) {
			if(cl.getId_cliente() == idCl) {
				return cl.printCliente();
			} 
		}
		throw new RegraException (fraseErro);
		
	}
	
	public static Cliente getCliente(int idCl) {
		for(Cliente cl : listaClientes) {
			if(cl.getId_cliente() == idCl) {
				return cl;
			} 
		}
		throw new RegraException (fraseErro);
		
	}
	public static boolean verificaCliente(int idCl) {
		for(Cliente cl : listaClientes) {
			if(cl.getId_cliente() == idCl) {
				return true;
			} 
		}
		return false;
	}
}
