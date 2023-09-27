package Aula14;

import java.util.Scanner;

public class Exercicio11 {

	/*
	 * Faça um programa que printe o número que o usuário entrou e os 20 números que
	 * vem depois dele.
	 */
	
	public static void number(int numero, int cont) {
		for (int i = 0; i < numero; i++) {
			cont++;
			numero += 1;
			System.out.println(numero);
			if (cont == 20) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int cont = 0;
		System.out.println("Digite seu número: ");
		int numero = s.nextInt();
		
		number(numero, cont);
		
		s.close();
	}

}
