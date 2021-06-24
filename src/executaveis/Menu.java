package executaveis;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		
		String opcao = null;
		
		do {
			opcao = JOptionPane.showInputDialog(null, "1 - Menu Cliente\n2 - Menu Produto\n3 - Menu Pedido\nS - SAIR");
			
			switch (opcao) {
			case "1":
				MenuCliente.criaMenuCliente();
				break;
				
			case "2":
				MenuProduto.criaMenuProduto();
				break;
				
			case "3":
				MenuPedido.criaMenuPedido();
				break;
				
			case "S":
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Opcao Invalida", "ERRO", JOptionPane.INFORMATION_MESSAGE);
				break;
			}
			
		}while(!opcao.equalsIgnoreCase("S"));

	}

}
