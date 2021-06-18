package pacoteTestes;
import pacote_classes.Marca;
import pacote_classes.Produto;

public class TesteProduto {

	public static void main(String[] args) throws Exception {
		//cenario 
		//ação
		//valiação 
		 String descricao_prod = "Leite";
		 String descricao_marca = "Calu";
		 Double valor_prod = 5.60;
		 Double desconto = 15.00;
		 
		 var marca = new Marca();
		 marca.setDescricao(descricao_marca);
		 
		 
		 var produto  = new Produto();
		 produto.setDescricaoProd(descricao_prod);
		 produto.setDesconto(desconto);
		 produto.setValor(valor_prod);
		 produto.setMarca(marca);
		 
		 
		 System.out.println(produto.toString());
		
		 
		 

	}

}
