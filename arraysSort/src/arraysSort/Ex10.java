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

		double soma = 0;
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Digite o " + (i + 1) + "º valor: ");
			int valores = s.nextInt();
			lista.add(valores);
		}
		System.out.println(lista);
		
		for (int i = 0; i < lista.size(); i++) {
			soma += lista.get(i);
		}
		
		double conta = soma / lista.size();
		
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) > conta) {
				System.out.println(lista.get(i));
			}
		}
		s.close();
	}
}
