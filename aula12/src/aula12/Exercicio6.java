package aula12;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		/*
		 * 6. Crie um programa onde o usuário define quantas linhas e colunas deve ter
		 * uma matriz, e posteriormente imprima o total de elementos(posições) que está
		 * matriz tem
		 */
		
		System.out.println("Digite quantas linhas terá sua matriz: ");
		System.out.println("Digite quantas colunas terá sua matriz: ");
		int linhas = s.nextInt();
		int colunas = s.nextInt();
		
		int[][] matriz = new int[linhas][colunas];
		
		System.out.println("Total de elementos: " + (linhas * colunas));;
		
	}

}
