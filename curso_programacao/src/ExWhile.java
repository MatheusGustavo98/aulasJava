import java.util.Scanner;

public class ExWhile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		
		System.out.println("Digite o valor da coordenada x:");
		x = sc.nextInt();
		System.out.println("Digite o valor da coordenada y:");
		y = sc.nextInt();
		
		while(x !=0 && y != 0){
			if (x>0 && y>0) {
				System.out.println("Coordenada pertence ao 1º quadrante");
			}
			else if (x<0 && y>0) {
				System.out.println("Coordenada pertence ao 2º quadrante");
			}
			else if (x<0 && y<0) {
				System.out.println("Coordenada pertence ao 3º quadrante");
			}
			else if (x>0 && y<0) {
				System.out.println("Coordenada pertence ao 4º quadrante");
			}
			System.out.println("Digite o valor da coordenada x:");
			x = sc.nextInt();
			System.out.println("Digite o valor da coordenada y:");
			y = sc.nextInt();
		}
		sc.close();
		
	
	}
}
