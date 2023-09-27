package aula9;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		// 3. Faça um algoritmo em que quem preenche os valores do vetor é o usuário,
		// por fim printe o vetor (vetor de 5 posições).
		
		int array = 5;

		String[] values = new String[array];

		for (int i = 0; i < 5; i++) {

			System.out.println("Digite seus números");
			values[i] = s.nextLine();
		}
		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
			
		}

	}

}
