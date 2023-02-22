package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	// Criando um construtor personalizado que obriga que eu
	// insira os valores dos atributos na sua instanciação
	public Product(String name, double price, int quantity) {
		// o this está reverenciando ao atributo da classe na
		// 5 linha que está recebendo como valor o argumento passado
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " + this.quantity 
				+ " units, total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}
