package Classe02;

public class Pessoa {
	
	/*
	 * Em uma classe denominada Pessoa, deseja-se manter o nome, sexo, data de
	 * nascimento e estado civil de uma pessoa. O sexo deve ser definido como um
	 * caracter. A data deve ser definida como String.
	 * 
	 * Crie 2 objetos de Pessoa.
	 */
	
	String nome;
	char sexo;
	String dataDeNascimento;
	String estadoCivil;
	
	public String imprimirTudo() {
		return " " + nome + " - " + sexo + " - " + dataDeNascimento + " - " + estadoCivil;  
	}
}
