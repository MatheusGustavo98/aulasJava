import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		
		int hora;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que horas são ?");
		hora = sc.nextInt();
		if (hora<12) {
			System.out.println("Bom Dia");
		}
		if (hora>=12 && hora<18) {
			System.out.println("Boa Tarde");
		}
		if (hora>=18 && hora<=24) {
		System.out.println("Boa Noite");
		}
		sc.close();
	}
}
