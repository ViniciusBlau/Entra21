package Simulado;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		Consulta cadastro1 = new Consulta("Jorge", "Private", 2022, 2500000, "Ana");
		Consulta cadastro2 = new Consulta("Luís", "Stilo", 2015, 500000, "Ana");
		Consulta cadastro3 = new Consulta("Cláudio", "Exclusive", 2017, 250000, "Marina");
		Consulta cadastro4 = new Consulta("Bruna", "Prime", 2005, 5500000, "Paulo");
		Consulta cadastro5 = new Consulta("Ana", "Exclusive", 2023, 240000, "Paulo");
		/*
		 * Imprima: a) Informações do cliente com mais dinheiro no banco b) Informações
		 * do cliente mais antigo de um dado gerente c) Listar as informações de todos
		 * os clientes de um dado gerente d) Informar quantos clientes um dado gerente
		 * tem
		 */

		double clienteMaisDinheiro = Integer.MIN_VALUE;
		double clienteMaisAntigo = Integer.MAX_VALUE;
		Consulta nomeClienteMaisDinheiro = null;
		Consulta nomeClienteMaisAntigo = null;

		System.out.println("Digite o nome do gerente: ");
		String dadoNomeGerente = s.nextLine();

		for (Consulta c : Consulta.listaConsulta) {
			if (c.getSaldo() > clienteMaisDinheiro) {
				clienteMaisDinheiro = c.getSaldo();
				nomeClienteMaisDinheiro = c;
			}
			if (c.getNomeGerente().equals(dadoNomeGerente)) {
				if (c.getAnoCadastro() < clienteMaisAntigo) {
					clienteMaisAntigo = c.getAnoCadastro();
					nomeClienteMaisAntigo = c;
				}
			}

		}
		System.out.println(nomeClienteMaisDinheiro.toString());
		System.out.println(nomeClienteMaisAntigo.toString());

		System.out.println("Digite o nome do gerente dois: ");
		String dadoNomeGerente2 = s.nextLine();

		for (Consulta c : Consulta.listaConsulta) {
			if (c.getNomeGerente().equals(dadoNomeGerente2)) {
				System.out.println(c.toString());
			}
		}

		System.out.println("Digite o nome do terceiro Gerente: ");
		String dadoNomeGerente3 = s.nextLine();

		int cont = 0;

		for (Consulta c : Consulta.listaConsulta) {
			if (c.getNomeGerente().equals(dadoNomeGerente3)) {
				cont++;
			}
		}
		System.out.println("Total de cliente deste terceiro Gerente: " + cont);

	}

}
