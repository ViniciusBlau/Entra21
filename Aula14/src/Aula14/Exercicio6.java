package Aula14;

import java.util.Scanner;

public class Exercicio6 {

	/*
	 * Faça um programa em que o usuário entre com um número de 1 a 4 Com o número 1
	 * sendo verão, 2 sendo outono... Dependendo de o que o usuário informa, printe:
	 * 
	 * É verão E o tempo está quente
	 * 
	 * Ou
	 * 
	 * É inverno E está frio
	 */
	
	public static void epocasAno(int escolha) {
		switch (escolha) {
		case 1:
			System.out.println("É verão e está quente!");
			break;
		case 2:
			System.out.println("É outono e está morno!");
			break;
		case 3:
			System.out.println("É inverno e está frio!");
			break;
		case 4:
			System.out.println("É primavera!");
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite 1 a 4: ");
		int escolha = s.nextInt();
		
		epocasAno(escolha);
		s.close();
	}

}
