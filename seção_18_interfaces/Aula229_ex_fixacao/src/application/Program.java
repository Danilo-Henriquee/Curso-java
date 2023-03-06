package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;
import services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = sc.nextDouble();
		
		// aqui foi instanciado um novo contrato que não possui ainda
		// as parcelas, um contrato vazio.
		Contract obj = new Contract(number, date, totalValue);
		
		// aqui está sendo inserido o numero de parcelas que esse
		// contrato irá possuir.
		System.out.print("Entre com o numero de parcelas: ");
		int n = sc.nextInt();
		
		// aqui está sendo instanciado um objeto que irá processar o
		// contrato e criar as parcelas
		ContractService contractService = new ContractService(new PaypalService());
		
		// aqui está sendo criada as parcelas passando o contrato como
		// primeiro argumento e o segundo argumento o numero de parcelas
		// que esse contrato ira possuir
		contractService.processContract(obj, n);
		
		System.out.println("Parcelas: ");
		// esse for ele vai percorrer a lista que possui todas as
		// parcelas(installment) que foram instanciadas
		for(Installment installment : obj.getInstalments()) {
			System.out.println(installment);
		}
		
		sc.close();
	}

}
