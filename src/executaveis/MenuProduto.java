package executaveis;

import javax.swing.JOptionPane;

import exceptions.*;
import tratamentosArray.TratamentosProdutos;

public class MenuProduto {
	
	private MenuProduto() {}
	
	public static void criaMenuProduto() {
		
		String opcaoProduto = null;
		var idProduto = 0;
		
		do {
			try {
				opcaoProduto = JOptionPane.showInputDialog(null, "1 - Criar Produto\n2 - Alterar produto\n3 - Buscar produto\n4 - Apagar produto\nI - Imprimir todos os produtos\nV - VOLTAR");
				
				switch (opcaoProduto) {
				case "1":
					TratamentosProdutos.insertProduto();
					break;
				
				case "2":
					idProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito id do produto que deseja alterar:"));
					TratamentosProdutos.updateProduto(idProduto);
					break;
					
				case "3":
					idProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito id do produto que deseja buscar:"));
					JOptionPane.showMessageDialog(null, TratamentosProdutos.buscaProduto(idProduto).printProduto(), "Produto encontrado:", JOptionPane.INFORMATION_MESSAGE);
					break;
					
				case "4":
					idProduto = Integer.parseInt(JOptionPane.showInputDialog(null, "Digito id do produto que deseja deletar:"));
					TratamentosProdutos.deleteProduto(idProduto);
					break;
					
				case "I":
					TratamentosProdutos.imprimirListaProduto();
					break;
					
				case "V":
					break;
					
				default:
					JOptionPane.showMessageDialog(null, "Opcao Invalida", "ERRO", JOptionPane.INFORMATION_MESSAGE);
					break;
				}
				
			}catch (RegraException e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.INFORMATION_MESSAGE);
			} 
		}while(!opcaoProduto.equalsIgnoreCase("V"));
	}

}
