package Revisão;

public class Exercicio5 {

	public static void main(String[] args) {

		/*
		 * 5. Faça um algoritmo que atribua valores ao vetor de acordo com o quadrado do
		 * seu índice
		 * 
		 * Ex:
		 * 
		 * [0] = 0
		 * 
		 * [1] = 1
		 * 
		 * [2] = 4
		 * 
		 * [3] = 9.
		 */
		
		int tamanho = 21;
		int[] array = new int[tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			array[i] = i*i;
		}
		
		for (int i = 0; i < tamanho; i++) {
			System.out.println(array[i]);
		}
	}

}
