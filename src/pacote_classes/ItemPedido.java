package pacote_classes;

import Validations.TypeValidations;
import exceptions.*;
import tratamentosArray.TratamentosProdutos;

public class ItemPedido {
	
	private int id;
	private int idProduto;
	private int quantidade;
	private Double valor;
	private Double desconto;
	private int cont = 0;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = cont++;
	}
	
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		if(!TratamentosProdutos.verificaProduto(idProduto)) {
			throw new ProdutoException();
		} else {
			this.idProduto = idProduto;
		}
	}
	

	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		if(!TypeValidations.validInt(quantidade)) {
			throw new InvalidNumberException();
		} else {
			this.quantidade = quantidade;
		}
	}
	
	
	public Double getValor() {
		return valor;
	}
	public void setValor() {
		this.valor = TratamentosProdutos.buscaProduto(getIdProduto()).getValor() * getQuantidade();
	}
	public Double getDesconto() {
		return desconto;
	}
	public void setDesconto(Double desconto) {
			this.desconto = desconto;
	}
	
	public double valorItem() {
		if (getDesconto() != 0.00) {
			return (getValor() - getDesconto());
		}
		return getValor();
	}
	
	private String nomeProd = TratamentosProdutos.buscaProduto(getIdProduto()).getDescricaoProd();
	private Double valorProd = TratamentosProdutos.buscaProduto(getIdProduto()).getValor();
	
	public String printItemPedido() {
		return "" + getId() + "/t" + nomeProd + "/t" +getQuantidade() + "/t" + valorProd + "/t" + getDesconto() + "/t" + valorItem();
	}
	
	
	
	
	
	
	
	
	
	
	

}