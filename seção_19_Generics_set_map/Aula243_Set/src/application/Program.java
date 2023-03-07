package application;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

//		HashSet não é indicado quando a ordem dos elementos
//		importa pois ele não garante que tudo sera na ordem
//		Set<String> set = new HashSet<>();

//		TreeSet ele irá ordenar pela ordem alfabetica
//		Diferentemente dos outros tipos de set, TreeSet precisa
//		Implementar a interface comparable usando o tipo generico
//		da classe que ira comparar, assim possibilitando que
//		o TreeSet consiga orderar seus elementos. 
//		Set<String> set = new TreeSet<>();

//		LinkedHashSet tem velocidade intermediaria na ordem
//		em que são adicionados
		Set<String> set = new LinkedHashSet<>();

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

		set.removeIf(x -> x.charAt(0) == 'T');

		for (String p : set) {
			System.out.println(p);
		}

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		
//		------União------
//      Esta sendo criado um novo conjunto  C que é uma cópia da coleção A
		Set<Integer> c = new TreeSet<>(a);
//		Aqui está ocorrendo a união com o conjunto C com o conjunto B
		c.addAll(b);
		System.out.println(c);
		
//      ------Intersecção------
//      Esta sendo criando um novo conjunto D que é uma cópia do conjunto A
		Set<Integer> d = new TreeSet<>(a);
//		Todos os elementos que tem em comum com os conjuntos
		d.retainAll(b);
		System.out.println(d);
		
//		------Diferença------
//		Esta sendo criando um novo conjunto E que é uma cópia do conjunto A
		Set<Integer> e = new TreeSet<>(a);
//      Sera removido do conjunto E todos os elementos que está no conjunto B
		e.removeAll(b);
		System.out.println(e);
	}

}
