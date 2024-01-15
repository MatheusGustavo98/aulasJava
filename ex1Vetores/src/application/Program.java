package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Quantos números você quer testar?(máx 10): ");
		int n = sc.nextInt();
		
		int[] vetor = new int[n];
		
		
		for (int i = 0; i<n; i++) {
			System.out.print("Digite um número:");
			vetor[i] = sc.nextInt();		
			}
		
		System.out.println("Numeros negativos: ");
		
		for (int i = 0; i<n; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		
		
		sc.close();

	}

}
