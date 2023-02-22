package expressoesCasting;

public class Main {

	public static void main(String[] args) {
		// Quando eu fizer uma expressão com dois numeros inteiros
		// mas querer que o resultado retorne double ou float
		// utiliza-se o (double) que é um método chamado casting

//		int a = 5;
//		int b = 2;
		
		// método casting, conversão explicita dos valores
//		double resultado = (double) a / b;
//		System.out.print(resultado);
		
		double a;
		int b;
		a = 5.0;
		b = (int) a;
		
		System.out.println(b);
	}

}
