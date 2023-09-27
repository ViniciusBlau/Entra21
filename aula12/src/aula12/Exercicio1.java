package aula12;

public class Exercicio1 {

	public static void main(String[] args) {

		/*
		 * 1. Criar uma matriz com 1 linha e 10 colunas, na mesma verifique quantos
		 * valores são par e quantos valores são impar e calcule a média dos valores
		 */

		double[][] matriz = new double[1][10];

		matriz[0][0] = 10;
		matriz[0][1] = 1;
		matriz[0][2] = 3;
		matriz[0][3] = 2;
		matriz[0][4] = 4;
		matriz[0][5] = 5;
		matriz[0][6] = 7;
		matriz[0][7] = 8;
		matriz[0][8] = 12;
		matriz[0][9] = 9;

		int soma = 0;
		double media = 0;
		int contPar = 0;
		int contImpar = 0;

		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			soma += matriz[0][coluna];
			if (matriz[0][coluna] % 2 == 0) {
				System.out.println("Este número é par: " + matriz[0][coluna]);
				contPar++;
				media++;
			} else {
				System.out.println("Este número é impar: " + matriz[0][coluna]);
				media++;
				contImpar++;
			}
		}
		System.out.println("Pares: " + contPar);
		System.out.println("Impares: " + contImpar);
		System.out.println("A soma dos números é: " + soma);
		System.out.println("A média dos números é: " + (soma/media));

	}
}
