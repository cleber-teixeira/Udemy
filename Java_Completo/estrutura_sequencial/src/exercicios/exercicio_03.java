package exercicios;

import java.util.Scanner;

public class exercicio_03 {
	/* TODO Fazer um programa para ler quatro valores inteiros A, B, C e D.
	 * A seguir, calcule e mostre a diferença do produto de A e B pelo produto
	 * de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, d, diferenca;
		
		System.out.println("Para saber a diferença do produto de A e B\npelo produto"
				+ " de C e D, digite 4 valores inteiros:");
		
		System.out.print("\nDigite o valor A: ");
		a = sc.nextInt();
		
		System.out.print("\nDigite o valor B: ");
		b = sc.nextInt();
		
		System.out.print("\nDigite o valor C: ");
		c = sc.nextInt();
		
		System.out.print("\nDigite o valor D: ");
		d = sc.nextInt();
		
		diferenca = a * b - c * d;
		
		System.out.println("\nDIFERENCA = " + diferenca);
		sc.close();

	}

}
