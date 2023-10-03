package arraysSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {

		/*
		 * Descreva um algoritmo que leia 6 valores reais e os coloque em uma Array
		 * List. Imprima quais valores desses informados são maiores que a média dos
		 * valores.
		 * 
		 */

		Scanner s = new Scanner(System.in);

		List<Integer> lista = new ArrayList<>();

		int soma = 0;
		
		for (int i = 1; i < 4; i++) {
			System.out.println("Digite o " + i + "º valor: ");
			int valor = s.nextInt(); // ler o dado como um número inteiro
			soma += valor;
			lista.add(soma);
		}
		System.out.println(soma);
		System.out.println(lista);
		s.close();
	}
}
