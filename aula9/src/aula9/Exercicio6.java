package aula9;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		/*
		 * 6. Crie um array de elementos e depois peça ao usuário para informar um
		 * valor, verifique se este valor está presente no array e printe o índice.
		 */

		Scanner s = new Scanner(System.in);

		int[] elements = new int[10];

		for (int i = 0; i < elements.length; i++) {
			System.out.println("Informe um valor: ");
			elements[i] = s.nextInt();
		}
		System.out.println("Informe um valor para ver se está presente: ");
		int aux = s.nextInt();

		boolean possuiValor = false;

		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == aux) {
				System.out.println("Índice: " + i);
				possuiValor = true;
			}
		}
		if (possuiValor == false) {
			System.out.println("Não existe!");
		}
	}

}
