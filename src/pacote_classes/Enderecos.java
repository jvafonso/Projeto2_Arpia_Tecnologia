package pacote_classes;

import exceptions.RegraException;

public class Enderecos extends Estados{
	
	protected int id_endereco;
	protected String logradouro;
	protected int numero;
	protected String quadra;
	protected String lote;
	protected String bairro;
	private static int cont = 0;
	

	public Enderecos(String logradouro, int numero, String quadra, String lote, String bairro, String uf) {
		super(uf);
		this.setId_endereco(id_endereco);
		this.setLogradouro(logradouro);
		this.setNumero(numero);
		this.setQuadra(quadra);
		this.setLote(lote);
		this.setBairro(bairro);
		
	}


	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		if(logradouro.isEmpty() || logradouro.isBlank()) {
			throw new RegraException("O logradouro informado eh invalido.");
		} else {
			this.logradouro = logradouro;
		}
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero)  {
		if(numero == 0) {
			throw new RegraException("O numero informado eh invalido.");
		} else {
			this.numero = numero;
		}
	}


	public String getQuadra() {
		return quadra;
	}


	public void setQuadra(String quadra) {
		if(quadra.isEmpty() || quadra.isBlank()) {
			throw new RegraException("A quadra informada eh invalida.");
		} else {
			this.quadra = quadra;
		}
	}


	public String getLote() {
		return lote;
	}


	public void setLote(String lote) {
		if(lote.isEmpty() || lote.isBlank()) {
			throw new RegraException("O lote informado eh invalido.");
		} else {
			this.lote = lote;
		}
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro){
		if(bairro.isEmpty() || bairro.isBlank()) {
			throw new RegraException("O bairro informado eh invalido.");
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


	public String printCliente() {
		return null;
	}
	
	
	
	
	
	
	
	

}
