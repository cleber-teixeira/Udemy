package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {
	/* TODO Você deve fazer um programa que leia um valor qualquer e
	 * apresente uma mensagem dizendo em qual dos seguintes intervalos
	 * ([0,25], [25,50], [50,75], [75,100]) este valor se encontra.
	 * Obviamente se o valor não estiver em nenhum destes intervalos,
	 * deverá ser impressa a mensagem “Fora de intervalo”. */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double value;
		
		System.out.print("Digite um valor: ");
		value = sc.nextDouble();
		
		if (value < 0 || value > 100) {
			System.out.println("Fora de intervalo");
		} else if (value <= 25) {
			System.out.println("\nIntervalo [0,25]");
		} else if (value <= 50) {
			System.out.println("\nIntervalo [25,50]");
		} else if (value <= 75) {
			System.out.println("\nIntervalo [50,75]");
		} else {
			System.out.println("\nIntervalo [75,100]");
		}
		sc.close();
	}
}
