package exercicios;

import java.util.Scanner;

/** Programa que lê a senha e retorna 'Senha Invalida' ou 'Acesso Permitido'.
 * 
 * @author Cleber Teixeira
 * @category Exercícios
 * @section 6 - Estruturas repetitivas
 * @lesson 48 - Exercícios para iniciantes - Parte 3)
 */
public class exercicio_02 {
	/* TODO Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
	 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever
	 * o quadrante a que ele pertence. O algoritmo será encerrado quando pelo 
	 * menos uma de duas coordenadas for NULA (nesta situação sem escrever
	 * mensagem alguma).
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = 1, y = 1;
		String result;
		
		System.out.println("Digite as coordenadas x e y do sistema carteziano.");
		
		System.out.print("\nX: ");
		x = sc.nextInt();
		System.out.print("\nY: ");
		y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			
			if (x > 0 && y > 0) {
				result = "\nprimeiro";
			} else if (x < 0 && y > 0) {
				result = "segundo";
			} else if (x < 0 && y < 0) {
				result = "\nterceiro";
			} else {
				result = "\nquarto";
			}
			
			System.out.println(result);

			System.out.print("\nX: ");
			x = sc.nextInt();
			System.out.print("\nY: ");
			y = sc.nextInt();
		}
		
		sc.close();
		
	}
}
