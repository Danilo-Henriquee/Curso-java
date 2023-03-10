package exercicioFixacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
//		System.out.printf("Products:%n"
//				+ "Computer, which price is $ %.2f%n"
//				+ "Office desk, which price is $ %.2f%n"
//				+ "%nRecord: %d years old, code %d and gender: %s%n"
//				+ "Measure with eight decimal places: %f%n"
//				+ "Rouded (Three decimal places): %.3f%n"
//				+ "US decimal point: %.3f", price1, price2, age, code
//				, gender, measure, measure, measure);
		System.out.println("\tProducts:");
		System.out.println("Computer, which price is $ " + price1);
		System.out.println("Office desk, which price is $ " + price2);
		System.out.print("\nRecord: " + age + " years old, code " + code + " and gender: " + gender + "\n");
		System.out.printf("Measure with eight decimal places: %.8f%n", measure);
		System.out.printf("Rouded (Three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
	}

}
