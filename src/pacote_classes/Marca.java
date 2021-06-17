package pacote_classes;

import Validations.TypeValidations;

public class Marca{
	
	private int id;
	private String descricao;
	private  int cont = 0;
	

	





	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = cont++;
	}




	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) throws Exception {
		if(!TypeValidations.validString(descricao)) {
			throw new Exception("A descricao esta em formato invalido.");
		} else {
			this.descricao = descricao;
		}
	}



	@Override
	public String toString() {
		return "Id Marca=" + id + "\tDescricao Marca=" + descricao;
	}




	
	
	

}
