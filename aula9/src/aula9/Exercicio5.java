package aula9;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		/*
		 * 5. Crie um array de 10 elementos e depois peça ao usuário para informar um
		 * índice, imprima o valor que está no vetor conforme indice informado pelo
		 * usuario
		 */

		Scanner s = new Scanner(System.in);

		int size = 10;
		int[] elements = new int[size];

		for (int i = 0; i < elements.length; i++) {
			System.out.println("Digite seus números: ");
			elements[i] = s.nextInt();
		}

		System.out.println("informe algum índice: ");
		int indice = s.nextInt();

		System.out.println(elements[indice]);

	}
}
