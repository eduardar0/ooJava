package aplicattion;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		String nome = sc.nextLine();
		int numConta = sc.nextInt();
		double deposito = sc.nextDouble();
		
		if(deposito == 0) {
			conta.setNome(nome);
		}
		
		

	}

}
