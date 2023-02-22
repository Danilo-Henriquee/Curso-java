package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		int total = 0;
		int pairNum = 0;
		boolean control = false;
		for (int i = 0;i < n; i++) {
			System.out.println("Digite um numero: ");
			vect[i] = sc.nextInt();
			
			if (vect[i] % 2 == 0) {
				total += vect[i];
				pairNum++;
				control = true;
			} 
		}
		
		if (control == true) {
			double average = total / pairNum;
			
			System.out.printf("MEDIA DOS PARES = %.1f", average);
		} 
		else {
			System.out.println("NENHUM NUMERO PAR");
		}
			
		sc.close();
	}

}
