package Classe02;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Em uma classe denominada Pessoa, deseja-se manter o nome, sexo, data de
		 * nascimento e estado civil de uma pessoa. O sexo deve ser definido como um
		 * caracter. A data deve ser definida como String.
		 * 
		 * Crie 2 objetos de Pessoa.
		 */

		Pessoa p1 = new Pessoa();

		p1.nome = "LéoCharada";
		p1.sexo = 'F';
		p1.dataDeNascimento = "11/08/04";
		p1.estadoCivil = "Abandonado";
		
		System.out.println(p1.imprimirTudo());
		
		
		Pessoa p2 = new Pessoa();
		
		p2.nome = "Blau";
		p2.sexo = 'M';
		p2.dataDeNascimento = "02/04/05";
		p2.estadoCivil = "Namorando";
		
		System.out.println(p2.imprimirTudo());
		
		
	}

}
