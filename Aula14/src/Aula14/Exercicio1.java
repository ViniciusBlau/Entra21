package Aula14;

public class Exercicio1 {

	/*
	 * --- Crie um método para imprimir seu nome, sua idade e cor favorita.
	 */ 
	
	public static void imprimirNome() {
		String nome = "Vinicius Blau";
		System.out.println("Meu nome é: " + nome + ".");
	}
	
	public static void imprimirCorFavorita() {
		String corFavorita = "Vermelho";
		System.out.println("Minha cor favorita é: " + corFavorita + ".");
	}
	
	public static void imprimirIdade() {
		int idade = 18;
		System.out.println("Eu tenho " + idade + " anos.");

	}
	
	public static void main(String[] args) {
	
		imprimirNome();
		imprimirCorFavorita();
		imprimirIdade();
		
	}

}
