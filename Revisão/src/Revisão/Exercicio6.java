package Revisão;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/*
		 * 6. Descreva um algoritmo que leia 12 valores decimais e os coloque em um
		 * vetor de 12 posições.
		 * 
		 * Em seguida, modifique o vetor de modo que os valores das POSIÇÕES ímpares
		 * sejam aumentados em 5% e os das posições pares sejam aumentados em 2%.
		 * 
		 * Imprima o vetor resultante
		 */

		int tamanho = 12;
		double par = 1.02;
		double impar = 1.05;
		double aux = 0;
		double[] vetor = new double[tamanho];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o valor " + (i + 1) + ":");
			aux = s.nextDouble();
			if (aux % 2 == 0) {
				aux = aux * par;
			} else {
				aux = aux * impar;
			}
			vetor[i] = aux;
		}
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("{" + vetor[i] + "}  ");
		}
	}

}
