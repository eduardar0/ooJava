package aaaaa_teste;

import java.util.Locale;

public class seila {

	public static void main(String[] args) {
		System.out.println("lero lero!");
		int x = 32;
		double y = 10.444;
		System.out.println(x);
		System.out.printf("%.2f%n", y);//printf para delimitar 2 casas decimais
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", y);
		//CONCATENAÇÃO: usar o operador + para concatenar: println(x + y + z...)
		//ex:
		System.out.println("Resultado da concatenação fica: " + x + " metros"); //com println
		//com printf
		System.out.printf("Resultado %.2f metros: %n", y);
		String nome = "Maria";
		int idadeaaa = 22;
		double renda = 6780.4444;
		System.out.printf("%s tem %d anos e recebe %.2f de renda %n", nome, idadeaaa, renda);
		System.out.println();
		
		//fixação
		
		String produto1 = "computador";
		String produto2 = "mesa de escritorio";
		
		int idade = 30;
		int code = 5290;
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double mesure = 53.234567;
		
		System.out.println("Produtos:");
		System.out.printf("%s , que o preço é %.2f%n", produto1, preco1);
		System.out.println();
		System.out.printf("%s , que o preço é %.2f%n:", produto2, preco2);
		System.out.println();
		System.out.printf("record: %d anos, code %d e genero %s: %n", idade, code, genero);
		
		System.out.println();
		System.out.printf("mensure com 8 casas decimais: %.8f%n", mesure);
		System.out.printf("Roudede com tres casas decimais: %.3f%n", mesure);
		
		
		 
		

	}

}
