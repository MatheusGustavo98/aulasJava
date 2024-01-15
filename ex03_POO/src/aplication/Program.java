package aplication;

import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno1 = new Aluno();
		System.out.print("Nome:");
		aluno1.nome = sc.nextLine();
		
		System.out.print("Nota 1:");
		aluno1.nota1 = sc.nextDouble();
		
		System.out.print("Nota 2:");
		aluno1.nota2 = sc.nextDouble();
		
		System.out.print("Nota 3:");
		aluno1.nota3 = sc.nextDouble();
		
		System.out.printf("Nota Final: %.2f\n",aluno1.notaFinal());
		
		if (aluno1.notaFinal() < 60) {
			System.out.println("Failed");
			System.out.printf("faltam %.2f pontos \n", aluno1.pontosFaltantes());
		}
		else {
			System.out.println("pass");
		}
		
		
		
		
		
		
		sc.close();

	}

}
