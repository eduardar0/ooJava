package principal;

import java.util.Locale;
import java.util.Scanner;

import aplication.Studant;

public class Aluno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Studant classe = new Studant();
		
		System.out.println("Digite o nome do aluno:");
		classe.nome = sc.nextLine();
		
		System.out.println("Nota 1:");
		classe.nota1 = sc.nextDouble();
		
		System.out.println("Nota 2:");
		classe.nota2 = sc.nextDouble();
		
		System.out.println("Nota 3:");
		classe.nota3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL: %.2f", classe.notaFinal());
		
		if(classe.faltantes() != 0)
		{
			System.out.println("Reprovado");
			System.out.printf("Faltaram %.2f pontos para a aprovação", classe.faltantes());
		}
		else
		{
			System.out.println("");
			System.out.println("Aprovado");
		}
		

	}

}
