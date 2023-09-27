package Revisão;

public class Exercicio8 {

	public static void main(String[] args) {

		/*
		 * 8. Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10
		 * metros e cresce 3 centímetros por ano.
		 *  
		 * Construa um algoritmo que calcule e imprima quantos anos serão necessários
		 * para que Zé seja maior que Chico.
		 * 
		 */
		
		double chico = 1.50;
		double ze = 1.10;
		double somaChico = 0.02;
		double somaZe = 0.03;
		int anos = 0;

		while (ze <= chico) {
			anos++;
			ze += somaZe;
			chico += somaChico;
		}
		System.out.println("Levarão " + anos + " anos.");
		
	}

}
