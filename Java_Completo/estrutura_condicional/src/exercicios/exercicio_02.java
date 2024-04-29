package exercicios;

import java.util.Scanner;

public class exercicio_02 {
	/* TODO Fazer um programa para ler um número inteiro
	 * e dizer se este número é par ou ímpar. */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int num = sc.nextInt();
		num = num % 2;
		
		if (Math.abs(num) == 1) {
			System.out.println("IMPAR");
		} else {
			System.out.println("PAR");
		}
		
		sc.close();
	}
}
