package aplication;

import java.util.Scanner;

import Entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Rectangle x = new Rectangle();
		
		System.out.println("Digite a altura do retângulo:");
		x.alt = sc.nextDouble();
		System.out.println("Digite a largura do retângulo:");
		x.larg = sc.nextDouble();
		
		double area = x.area();
		double perimetro = x.perimetro();
		double diagonal = x.diagonal();
		
		System.out.printf("AREA = %.2f\n", area);
		System.out.printf("PERIMETRO = %.2f\n", perimetro);
		System.out.printf("DIAGONAL = %.2f\n", diagonal);
		
		sc.close();
	}

}
