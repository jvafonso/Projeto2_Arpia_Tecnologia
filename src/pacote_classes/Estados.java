package pacote_classes;

import java.util.ArrayList;

public class Estados {
	
	private int id;
	private String nome;
	private String uf;
	private static int cont = 0;
	
	public Estados(String nome, String uf) throws Exception {
		// TODO Auto-generated constructor stub
		this.setId(id);
		this.setNome(nome);
		this.setUf(uf);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = cont++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws Exception {
		if(nome.isEmpty() || nome.isBlank() || nome == null) {
			throw new Exception("O nome do estado informado esta vazio ou é invalido");
		} else {
			this.nome = nome;
		}
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) throws Exception {
		if(uf.isEmpty() || uf.isBlank() || uf == null) {
			throw new Exception("A abreviação do estado informado esta vazio ou é invalida");
		} else {
			this.uf = uf;
		}
	}
	
	public ArrayList<Estados> list_est() throws Exception {
		ArrayList<Estados> est = new ArrayList<Estados>();
		
		Estados estado1 = new Estados("São Paulo", "SP");
		est.add(estado1);
		
		Estados estado2 = new Estados("Rio de Janeiro", "RJ");
		est.add(estado2);
		
		Estados estado3 = new Estados("Goias", "GO");
		est.add(estado3);
		
		return est;
	}
	
	

	@Override
	public String toString() {
		return "Estados [id=" + id + ", nome=" + nome + ", uf=" + uf + "]";
	}
	
	
	

	
	
	
	

}
