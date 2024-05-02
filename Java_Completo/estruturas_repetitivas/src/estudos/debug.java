package estudos;

import java.util.Locale;
import java.util.Scanner;

public class debug {
	// TODO Programa que calcula o preço do terreno.

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a largura do terreno: ");
		double largura = sc.nextDouble();
		
		System.out.print("Digite o comprimento do terreno: ");
		double comprimento = sc.nextDouble();
		
		System.out.print("Digite o valor do m²: ");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("\nAREA = %.2f%n", area);
		System.out.printf("PRECO = R$ %.2f%n", preco);
		
		sc.close();
		
	}
}
