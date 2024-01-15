package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Integer> diagonal = new ArrayList<>();
		
		System.out.print("Digite a ordem da matriz: ");
		int n = sc.nextInt();
		
		int count = 0;
		
		int[][] matriz1 = new int [n][n]; //declaração e instanciação da matriz na memória
		
		for (int i=0; i<matriz1.length; i++) {
			for (int j=0; j < matriz1[i].length; j++) {
				matriz1[i][j] = sc.nextInt();
				if (i == j) {
					diagonal.add(matriz1[i][j]); // salvar diagonal principal em 
				}
				if (matriz1[i][j] < 0) {
					count ++;
				}
			}
		}
		System.out.println("Main diagonal: ");
		
		for(int i = 0; i<n; i++) {
				System.out.println(matriz1[i][i]); 	//imprimir diagonal principal com um "for" 
		}
		
		System.out.println(diagonal);
		
		System.out.println("Quantidade de nºs negativos: " + count);		
		sc.close();

	}

}
