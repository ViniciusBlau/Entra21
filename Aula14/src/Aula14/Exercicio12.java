package Aula14;

import java.util.Scanner;

public class Exercicio12 {

	/*
	 * Faça um código que recebe uma palavra do usuário, se essa palavra tem tamanho
	 * par, printe o primeiro caracter dessa palavra Caso ela tenha tamanho ímpar,
	 * printe o segundo caracter dessa palavra
	 */

	public static void tamanho(String palavra) {
		
		if (palavra.length() % 2 == 0) {
			System.out.println("O primeiro caracter da palavra é: " + palavra.charAt(0));
		} else {
			System.out.println("O segundo caracter da palavra é: " + palavra.charAt(1));
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite sua palavra: ");
		String palavra = s.next();
		
		tamanho(palavra);
		
		s.close();
	}

}
