package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
		printList(myStrs);
	}

	/* O tipo generic ? é o tipo que aceita todos os tipos de listas
	 * tornando métodos ou classes reutilizaveis para todos os tipos
	 * de dados, porém, não pode ser adicionado novos valores a essa 
	 * lista */
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}
}
