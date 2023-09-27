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

		Pessoa pessoa = new Pessoa();

		pessoa.nome = "LéoCharada";
		pessoa.sexo = "F";
		pessoa.dataDeNascimento = "11/08/04";
		pessoa.estadoCivil = "Abandonado";
		
		System.out.println("Nome: " + pessoa.nome);
		System.out.println("Sexo: " + pessoa.sexo);
		System.out.println("Data de nascimento: " + pessoa.dataDeNascimento);
		System.out.println("Estado civil: " + pessoa.estadoCivil);
		
		
		Pessoa pessoa2 = new Pessoa();
		
		pessoa2.nome = "Blau";
		pessoa2.sexo = "M";
		pessoa2.dataDeNascimento = "02/04/05";
		pessoa2.estadoCivil = "Namorando";
		
		System.out.println("Nome: " + pessoa2.nome);
		System.out.println("Sexo: " + pessoa2.sexo);
		System.out.println("Data de nascimento: " + pessoa2.dataDeNascimento);
		System.out.println("Estado civil: " + pessoa2.estadoCivil);
		
		
	}

}
