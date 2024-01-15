package aplicattion;

import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ContaBancaria conta1;
		
		System.out.println("Digite o numero da conta bancaria: ");
		int numeroConta = sc.nextInt();
		
		
		System.out.println("Digite o nome do titular: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		
		
		System.out.println("Deseja efetuar um depósito inicial(s/n)?");
		char desejoDeposito = sc.next().charAt(0);
		
		while((desejoDeposito != 's') && (desejoDeposito != 'n')) {
			System.out.println("Resposta Inválida!! \nDigite novamente:");
			desejoDeposito = sc.next().charAt(0);
		}
		
		if (desejoDeposito == 's') {
			System.out.println("Qual o valor do deposito?: ");
			double depositoInicial = sc.nextDouble();
			conta1 = new ContaBancaria(numeroConta, nomeTitular, depositoInicial);
		}
		else {
			conta1 = new ContaBancaria(numeroConta, nomeTitular);
			}
		System.out.println("Qual o valor do saque(s/n)?: ");
		double saque  = sc.nextDouble();
		
		conta1.saque(saque);
		
		
		System.out.println();
		System.out.println();
		System.out.println(conta1);
		 sc.close();
		
		
		
		

	}

}
