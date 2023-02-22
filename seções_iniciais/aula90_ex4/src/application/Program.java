package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quanto numeros serão digitados? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();

		}
		
		int totalPair = 0;
		System.out.println();
		System.out.println("NUMEROS PARES: ");
		for(int i = 0; i < vect.length; i++) {
			
			if (vect[i] % 2 == 0) {
				System.out.print(vect[i] + "  ");
				totalPair++;
			}
		}
		System.out.println();
		System.out.println("\nQUANTIDADE DE PARES = " + totalPair);
		
		sc.close();
	}

}
