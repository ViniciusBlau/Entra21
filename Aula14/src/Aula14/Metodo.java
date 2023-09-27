package Aula14;

public class Metodo {

	public static void main(String[] args) {
		
		String nome = "Blau";
		name(nome);
		media();
		
	}

	public static void name(String nome) {
		
		System.out.println("Olá, meu nome é " + nome + ".");
		
	}
	public static void media() {
		
		int valorUm = 100;
		int valorDois = 10;
		
		System.out.println("Média: " + (valorUm / valorDois));
	}

}
