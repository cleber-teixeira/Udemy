package exercicios;

import java.util.Scanner;

/** Programa que lê a senha e retorna 'Senha Invalida' ou 'Acesso Permitido'.
 * 
 * @author Cleber Teixeira
 * @category Exercícios
 * @section 6 - Estruturas repetitivas
 * @lesson 48 - Exercícios para iniciantes - Parte 3)
 */
public class exercicio_03 {
	/* TODO Um Posto de combustíveis deseja determinar qual de seus produtos tem
	 * a preferência de seus clientes. Escreva um algoritmo para ler o tipo de
	 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
	 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa
	 * de 1 a 4) deve ser solicitado um novo código (até que seja válido). O 
	 * programa será encerrado quando o código informado for o número 4. Deve ser
	 * escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que
	 * abasteceram cada tipo de combustível, conforme exemplo. */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = 0, alcool = 0, gasolina = 0, diesel = 0;
		
		System.out.println("Digite um tipo de combustível:"
				+ "\n1. Álcool\n2. Gasolina\n3. Diesel\n4. Fim");
		x = sc.nextInt();
		
		while (x != 4) {
			switch (x) {
				case 1:
					alcool += 1;
					break;
				case 2:
					gasolina += 1;
					break;
				case 3:
					diesel += 1;
					break;
				default:
					System.out.println("Código inválido! Digite novamente:");
			}
			System.out.println("\n1. Álcool\n2. Gasolina\n3. Diesel\n4. Fim");
			x = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO"
				+ "\nAlcool: " + alcool
				+ "\nGasolina: " + gasolina
				+ "\nDiesel: " + diesel);
		
		sc.close();
		
	}
}
