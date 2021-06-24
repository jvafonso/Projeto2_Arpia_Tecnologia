package pacote_classes;

import Validations.TypeValidations;
import exceptions.RegraException;

public class Produto{
	
	private int id;
	private String descricaoProd;
	private Double valor;
	private Double desconto;
	private Marca marca;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	

	public void setDescricaoProd(String descricaoProd){
		if(!TypeValidations.validString(descricaoProd)) {
			throw new RegraException("Descricao do produto em formato invalido.");
		} else {
			this.descricaoProd = descricaoProd;
		}
	}

	public String getDescricaoProd() {
		return descricaoProd;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		if(!TypeValidations.validDouble(valor)) {
			throw new RegraException("Um produto nao pode ter valor 0.");
		} else {
			if (getDesconto() != 0.00) {
					this.valor = valor - getDesconto();
			} else {
				this.valor = valor;
			}
		}
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}


	public Marca getMarca() {
		return this.marca == null ? new Marca() : this.marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public String printProduto() {
		return "Id:" + id + "\t  Produto:" + descricaoProd + "\nValor:" + valor + "\t  Desconto aplicado:" + desconto
				+ "\nMarca:" + marca.getDescricao();
	}
	
	
	
	
	
	

}
