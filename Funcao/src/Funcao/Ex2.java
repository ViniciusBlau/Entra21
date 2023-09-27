package Funcao;

import java.util.Scanner;

public class Ex2 {
	
	public static String comparacoes(int numeroUm, int numeroDois) {
		
		int cubo = numeroUm * numeroUm  * numeroUm;
		int cubo2 = numeroDois * numeroDois * numeroDois;
		int quadrado = numeroUm * numeroUm * numeroUm;
		int quadrado2 = numeroDois * numeroDois * numeroDois;
		
		if (numeroUm == 5 || numeroDois ==5 || numeroUm + numeroDois == 5 || numeroUm - numeroDois == 5 || numeroDois - numeroUm == 5) {
			return "Primeiro número ao cubo: " + (cubo) + " - Segundo número ao cubo: " + (cubo2);
		} else {
			return "Primeiro número ao quadrado: " + (quadrado) + " - Segundo número ao quadrado: " + (quadrado2);
		}
	}

	public static void main(String[] args) {
		/*
		 * Faça um código que receba duas entradas do usuário
		 * 
		 * Printe cada entrada ao cubo se: Algum dos dois números for 5 A soma deles é 5
		 * A diferença deles é 5
		 * 
		 * Se nenhuma dessas condições forem satisfeitas, printe cada entrada ao
		 * quadrado
		 */
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Digite os dois números: ");
		int entradaUm = s.nextInt();
		int entradaDois = s.nextInt();
		
		System.out.println(comparacoes(entradaUm, entradaDois));
		
		s.close();
	}

}
