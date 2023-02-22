package expressaoTernaria;

public class Main {

	public static void main(String[] args) {
//		double preco = 34.5;
//		double desconto;
//		
// Método tradicional	
//		if(preco < 20.0) {
//			desconto = preco * 0.1;
//		}
//		else {
//			desconto = preco * 0.05;
//		}

// Simplificando usando operação ternária
		double preco = 34.5;
		// caso o preço seja menor que 20.0 preco * 0.1
		// caso contrario preco * 0.05
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		
	}

}
