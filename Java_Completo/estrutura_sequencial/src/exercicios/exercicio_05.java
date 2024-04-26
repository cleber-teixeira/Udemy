package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
	/* TODO Fazer um programa para ler o código de uma peça 1,
	 * o número de peças 1, o valor unitário de cada peça 1, o
	 * código de uma peça 2, o número de peças 2 e o valor unitário
	 * de cada peça 2. Calcule e mostre o valor a ser pago.*/

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int partCode1, partQuantity1, partCode2, partQuantity2;
		double unitValue1, unitValue2, total;
		
		System.out.print("Digite o códio do produto 1: ");
		partCode1 = sc.nextInt();
		
		System.out.print("\nDigite a quantidade do produto 1: ");
		partQuantity1 = sc.nextInt();
		
		System.out.print("\nDigite o valor unitário do produto 1: ");
		unitValue1 = sc.nextDouble();
		
		System.out.print("\nDigite o códio do produto 2: ");
		partCode2 = sc.nextInt();
		
		System.out.print("\nDigite a quantidade do produto 2: ");
		partQuantity2 = sc.nextInt();
		
		System.out.print("\nDigite o valor unitário do produto 2: ");
		unitValue2 = sc.nextDouble();
		
		total = (double) partQuantity1 * unitValue1 + partQuantity2 * unitValue2;
		
		System.out.printf("\nVALOR A PAGAR: R$ %.2f%n", total);
			
		sc.close();
	}

}
