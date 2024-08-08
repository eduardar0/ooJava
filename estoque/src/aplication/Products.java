package aplication;

public class Products {
	private String name;  //definindo os tipos da classe, igual struct
	private double price;
	private int quantity;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}


	public Products() {
		
	}
	
	public Products(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Products(String name, double price) {
		this.name = name;
		this.price = price;
	
	}
	public double totalValueinStok() //funções que podem ser usadas dentro de uma classe
	{
		return price*quantity;
	}
	public void addProducts(int quantity)
	{
		this.quantity += quantity;
	}
	public void removeProducts(int quantity)
	{
		this.quantity -= quantity;
	}
	
	public String toString()   //IMPORTANTE: toString para formatar o print na classe principal
	{
		return name
				+", $ "
				+String.format("%.2f", price) //definir casas decimais  (STRING.FORMAT)
				+", "
				+quantity
				+" units, total: $ "
				+String.format("%.2f", totalValueinStok());
							
	}


}
