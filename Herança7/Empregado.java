package Herança7;

import java.time.LocalDate;
import java.util.ArrayList;

public class Empregado extends Funcionario {

	private String idSindicato;
	private Gerente gerente;

	public Empregado(String id, Endereco endereco, LocalDate dataNascimento, String nome, double salario,
			LocalDate dataIngresso, ArrayList<String> habilidades, String idSindicato, Gerente gerente) {
		super(id, endereco, dataNascimento, nome, salario, dataIngresso, habilidades);
		setIdSindicato(idSindicato);
		setGerente(gerente);
	}

	public String getIdSindicato() {
		return idSindicato;
	}

	public void setIdSindicato(String idSindicato) {
		if (idSindicato == null) {
			throw new IllegalArgumentException("Id do sindicato Inválida!");
		}
		this.idSindicato = idSindicato;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		if (gerente == null) {
			throw new IllegalArgumentException("Gerente Inválido!");
		}
		this.gerente = gerente;
	}
	
	public void sairDoSindicato() {
		idSindicato = null;
	}
	
	public void comissao(double parte) {
		double valor = getSalario() - (getSalario() * parte);
		setSalario(valor);
	}
	
	@Override
	
	public String toString() {
		return super.toString() + " - Id Sindicato: " + idSindicato + " - Gerente: " +
				gerente;
	}

}
