package tratamentosArray;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import exceptions.ProdutoException;
import pacote_classes.Marca;
import pacote_classes.Produto;

public class TratamentosProdutos {
	
	static int cont = 1;
	static int contM = 1;
	private TratamentosProdutos() {}
	
	public static final List<Produto> listaProdutos = new ArrayList<>();
	
	public static List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	
	public static void imprimirListaProduto() {
		for(Produto produtos : listaProdutos) {
			JOptionPane.showMessageDialog(null, produtos.printProduto(), "Dados do Produto", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public static void insertProduto() {
		String descricaoProd = JOptionPane.showInputDialog(null, "Digite a descricao do Produto:");
		Double desconto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o desconto sobre o produto:"));
		Double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do produto:"));
		String descricaoMarc = JOptionPane.showInputDialog(null, "Digite a marca do produto:");
		
		var marca = new Marca();
		marca.setId(contM);
		contM++;
		marca.setDescricao(descricaoMarc);
		
		var pr = new Produto();
		
		pr.setId(cont);
		cont++;
		pr.setDescricaoProd(descricaoProd);
		pr.setDesconto(desconto);
		pr.setValor(valor);
		pr.setMarca(marca);
		
		listaProdutos.add(pr);
	}
	
	public static void deleteProduto(int idProd) {
		
		listaProdutos.remove(buscaProduto(idProd));
	}
	
	public static Produto buscaProduto(int idProd){
		for (Produto lp : listaProdutos) {
			if(lp.getId() == idProd) {
				return lp;
			}
		}
		throw new ProdutoException();
	}
	
	public static boolean verificaProduto(int idProd) {
		for (Produto lp : listaProdutos) {
			if(lp.getId() == idProd) {
				return true;
			}
		}
		return false;
	}
	
	public static void updateProduto(int idProd){
		Produto pr;
		pr = buscaProduto(idProd);

		
		String descricaoProd = JOptionPane.showInputDialog(null, "Digite a nova descricao do  Produto:");
		Double desconto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o novo desconto do produto:"));
		Double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o novo valor do produto:"));
		String descricaoMarc = JOptionPane.showInputDialog(null, "Digite a nova marca do produto:");
		
		var marca = new Marca();
		marca.setDescricao(descricaoMarc);
		 
		pr.setDescricaoProd(descricaoProd);
		pr.setDesconto(desconto);
		pr.setValor(valor);
		pr.setMarca(marca);
		  
		
	}
	
	

}
