package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int l = 0, c = 0, x = 0, up = 0, down = 0, left = 0, right = 0;
		
		System.out.println("type it of quantity of lines of matrix: ");
		l = sc.nextInt();
		System.out.println("type it of quantity of colunes of matrix: ");
		c = sc.nextInt();
		
		int[][] matriz = new int[l][c];
		
		for (int i=0; i<l; i++) {
			for (int j=0; j<c; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite um numero que pertence a matriz: ");
		x = sc.nextInt();
		
		for (int i=0; i<l; i++) {
			for (int j=0; j<c; j++) {
				if (matriz[i][j] == x) {
	
					if (i > 0) {
						up = matriz[i-1][j];
						System.out.println("up: " + up);
					}
					if (i < l-1) {
						down = matriz[i+1][j];
						System.out.println("down: " + down);
					}
					if (j > 0) {
						left = matriz[i][j-1];
						System.out.println("left: " + left);
					}
					if (j < c-1) {
						right = matriz[i][j+1];
						System.out.println("right: " + right);
					}
					
					
				
				}
			}
		
		
		
		sc.close();

		}
	}
}
