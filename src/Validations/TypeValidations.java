package Validations;

public class TypeValidations {
	
	
	private TypeValidations() {
		
	}
	
	public static boolean validString (String frase) {
		if(frase.isBlank() || frase.isEmpty() || frase.equals(null)) {
			return false;
		} else {
			return true;
		}
		
	}
	
	public static boolean validInt (int num) {
		if(num == 0) {
			return false;
		} else {
			return true;
		}
		
	}
	
	public static boolean validDouble (Double num) {
		if(num == 0.0) {
			return false;
		} else {
			return true;
		}
	}

}
