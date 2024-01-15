import java.util.Scanner;

public class Ex2For {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de valores:");
		int N = sc.nextInt();
		int in = 0;
		int out = 0;
		
		for (int i = 0; i < N; i++) {
			System.out.println("digite um número:");
			int y = sc.nextInt();
			if (y >= 10  &&  y<=20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}	
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		
		
		
		sc.close();
		

	}

}
