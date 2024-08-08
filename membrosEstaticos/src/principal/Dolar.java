package principal;

import java.util.Locale;
import java.util.Scanner;

import help.Converter;

public class Dolar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double cotac = sc.nextDouble();
		double valor = sc.nextDouble();
		
		System.out.printf("O valor que será pago em reais será: %.2f", Converter.dolar(valor, cotac));		
	}

}
