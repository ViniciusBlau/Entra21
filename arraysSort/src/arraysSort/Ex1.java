package arraysSort;

import java.util.ArrayList;
import java.util.List;

public class Ex1 {

	public static void main(String[] args) {
		
		/*
		 * Coloque 5 elementos em uma Array List e ordene-os
		 */
		
		List<Integer> lista = new ArrayList<>();
		
		lista.add(2);
		lista.add(5);
		lista.add(4);
		lista.add(3);
		lista.add(7);
		
		lista.sort(null);
		System.out.println(lista);
		
	}

}
