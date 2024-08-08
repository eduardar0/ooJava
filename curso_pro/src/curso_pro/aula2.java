package curso_pro;

import java.util.Scanner;

public class aula2 {

	public static void main(String[] args) {
		
		//31/01- leitura de dados 
		//primeiro: declarar uma variável do tipo Scanner e importar java.util.Scanner
		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next(); //funciona como o scaf pu inuput em outras linguagens
		System.out.println("Voce digitou:"  + x); //Sysout cntr + espaço vira System.out.println
		sc.close(); //NÃO ESQUECER DE FEIXAR A CLASSE!!!!!!!!!	
		
		

	}

}
