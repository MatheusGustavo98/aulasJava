package aplication;

import java.util.Scanner;

import entities.Funcionarios;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Funcionarios funcionario1 = new Funcionarios();
		
		System.out.println("Nome do funcionário: ");
		funcionario1.nome = sc.nextLine();
		
		System.out.print("Digite o salário bruto:");
		funcionario1.salBruto = sc.nextDouble();
		
		System.out.print("Digite a taxa de desconto:");
		funcionario1.taxaDesconto = sc.nextDouble();
		
		System.out.print(funcionario1);
		
		System.out.print("Digite a porcentagem de aumento: ");
		double incremento = sc.nextDouble();
		funcionario1.incremento(incremento);
		
		System.out.printf("Dados atualizados: %s, $ %.2f",funcionario1.nome,funcionario1.salLiquido());		
		
		
		sc.close();

	}

}
