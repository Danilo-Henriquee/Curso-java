package aula72_ex;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double dolPrice = sc.nextDouble();

		System.out.print("How many dollars will be bought? ");
		double dolQuantity = sc.nextDouble();

		double result = CurrencyConverter.converter(dolPrice, dolQuantity);

		System.out.printf("Amount to be paid in reais = %.2f", result);

		sc.close();
	}

}
