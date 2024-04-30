package exercicios;

import java.util.Scanner;

public class exercicio_04 {
	/* TODO Leia a hora inicial e a hora final de um jogo. A seguir
	 * calcule a duração do jogo, sabendo que o mesmo pode começar
	 * em um dia e terminar em outro, tendo uma duração mínima de 1
	 * hora e máxima de 24 horas. */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int startTime, endTime, gameDuration;
		
		System.out.println("Digite a hora inicial e final de um jogo.");
		
		System.out.print("\nHora inicial: ");
		startTime = sc.nextInt();
		
		System.out.print("\nHora final: ");
		endTime = sc.nextInt();
		
		if (startTime >= endTime) {
			gameDuration = (24 - startTime) + endTime;
		} else {
			gameDuration = endTime - startTime;
		}
		
		System.out.println("\nO JOGO DUROU " + gameDuration + " HORA(S)");
		
		sc.close();
	}
}
