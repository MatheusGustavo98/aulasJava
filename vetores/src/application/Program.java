package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas alturas irá informar?: ");
		
		int n = sc.nextInt();
		double[] vetor = new  double[n];
		
		for (int i=0; i<n ; i++) {
			System.out.println("Digite a altura: ");
			vetor[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		
		for (int i =0; i<n; i++) {
			soma += vetor[i];
		}
		
		double media = soma/n;
		
		System.out.println("A media das alturas é: "+ media);
		
		
		
		sc.close();
	}

}
