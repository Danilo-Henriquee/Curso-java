package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		// Principio GET/PUT
		
		// Covariância
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		
		/* Esta lista esta sendo instanciada que pode ser de qualquer
		 * tipo que seja um subtipo de number ou seja, Integer, Float,
		 * Double e etc
		 * */
		List<? extends Number> list = intList;
		
		Number x = list.get(0);
		
		/* Diferentemente da contravariancia o comando put/add não e
		 * possivel na covariancia pois o compilador não entende se
		 * o tipo do numero que foi inserido no add que no caso é 
		 * integer é compativel com qualquer subtipo de Number, o
		 * compilador não pode realizar essa operação */ 
		list.add(20);
		
		// Contravariância
		List<Object> myObjs = new ArrayList<Object>();
		/* É possivel inserir Strings em uma lista do tipo object pois
		 * String é um subtipo/subclasse de Object, assim como number */
		myObjs.add("Maria");
		myObjs.add("Alex");
		
		/* Nessa lista ela aceita qualquer Number ou super tipo de
		 * Number ou seja Object que abrange todos os tipos como String
		 * Character e boolean também são aceitos nessa classe */
		List<? super Number> myNums = myObjs;
		
		myNums.add(10);
		myNums.add(3.14);
		
		/* Não é permitido acessar valores em uma lista como esta
		 * porque o valor pode ser tanto um Number ou um super tipo 
		 * de number, então essa atribuição não é permitida */
		Number x = myNums.get(0);
	}

}
