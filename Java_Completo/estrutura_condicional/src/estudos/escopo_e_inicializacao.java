package estudos;

public class escopo_e_inicializacao {
	// TODO Exemplo de Escopo e Inicialização de Variável

	public static void main(String[] args) {

		double price = 400.00;
		
		double discount;
		
		if (price < 200.00) {
			discount = price * 0.1;
		} else {
			discount = 0;
		}
		
		System.out.println(discount);
	}
}