package Entities;

public class Rectangle {
	public double alt;
	public double larg;
	
	public double area() {
		return alt*larg;
	}
	
	public double perimetro() {
		return (alt+larg)*2;
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(alt, 2) + Math.pow(larg,2));
	}

}
