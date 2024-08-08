package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidade.programa;

public class Ex1Triangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		programa triang = new programa();
		
		System.out.println("coloque as medidas do triangulo:");
		
		triang.altura = sc.nextDouble();
		triang.base = sc.nextDouble();
		
		System.out.printf("Area do triangulo %.2f %n:", triang.area());
		System.out.printf("Perimetro do triangulo %.2f %n:", triang.perimetro());
		System.out.printf("Diagonal do triangulo %.2f %n:", triang.diagonal());
		
		
		
		sc.close();
		
		//É DE UM RETANGULOOOOOOOOO
		
		

	}

}
