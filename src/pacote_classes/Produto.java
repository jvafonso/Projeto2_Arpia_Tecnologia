package pacote_classes;

import Validations.TypeValidations;
import exceptions.RegraException;

public class Produto{
	
	private int id;
	private String descricaoProd;
	private Double valor;
	private Double desconto;
	private Marca marca;
	private int cont = 0;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = cont++;
	}

	

	

	public void setDescricaoProd(String descricaoProd){
		if(!TypeValidations.validString(descricaoProd)) {
			throw new RegraException("Descricao do produto em formato invalido.");
		} else {
			this.descricaoProd = descricaoProd;
		}
		this.descricaoProd = descricaoProd;
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
				this.valor = valor - (valor*getDesconto());
			} else {
				this.valor = valor;
			}
		}
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto/100;
	}


	public Marca getMarca() {
		return this.marca == null ? new Marca() : this.marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Produto: Id:" + id + "/nNome Produto:" + descricaoProd + "/nValor:" + valor + "/ndesconto aplicado:" + desconto
				+ "/nMarca:" + marca;
	}
	
	
	
	
	
	

}
