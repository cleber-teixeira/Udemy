package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_07 {
	/* TODO Leia 2 valores com uma casa decimal (x e y), que devem
	 * representar as coordenadas de um ponto em um plano. A seguir,
	 * determine qual o quadrante ao qual pertence o ponto, ou se
	 * está sobre um dos eixos cartesianos ou na origem (x = y = 0).
	 * Se o ponto estiver na origem, escreva a mensagem “Origem”.
	 * Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou
	 * “Eixo Y”, conforme for a situação. */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorX, valorY;
		
		System.out.println("Digite dois valores que representem x e y.");
		
		System.out.print("\nValor X: ");
		valorX = sc.nextDouble();
		
		System.out.print("\nValor y: ");
		valorY = sc.nextDouble();
		
		if (valorX > 0 && valorY > 0) {
			System.out.println("\nQ1");
		} else if (valorX < 0 && valorY > 0) {
			System.out.println("\nQ2");
		} else if (valorX < 0 && valorY < 0) {
			System.out.println("\nQ3");
		} else if (valorX > 0 && valorY < 0) {
			System.out.println("\nQ4");
		} else {
			System.out.println("\nOrigem");
		}
		
		sc.close();
	}
}
