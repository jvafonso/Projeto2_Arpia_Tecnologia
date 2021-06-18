package exceptions;

@SuppressWarnings("serial")
public class RegraException extends RuntimeException{

	public RegraException(String message) {
		super(message);
	}

	public RegraException(Throwable cause) {
		super(cause);
	}
	

}
