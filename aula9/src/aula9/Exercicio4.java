package aula9;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// Crie uma array de 5 elementos e descubra:

		// a) Qual o maior elemento

		// b) Qual o menor elemento

		// c) A média dos elementos

		Scanner s = new Scanner(System.in);

		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;

		int tamanho = 5;
		int[] array = new int[tamanho];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Digite seus números: ");
			array[i] = s.nextInt();
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] < menor) {
				menor = array[i];

			}
			if (array[i] > maior) {
				maior = array[i];
			}
		}
		double soma = 0;
		for (int i = 0; i < array.length; i++) {
			soma = soma + array[i];
		}
		System.out.println("O menor valor é o: " + menor);
		System.out.println("O maior valor é o: " + maior);
		System.out.println("A média dos valores é: " + (soma / tamanho));
	}

}
