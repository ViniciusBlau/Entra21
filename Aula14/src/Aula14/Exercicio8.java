package Aula14;

public class Exercicio8 {

	/*
	 * Faça um programa que some 4 números. Passando esses 4 números como parâmetros
	 * para um método
	 */

	public static void soma(int numA, int numB, int numC, int numD, int plus) {
		plus = numA + numB + numC + numD;
		System.out.println("A soma dos 4 números é: " + plus);
	}
	
	public static void main(String[] args) {
		
		int numA = 1;
		int numB = 2;
		int numC = 3;
		int numD = 4;
		int plus = 0;
		
		soma(numA, numB, numC, numD, plus);

	}

}
