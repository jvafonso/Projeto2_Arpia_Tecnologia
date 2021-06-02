package pacote_classes;

import java.util.ArrayList;

public class Estados {
	
	protected int id_estado;
	protected String nome_estado;
	protected String uf;
	private static int cont = 0;
	
	public Estados(String uf) throws Exception {
		// TODO Auto-generated constructor stub
		this.setId(id_estado);
		this.setNome(nome_estado);
		this.setUf(uf);
	}

	public int getId() {
		return id_estado;
	}

	public void setId(int id_estado) {
		this.id_estado = cont++;
	}

	public String getNome() {
		return nome_estado;
	}

	public void setNome(String nome) throws Exception {
		if(getUf() == "SP" || getUf() == "sp") {
			this.nome_estado = "São Paulo";
		} else if(getUf() == "RJ" || getUf() == "rj"){
			this.nome_estado = "Rio de Janeiro";
		} else if(getUf() == "MG" || getUf() == "mg"){
			this.nome_estado = "Minas Gerais";
		} else if(getUf() == "ES" || getUf() == "es"){
			this.nome_estado = "Espírito Santo";
		} else if(getUf() == "AC" || getUf() == "ac"){
			this.nome_estado = "Acre";
		} else if(getUf() == "AL" || getUf() == "al"){
			this.nome_estado = "Alagoas";
		} else if(getUf() == "AP" || getUf() == "ap"){
			this.nome_estado = "Amapá";
		} else if(getUf() == "AM" || getUf() == "am"){
			this.nome_estado = "Amazonas";
		} else if(getUf() == "BA" || getUf() == "ba"){
			this.nome_estado = "Bahia";
		} else if(getUf() == "CE" || getUf() == "ce"){
			this.nome_estado = "Ceará";
		} else if(getUf() == "DF" || getUf() == "df"){
			this.nome_estado = "Distrito Federal";
		} else if(getUf() == "GO" || getUf() == "go"){
			this.nome_estado = "Goiás";
		} else if(getUf() == "MA" || getUf() == "ma"){
			this.nome_estado = "Maranhão";
		} else if(getUf() == "MT" || getUf() == "mt"){
			this.nome_estado = "Mato Grosso";
		} else if(getUf() == "MS" || getUf() == "ms"){
			this.nome_estado = "Mato Grosso do Sul";
		} else if(getUf() == "PA" || getUf() == "pa"){
			this.nome_estado = "Pará";
		} else if(getUf() == "PB" || getUf() == "pb"){
			this.nome_estado = "Paraíba";
		} else if(getUf() == "PR" || getUf() == "pr"){
			this.nome_estado = "Paraná";
		} else if(getUf() == "PE" || getUf() == "pe"){
			this.nome_estado = "Pernambuco";
		} else if(getUf() == "PI" || getUf() == "pi"){
			this.nome_estado = "Piauí";
		} else if(getUf() == "RN" || getUf() == "rn"){
			this.nome_estado = "Rio Grande do Norte";
		} else if(getUf() == "RS" || getUf() == "rs"){
			this.nome_estado = "Rio Grande do Sul";
		} else if(getUf() == "RO" || getUf() == "ro"){
			this.nome_estado = "Rondônia";
		} else if(getUf() == "RR" || getUf() == "rr"){
			this.nome_estado = "Roraima";
		} else if(getUf() == "SC" || getUf() == "sc"){
			this.nome_estado = "Santa Cantarina";
		} else if(getUf() == "SE" || getUf() == "se"){
			this.nome_estado = "Sergipe";
		} else if(getUf() == "TO" || getUf() == "to"){
			this.nome_estado = "Tocantins";
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
		
		Estados estado1 = new Estados("SP");
		est.add(estado1);
		
		Estados estado2 = new Estados("RJ");
		est.add(estado2);
		
		Estados estado3 = new Estados("GO");
		est.add(estado3);
		
		return est;
	}

	@Override
	public String toString() {
		return "Estados [id_estado=" + id_estado + ", nome_estado=" + nome_estado + ", uf=" + uf + "]";
	}

	
	
	

	
	
	

	
	
	
	

}
