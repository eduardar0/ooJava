package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //para mudar o formato 0,00 para 0.00 
		Scanner sc = new Scanner(System.in); //função para conseguir usar o scan
		
		 //declarando a variável do tipo Products, igual na linguagem C com struct
		System.out.println("Enter the product data:");
		System.out.print("Name:");
		String name = sc.nextLine(); //colocando valor com a entrada de dados para a variavel nome
		System.out.print("Price:");
		double price= sc.nextDouble(); //colocando valor com a entrada de dados para a variavel preço
		System.out.printf("Quantity on strock: ");
		int quantity= sc.nextInt(); //colocando valor com a entrada de dados para a variavel quantidade
		
		Products product = new Products(name, price, quantity);
		
		System.out.println(" ");
		//double total = product.totalValueinStok();
		//System.out.printf("Product Data: %s, price:$ %.2f, quantity on stock: %d, total: $ %.2f %n", product.name, product.price, product.quantity, total);
		System.out.println("Product data:" + product);
		
		System.out.println(" ");
		System.out.println("Enter the number os products to be added in the strock:");
		int x; 
		x = sc.nextInt();
		product.addProducts(x);
		
		System.out.println(" ");

		System.out.println("Updated data:" + product);
		
		System.out.println("Enter the number os products to be less in the strock:");
		
		int y = sc.nextInt();
		product.removeProducts(y);
		System.out.println(" ");
		
		System.out.println("Updated data:" + product);
		
		
		
		
		
		//COMENTARIOS NA CLASSE ---------------
		
		sc.close();

	}

}
