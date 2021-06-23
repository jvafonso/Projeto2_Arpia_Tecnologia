package exceptions;

@SuppressWarnings("serial")
public class InvalidNumberException extends RegraException{

	public InvalidNumberException() {
		super("Numero digitado eh invalido");
	}

}
