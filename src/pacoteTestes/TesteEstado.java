package pacoteTestes;
import pacote_classes.Estados;

import java.util.ArrayList;



public class TesteEstado {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Estados> estados = new ArrayList<Estados>();
		
		String uf;
		
		
		uf = "SP";
		
		Estados estado1 = new Estados(uf);
		estados.add(estado1);
		
	
		uf = "MG";
		
		Estados estado2 = new Estados(uf);
		estados.add(estado2);
		
		for(Estados es : estados) {
			System.out.println(es.toString());
		}
		
		for(Estados es : estados) {
			if(es.getUf().equals("SP")) {
				estados.remove(es);
			}
		}
		
		System.out.println();
		
		for(Estados es : estados) {
			System.out.println(es.toString());
		}
		
		
		
		
		
		
		

	}

}
