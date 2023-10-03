package arraysSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		/*
		 * 
		 * Crie uma Array List O usuário vai colocando valores decimais até ele colocar
		 * o número 0. Calcular: a) Qual o menor número b) Qual o maior número c)
		 * Calcular a média
		 * 
		 */
		Scanner s = new Scanner(System.in);
		
		List<Double> lista = new ArrayList<>();
		
		System.out.println("Digite seu número(0 para encerrar): ");
		double valor = s.nextDouble();
		
		double menor = Integer.MAX_VALUE;
		double maior = Integer.MIN_VALUE;
		double soma = 0;
		
		while (valor != 0) {
			lista.add(valor);
			soma += valor;
			if (valor < menor) {
				menor = valor;
			}
			if (valor > maior) {
				maior = valor;
			}
			System.out.println("Digite seu número(0 para encerrar): ");
			valor = s.nextDouble();
		}
		

		if (valor == 0) {
			System.out.println("Menor valor: " + menor);
			System.out.println("Maior valor: " + maior);
			System.out.println(soma / lista.size());
		}
		
		
		s.close();
		
	}
}
