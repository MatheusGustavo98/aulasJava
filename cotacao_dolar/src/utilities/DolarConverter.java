package utilities;

public class DolarConverter {
	
	public static double converter(double valorDolar, double taxa) {
		
		return (valorDolar*taxa)+((valorDolar*taxa)*0.06);
	}

}
