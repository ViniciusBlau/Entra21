package Ex2;

public class Principal {

	public static void main(String[] args) {
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
		
		OnibusEscolar onibus1 = new OnibusEscolar(35, 2);
		OnibusEscolar onibus2 = new OnibusEscolar(35, 0);
		OnibusEscolar onibus3 = new OnibusEscolar(55, 1);
		
		for (OnibusEscolar oe : OnibusEscolar.listaOnibus) {
			System.out.println(oe.toString());
			oe.removerAlunos(10);
			System.out.println(oe.getEstudantes());
		}

	}

}
