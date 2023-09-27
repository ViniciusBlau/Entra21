package aula12;

import java.util.Random;

public class Exercicio9 {

	public static void main(String[] args) {
		Random r = new Random();
		/*
		 * 9. Crie uma matriz com 7 linhas e 8 colunas do tipo inteiro, para preencher a
		 * mesma utilize o Random de java.util.Random, posteriormente imprima esta
		 * matriz;
		 */
		
		int linhas = 7;
		int colunas = 8;
		
		int[][] matriz = new int[linhas][colunas];
		
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				matriz[i][j] = r.nextInt(10);
			}
		}
		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print(matriz[i][j] + "  ");
			}
			System.out.println();
		}
		
	}

}
