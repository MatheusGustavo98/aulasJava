import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z;
		char w;
		x=sc.next();
		y=sc.nextInt();
		z=sc.nextDouble();
		w=sc.next().charAt(0);
		
		System.out.println("Você digitou: "+x);
		System.out.println("Você digitou o numero: "+y);
		System.out.println("Você digitou o numero flutuante: "+z);
		System.out.println("Você digitou: "+ w);
		sc.close();

	}

}
