package Revisão;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {

		/*
		 * Um aluno se vê com necessidade de ajuda na aula e logo tem a ideia de um
		 * algoritmo, pensando nisso, ele descreve como deve funcionar: o usuário
		 * seleciona a opção onde 1) Solicita 3 notas e calcula a média, 2) Retorna os
		 * dados do aluno em questão (informe seu nome e e-mail), 3) Solicita 5 valores,
		 * verifica e retorna qual é o maior e o menor. A opção 0 encerra o programa e
		 * qualquer outra é declarada como inválida, além disso, informe quantas vezes o
		 * usuário escolheu opções válidas antes de encerrar o programa e quantas
		 * inválidas.
		 * 
		 */
		Scanner s = new Scanner(System.in);
		int opcao;
		int opcoesValidas = 0;
		int opcoesInvalidas = 0;
		double media = 0;
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		String nome = "";
		String email = "";
		boolean ficar = true;

		while (ficar) {
			System.out.println("1) Solicita 3 notas e calcula a média");
			System.out.println("2) Retorna os dados do aluno em questão (informe seu nome e e-mail)");
			System.out.println("3) Solicita 5 valores, verifica e retorna qual é o maior e o menor");
			System.out.println("0) Para encerrar.");
			System.out.println("Digite a opção que gostaria: ");
			opcao = s.nextInt();

			switch (opcao) {
			case 1:
				opcoesValidas++;
				System.out.println("Digite suas 3 notas: ");
				double notaUm = s.nextDouble();
				double notaDois = s.nextDouble();
				double notaTres = s.nextDouble();
				media = (notaUm + notaDois + notaTres) / 3;
				System.out.println("A média das notas é: " + media);
				break;
			case 2:
				opcoesValidas++;
				System.out.println("Digite seu nome e email: ");
				nome = s.next();
				email = s.next();
				System.out.println("Nome: " + nome);
				System.out.println("E-mail: " + email);
				break;
			case 3:
				opcoesValidas++;
				for (int i = 0; i < 5; i++) {
					System.out.println("Digite o " + (i + 1) + " valor: ");
					int valor = s.nextInt();
					if (valor > maior) {
						maior = valor;
					}
					if (valor < menor) {
						menor = valor;
					}
				}
				System.out.println("Maior valor: " + maior);
				System.out.println("Menor valor: " + menor);
				break;
			case 0:
				System.out.println("Encerrando o programa.");
				break;
			default:
				opcoesInvalidas++;
				System.out.println("Opção inválida!");
			}

			if (opcao == 0) {
				ficar = false;
			}
		}

		System.out.println("Opções válidas selecionadas: " + opcoesValidas);
		System.out.println("Opções inválidas selecionadas: " + opcoesInvalidas);

		s.close();
	}

}