package Revisão;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		/*
		 * 4. Crie uma array de 5 elementos e descubra:
		 * 
		 * a) Qual o maior elemento
		 * 
		 * b) Qual o menor elemento
		 * 
		 * c) A média dos elementos
		 */
		
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		int soma = 0;
		int indices = 5;
		
		int[] array = new int[indices];
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("Digite os números da sua array: ");
			array[i] = s.nextInt();
			soma += array[i];
			
			if (array[i] < menor) {
				menor = array[i];
			}
			if (array[i] > maior) {
				maior = array[i];
			}
			
		}
		
		System.out.println("O menor número da array é: " + menor);
		System.out.println("O maior número da array é: " + maior);
		System.out.println("A média dos número da array é: " + (soma / indices));
		
	}

}
