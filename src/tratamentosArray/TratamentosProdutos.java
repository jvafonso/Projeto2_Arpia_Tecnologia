package tratamentosArray;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import pacote_classes.Marca;
import pacote_classes.Produto;

public class TratamentosProdutos {
	
	private static ArrayList<Produto> listaProdutos = new ArrayList<>();
	
	public List<Produto> insertProduto(Produto p) {
		
		listaProdutos.add(p);
		return listaProdutos;
	}
	
	public List<Produto> deleteProduto(int idProd) throws Exception {
		
		for (Produto lp : listaProdutos) {
			if(lp.getId() == idProd) {
				listaProdutos.remove(lp);
				return listaProdutos;
			}
		}
		throw new Exception ("Produto não existe.");
	}
	
	public Produto buscaProduto(int idProd) throws Exception {
		for (Produto lp : listaProdutos) {
			if(lp.getId() == idProd) {
				return lp;
			}
		}
		throw new Exception ("Produto não existe.");
	}
	
	public List<Produto> updateProduto(int idProd) throws Exception {
		Produto pr;
		pr = buscaProduto(idProd);
		
		String descricaoProd = JOptionPane.showInputDialog(null, "Digite o novo Produto:");
		Double desconto = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o novo desconto:"));
		Double valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o novo valor:"));
		String descricaoMarc = JOptionPane.showInputDialog(null, "Digite a nova marca:");
		
		var marca = new Marca();
		marca.setDescricao(descricaoMarc);
		 
		pr.setDescricaoProd(descricaoProd);
		pr.setDesconto(desconto);
		pr.setValor(valor);
		pr.setMarca(marca);
		 
		return listaProdutos; 
		
	}
	
	

}
