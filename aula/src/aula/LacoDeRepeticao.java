package aula;

import java.util.Scanner;

public class LacoDeRepeticao {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe uma opção");
		char opcao = scan.next().charAt(0);
		
		int numero = 0;
		
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		
		
		while(opcao == 's') {
			
			
			System.out.println("Informe um número");
			numero = scan.nextInt();
			if(numero < menor) {
				menor = numero;
			}
			//System.out.println("menor temp" + menor);
			if(numero > maior) {
				maior = numero;
			}
			
			System.out.println("Informe uma opção");
			opcao = scan.next().charAt(0);
			
			while(opcao != 's' && opcao != 'n') {
				System.out.println("Valor inválido");
				System.out.println("Informe de novo");
				opcao = scan.next().charAt(0);
			}
			
			//opcao = 'n';
		}
		System.out.println("menor numero foi" + menor);
		System.out.println("maior numero foi" + maior);

	}
	
}