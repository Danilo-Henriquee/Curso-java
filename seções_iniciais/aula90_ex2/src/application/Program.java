package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros vai digitar?");
		int n = sc.nextInt();
		double[] vect = new double[n];

		double sum = 0;
		double avg = 0;
		for (int i = 0; i < vect.length ; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < vect.length ; i++) {
			sum += vect[i]; 
			avg = sum / vect.length;
		}
		
		System.out.print("\nVALORES = ");
		
		for (int i = 0; i < vect.length ; i++) {
			System.out.printf("%.1f ", vect[i]);
		}
		
		System.out.println("\nSOMA = " + sum);
		System.out.println("MEDIA = " + avg);
		
		sc.close();
	}

}
