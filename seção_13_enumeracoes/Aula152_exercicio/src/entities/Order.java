package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	Date moment = new Date();
	private OrderStatus status;
	private Client client;
	private List<OrderItem> OrderItens = new ArrayList<>();
	
	public Order() {
		
	}
	
	public Order(OrderStatus status, Client client) {

		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public List<OrderItem> getOrderItens() {
		return OrderItens;
	}	
	
	public void addItem(OrderItem order) {
		OrderItens.add(order);
	}
	
	public void removeItem(OrderItem order) {
		OrderItens.remove(order);
	}

	public Double total() {
		double total = 0;
		
		for (OrderItem itens : OrderItens) {
			total += itens.subTotal();
		}
		
		return total;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		System.out.println();
		sb.append("ORDER SUMMARY: \n");
		sb.append("Order moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: " );
		sb.append(client + "\n");
		sb.append("Order items:\n");
		for (OrderItem item : OrderItens) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
}
