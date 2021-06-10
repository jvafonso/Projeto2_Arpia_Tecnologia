package pacote_testes;
import pacote_classes.Produto;

public class teste_produto {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 String descricao_prod = "Leite";
		 String descricao_marca = "Calu";
		 Double valor_prod = 5.60;
		 Double desconto = 15.00;
		 
		 Produto produto  = new Produto(descricao_prod, valor_prod, desconto, descricao_marca);
		 
		 
		 System.out.println(produto.toString());
		
		 
		 

	}

}
