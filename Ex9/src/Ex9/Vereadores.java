package Ex9;

import java.util.ArrayList;
import java.util.List;

public class Vereadores {

	private String nome;
	private String partido;
	private int qtdProjetosApresentados;
	private int qtdProjetosAprovados;
	private double indiceTrabalho;
	public static List<Vereadores> listaVereadores = new ArrayList<>();

	public Vereadores(String nome, String partido, int qtdProjetosApresentados, int qtdProjetosAprovados) {
		setNome(nome);
		setPartido(partido);
		setQtdProjetosApresentados(qtdProjetosApresentados);
		setQtdProjetosAprovados(qtdProjetosAprovados);
		setIndiceTrabalho();
		listaVereadores.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.isBlank() || nome.isEmpty() || nome == null) {
			System.out.println("Nome não pode estar vazio ou nulo.");
		} else {
			this.nome = nome;
		}

	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		if (partido.isBlank() || partido.isEmpty() || partido == null) {
			System.out.println("Partido não pode estar vazio ou nulo.");
		} else {
			this.partido = partido;
		}

	}

	public int getQtdProjetosApresentados() {
		return qtdProjetosApresentados;
	}

	public void setQtdProjetosApresentados(int qtdProjetosApresentados) {
		this.qtdProjetosApresentados = qtdProjetosApresentados;
	}

	public int getQtdProjetosAprovados() {
		return qtdProjetosAprovados;
	}

	public void setQtdProjetosAprovados(int qtdProjetosAprovados) {
		this.qtdProjetosAprovados = qtdProjetosAprovados;
	}

	public double getIndiceTrabalho() {
		return indiceTrabalho;
	}

	public void setIndiceTrabalho() {
		if (qtdProjetosApresentados >= 1 && qtdProjetosApresentados <= 5) {
			this.indiceTrabalho = 0.80;
		} else if (qtdProjetosApresentados >= 6 && qtdProjetosApresentados <= 10) {
			this.indiceTrabalho = 1.00;
		} else if (qtdProjetosApresentados >= 11 && qtdProjetosApresentados <= 17) {
			this.indiceTrabalho = 1.08;
		} else if (qtdProjetosApresentados > 17) {
			this.indiceTrabalho = 1.22;
		} else {
			this.indiceTrabalho = 0.0;
		}
	}

	public double desempenho() {
		if (qtdProjetosApresentados == 0) {
			return 0;
		} else {
			return (qtdProjetosAprovados / (double) qtdProjetosApresentados) * indiceTrabalho;
		}

	}

	@Override
	public String toString() {
		return "Nome: " + this.nome + " - Partido: " + this.partido + " - Desempenho: " + this.desempenho();
	}
}
