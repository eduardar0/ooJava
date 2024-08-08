package apliacation;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		double x, y;
		double x1,x2,x3, y1,y2,y3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque as medidas do triangulo x: ");
		x1 = sc.nextDouble();
		x2 = sc.nextDouble();
		x3 = sc.nextDouble();
		
		System.out.println("Coloque as medidas do triandulo y: ");
		
		y1 = sc.nextDouble();
		y2 = sc.nextDouble();
		y3 = sc.nextDouble();
		
		double p = (x1 + x2 + x3)/2.0;
		x = Math.sqrt(p*(p-x1)*(p-x2)*(p-x3));
		
		System.out.printf("Area dp triangulo x: %.2f%n", x);
		
		double p2 = (y1 + y2 + y3)/2.0;
		y = Math.sqrt(p2*(p2-y1)*(p2-y2)*(p2-y3)); 
		System.out.printf("Area dp triangulo y: %.2f%n", y);
		
		if(x>y)
		{
			System.out.printf("O valor maior é X: ", x);
		}
		else
		{
			System.out.printf("O valor maior é Y: ", y);
		}
		
		
 
		sc.close();
	}

}
