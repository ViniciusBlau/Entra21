package aula9;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		/*
		 * 11. Faça um algoritmo que inverta a ordem de uma array (o primeiro elemento
		 * vai se tornar o último elemento)
		 */

		char[] vetor = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H' };
		int tamanho = vetor.length - 1; // percorre metade final
		// e o indice percorre metade inicial
		char temp = ' ';
		System.out.println(Arrays.toString(vetor));

		for (int indice = 0; indice < tamanho;) {

			// temp recebe um valor antes de ser alterado
			temp = vetor[indice];
			// valor do vetor é alterado
			vetor[indice] = vetor[tamanho];
			// valor salvo pela temp passa a ser reatribuído
			vetor[tamanho] = temp;
			tamanho--;
			indice++;
		}

		System.out.println(Arrays.toString(vetor));

	}

}
