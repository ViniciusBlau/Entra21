package aula12;

public class Exercicio8 {

	public static void main(String[] args) {

		/*
		 * 8. Dada a seguinte matriz, calcule:
		 * 
		 * 
		 * 
		 * 1 2 3 4
		 * 
		 * 5 6 7 8
		 * 
		 * 9 10 11 12
		 * 
		 * 13 14 15 16
		 * 
		 * a) A soma dos elementos de primeira coluna;
		 * 
		 * b) O produto dos elementos da primeira linha;
		 * 
		 * c) A soma de todos os elementos;
		 * 
		 * d) O produto da diagonal principal.
		 */

		int[][] matriz = { 
				{ 1, 2, 3, 4 }, 
				{ 5, 6, 7, 8 }, 
				{ 9, 10, 11, 12}, 
				{ 13, 14, 15, 16 } 
				};

		int plusElements = 0;
		int plusFirstColumn = 0;
		int multFirstLine = 1;
		int product = 1;

		// A
		for (int i = 0; i < matriz.length; i++) {
			plusFirstColumn += matriz[i][0];
		}
		System.out.println("A soma da primeira coluna de cada linha é :" + plusFirstColumn);

		// B
		for (int j = 0; j < matriz[0].length; j++) {
			multFirstLine *= matriz[0][j];
		}
		System.out.println("A multiplicação de cada elemento da primeira linha é: " + multFirstLine);

		// C
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				plusElements += matriz[i][j];
			}
		}
		System.out.println("A soma de todos os elementos da matriz é: " + plusElements);
		
		// D
		for (int i = 0; i < matriz.length; i++) {
			product *= matriz[i][i];
		}
		System.out.println("O produto da diagonal principal é: " + product);
		
	}

}
