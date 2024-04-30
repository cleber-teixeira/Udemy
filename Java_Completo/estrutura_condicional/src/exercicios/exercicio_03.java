package exercicios;

import java.util.Scanner;

public class exercicio_03 {
	/* TODO Leia 2 valores inteiros (A e B). Após, o programa deve
	 * mostrar uma mensagem "Sao Multiplos" ou "Nao sao Multiplos",
	 * indicando se os valores lidos são múltiplos entre si.
	 * Atenção: os números devem poder ser digitados em ordem
	 * crescente ou decrescente. */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valorA, valorB, result;
		
		System.out.println("Digite dois valores inteiros:");

		System.out.print("Digite o valor A: ");
		valorA = sc.nextInt();
		
		System.out.print("\nDigite o valor B: ");
		valorB = sc.nextInt();
		
		if (valorA >= valorB) {
			result = valorA % valorB;
		} else {
			result = valorB % valorA;
		}
		
		if (result == 0) {
			System.out.println("\nSao Multiplos");
		} else {
			System.out.println("\nNao sao Multiplos");
		}
		
		sc.close();
	}
}
