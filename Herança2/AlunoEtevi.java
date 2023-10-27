package Herança2;

public class AlunoEtevi extends Aluno {
	
	private int ano;
	
	public AlunoEtevi(String nome, int idade, int ano) {
		super(nome, idade);
		setAno(ano);
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		if (ano < 0) {
			throw new IllegalArgumentException("Ano inválido!");
		}
		this.ano = ano;
	}

	@Override
	public String toString() {
		return super.toString() + " - Ano: " + this.ano;
	}	
	
}
