package exercicio2;

import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Aplication2 var = new Aplication2();
		
		System.out.println("Digite o nome:");
		
		var.nome = sc.nextLine();//nextLine pra ler string
		
		System.out.println("Digiite o salario bruto:");
		var.salarioBruto = sc.nextDouble();
		
		System.out.println("digite o total de impostos a serem cobrados:");
		var.imposto = sc.nextDouble();
		
		System.out.printf("Nome: %s %nsalario: %.2f %n", var.nome,var.netSasary());
		
		System.out.println();
		
		System.out.println("quanto deseja aumentar o salário:");
		
		double porcent = sc.nextDouble();
		
		System.out.printf("Salario atualizado: %.2f", var.increaseSalary(porcent)-var.imposto);
		
		
		
		
		sc.close();

	}

}
