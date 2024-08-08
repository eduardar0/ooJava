package orientacaoObj;

import java.util.Scanner;

import entidade.TriangleCerto;

public class Program {

	public static void main(String[] args) {
		
		TriangleCerto x, y;
		x = new TriangleCerto();
		y = new TriangleCerto();
		
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Coloque as medidas do triangulo x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c= sc.nextDouble();
		
		System.out.println("Coloque as medidas do triandulo y: ");
		
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double area;
		area = x.area();
		
		System.out.printf("Area dp triangulo x: %.2f%n", area);
		
		
		double area2;
		area2 = y.area();  
		System.out.printf("Area dp triangulo y: %.2f%n", area2);
		
		if(area>area2)
		{
			System.out.printf("O valor maior é X: ");
		}
		else
		{
			System.out.printf("O valor maior é Y: ");
		}
		
		
 
		sc.close();
	}

}
