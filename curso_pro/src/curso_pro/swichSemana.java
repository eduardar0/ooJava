package curso_pro;

import java.util.Scanner;

public class swichSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int semana;
		semana = sc.nextInt();
		String dia;

		switch (semana) {
		case 1:
			dia = "Domingo";
			break;

		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Valor invalido";
			break;

		}

		System.out.printf("Dia da semana: %s", dia);

		sc.close();

	}

}
