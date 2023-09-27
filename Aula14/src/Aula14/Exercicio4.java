package Aula14;

import java.text.DecimalFormat;

public class Exercicio4 {

	/*
	 * Crie mais um método, utilize os dados da altura de dois amigos e imprima a
	 * média e os nomes.
	 */

	public static void mediaAltura() {
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		float bruna = 1.64f;
		float blau = 1.70f;
		
		float media = (bruna + blau) / 2;
		
		System.out.println("A média de altura dos amigos é: " + df.format(media));
		
	}
	
	public static void nomes() {
		
		String nomeA = "Bruna";
		String nomeB = "Blau";
		
		System.out.println("Nome do primeiro amigo: " + nomeA);
		System.out.println("Nome do segundo amigo: " + nomeB);
		
	}
	
	public static void main(String[] args) {

		mediaAltura();
		nomes();

	}

}
