package Revisão;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		/*
		 * 3. Descreva um algoritmo que leia vá lendo números inteiros até o usuário
		 * entrar com o número 0
		 * 
		 * a) Qual é o menor valor?
		 * 
		 * b) Qual é o maior valor?
		 * 
		 * c) Qual é a média dos valores?
		 */

		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		int soma = 0;
		int cont = 0;

		System.out.println("Digite algum número(0 para encerrar): ");
		int numero = s.nextInt();

		while (numero != 0) {
			soma += numero;
			cont++;
			if (numero < menor) {
				menor = numero;

			}
			if (numero > maior) {
				maior = numero;
			}
			
			System.out.println("Digite algum número(0 para encerrar): ");
			numero = s.nextInt();

		}
		
		
		

            System.out.println("O menor número é: " + menor);
            System.out.println("O maior número é: " + maior);
            System.out.println("A média dos valores é: " + (soma / cont));

	}

}
