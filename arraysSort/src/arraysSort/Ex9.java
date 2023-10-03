package arraysSort;

import java.util.ArrayList;
import java.util.List;

public class Ex9 {
	public static void main(String[] args) {

		/*
		 * Faça um algoritmo que remova o valor do meio da ArrayList. Caso a array list
		 * tenha tamanho par, remova o valor da segunda metade. Por exemplo: Em uma
		 * ArrayList de tamanho 6, remova o valor no índice 4
		 */
		
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		lista.add(6);
		
		int tamanho = lista.size();
		
		if (tamanho % 2 == 0) {
			int indiceRemover = (tamanho/2)+1 ;
			lista.remove(indiceRemover);
		} else {
			int indiceRemover = tamanho/2;
			lista.remove(indiceRemover);
		}
		
		System.out.println(lista);
		
	}
}
