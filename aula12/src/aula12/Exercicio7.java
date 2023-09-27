package aula12;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/*
		 * 6. 7. Crie uma matriz 3x3 do tipo, onde o usuário irá preencher os valores
		 * utilizando o scanner, ao fim imprima a matriz
		 */

		int linhas = 3;
		int colunas = 3;

		int[][] matriz = new int[linhas][colunas];
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print("Digite os valor da linha " + (i + 1) + ", da coluna " + (j + 1) + ": ");
				matriz[i][j]= s.nextInt();
			}
		}
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}

	}

}
