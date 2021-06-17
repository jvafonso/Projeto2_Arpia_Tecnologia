package executaveis;

import pacote_classes.Cliente;
import pacote_classes.Crud;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Menu_Exec {

	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<Cliente>();
		Crud listaClientes = new Crud();
		
		String opcao = null;
		String razaoSocial = null;
		String fantasia = null;
		String logradouro = null;
		int numero = 0;
		String numeroK = null;
		String quadra = null;
		String lote = null;
		String bairro = null;
		String uf = null;
		
		int id_cl = 0;
			
			
			do {
				try {
				opcao = JOptionPane.showInputDialog(null, "1 - Criar Cliente\n2 - Alterar cliente\n3 - Buscar cliente\n4 - Apagar cliente\nI - Imprimir todos os clientes\nS - SAIR");
				
				switch (opcao) {
				case "1":
					//Crud.getListaClientes(); //singleton
					razaoSocial = JOptionPane.showInputDialog(null, "Digite a razao social do cliente:");
					fantasia = JOptionPane.showInputDialog(null, "Digite o nome fantasia do cliente caso houver:");
					logradouro = JOptionPane.showInputDialog(null, "Digite a cidade do cliente:");
					
					numeroK = JOptionPane.showInputDialog(null, "Digite o numero da residencia do cliente:");
					
					if(numeroK.matches("[0-9]*")) {
						numero = Integer.parseInt(numeroK);
						
					} else {
						throw new Exception("O valor informado nao eh um numero.");
					}
					
					quadra = JOptionPane.showInputDialog(null, "Digite a quadra do cliente:");
					lote = JOptionPane.showInputDialog(null, "Digite o lote do cliente:");
					bairro = JOptionPane.showInputDialog(null, "Digite o bairro do cliente:");
					uf = JOptionPane.showInputDialog(null, "Digite a UF do estado do cliente:");
					
					
					Cliente cliente = new Cliente(razaoSocial, fantasia, logradouro, numero, quadra, lote, bairro, uf);
					clientes = listaClientes.insertCliente(cliente);
					
					break;
					
				case "2":
					id_cl = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito id do cliente que deseja alterar:"));
					clientes = listaClientes.uptadeCliente(id_cl);
					break;
					
				case "3":
					id_cl = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito id do cliente que deseja buscar:"));
					JOptionPane.showMessageDialog(null, listaClientes.showCliente(id_cl), "Cliente encontrado:", JOptionPane.INFORMATION_MESSAGE);
					break;
					
				case "4":
					id_cl = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito id do cliente que deseja apagar:"));
					clientes = listaClientes.deleteCliente(id_cl);
					break;
					
				case "I":
					for(Cliente cl : clientes) {
						JOptionPane.showMessageDialog(null, cl.printCliente(), "Dados dos Clientes", JOptionPane.INFORMATION_MESSAGE);
					}
				}
				
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.INFORMATION_MESSAGE);
			}
				
				
			}while(!opcao.equals("S"));
			
			for(Cliente cl : clientes) {
				System.out.println(cl.printCliente());
			}
			

	}

}
