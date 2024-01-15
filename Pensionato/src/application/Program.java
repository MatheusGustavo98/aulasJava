package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Quartos[] vetor = new Quartos[10];
		
		System.out.print("Quantos quartos serão alugados?");
		int n = sc.nextInt();
		
		for (int i=0; i < n; i++) {
			
			System.out.print("Qual o nome?");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Qual o email?");
			String email = sc.nextLine();
			
			System.out.print("Qual o numero do quarto(0-9)?");
			int numQuarto = sc.nextInt();
			
			vetor[numQuarto] = new Quartos(name, email);
		}
		System.out.println("Quartos alugados:");
		for (int i=0; i < vetor.length; i++) {
			if (vetor[i] != null) {
			System.out.println("Quarto: " + i + " - " + vetor[i]);
			}
			else {
				
			}
		}
		
		
		sc.close();

	}

}
