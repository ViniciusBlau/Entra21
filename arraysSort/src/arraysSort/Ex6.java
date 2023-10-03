package arraysSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo em que o usuário insere um número em um índice específico
		 * que ele mesmo informou
		 */
		Scanner s = new Scanner(System.in);

		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);

		System.out.println("Digite o índice que deseja colocar: ");
		int indice = s.nextInt();
		System.out.println("Digite o valor que deseja colocar: ");
		int valor = s.nextInt();

		if (indice < 0 || indice > lista.size()) {
			System.out.println("Nada será mudado!");
		} else {
			lista.set(indice, valor);
			System.out.println(lista);
		}
		s.close();
	}

}
