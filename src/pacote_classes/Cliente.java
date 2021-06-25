package pacote_classes;

import exceptions.RegraException;

public class Cliente extends Enderecos{

	
	protected int id_cliente;
	protected String razaoSocial;
	protected String fantasia;
	private static int cont = 1;
	
	public Cliente(String razaoSocial, String fantasia, String logradouro, int numero, String quadra, String lote, String bairro, String uf){
		super(logradouro, numero, quadra, lote, bairro, uf);
		this.setId_cliente(id_cliente);
		this.setRazaoSocial(razaoSocial);
		this.setFantasia(fantasia);
		
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		if(razaoSocial.isEmpty() || razaoSocial.isBlank()) {
			throw new RegraException("O nome digitado nao eh valido.");
		} else {
			this.razaoSocial = razaoSocial;
		}

	}

	public String getFantasia() {
		return fantasia;
	}

	public void setFantasia(String fantasia){
		if(fantasia.equals(null)) {
			throw new RegraException("Erro ao receber o nome fantasia");
		}
		this.fantasia = fantasia;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = cont++;
	}
	
	

	@Override
	public String printCliente() {
		
		if(getFantasia().isBlank() || getFantasia().isEmpty()) {
		return "Id: " + id_cliente + "\nCliente: " + razaoSocial + "\nCidade/UF: " + logradouro
				+ "/" + uf
				+ "\n";
		} else {
			return "Id: " + id_cliente + "\nCliente/Fantasia: " + razaoSocial + "/" + fantasia + "\nCidade/UF: " + logradouro
					+ "/" + uf
					+ "\n";
		}
		
	}
	
	
	
	
	
	

}
