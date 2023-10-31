package Herança7;

import java.time.LocalDate;
import java.util.ArrayList;

public class Gerente extends Funcionario {

	public Gerente(String id, Endereco endereco, LocalDate dataNascimento, String nome, double salario,
			LocalDate dataIngresso, ArrayList<String> habilidades, String idGerente) {
		super(id, endereco, dataNascimento, nome, salario, dataIngresso, habilidades);
		setId(idGerente);
	}

	private String idGerente;



	public String getIdGerente() {
		return idGerente;
	}

	public void setIdGerente(String idGerente) {
		if (idGerente == null || idGerente.isBlank()) {
			throw new IllegalArgumentException("Id de gerente inválido!");
		}
		this.idGerente = idGerente;
	}

	public void demitirEmpregado(Empregado byeFolks) {

		if (byeFolks.getId().equals(idGerente)) {
			byeFolks.setId("Este gerente não é o gerente do empregado.");
		} else {
			System.out.println("Demitido!");
		}
			

	}

	@Override

	public String toString() {
		return super.toString() + " - Id Gerente: " + idGerente;
	}

}
