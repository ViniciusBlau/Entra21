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
		
		Cinema cinema01 = new Cinema("dinheiro", endereco01, true, 1, nomeFilme, generoFilme);

		System.out.println("Quantos ingressos deseja comprar? ");
		int qtdIngressos = entrada.nextInt();

		while (qtdIngressos < 1 || qtdIngressos > 30) {
			System.out.println("Quantidade de ingressos inválida, tente novamente!");
			System.out.println("Quantos ingressos deseja comprar? ");
			qtdIngressos = entrada.nextInt();
		}

		
		cinema01.reservar(qtdIngressos);
		System.out.println(cinema01.toString());
		
		entrada.close();
	}

}
