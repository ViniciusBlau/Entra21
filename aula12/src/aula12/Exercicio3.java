package aula12;

public class Exercicio3 {

	public static void main(String[] args) {
		/*
		 * Criem uma matriz de 5 linhas e 1 coluna, somem todos os valores
		 * Posteriormente verifique a média e imprima somente os valores que estão acima
		 * dela
		 */

		int[][] matriz = new int[5][1];

		matriz[0][0] = 1;
		matriz[1][0] = 2;
		matriz[2][0] = 3;
		matriz[3][0] = 4;
		matriz[4][0] = 5;

		int soma = 0;
		int media = 0;

		for (int linha = 0; linha < matriz.length; linha++) {
			soma += matriz[linha][0];
		}

		media = soma / 5;
		System.out.println("A soma dos valores é: " + soma);
		System.out.println("A média dos valores é: " + media);

		for (int linha = 0; linha < matriz.length; linha++) {
			if (matriz[linha][0] > media) {
				System.out.println("Os números acima da média são: " + matriz[linha][0]);
			} else {
				System.out.println("Os valores abaixo da média são: " + matriz[linha][0]);
			}
		}
	}
}
