package Herança5;

import java.util.ArrayList;
import java.util.List;

public class Instrutor extends Pessoa {
	
	private String especializacao;
	private List<Aluno> listaAlunos = new ArrayList<Aluno>();
	private List<String> listaEspecializacao = new ArrayList<String>();
	
	public Instrutor(String nome, String telefone, Endereco endereco, String email,
			String especializacao) {
		super(nome, telefone, endereco, email);
		setEspecializacao(especializacao);
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		if (especializacao == null || especializacao.isBlank()) {
			throw new IllegalArgumentException("Especialização inválida!");
		}
		this.especializacao = especializacao;
	}
	
	// Perguntar sobre esse Aluno
	
	/*public void adicionaAlunos(Aluno Aluno) {
		listaAlunos.add(Aluno);
	}
	
	public void adicionaEspecializacao(String) {
		
	}
	*/
	@Override
	
	public String toString() {
		return super.toString() + " - Especialização: " + this.especializacao;
	}

}
