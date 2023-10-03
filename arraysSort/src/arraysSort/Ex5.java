package arraysSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que coloque o número 0 no índice que o usuário escolheu
		 */
		Scanner s = new Scanner(System.in);
		
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		
		System.out.println("Digite o índice que deseja colocar o 0: ");
		int indice = s.nextInt();
		
		if (indice < 0 || indice > lista.size()) {
			System.out.println("Nada será mudado!");
		} else {
			lista.set(indice, 0);
			System.out.println(lista);
		}
		s.close();
	}

}
