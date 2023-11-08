package TrabalhoJava;

import java.util.ArrayList;

public class Cinema extends Estabelecimento {

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

	public void reserva(int assento) {
		
		boolean verificaAcento = false;
		
		for (int i = 0; i < assentos.size(); i++) {
			if (assentos.get(i).equals(assento) || assento == 0) {
				verificaAcento = true;
				System.out.println("Assento já reservado!");
				break;
			}
		}
		if (verificaAcento == false) {
			assentos.add(assento);
			System.out.println("Assento reservado com sucesso!");
		}

	}

	@Override
	public boolean saida() {
		return true;
	}

	@Override

	public String toString() {
		return super.toString() + " - Filme: " + this.filme + " - Gênero: " + this.genero + " - Assentos: "
				+ this.assentos;
	}

}
