package pacote_classes;

public class Enderecos extends Estados{
	
	protected int id_endereco;
	protected String logradouro;
	protected int numero;
	protected String quadra;
	protected String lote;
	protected String bairro;
	private static int cont = 0;
	

	public Enderecos(String uf, String logradouro, int numero, String quadra, String lote, String bairro) throws Exception {
		// TODO Auto-generated constructor stub
		super(uf);
		
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) throws Exception {
		if(logradouro.isEmpty() || logradouro.isBlank() || logradouro == null) {
			throw new Exception("O logradouro informado eh invalido.");
		} else {
			this.logradouro = logradouro;
		}
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) throws Exception {
		if(numero == 0) {
			throw new Exception("O numero informado eh invalido.");
		} else {
			this.numero = numero;
		}
	}


	public String getQuadra() {
		return quadra;
	}


	public void setQuadra(String quadra) throws Exception {
		if(quadra.isEmpty() || quadra.isBlank() || quadra == null) {
			throw new Exception("A quadra informada eh invalida.");
		} else {
			this.quadra = quadra;
		}
	}


	public String getLote() {
		return lote;
	}


	public void setLote(String lote) throws Exception {
		if(lote.isEmpty() || lote.isBlank() || lote == null) {
			throw new Exception("O lote informado eh invalido.");
		} else {
			this.lote = lote;
		}
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) throws Exception {
		if(bairro.isEmpty() || bairro.isBlank() || bairro == null) {
			throw new Exception("O bairro informado eh invalido.");
		} else {
			this.bairro = bairro;
		}
	}


	public int getId_endereco() {
		return id_endereco;
	}


	public void setId_endereco(int id_endereco) {
		this.id_endereco = cont++;
	}


	@Override
	public String toString() {
		return "Enderecos [id_endereco=" + id_endereco + ", logradouro=" + logradouro + ", numero=" + numero
				+ ", quadra=" + quadra + ", lote=" + lote + ", bairro=" + bairro + ", uf=" + uf + "]";
	}
	
	
	
	
	
	
	
	

}
