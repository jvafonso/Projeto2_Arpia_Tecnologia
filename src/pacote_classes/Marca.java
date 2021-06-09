package pacote_classes;

public class Marca {
	
	protected int id_marca;
	protected String descricao;
	private static int cont = 0;
	
	

	public Marca(String descricao) throws Exception {
		// TODO Auto-generated constructor stub
		this.setId_marca(id_marca);
		this.setDescricao(descricao);
		
	}



	public int getId_marca() {
		return id_marca;
	}



	public void setId_marca(int id_marca) {
		this.id_marca = cont++;
	}




	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) throws Exception {
		if(descricao.isEmpty() || descricao.isBlank() || descricao == null) {
			throw new Exception("A descricao esta em formato invalido.");
		} else {
			this.descricao = descricao;
		}
	}



	@Override
	public String toString() {
		return "Marca [id_marca=" + id_marca + ", descricao=" + descricao + "]";
	}
	
	
	

}
