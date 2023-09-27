package Classe01;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Em uma classe denominada Pessoa, deseja-se manter o nome, sexo, data de
		 * nascimento e estado civil de uma pessoa. O sexo deve ser definido como um
		 * caracter. A data deve ser definida como String.
		 * 
		 * Crie 2 objetos de Pessoa.
		 */
		
		Veiculo civic = new Veiculo();
		
		civic.modelo = "Civic";
		civic.comprimento = 4.7;
		civic.passageiros = 5;
		civic.velMax = 200;
		civic.cor = "Preto";
		
		System.out.println(civic.cor);
		
	}

	
}
