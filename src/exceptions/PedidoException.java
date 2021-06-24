package exceptions;

@SuppressWarnings("serial")
public class PedidoException extends RegraException{

	public PedidoException() {
		super("Pedido nao existe");
	}

}
