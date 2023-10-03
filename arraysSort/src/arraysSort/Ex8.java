package arraysSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {

		/*
		 * Faça um algoritmo que descubra se uma Array List possui o número que o
		 * usuário entrou. Imprima também o seu índice
		 */

		Scanner s = new Scanner(System.in);

		List<Integer> lista = new ArrayList<>();
		lista.add(9);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);

		System.out.println("Digite seu valor: ");
		int valor = s.nextInt();

		if (lista.contains(valor)) {

			System.out.println("Existe este valor.");
			
			int indice = lista.indexOf(valor);
			System.out.println("O índice dele é: " + indice);

		} else {

			System.out.println("Não existe este valor.");

		}
		s.close();
	}
}
