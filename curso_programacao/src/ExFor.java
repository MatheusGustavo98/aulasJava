import java.util.Scanner;

public class ExFor {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int N = sc.nextInt();
	int x = 0;
	for (int i=0; i<N; i++) {
		System.out.println("Digite um numero:");
		int y = sc.nextInt();
		x = x + y;
		
	}
	
	System.out.println(x);
	sc.close();

	}

}
