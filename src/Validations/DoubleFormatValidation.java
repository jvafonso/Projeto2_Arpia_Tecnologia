package Validations;

import java.text.DecimalFormat;

public class DoubleFormatValidation {
	
	private DoubleFormatValidation() {}
	
	private static DecimalFormat df = new DecimalFormat("###,###.00");
	
	public static String doubleFormat(Double num) {
		return df.format(num);
	} 

}
