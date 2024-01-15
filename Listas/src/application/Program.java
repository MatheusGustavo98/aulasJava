package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Alice");
		list.add("Alirio");
		list.add("Bruno");
		
		System.out.println(list.get(1));
		
		list.add(2, "Marco"); // adicionar item na posição escolhida
		
		list.remove("Anna"); // remove por comparação
		
		System.out.println(list.size()); //Tamanho da lista
		
		for (String name : list) {
			System.out.println(name);
		}
		
		System.out.println("--------------------------");
		
		list.remove(1); // remove por posição
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String name : list) {
			System.out.println(name);
		}
		System.out.println("--------------------------");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob")); // descobrir posilçao do elemento "Bob"
		System.out.println("Index of Alirio: " + list.indexOf("Alirio"));
		
		System.out.println("--------------------------");
	
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); //Transforma a lista em stream()
		                                                                                                  //depois filtra de acordo com o predicado e converte pra o tipo List de novo
		
		for (String name : result) {
			System.out.println(name);
		}
		System.out.println("--------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
