package aula9;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {

		/*
		 * 8. Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor
		 * de 12 posições do tipo real.
		 * 
		 * Imprima quais valores desses informados são maiores que a média dos valores..
		 */

		Scanner s = new Scanner(System.in);

		int[] array = new int[12];
		int soma = 0;
		int div = 0;

		for (int i = 0; i < array.length; i++) {
			System.out.println("Digite o valor " + (i+1) + ":");
			array[i] = s.nextInt();
			soma += array[i];
			div = soma / 12;
		}
		System.out.println("A média dos números é: " + div);
		for (int i = 0; i < array.length; i++) {
			if (array[i] > div) {
				System.out.print(array[i] + " ");
			}
		}

	}

}