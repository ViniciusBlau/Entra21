package arraysSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		/*
		 * Descreva um algoritmo que leia 5 valores decimais e os coloque em uma Array
		 * List. Em seguida, modifique a Array List de modo que os valores das POSIÇÕES
		 * ímpares sejam aumentados em 5% e os das POSIÇÕES pares sejam aumentados em
		 * 2%. Imprima a Array List resultante
		 */

		Scanner s = new Scanner(System.in);

		List<Integer> lista = new ArrayList<>();

		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		System.out.println(lista);
		
		s.close();
	}

}
