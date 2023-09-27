package Funcao;

import java.util.Scanner;

public class Ex1 {
	
	public static String escolha(int numero, String certo, String errado, int min, int max) {
		
		if (numero >= min && numero <= max) {
			return certo;
		} else {
			return errado;
		}
		
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		/*
		 * Faça um programa que diz se um número inserido está dentro de um limite
		 * imposto pelo usuário
		 * 
		 * Por exemplo:
		 * 
		 * Usuário inseriu o limite máximo como 100. Usuário inseriu o limite mínimo
		 * como 70.
		 * 
		 * Depois ele inseriu o número 80.
		 * 
		 * A saída deve ser: 80 está nos limites impostos.
		 */
		
		int min = 70;
		int max = 100;
		String certo = "Está nos padrões";
		String errado = "Não está nos padrões";
		
		System.out.println("Digite seu número de 70 a 100: ");
		int numero = s.nextInt();
		
		escolha(numero, certo, errado, min, max);
		
		System.out.println(escolha(numero, certo, errado, min, max));
		
		s.close();
	}

}
