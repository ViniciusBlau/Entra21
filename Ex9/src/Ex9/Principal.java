package Ex9;

public class Principal {

	public static void main(String[] args) {

		/*
		 * A Câmara Municipal de Vereadores de Blumenau pretende realizar uma
		 * estatística sobre o desempenho dos seus parlamentares. Para cada um dos 15
		 * vereadores, ela possui o nome, partido, quantidade de projetos apresentados,
		 * quantidade de projetos aprovados. O desempenho é calculado da seguinte forma:
		 * (projetos aprovados / projetos apresentados) * índice de trabalho. Se não
		 * apresentou nenhum projeto, o desempenho é 0 (zero).
		 * 
		 * O índice de trabalho é definido pela seguinte tabela: Projetos apresentados
		 * Índice de trabalho 01 – 05 0,80 06 – 10 1,00 11 – 17 1,08 acima de 17 1,22
		 * 
		 * Escreva um programa Java que leia os dados disponíveis pela Câmara e imprima
		 * o nome, partido e desempenho do vereador.
		 * 
		 * Imprima: a) o total de projetos apresentados e de aprovados na câmara;
		 * 
		 * b) o nome, partido e desempenho do vereador com mais projetos aprovados;
		 * 
		 * c) o nome, partido e desempenho do vereador com menor desempenho;
		 * 
		 * d) o nome, partido e desempenho dos vereadores cujo desempenho seja maior que
		 * o desempenho médio de toda a câmara;
		 */

		Vereadores vereador1 = new Vereadores("Vereador 1", "Partido A", 8, 5);
		Vereadores vereador2 = new Vereadores("Vereador 2", "Partido B", 12, 10);
		Vereadores vereador3 = new Vereadores("Vereador 3", "Partido C", 4, 3);
		Vereadores vereador4 = new Vereadores("Vereador 4", "Partido D", 5, 2);

		int somaApresentados = 0;
		int somaAprovados = 0;

		for (Vereadores v : Vereadores.listaVereadores) {
			somaApresentados += v.getQtdProjetosApresentados();
			somaAprovados += v.getQtdProjetosAprovados();
		}

		System.out.println(
				"Soma projetos apresentados: " + somaApresentados + " - Soma projetos aprovados: " + somaAprovados);

		Vereadores vereadorComMaisAprovados = null;
		Vereadores vereadorMenosDesempenho = null;

		double maxAprovados = Integer.MIN_VALUE;
		double minDesempenho = Integer.MAX_VALUE;

		for (Vereadores v : Vereadores.listaVereadores) {
			if (v.getQtdProjetosAprovados() > maxAprovados) {
				maxAprovados = v.getQtdProjetosAprovados();
				vereadorComMaisAprovados = v;
			}
			if (v.desempenho() < minDesempenho) {
				minDesempenho = v.desempenho();
				vereadorMenosDesempenho = v;
			}
		}

		System.out.println("Vereador com mais projetos aprovados: " + vereadorComMaisAprovados.toString());
		System.out.println("Vereador com menor desempenho: " + vereadorMenosDesempenho.toString());

		/*
		 * d) o nome, partido e desempenho dos vereadores cujo desempenho seja maior que
		 * o desempenho médio de toda a câmara;
		 */
		double desempenhoTotal = 0;
		for (Vereadores v : Vereadores.listaVereadores) {
			desempenhoTotal += v.desempenho();
		}

		double desempenhoMedio = desempenhoTotal / Vereadores.listaVereadores.size();

		System.out.println("Vereadores com desempenho maior que a média:");
		for (Vereadores v : Vereadores.listaVereadores) {
			if (v.desempenho() > desempenhoMedio) {
				System.out.println(v.toString());
			}
		}

	}
}
