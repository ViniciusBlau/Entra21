package aula9;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		DecimalFormat f = new DecimalFormat("0.00");

		int[] valores = new int[7];

		for (int i = 0; i < 7; i++) {

			System.out.println(valores[i]);
			valores[i] = i * i;

		}
		for (int i = 0; i < 7; i++) {
			System.out.println(valores[i]);

		}

	}

}
