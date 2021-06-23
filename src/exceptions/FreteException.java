package exceptions;

@SuppressWarnings("serial")
public class FreteException extends RegraException{

	public FreteException() {
		super("Estado sem frete cadastrado.");
	}

}
