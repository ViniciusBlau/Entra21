package Ex2;

import java.util.ArrayList;
import java.util.List;

public class OnibusEscolar {

		/*
		 * Faça uma classe chamada OnibusEscolar, com os atributos estudantes e
		 * professor
		 * 
		 * Faça uma exceção no método setAlunos que se o número de alunos for maior do
		 * que 40, faça com que o número de alunos seja 40
		 * 
		 * Caso o número de professores for 0, o número de alunos também deve ser zerado
		 * 
		 * Faça também um método chamado remover alunos, que deverá remover os alunos de
		 * acordo com o valor passado como parâmetro
		 * 
		 */
		
	private int estudantes;
	private int professor;
	public static List<OnibusEscolar> listaOnibus = new ArrayList<>();
	
	public OnibusEscolar(int estudantes, int professor) {
		setEstudantes(estudantes);
		setProfessor(professor);
		listaOnibus.add(this);
	}

	public int getEstudantes() {
		return estudantes;
	}

	public void setEstudantes(int estudantes) {
		if (estudantes > 40) {
			this.estudantes = 40;
		} else {
			this.estudantes = estudantes;	
		}
	}

	public int getProfessor() {
		return professor;
	}

	public void setProfessor(int professor) {
		if (professor == 0) {
			this.setEstudantes(0);
		} else {
			this.professor = professor;
		}
	}
	
	public void removerAlunos(int dez) {
		setEstudantes(this.estudantes - dez);
	}
	
	@Override
	
	public String toString() {
		return "Número de estudantes: " + this.estudantes + " - Número de professores: " + this.professor;
	}
	
}
