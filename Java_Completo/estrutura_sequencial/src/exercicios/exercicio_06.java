package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06 {
	/* TODO Fazer um programa que leia três valores com ponto flutuante
	 * de dupla precisão: A, B e C. Em seguida, calcule e mostre:
	 * 
	 * a) a área do triângulo retângulo que tem A por base e C por altura.
	 * b) a área do círculo de raio C. (pi = 3.14159)
	 * c) a área do trapézio que tem A e B por bases e C por altura.
	 * d) a área do quadrado que tem lado B.
	 * e) a área do retângulo que tem lados A e B.  */

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float a, b, c, pi, triangle, circle, trapeze, square, rectangle;
		pi = 3.14159f;
		
		System.out.println("Digite 3 valores para calcular áreas:");
		
		System.out.print("\nDigite o valor A: ");
		a = sc.nextFloat();
		
		System.out.print("\nDigite o valor B: ");
		b = sc.nextFloat();
		
		System.out.print("\nDigite o valor C: ");
		c = sc.nextFloat();
		
		triangle = a * c / 2;
		circle = (float) (pi * Math.pow(c, 2));
		trapeze = ((a + b) * c) / 2;
		square = (float) Math.pow(b, 2);
		rectangle = a * b;
				
		System.out.printf("\nTRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%n"
				+ "QUADRADO: %.3f%nRETANGULO: %.3f%n", triangle, circle, trapeze,
				square, rectangle);
		
		sc.close();
	}
}
