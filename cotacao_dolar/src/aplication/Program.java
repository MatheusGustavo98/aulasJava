package aplication;

import java.util.Locale;
import java.util.Scanner;

import utilities.DolarConverter;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Qual a cotação do Dólar?:");
		double taxa = sc.nextDouble();
		
		System.out.println("Quantos dólares você quer comprar?:");
		double valorDolar = sc.nextDouble();
		
		double valorFinal = DolarConverter.converter(valorDolar, taxa);
		
		System.out.printf("Você pagará R$ %.2f", valorFinal);
		
		sc.close();
	}

}
