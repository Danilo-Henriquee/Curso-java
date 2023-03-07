package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Teste";
		String s2 = "Test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		
		/* Nesta linha de código a comparação utilizando
		 * igual e igual retorna falso pois essa operação
		 * não compara o conteudo em si do objeto, mas sim
		 * a sua referência de memoria que é diferente */
		System.out.println(c1 == c2);
		
		/* Nesta linha irá retornar True, pois o compilador
		 * enxerga que foi declarado de forma literal as duas
		 * Strings então ele trata de forma especial */ 
		System.out.println(s1 == s2);
	}

}
