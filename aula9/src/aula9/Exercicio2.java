package aula9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("0.00");

		/*
		 * 2. Crie uma array de 5 elementos e no momento de imprimir, comece pelo último
		 * elemento até o primeiro elemento.
		 */

		int[] elements = new int[5];
		elements[0] = 0;
		elements[1] = 1;
		elements[2] = 2;
		elements[3] = 3;
		elements[4] = 4;

		for (int i = elements.length - 1; i >= 0; i--) {

			System.out.println(elements[i]);

		}

	}

}
