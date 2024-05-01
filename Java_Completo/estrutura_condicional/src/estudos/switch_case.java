package estudos;

import java.util.Scanner;

public class switch_case {
	/* TODO Fazer um programa para ler um valor inteiro de 1 a 7 representando
	 * um dia da semana (sendo 1 = domingo, 2 = segunda, e assim por diante).
	 * Escrever na tela o dia da semana correspondente. */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número representando o dia da semana: ");
		
		int x = sc.nextInt();
		String dia;

		switch (x) {
		case 1:
			dia = "domingo";
			break;
		case 2:
			dia = "segunda";
			break;
		case 3:
			dia = "terça";
			break;
		case 4:
			dia = "quarta";
			break;
		case 5:
			dia = "quinta";
			break;
		case 6:
			dia = "sexta";
			break;
		case 7:
			dia = "sábado";
			break;
		default:
			dia = "valor inválido";
			break;
		}
		
		System.out.println("\nDia da semana: " + dia);
		
		sc.close();
	}

}
