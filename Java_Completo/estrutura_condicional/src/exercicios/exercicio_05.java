package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
	/* TODO Com base na tabela abaixo, escreva um programa que
	 * leia o código de um item e a quantidade deste item. A
	 * seguir, calcule e mostre o valor da conta a pagar. */
	
	/*
		_______________________________________
		CODIGO		ESPECIFICAÇÃO		PREÇO
		_______________________________________
		1			Cachorro Quente		R$ 4.00
		2			X-Salada			R$ 4.50
		3			X-Bacon				R$ 5.00
		4			Torrada simples		R$ 2.00
		5			Refrigerante		R$ 1.50
		_______________________________________
	*/

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod, qtde;
		double total;
		
		System.out.println("________________________________________\n"
				+ "CODIGO	ESPECIFICAÇÃO		PREÇO\n"
				+ "________________________________________\n"
				+ "1	Cachorro Quente		R$ 4.00\n"
				+ "2	X-Salada		R$ 4.50\n"
				+ "3	X-Bacon			R$ 5.00\n"
				+ "4	Torrada simples		R$ 2.00\n"
				+ "5	Refrigerante		R$ 1.50\n"
				+ "________________________________________");
		
		System.out.println("\nDigite o código e a quantidade do produto com base no menu.");
		
		System.out.print("\nCódigo: ");
		cod = sc.nextInt();
		
		if (cod < 1 || cod > 5) {
			System.out.println("Código não identificado!");
		} else {

			System.out.print("\nQuandidade: ");
			qtde = sc.nextInt();
			
			if (cod == 1) {
				total = 4.00 * qtde;
			} else if (cod == 2) {
				total = 4.50 * qtde;
			} else if (cod == 3) {
				total = 5.00 * qtde;
			} else if (cod == 4) {
				total = 2.00 * qtde;
			} else {
				total = 1.50 * qtde;
			}
			System.out.printf("\nTotal: R$ %.2f%n", total );
		}

		sc.close();
	}
}
