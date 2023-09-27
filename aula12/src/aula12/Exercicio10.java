package aula12;

import java.util.Random;

public class Exercicio10 {

	public static void main(String[] args) {

		Random r = new Random();

		/*
		 * 10. Crie em Java uma matriz 3x5 de inteiros, preencha a matriz utilizando
		 * Randon e depois:
		 * 
		 * a) Informe quantas vezes a matriz repete o número 0;
		 * 
		 * b) A quantidade de números pares;
		 * 
		 * c) A quantidade de números ímpares
		 */

		int linhas = 3;
		int colunas = 5;
		int zero = 0;
		int pares = 0;
		int impares = 0;

		int[][] matriz = new int[linhas][colunas];

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = r.nextInt(10);
			}
		}

		// A
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				if (matriz[i][j] == 0) {
					zero++;
				}
		// B
				if (matriz[i][j] % 2 == 0) {
					pares++;
		// C
				} else {
					impares++;
				}
			}
		}

		System.out.println("Possui: " + zero + " zero(s) nesta matriz.");
		System.out.println("Possuem " + pares + " par(es) nesta matriz.");
		System.out.println("Possuem " + impares + " impar(es) nesta matriz.");
		System.out.println();

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println();
			System.out.println();
		}

	}

}
