package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employed;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
	
		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Employed> list = new ArrayList<>();
		
		
		for (int i = 0; i<n; i++) {
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(i, new Employed(id, name, salary));
			
		}
		System.out.println("Digite o id do funcionario que irá receber o aumento: ");
		int id = sc.nextInt();
		
		Integer pos = positionId(list, id);
		
		if (pos == null) {
			System.out.println("ID inexistente");
		}
		else {
			System.out.println("digite a taxa de aumento:" );
			double tax = sc.nextDouble();
			list.get(pos).aumento(tax);
		}
	
		System.out.println();
		System.out.println("Lista de funcionários: " + list);
		
		sc.close();
	}
	
	public static Integer positionId (List<Employed> list, int id) {
		for (int i=0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
}

