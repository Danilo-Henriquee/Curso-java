package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		
/* entre o simbolo de maior e menor é o que chama de generics que é quando
 * você pode parametrizar a definição de um tipo informando um outro tipo
 * especifico que você quiser, quando eu quiser uma lista de inteiros eu
 * uso a wrapper class do inteiro que é Integer o mesmo serve para float
 * double entre outros. */  
		List<String> list = new ArrayList<>();
		
		// para adicionar elemento a uma lista.
		list.add("Maria"); // 0
		list.add("Alex");  // 1
		list.add("Bob");   // 2
		list.add("Anna");  // 3
		
		/* adicionar um elemento informando o indice que é o 2.
		 * usa-se o segundo construtor que recebe
		 * o indice como primeiro argumento. */ 
		list.add(2, "Marco");
		
		// verificar o tamanho da lista
		System.out.println(list.size());
		System.out.println(list);
		
		System.out.println("-------------------------");
		
		// remover um elemento da lista
		// list.remove("Anna");
		list.remove(1); // removendo o elemento do indice 1
		
		/* remover um elemento usando predicado
		 * pega um valor x que é do tipo string e me retorna se esse x
		 * possui M no primeiro caracter de sua composição.*/ 
		list.removeIf(x -> x.charAt(0) == 'M');
		
		// encontrar a posição de um elemento
		System.out.println("Index of bob: " + list.indexOf("Bob"));
		
		/* para pegar somente os valores que possuem A como primeira letra
		 * cria-se uma nova lista com nome result. */ 
		List<String> result;
		/* 1 - converter a lista para uma stream que faz com que a lista aceite  
		 * operações com expressões lambda.
		 * 2 - chame o método filter que aceita expressões lambdas.
		 * 3 - converter novamente para um tipo lista usando o método collect
		 * passando como parametro Collectors.toList() */
		result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		/* como encontrar o primeiro elemento que começa com a letra A
		 * 1 - cria uma variavel do tipo igual ao da sua lista
		 * 2 - adiciona o predicado filter que irá encontrar o elemento que
		 * começa com A.
		 * 3 - adicionar o findFirst() que irá pegar o primeiro elemento 
		 * dessa lista que atende ao predicado passado no filter.
		 * 4 - adicionar o orElse() que se o elemento não existir
		 * ele vai retornar null(nulo). */
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		
		System.out.println(name);
		
		for (String x : list) {
			System.out.println(x);
		}
		for (String x : result) {
			System.out.println(x);
		}
	}

}
