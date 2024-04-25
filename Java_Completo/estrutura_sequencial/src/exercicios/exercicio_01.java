package exercicios;

import java.util.Scanner;

public class exercicio_01 {
	/* TODO Faça um programa para ler dois valores inteiros,
	 * e depois mostrar na tela a soma desses números com uma
	 * mensagem explicativa, conforme exemplos. */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int value01, value02, result;
		
		System.out.println("Soma de dois valores inteiros.\n");
		System.out.println("Digite o primeiro valor:");
		value01 = sc.nextInt();
		System.out.println("\nDigite o segundo valor:");
		value02 = sc.nextInt();
		
		result = value01 + value02;
		System.out.println("\nSOMA = " + result);
		
		sc.close();
	}

}
