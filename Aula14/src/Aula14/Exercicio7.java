package Aula14;

public class Exercicio7 {

	/*
	 * Faça um método para cada um dos seus seus colegas O método deve printar: O
	 * nome dele(a) é [nome] Ele(a) tem [idade] anos Ele(a) é estudante do Entra 21
	 * (Em prints separados)
	 * 
	 * Os dados devem ser passados como parametros, e o metodo pode ser chamado mais
	 * de uma vez
	 */

	public static void colega(String nome, int idade, boolean estudante) {
		
		System.out.println("Nome: " + nome );
		System.out.println("Idade: " + idade);
		if (estudante) {
			System.out.println("É estudante do Entra21.");
		} else {
			System.out.println("Não é estudante do Entra21.");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		colega("Blau", 18, true);
		colega("Léo", 20, false);

	}

}
