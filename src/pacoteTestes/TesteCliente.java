package pacoteTestes;
import pacote_classes.Cliente;

import java.util.ArrayList;

public class TesteCliente {

	public static void main(String[] args) throws Exception {
		ArrayList<Cliente> clienteS = new ArrayList<>();
		
		var nome = "Joao Vitor Afonso";
		var nomeFantasia = "JvAfonso";
		var logradouro = "Uberlandia";
		var numero = 46;
		var quadra = "q2";
		var lote = "l2";
		var bairro = "Vigilato";
		var uf = "MG";
		
		var cliente1 = new Cliente(nome, nomeFantasia, logradouro, numero, quadra, lote,bairro, uf);
		clienteS.add(cliente1);
		
		nome = "Ana Carolina";
		nomeFantasia = "";
		logradouro = "Ribeirao";
		numero = 102;
		quadra = "q222";
		lote = "l333";
		bairro = "Gaveia Sul";
		uf = "SP";
		
		var cliente2 = new Cliente(nome, nomeFantasia, logradouro, numero, quadra, lote,bairro, uf);
		clienteS.add(cliente2);
		
		
		for(Cliente cl : clienteS) {
			System.out.println(cl.printCliente());
		}
		
		
		for(Cliente cl : clienteS) {
			if(cl.getId_cliente() == 1) {
				clienteS.remove(cl);
			}
		}
		
		
		for(Cliente cl : clienteS) {
			System.out.println(cl.printCliente());
		}

	}

}
