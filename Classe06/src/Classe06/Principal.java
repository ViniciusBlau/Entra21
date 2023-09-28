package Classe06;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Utilizando a classe Mercado.
		 * 
		 * Atribua valores às variáveis da classe Mercado para cada um dos objetos de
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

		Mercado unidadeDeBlumenau = new Mercado(1000, 5.20, 870, 4.35, "Blumenau");

		Mercado unidadeDeJoinville = new Mercado(1200, 4.90, 800, 4.75, "Joinville");

		Mercado unidadeDeFlorianopolis = new Mercado(1400, 5, 1200, 5.0, "Floripa");
		
		Mercado vetor[] = new Mercado[3];
		vetor[0] = unidadeDeBlumenau;
		vetor[1] = unidadeDeJoinville;
		vetor[2] = unidadeDeFlorianopolis;


	}
}
