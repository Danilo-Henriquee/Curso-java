package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	// Esse serviço ContractService sera responsavel por processar 
	// o contrato e gerar os objetos das parcelas
	
	// ContractService possui uma dependência do OnlinePaymentService
	private OnlinePaymentService onlinePaymentService;

	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	// aqui é onde sera processada as parcelas(installments) do contrato
	public void processContract(Contract contract, int months) {

		/* Para ser geradas as parcelas é preciso pegar o valor
		 * do contrato e dividir pelo numero de parcelas que é
		 * o que esta sendo feito nessa váriavel abaixo 
		 * onde contract.getTotalValue() esta pegando o valor total
		 * e dividindo pelo numero de meses ou numero de parcelas.*/
		double basicQuota = contract.getTotalValue() / months;
		
		/* 	esse for ira realizar o loop até o numero de meses que foi
		passado la na classe principal e ira ser geradas as parcelas
		em cima do numero de meses que foi passado se for passado 3
		serão geradas 3 parcelas */
		for (int i = 1; i <= months; i++) {
			/* a parcela ela precisa ser 1 mes a mais que o mes que
			foi passado, então aqui está pegando a data do contrato
			e somando com plusMonths() + 1 no mes da parcela
			utilizando a variavel de controle do for. */
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			/* juros 
			 * primeiro argumento está sendo passado a quantia do contrato dividido
			 * pelo numero de meses ou parcelas
			 * no segundo, está sendo passado o numero de meses ou parcelas
			 * 
			 * esse método funciona aplicando 1% em cima da parcela que é 200
			 * multiplicado por i que é o numero de meses, então no primeiro mes
			 * vai ser 1% em cima de 200, no segundo 2% em cima de 200
			 * no terceiro mês 3%*/
			double interest = onlinePaymentService.interest(basicQuota, i);
			
			/* taxa
			 * está sendo passado o basicQuota que é 200 mais o valor
			 * do juros calculado no interest que no primeiro loop é 1% de 200,
			 * no segundo loop é 2% de 200 no terceiro 3% de 200. */
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			
			// a quota é o valor cheio da parcela que deve ser paga
			// basicQuota(200) + interest(200 * 1%) + fee(200 + (200 * 1% = 2))
			double quota = basicQuota + interest + fee;
			
			// aqui está sendo adicionada uma parcela a cada loop do for na lista
			// de parcelas que o contrato possui
			contract.getInstalments().add(new Installment(dueDate, quota));
		}
	}
}
