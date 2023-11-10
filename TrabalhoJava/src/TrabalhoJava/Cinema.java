package TrabalhoJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Cinema extends Estabelecimento {
	Scanner s = new Scanner(System.in);

	private String filme;
	private String genero;
	private ArrayList<Integer> assentos = new ArrayList<>();

	public Cinema(String formaPagamento, Endereco local, boolean funcionamento, int saidasEmergencia, String filme,
			String genero) {
		super(formaPagamento, local, funcionamento, saidasEmergencia);
		setFilme(filme);
		setGenero(genero);
	}

	public String getFilme() {
		return filme;
	}

	public void setFilme(String filme) {
		if (filme == null || filme.isBlank()) {
			throw new IllegalArgumentException("Filme inválido!");
		} else {
			this.filme = filme;
		}

	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		if (genero.equalsIgnoreCase("comédia") || genero.equalsIgnoreCase("ação") || genero.equalsIgnoreCase("romance")
				|| genero.equalsIgnoreCase("drama") || genero.equalsIgnoreCase("terror")
				|| genero.equalsIgnoreCase("documentário") || genero.equalsIgnoreCase("suspense")
				|| genero.equalsIgnoreCase("ficção científica")) {
			this.genero = genero;

		} else {
			throw new IllegalArgumentException("Gênero inválido!");
		}

	}

	public void reservar(int qtdIngressos) {

		for (int i = 0; i < qtdIngressos; i++) {
			System.out.println("Digite o assento que deseja reservar(1-30): ");
			int assento = s.nextInt();

			if (assento >= 1 && assento <= 30) {
				if (assentos.contains(assento)) {
					System.out.println("Assento já reservado!");
					i--;
				} else {
					assentos.add(assento);
					System.out.println("Assento " + assento + " reservado com sucesso!");
				}
			} else {
				System.out.println("Assento inválido!");
				i--;
			}
		}

	}

	public int totalPagar() {

		int totalAssentos = 0;

		for (int a : assentos) {
			totalAssentos += 1;
		}
		totalAssentos = totalAssentos * 16;

		return totalAssentos;
	}

	@Override
	public String pagar(boolean pago) {
		if (pago) {
			return "Pago";
		} else {
			return "Não Pago";
		}

	}

	@Override

	public String toString() {
		return "Filme: " + this.filme + " - Gênero: " + this.genero + " - Assentos: " + this.assentos
				+ " - Forma de pagamento: " + getFormaPagamento() + " - Total a pagar: " + totalPagar() + " reais"
				+ " - " + "Conta: " + pagar(true);
	}

}
