package aula9;
import java.util.Scanner;

public class Exercicio10 {
		public static void main(String[] args) {
			
			/*
			 * 10 . Faça um algoritmo em que quem preenche os valores do vetor é o usuário,
			 * por fim printe o vetor (vetor de 5 posições).
			 */

			Scanner s = new Scanner(System.in);

			int tamanhoArray = 5;
			int[] array = new int[tamanhoArray];
			
			for (int i = 0; i < array.length; i++) {
				System.out.println("Digite o " + (i + 1) + " valor da array: ");
				array[i] = s.nextInt();
			}
			for (int i = 0; i < array.length; i++) {
					System.out.print(array[i] + " ");
			}

		}

	}