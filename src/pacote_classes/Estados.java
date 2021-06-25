package pacote_classes;

import exceptions.RegraException;

public class Estados {
	
	protected int id_estado;
	protected String nome_estado;
	protected String uf;
	private static int cont = 1;
	
	public Estados(String uf)  {
		this.setId(id_estado);
		this.setUf(uf);
		this.setNome(nome_estado);
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

	public void setNome(String nome){
		if(getUf().equals("SP") || getUf().equals("sp")) {
			this.nome_estado = "São Paulo";
		} else if(getUf().equals("RJ") || getUf().equals("rj")){
			this.nome_estado = "Rio de Janeiro";
		} else if(getUf().equals("MG") || getUf().equals("mg")){
			this.nome_estado = "Minas Gerais";
		} else if(getUf().equals("ES") ||getUf().equals("es")){
			this.nome_estado = "Espírito Santo";
		} else if(getUf().equals("AC") || getUf().equals("ac")){
			this.nome_estado = "Acre";
		} else if(getUf().equals("AL") || getUf().equals("al")){
			this.nome_estado = "Alagoas";
		} else if(getUf().equals("AP") || getUf().equals("ap")){
			this.nome_estado = "Amapá";
		} else if(getUf().equals("AM") || getUf().equals("am")){
			this.nome_estado = "Amazonas";
		} else if(getUf().equals("BA") || getUf().equals("ba")){
			this.nome_estado = "Bahia";
		} else if(getUf().equals("CE") || getUf().equals("ce")){
			this.nome_estado = "Ceará";
		} else if(getUf().equals("DF") || getUf().equals("df")){
			this.nome_estado = "Distrito Federal";
		} else if(getUf().equals("GO") || getUf().equals("go")){
			this.nome_estado = "Goiás";
		} else if(getUf().equals("MA") || getUf().equals("ma")){
			this.nome_estado = "Maranhão";
		} else if(getUf().equals("MT") || getUf().equals("mt")){
			this.nome_estado = "Mato Grosso";
		} else if(getUf().equals("MS") || getUf().equals("ms")){
			this.nome_estado = "Mato Grosso do Sul";
		} else if(getUf().equals("PA") || getUf().equals("pa")){
			this.nome_estado = "Pará";
		} else if(getUf().equals("PB") || getUf().equals("pb")){
			this.nome_estado = "Paraíba";
		} else if(getUf().equals("PR") || getUf().equals("pr")){
			this.nome_estado = "Paraná";
		} else if(getUf().equals("PE") || getUf().equals("pe")){
			this.nome_estado = "Pernambuco";
		} else if(getUf().equals("PI") || getUf().equals("pi")){
			this.nome_estado = "Piauí";
		} else if(getUf().equals("RN") || getUf().equals("rn")){
			this.nome_estado = "Rio Grande do Norte";
		} else if(getUf().equals("RS") || getUf().equals("rs")){
			this.nome_estado = "Rio Grande do Sul";
		} else if(getUf().equals("RO") || getUf().equals("ro")){
			this.nome_estado = "Rondônia";
		} else if(getUf().equals("RR") || getUf().equals("rr")){
			this.nome_estado = "Roraima";
		} else if(getUf().equals("SC") || getUf().equals("sc")){
			this.nome_estado = "Santa Cantarina";
		} else if(getUf().equals("SE") || getUf().equals("se")){
			this.nome_estado = "Sergipe";
		} else if(getUf().equals("TO") || getUf().equals("to")){
			this.nome_estado = "Tocantins";
		} else {
			throw new RegraException("A UF digitada não corresponde a nenhum estado brasileiro.");
		}
	} 

	public String getUf() {
		return uf;
	}

	public void setUf(String uf){
		if(uf.isEmpty() || uf.isBlank()) {
			throw new RegraException("A abreviação do estado informado esta vazio ou é invalida");
		} else {
			this.uf = uf;
		}
	}
	

	@Override
	public String toString() {
		return "Estados [id_estado=" + id_estado + ", nome_estado=" + nome_estado + ", uf=" + uf + "]";
	}

	
	
	

	
	
	

	
	
	
	

}
