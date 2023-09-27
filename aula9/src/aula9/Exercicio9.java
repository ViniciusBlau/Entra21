package aula9;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {

		/*
		 * 9. Faça um programa para ler os valores de dois vetores de inteiros, cada um
		 * contendo 10 elementos.
		 * 
		 * Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas
		 * posições respectivas dos vetores originais.
		 * 
		 * Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao
		 * final, os três vetores na tela..
		 */

		Scanner s = new Scanner(System.in);
		
		int size = 10;
		int[] arrayOne = new int[size];
		int[] arrayTwo = new int[size];
		int[] arrayThree = new int[size];

		for (int i = 0; i < arrayOne.length; i++) {

			System.out.println("Digite o " + (i + 1) + " do primeiro vetor:");
			arrayOne[i] = s.nextInt();

		}
		for (int i = 0; i < arrayTwo.length; i++) {

			System.out.println("Digite o " + (i + 1) + " do segundo vetor: ");
			arrayTwo[i] = s.nextInt();

		}
		for (int i = 0; i < arrayOne.length; i++) {
			arrayThree[i] = arrayOne[i] + arrayTwo[i];
		}
		for (int i = 0; i < arrayThree.length; i++) {
			System.out.print(arrayThree[i] + ", ");
		}

	}

}
