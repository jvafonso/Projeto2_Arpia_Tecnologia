package exceptions;

@SuppressWarnings("serial")
public class StatusException extends RegraException{

	public StatusException() {
		super("Status invalido");
	}

}
