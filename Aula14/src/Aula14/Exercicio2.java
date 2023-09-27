package Aula14;

public class Exercicio2 {

	/*
	 * Crie um método com duas variaveis com os valores 10 e 100, imprima,
	 * multiplique e some.
	 */ 
	
	public static void imprimaNumeros() {
		
		int numA = 10;
		int numB = 100;
		System.out.print(numA + ", ");
		System.out.println(numB);
		
	}
	
	public static void multiplique() {
		int numA = 10;
		int numB = 100;
		System.out.println("A multiplicação dos números é: " + (numA * numB));
	}
	
	public static void soma() {
		int numA = 10;
		int numB = 100;
		System.out.println("A soma dos números é: " + (numA + numB));
	}
	
	public static void main(String[] args) {
		imprimaNumeros();
		multiplique();
		soma();
	}

}
