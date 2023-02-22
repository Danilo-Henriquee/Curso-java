package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pearson;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();
		
		Pearson[] vect = new Pearson[n];
		
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			
			System.out.print("Name: ");
			String name = sc.next();
			
			System.out.print("Age: ");
			int age = sc.nextInt();
			
			System.out.print("Height: ");
			double height = sc.nextDouble();
			
			vect[i] = new Pearson(name, age, height);
		}
		
		int minors = 0;
		double heightTotal = 0;
		for (int i = 0; i < vect.length; i++) {
			heightTotal += vect[i].getHeight();
			if (vect[i].getAge() < 16) {
				minors++;
			}
		}
		
		double heightAvg = heightTotal / n;
		System.out.printf("Altura média: %.2f%n", heightAvg);
		
		double percentageMinors = ((double)minors / n) * 100.0;
		System.out.printf("Percentual de pessoas com menos de 16 anos: %.1f%%", percentageMinors);
		
		sc.close();
	}

}
