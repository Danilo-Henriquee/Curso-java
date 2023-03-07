package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
		List<Double> myDoubles = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
		copy(myInts, myObjs);
		printList(myObjs);
		copy(myDoubles, myObjs);
		printList(myObjs);
	}

	/* A primeira lista a ser passada ela pode ser do tipo Number 
	 * ou de qualquer subtipo de Number(Integer, Double, Float)
	 * 
	 * A segunda lista a ser passada ela pode ser do tipo Number
	 * ou qualquer subtipos do supertipos de Number que só tem
	 * o Object que tem os subtipos String, Character, Boolean e Number */
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number number : source) {
			destiny.add(number);
		}
	}
	/* Resumindo a covariancia pode acessar porém não pode inserir 
	 * ja na contravariancia que acessa os supertipos ela não pode
	 * acessar mas pode inserir novos dados em sua coleção */
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
}
