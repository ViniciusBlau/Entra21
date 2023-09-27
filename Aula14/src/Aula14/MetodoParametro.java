/*
 *  Crie um parâmetro com um nome, eu não posso criar uma variável com este mesmo nome no escopo do metodo
 *
 * Criei um metodo com parametro, ao chamar este metodo, obrigatoriamente
 *  preciso informa um dado dentro dos parenteses
 */
package Aula14;

public class MetodoParametro {

	/*
	 * Crie mais um método, utilize os dados da altura de dois amigos e imprima a
	 * média e os nomes.
	 */

	// metodo com parametro

	public static void metodoComParametro(String nome) {
		System.out.println("Meu nome: " + nome);
	}
	
	public static void metodoComMaisDeUmParametro(int idadeUm, int idadeDois, String texto) {
		
		System.out.println("A soma das idades é: " + (idadeUm + idadeDois));
		System.out.println("Texto: " + texto);
		
	}

	public static void main(String[] args) {
		
		String nome = "Vinicius";
		
		metodoComParametro(nome);
		metodoComMaisDeUmParametro(24, 18, "E o pix? Cade o pix zeca urubu?");

	}

}