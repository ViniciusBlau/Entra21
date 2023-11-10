package TrabalhoJava;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Endereco endereco01 = new Endereco("Rua São Paulo", "Blumenau", "SC", "Brasil", 1254);

		System.out.println("  ______________________________");
		System.out.println("  |                            |");
		System.out.println("  |      Filmes em Cartaz      |");
		System.out.println("  |____________________________|");
		System.out.println("  |                            |");
		System.out.println("  |  1   Piratas do Caribe     |"); // ação
		System.out.println("  |  2   Gente grande 2        |"); // comédia
		System.out.println("  |  3   Titanic               |"); // drama
		System.out.println("  |  4   Amor em redenção      |"); // romance
		System.out.println("  |  5   Sorria                |"); // terror
		System.out.println("  |  6   22 de Julho           |"); // documentário
		System.out.println("  |  7   Nós                   |"); // suspense
		System.out.println("  |  8   Interestelar          |"); // ficção científica
		System.out.println("  |____________________________|"); //
		System.out.println();

		System.out.println("Digite o número do filme de sua preferência: ");
		int escolhaFilme = entrada.nextInt();

		String generoFilme = "";
		String nomeFilme = "";

		while (true) {
			switch (escolhaFilme) {
			case 1:
				nomeFilme = "Piratas do Caribe";
				generoFilme = "Ação";
				break;
			case 2:
				nomeFilme = "Gente Grande 2";
				generoFilme = "Comédia";
				break;
			case 3:
				nomeFilme = "Titanic";
				generoFilme = "Drama";
				break;
			case 4:
				nomeFilme = "Amor em Redenção";
				generoFilme = "Romance";
				break;
			case 5:
				nomeFilme = "Sorria";
				generoFilme = "Terror";
				break;
			case 6:
				nomeFilme = "22 de Julho";
				generoFilme = "Documentário";
				break;
			case 7:
				nomeFilme = "Nós";
				generoFilme = "Suspense";
				break;
			case 8:
				nomeFilme = "Interestelas";
				generoFilme = "Ficção Científica";
				break;
			default:
				System.out.println("Filme inválido!");

			}

			if (escolhaFilme >= 1 && escolhaFilme <= 8) {
				break;
			}
			System.out.println("Digite o número do filme de sua preferência: ");
			escolhaFilme = entrada.nextInt();

		}

		System.out.println("  _______________________________");
		System.out.println("  |                             |");
		System.out.println("  |     Formas de pagamento     |");
		System.out.println("  |_____________________________|");
		System.out.println("  |                             |");
		System.out.println("  |  1   Dinheiro               |");
		System.out.println("  |  2   Cartão de Crédito      |");
		System.out.println("  |  3   Cartão de Débito       |");
		System.out.println("  |  4   Pix                    |");
		System.out.println("  |                             |");
		System.out.println("  |    R$16.00 cada ingresso    |");
		System.out.println("  |_____________________________|");
		System.out.println();

		System.out.println("Digite o número do seu método de pagamento: ");
		int escolhaPagamento = entrada.nextInt();

		String formaPagamento = "";

		while (true) {
			switch (escolhaPagamento) {
			case 1:
				formaPagamento = "Dinheiro";
				break;
			case 2:
				formaPagamento = "Cartão de Crédito";
				break;
			case 3:
				formaPagamento = "Cartão de Débito";
				break;
			case 4:
				formaPagamento = "Pix";
				break;
			default:
				System.out.println("Método de pagamento inválido!");
			}
			if (escolhaPagamento >= 1 && escolhaPagamento <= 4) {
				break;
			}

			System.out.println("Erro! Tente novamente!");
			System.out.println();
			System.out.println("Digite seu método de pagamento: ");
			escolhaPagamento = entrada.nextInt();

		}

		Cinema cinema01 = new Cinema(formaPagamento, endereco01, true, 1, nomeFilme, generoFilme);

		System.out.println("Quantos ingressos deseja comprar? ");
		int qtdIngressos = entrada.nextInt();

		while (qtdIngressos < 1 || qtdIngressos > 30) {
			System.out.println("Quantidade de ingressos inválida, tente novamente!");
			System.out.println("Quantos ingressos deseja comprar? ");
			qtdIngressos = entrada.nextInt();
		}

		System.out.println("Deseja pagar a conta(1-Sim, 2-Não): ");
		int pagar = entrada.nextInt();

		boolean pago = true;

		while (pagar != 1) {
			switch (pagar) {
			case 1:
				pago = true;
				break;
			default:
				System.out.println("Você deve pagar! Tente novamente!");
			}
			if (pagar == 1) {
				break;
			}
			System.out.println("Deseja pagar a conta(1-Sim, 2-Não): ");
			pagar = entrada.nextInt();
		}

		cinema01.pagar(pago);
		cinema01.reservar(qtdIngressos);
		System.out.println(cinema01.toString());

		Lanchonete lanchonete01 = new Lanchonete(formaPagamento, endereco01, pago, 1, 4);
		System.out.println("  ________________________________________");
		System.out.println("  |                                      |");
		System.out.println("  |        BEM-VINDO À LANCHONETE!       |");
		System.out.println("  |______________________________________|");
		lanchonete01.comprar();;
		System.out.println();

		System.out.println("  _______________________________");
		System.out.println("  |                             |");
		System.out.println("  |     Formas de pagamento     |");
		System.out.println("  |_____________________________|");
		System.out.println("  |                             |");
		System.out.println("  |  1   Dinheiro               |");
		System.out.println("  |  2   Cartão de Crédito      |");
		System.out.println("  |  3   Cartão de Débito       |");
		System.out.println("  |  4   Pix                    |");
		System.out.println("  |_____________________________|");
		System.out.println();

		System.out.println("Digite o número do seu método de pagamento: ");
		int escolhaPagamento2 = entrada.nextInt();

		while (true) {
			switch (escolhaPagamento2) {
			case 1:
				lanchonete01.setFormaPagamento("Dinheiro");
				break;
			case 2:
				lanchonete01.setFormaPagamento("Cartão de Crédito");
				break;
			case 3:
				lanchonete01.setFormaPagamento("Cartão de Débito");
				break;
			case 4:
				lanchonete01.setFormaPagamento("Pix");
				break;
			default:
				System.out.println("Método de pagamento inválido!");
			}
			if (escolhaPagamento2 >= 1 && escolhaPagamento2 <= 4) {
				break;
			}

			System.out.println("Erro! Tente novamente!");
			System.out.println();
			System.out.println("Digite seu método de pagamento: ");
			escolhaPagamento2 = entrada.nextInt();

		}
		lanchonete01.pagar(pago);
		System.out.println(lanchonete01.toString());

		entrada.close();
	}

}
