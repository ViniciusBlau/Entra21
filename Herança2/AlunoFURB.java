package Herança2;

public class AlunoFURB extends Aluno {

	private char formaIngresso;
	private String curso;
	private String atletica;

	public AlunoFURB(String nome, int idade, char formaIngresso, String curso, String atletica) {
		super(nome, idade);
		setFormaIngresso(formaIngresso);
		setCurso(curso);
		setAtletica(atletica);
	}

	public char getFormaIngresso() {
		return formaIngresso;
	}

	public void setFormaIngresso(char formaIngresso) {
		formaIngresso = Character.toUpperCase(formaIngresso);
		if ('V' == formaIngresso || 'E' == formaIngresso || 'S' == formaIngresso || 'T' == formaIngresso
				|| 'I' == formaIngresso) {
			this.formaIngresso = formaIngresso;	
		} else {
			throw new IllegalArgumentException("Forma de ingresso inválida!");
		}
		
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		if (curso == null) {
			System.out.println("Curso trancado!");
	    } else if (curso.isBlank()) {
	        throw new IllegalArgumentException("Curso inválido!");
	    }
	    this.curso = curso;
	}

	public String getAtletica() {
		return atletica;
	}

	public void setAtletica(String atletica) {
		if (atletica == null || atletica.isBlank()) {
			throw new IllegalArgumentException("Atlética inválida!");
		}
		this.atletica = atletica;
	}
	
	public void trancarCurso() {
		System.out.println("Curso do(a) " + getNome() + " foi trancado!");
	    this.curso = null;
	}
	
	@Override
	public String toString() {
		return super.toString() + " - Forma de ingresso: " + this.formaIngresso
				+ " - Curso: " + this.curso + " - Atlética: " + this.atletica;
	}	
	
}
