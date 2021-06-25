package pacote_classes;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Validations.DoubleFormatValidation;
import enums.statusPedido;
import exceptions.*;
import tratamentosArray.TratamentosCliente;

public class Pedido {
	
	private int id;
	private statusPedido status;
	private int idCliente;
	private Double desconto;
	private Double valorTotal;
	private Double frete;
	
	static int cont = 1;
	
	private List<ItemPedido> listaItemPedido = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

	public statusPedido getStatus() {
		return status;
	}

	public void setStatus() {
		this.status = statusPedido.AGUARDANDO_APROVACAO;
	}
	
	public void mudarStatus (String novoStatus) {
		if(novoStatus.equals("1")) {
			this.status = statusPedido.FINALIZADO;
		} else if(novoStatus.equals("2")) {
			this.status = statusPedido.APROVADO;
		} else if(novoStatus.equals("3")) {
			this.status = statusPedido.AGUARDANDO_APROVACAO;
		} else {
			throw new StatusException();
		}
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		if(!TratamentosCliente.verificaCliente(idCliente)) {
			throw new ClienteException();
		} else {
			this.idCliente = idCliente;
		}
	}
	
	
	public void adicionaItem() {
		
		var idProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id do produto a ser adicionado: "));
		var quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quabtidade do produto: "));
		Double descontoItem = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o desconto relacionado a esse item se houver: "));
		
		var item = new ItemPedido();
		item.setId(cont);
		cont++;
		
		item.setIdProduto(idProduto);
		item.setQuantidade(quantidade);
		item.setDesconto(descontoItem);
		
		listaItemPedido.add(item);
	}
	
	public void uptadeItem(int idItem) {
		for(ItemPedido ip : listaItemPedido) {
			if(ip.getId() == idItem) {
				var idProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o id do produto a ser adicionado: "));
				var quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quabtidade do produto: "));
				Double descontoItem = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o desconto relacionado a esse item se houver: "));
				
				ip.setIdProduto(idProduto);
				ip.setQuantidade(quantidade);
				ip.setDesconto(descontoItem);
				
			} else {
				throw new ProdutoException();
			}
		}
	}
	
	public void deletaItem(int idItem) {
		for(ItemPedido ip : listaItemPedido) {
			if(ip.getId() == idItem) {
				listaItemPedido.remove(ip);
			} else {
				throw new ProdutoException();
			}
		}
	}
	

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	
	

	public Double getValorTotal() {
		Double valorParcial = 0.00;
		if(getDesconto() != 0.00) {
			for(ItemPedido ip : listaItemPedido) {
				valorParcial = valorParcial + ip.valorItem();
			}
			valorParcial = valorParcial - getDesconto();
			this.valorTotal = valorParcial + getFrete(valorParcial);
		} else {
			for(ItemPedido ip : listaItemPedido) {
				valorParcial = valorParcial + ip.valorItem();
			}
			this.valorTotal = valorParcial + getFrete(valorParcial);
		}
		return valorTotal;
	}
	

	public Double getFrete(Double valorParcial) {
		if(TratamentosCliente.getCliente(getIdCliente()).getUf().equalsIgnoreCase("mg")) {
			this.frete = (valorParcial * 1.3) - valorParcial;
		} else if(TratamentosCliente.getCliente(getIdCliente()).getUf().equalsIgnoreCase("go")) {
			this.frete = (valorParcial * 1.1) - valorParcial;
		} else if(TratamentosCliente.getCliente(getIdCliente()).getUf().equalsIgnoreCase("to")) {
			this.frete = (valorParcial * 1.5) - valorParcial;
		} else {
			throw new FreteException();
		}
		return frete;
	}
	
	
	
	public void setListaItemPedido() {
		this.listaItemPedido = null;
	}

	public List<ItemPedido> getListaItemPedido() {
		return listaItemPedido;
	}

	public String printListaItem() {
		var liT = new StringBuilder();
		for(ItemPedido ip : listaItemPedido) {
			liT.append("\n"+ ip.printItemPedido());
		}
		return liT.toString();
	}
	
	
	public String printPedido() {
		return "Pedido: " + getId() + "\n" +TratamentosCliente.getCliente(getIdCliente()).printCliente() +
				"\nStatus: " + getStatus() + "\t  Valor Total:" + DoubleFormatValidation.doubleFormat(getValorTotal()) + "\nDesconto: " + getDesconto() +
				"\t  Frete: " + DoubleFormatValidation.doubleFormat(this.frete) + "\nLista de Item do pedido:" + "\nID  /tNome do Produdo  /tQuantidade  /tValor  /tDesconto  /tValorTotal" + 
				"\n" + printListaItem();
	}
	
	
	

}
