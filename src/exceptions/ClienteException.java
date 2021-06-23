package exceptions;

@SuppressWarnings("serial")
public class ClienteException extends RegraException{

	public ClienteException() {
		super("Cliente nao existe");
	}

}
