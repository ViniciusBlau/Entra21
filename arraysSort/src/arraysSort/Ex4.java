package arraysSort;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * Faça um algoritmo que atribua valores à Array List de acordo com o quadrado
		 * do seu índice Ex: [0] = 0 [1] = 1 [2] = 4 [3] = 9 [4] = 16;
		 */
		
		List<Integer> lista = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			lista.add(i * i);
		}
		
		System.out.println(lista);
	}

}
