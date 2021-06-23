package exceptions;

@SuppressWarnings("serial")
public class ProdutoException extends RegraException{

	public ProdutoException() {
		super("O produto não existe");
	}
	
	

}
