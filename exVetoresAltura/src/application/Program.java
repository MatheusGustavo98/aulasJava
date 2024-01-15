package application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Quantas pessoas serão cadastradas?" );
		int n = sc.nextInt();
		
		Pessoas[] vetor = new Pessoas[n];
		
		for (int i=0; i<n; i++) {
			System.out.println("Digite o nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.println("Digite a idade: ");
			int idade = sc.nextInt();
			
			System.out.println("Digite a altura: ");
			double altura = sc.nextDouble();
			
			vetor[i] = new Pessoas(nome, idade, altura);
		}
		
		double soma = 0;
		
		for (int i = 0; i < n; i++) {
			soma += vetor[i].getAltura();
		}
		
		double media = soma/n;
		
		System.out.printf("A media das alturas é: %.2f\n", media);
		
		int nmenores=0;
		
		for (int i = 0; i < n; i++) {
			if (vetor[i].getIdade() < 16) {
				nmenores++;
			}
		}
		double porcentagem = ((double)nmenores/n)*100;
		
		System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");
		
		for (int i = 0; i < n; i++) {
			if (vetor[i].getIdade() < 16) {
				System.out.println(vetor[i].getNome());
			}
		}
				
		sc.close();

	}

}
