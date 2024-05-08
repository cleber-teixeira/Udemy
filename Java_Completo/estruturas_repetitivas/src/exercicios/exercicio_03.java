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
		
		int x;
		
		System.out.println("Digite um tipo de combustível ou 4 para sair:");
		
		sc.close();
		
	}
}
