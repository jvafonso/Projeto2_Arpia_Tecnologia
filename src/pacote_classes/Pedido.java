package pacote_classes;

import java.util.ArrayList;
import java.util.List;

import enums.statusPedido;
import exceptions.*;
import tratamentosArray.TratamentosCliente;

public class Pedido {
	
	private int id;
	private int cont = 0;
	private statusPedido status;
	private int idCliente;
	private Double desconto;
	private Double valorTotal;
	private Double frete;
	
	private List<ItemPedido> listaItemPedido = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = cont++;
	}

	public statusPedido getStatus() {
		return status;
	}

	public void setStatus() {
		this.status = statusPedido.AGUARDANDO_APROVACAO;
	}
	
	public void mudarStatus (String novoStatus) {
		if(novoStatus.equalsIgnoreCase("aguardando_aprovacao")) {
			this.status = statusPedido.AGUARDANDO_APROVACAO;
		} else if(novoStatus.equalsIgnoreCase("aprovado")) {
			this.status = statusPedido.APROVADO;
		} else if(novoStatus.equalsIgnoreCase("finalizado")) {
			this.status = statusPedido.FINALIZADO;
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
	
	
	public void adicionaItem(int idProd, int quantidade, Double descontoItem) {
		var item = new ItemPedido();
		item.setIdProduto(idProd);
		item.setQuantidade(quantidade);
		item.setDesconto(descontoItem);
		
		listaItemPedido.add(item);
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
			this.valorTotal = valorParcial + ((valorParcial*getFrete())/10);
		} else {
			for(ItemPedido ip : listaItemPedido) {
				valorParcial = valorParcial + ip.valorItem();
			}
			this.valorTotal = valorParcial + ((valorParcial*getFrete())/10);
		}
		return valorTotal;
	}
	

	public Double getFrete() {
		if(TratamentosCliente.getCliente(getIdCliente()).getUf().equalsIgnoreCase("mg")) {
			this.frete = 1.3;
		} else if(TratamentosCliente.getCliente(getIdCliente()).getUf().equalsIgnoreCase("go")) {
			this.frete = 1.1;
		} else if(TratamentosCliente.getCliente(getIdCliente()).getUf().equalsIgnoreCase("to")) {
			this.frete = 1.5;
		} else {
			throw new FreteException();
		}
		return frete;
	}
	
	
	
	
	
	
	

}
