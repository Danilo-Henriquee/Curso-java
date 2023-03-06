package model.services;

import java.time.Duration;

import model.entities.CarRental;
import model.entities.Invoice;

public class RentalService {
	
	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerDay = pricePerDay;
		this.pricePerHour = pricePerHour;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		
		// aqui sera subtraida as horas da retirada e da entrega convertidos para minutos
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
		
		// aqui esta pegando a diferença em minutos dos horarios e fazendo
		// a divisão por 60 que são horas
		double hours = minutes / 60.0;
		
		// Math.ceil arredonda o numero para cima, acima do teto(ceil)
		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours / 24.0);
		}
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}
}
