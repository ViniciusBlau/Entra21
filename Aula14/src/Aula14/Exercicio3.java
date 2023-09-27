package Aula14;

public class Exercicio3 {

	/*
	 * Utilize o metodo conta(), já criado, quebre o mesmo em dois métodos - soma(),
	 * e multiplicacao(), sendo que os nomes das variáveis devem ser iguais.
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
