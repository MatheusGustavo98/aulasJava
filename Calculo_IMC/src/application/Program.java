package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double altura = 0;
		double peso = 0;
		double imc = 0;
		
		System.out.println("Digite sua altura(m): ");
		altura = sc.nextDouble();
		
		System.out.println("Digite seu peso: ");
		peso = sc.nextDouble();
		
		imc = (peso)/(altura*altura);
		
		System.out.println("Seu IMC é: " + imc);
		
		if (imc < 16.9) {
			System.out.println("Muito abaixo do peso");
		}
		else if (imc >= 17 && imc < 18.4 ) {
			System.out.println("abaixo do peso");
		}
		else 
			System.out.println("peso normal");
		
		
		sc.close();
		
				
		
		

	}

}
