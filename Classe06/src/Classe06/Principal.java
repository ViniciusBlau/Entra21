package exercicio;

public class Principal {

	public static void main(String[] args) {
		/*
		 * tribua valores às variáveis da classe Mercado para cada um dos objetos de
		 * Mercado.
		 * 
		 * Sendo que o preço de compra dos produtos foi igual em todos os mercados.
		 * 
		 * Calcule: a) Quem teve o maior lucro vendendo maçãs? b) Quem teve o maior
		 * lucro vendendo laranjas? c) Qual das lojas teve o maior lucro nesse ano
		 * específico? d) Qual das lojas teve o menor lucro? e) Qual das lojas ficou no
		 * "meio" em termos de lucro? f) Juntando as 3 lojas, a franquia teve um lucro
		 * maior vendendo maçãs ou laranjas?
		 */

		String menosLucro = "";
		String maisLucro = "";
		String locMaiorMacas = "";
		String locMaiorLaranjas = "";
		String locMeio = "";

		double maiorMacas = Integer.MIN_VALUE;
		double maiorLaranjas = Integer.MIN_VALUE;
		double maiorLucro = Integer.MIN_VALUE;
		double menorLucro = Integer.MAX_VALUE;
		double valorMeio = Integer.MIN_VALUE;
		double valorTotal = 0;

		Mercado unidadeDeBlumenau = new Mercado(800, 5, 800, 5, "Blumenau");
		Mercado unidadeDeJoiville = new Mercado(900, 5, 950, 5, "Joinville");
		Mercado unidadeDeFloripa = new Mercado(1000, 5, 800, 5, "Florianópolis");

		Mercado vetor[] = new Mercado[3];
		vetor[0] = unidadeDeBlumenau;
		vetor[1] = unidadeDeJoiville;
		vetor[2] = unidadeDeFloripa;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].lucroMacas() > maiorMacas) {
				maiorMacas = vetor[i].lucroMacas();
				locMaiorMacas = vetor[i].getLocalidade();
			}
			if (vetor[i].lucroLaranjas() > maiorLaranjas) {
				maiorLaranjas = vetor[i].lucroLaranjas();
				locMaiorLaranjas = vetor[i].getLocalidade();
			}
			if (vetor[i].lucroTotal() > maiorLucro) {
				maiorLucro = vetor[i].lucroTotal();
				maisLucro = vetor[i].getLocalidade();
			}
			if (vetor[i].lucroTotal() < menorLucro) {
				menorLucro = vetor[i].lucroTotal();
				menosLucro = vetor[i].getLocalidade();
			}
			if (vetor[i].lucroTotal() > valorMeio && vetor[i].lucroTotal() < maiorLucro) {
				valorMeio = vetor[i].lucroTotal();
				locMeio = vetor[i].getLocalidade();
			}

		}
		
		for (int i = 0; i < vetor.length; i++) {
			valorTotal += vetor[i].lucroTotal(); 
		}

		System.out.println("A franquia que mais lucrou com maçãs: " + locMaiorMacas);
		System.out.println("A franquia que mais lucrou com laranjas: " + locMaiorLaranjas);
		System.out.println("A franquia que mais lucrou ao todo: " + maisLucro);
		System.out.println("A franquia que menos lucrou ao todo: " + menosLucro);
		System.out.println("A franquia que ficou no meio: " + locMeio);
		System.out.println("O lucro total das franquias: " + valorTotal);

	}

}
