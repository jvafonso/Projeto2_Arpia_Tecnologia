package executaveis;

import javax.swing.JOptionPane;

import exceptions.*;
import tratamentosArray.TratamentosPedidos;

public class MenuPedido {
	
	private MenuPedido() {}
	
	public static void criaMenuPedido() {
		
		String opcaoPedido = null;
		var idPedido = 0;
		
		do {
			try {
				opcaoPedido = JOptionPane.showInputDialog(null, "1 - Criar Pedido\n2 - Alterar pedido\n3 - Buscar pedido\n4 - Alterar Status do pedido\n5 - Apagar pedido\n6 - Adicionar item a um pedido\n7 - Alterar item de pedido\n8 - Apagar item de pedido\nI - Imprimir todos os pedidos\nV - VOLTAR");
				
				switch (opcaoPedido) {
				case "1":
					TratamentosPedidos.insertPedido();
					break;
					
				case "2":
					idPedido = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito id do pedido que deseja alterar:"));
					TratamentosPedidos.updatePedido(idPedido);
					break;
					
				case "3":
					idPedido = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito id do pedido que deseja buscar:"));
					JOptionPane.showMessageDialog(null, TratamentosPedidos.buscaPedido(idPedido).printPedido(), "Pedido encontrado:", JOptionPane.INFORMATION_MESSAGE);
					break;
					
				case "4":
					idPedido = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito id do pedido que deseja alterar o status:"));
					TratamentosPedidos.updateStatus(idPedido);
					break;
					
				case "5":
					idPedido = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito id do pedido que deseja apagar:"));
					TratamentosPedidos.deletePedido(idPedido);
					break;
					
				case "6":
					idPedido = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito id do pedido que deseja adicionar um item:"));
					TratamentosPedidos.adicionaItem(idPedido);
					break;
					
				case "7":
					idPedido = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito id do pedido que deseja alterar um item:"));
					TratamentosPedidos.updateItem(idPedido);
					break;
					
				case "8":
					idPedido = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito id do pedido que deseja apagar um item:"));
					TratamentosPedidos.deletaItem(idPedido);
					break;
					
				case "I":
					TratamentosPedidos.imprimirListaPedidos();
					break;
					
				case "V":
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Opcao Invalida", "ERRO", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
				
			} catch(RegraException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.INFORMATION_MESSAGE);
			}
		}while(!opcaoPedido.equalsIgnoreCase("V"));
	}

}
