package aula9;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {

		/*
		 * 7. Faça um algoritmo que coloque o número 0 no índice que o usuário escolheu
		 * e por fim printe o vetor.
		 */
		Scanner s = new Scanner(System.in);

		int size = 5;
		int[] array = new int[size];

		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		array[4] = 5;

		System.out.println("Digite o índice que deseja inserir o 0: ");
		int indice = s.nextInt();

		if (indice >= 0 && indice < size) {
			array[indice] = 0;
		} else {
			System.out.println("índice Inválido!");
		}
		System.out.println("Array resultante: ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i] + " ");
		}

	}

}