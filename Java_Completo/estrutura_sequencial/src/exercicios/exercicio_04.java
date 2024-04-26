package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04 {
	/* TODO Fazer um programa que leia o número de um funcionário,
	 * seu número de horas trabalhadas, o valor que recebe por hora
	 * e calcula o salário desse funcionário. A seguir, mostre o número
	 * e o salário do funcionário, com duas casas decimais. */

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int employeeNumber, hours;
		double valuePerHour, salary;
		
		System.out.print("\nDigite o nº do funcionário: ");
		employeeNumber = sc.nextInt();
		
		System.out.print("\nDigite as horas trabalhadas: ");
		hours = sc.nextInt();
		
		System.out.print("\nDigite o valor por hora trabalhada: ");
		valuePerHour = sc.nextDouble();
		
		salary = (double) hours * valuePerHour;
		
		System.out.println("\nNUMBER = " + employeeNumber);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
	}

}
