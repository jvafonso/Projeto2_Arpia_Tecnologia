package pacote_testes;
import pacote_classes.Cliente;

import java.util.ArrayList;

public class teste_cliente {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ArrayList<Cliente> clienteS = new ArrayList<Cliente>();
		
		String nome = "Joao Vitor Afonso";
		String nome_fantasia = "JvAfonso";
		String logradouro = "Uberlandia";
		int numero = 46;
		String quadra = "q2";
		String lote = "l2";
		String bairro = "Vigilato";
		String uf = "MG";
		
		Cliente cliente1 = new Cliente(nome, nome_fantasia, logradouro, numero, quadra, lote,bairro, uf);
		clienteS.add(cliente1);
		
		nome = "Ana Carolina";
		nome_fantasia = "";
		logradouro = "Ribeirao";
		numero = 102;
		quadra = "q222";
		lote = "l333";
		bairro = "Gaveia Sul";
		uf = "SP";
		
		Cliente cliente2 = new Cliente(nome, nome_fantasia, logradouro, numero, quadra, lote,bairro, uf);
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
