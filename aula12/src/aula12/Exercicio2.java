package aula12;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Agora criem uma segunda linha e novamente somem todas as colunas, por fim
		 * somem os valores da linho 0 e da linha 1
		 */

		int[][] matriz = new int[2][10];

		matriz[0][0] = 1;
		matriz[0][1] = 1;
		matriz[0][2] = 3;
		matriz[0][3] = 2;
		matriz[0][4] = 4;
		matriz[0][5] = 5;
		matriz[0][6] = 7;
		matriz[0][7] = 8;
		matriz[0][8] = 12;
		matriz[0][9] = 9;
		matriz[1][0] = 10;
		matriz[1][1] = 1;
		matriz[1][2] = 3;
		matriz[1][3] = 2;
		matriz[1][4] = 4;
		matriz[1][5] = 5;
		matriz[1][6] = 7;
		matriz[1][7] = 8;
		matriz[1][8] = 1;
		matriz[1][9] = 9;

		int soma = 0;
		int somaDois = 0;
		
		for (int coluna = 0; coluna < matriz[0].length; coluna++) {
			soma += matriz[0][coluna];
		}
		System.out.println(soma);
		
		for (int coluna = 0; coluna < matriz[1].length; coluna++) {
			somaDois += matriz[1][coluna]; 
		}
		System.out.println(somaDois);
		System.out.println(soma + somaDois);
	}

}
