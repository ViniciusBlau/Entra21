package Aula14;

import java.util.Scanner;

public class Exercicio9 {

	/*
	 * Faça um programa que receba 2 números do usuário. Faça um método que descubra
	 * qual dos números é maior Se os dois números forem iguais, informe: número
	 * iguais
	 */

	public static void comparation(int numUm, int numDois) {
		if (numUm == numDois) {
			System.out.println("Número iguais!");
		} else if(numDois > numUm) {
			System.out.println("Número dois é maior!");
		} else {
			System.out.println("Número um é maior!");
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		int numUm = s.nextInt();
		System.out.println("Digite o segundo número: ");
		int numDois = s.nextInt();
		
		comparation(numUm, numDois);
		
		s.close();
		
	}

}
