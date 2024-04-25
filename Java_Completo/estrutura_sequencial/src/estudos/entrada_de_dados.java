package estudos;
import java.util.Locale;
import java.util.Scanner;

public class entrada_de_dados {

	public static void main(String[] args) {
		
		// cololar Locale para aceitar pontos flutuantes
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// capturar string
		String x;
		System.out.println("Digite uma palavra:");
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		// capturar inteiro
		int y;
		System.out.println("\nDigite um número inteiro:");
		y = sc.nextInt();
		System.out.println("O número que você digitou foi: " + y);
		
		// capturar ponto flutuante
		double a;
		System.out.println("\nDigite um número flutuante:");
		a = sc.nextDouble();
		System.out.println("O número flutuante digitado é: " + a);
		
		
		// capturar um caractere
		char b;
		System.out.println("\nDigite um caracter:");
		b = sc.next().charAt(0);
		System.out.println("O caracter digitado é: " + b);
		
		// capturar vários dados na mesmo linha
		String c;
		int d;
		double e;
		System.out.println("\nDigite uma String:, um inteiro e um double");
		c = sc.next();
//		System.out.println("Digite um inteiro:");
		d = sc.nextInt();
//		System.out.println("Digite um double:");
		e = sc.nextDouble();
		
		System.out.println("\nDados digitados:");
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

		// capturar texto
		String s1, s2, s3;
		System.out.println("\nDigite três parágrafos:");
		/* sc.nextLine(); corrige pequeno bug de não contar uma quebra
		 * de linha a menos (limpar o buffer de leitura) */ 
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("\nDados digitados:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
		
	}

}
