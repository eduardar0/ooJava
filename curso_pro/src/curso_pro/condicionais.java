package curso_pro;

import java.util.Scanner;

public class condicionais {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int minutos;
		minutos = sc.nextInt();
		double valor = 50.0;

		if (minutos < 100) {
			System.out.printf("Valor a pagar: %.2f%n", valor);
		} else {
			valor += (minutos - 100) * 2;
			System.out.printf("Valor a pagar: %.2f%n", valor);
		}

		sc.close();

	}

}
