package estudos;

import java.util.Scanner;

public class enquanto_while {
	/** Programa que lê números inteiros e retorna a soma.
	 * 
	 * @author Cleber Teixeira
	 * @category Estudos
	 * @section 6 - Estruturas repetitivas
	 * @lesson 44 - Estrutura repetitiva enquanto (while)
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite valores inteiros que deseja somar:"
				+ "\n(obs.: para parar a entrada de valores digite '0')");
		int x = sc.nextInt();
		
		int soma = 0;
		
		// executa enquanto "x" for diferente de "0"
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		System.out.println("Soma Total: " + soma);
		
		sc.close();

	}

}
