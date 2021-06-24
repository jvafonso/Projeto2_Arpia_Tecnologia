package executaveis;

import javax.swing.JOptionPane;

import exceptions.*;
import tratamentosArray.TratamentosCliente;

public class MenuCliente {
	
	private MenuCliente() {}
	
	public static void criaMenuCliente(){
		
		String opcaoCliente = null;
		var idCliente = 0;
		
		do {
			try {
				opcaoCliente = JOptionPane.showInputDialog(null, "1 - Criar Cliente\n2 - Alterar cliente\n3 - Buscar cliente\n4 - Apagar cliente\nI - Imprimir todos os clientes\nV - VOLTAR");
					
				switch (opcaoCliente) {
				case "1":
					TratamentosCliente.insertCliente();
					break;
					
				case "2":
					idCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito id do cliente que deseja alterar:"));
					TratamentosCliente.uptadeCliente(idCliente);
					break;
					
				case "3":
					idCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito id do cliente que deseja buscar:"));
					JOptionPane.showMessageDialog(null, TratamentosCliente.getCliente(idCliente).printCliente(), "Cliente encontrado:", JOptionPane.INFORMATION_MESSAGE);
					break;
					
				case "4":
					idCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito id do cliente que deseja apagar:"));
					TratamentosCliente.deleteCliente(idCliente);
					break;
					
				case "I":
					TratamentosCliente.imprimeListaCliente();
					break;
					
				case "V":
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Opcao Invalida", "ERRO", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
				
			} catch (RegraException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.INFORMATION_MESSAGE);
			}
		}while(!opcaoCliente.equalsIgnoreCase("V"));
	}

}
