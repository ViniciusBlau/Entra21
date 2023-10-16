package Ex11;

public class Principal {
	public static void main(String[] args) {
		/*
		 * O objetivo deste exercício é implementar a relação entre uma pessoa e seu
		 * endereço.
		 * 
		 * Para isto crie três classes: Pessoa.java, Endereco.java e Principal.java.
		 * 
		 * Na classe Pessoa faça o seguinte: a) Crie dois atributos privados: Um do tipo
		 * String para o nome da pessoa e outro do Endereco para armazenar o endereço da
		 * Pessoa; b) Sobrescreva o método toString() da classe Object para gerar uma
		 * String com o nome da Pessoa e os três atributos de Endereco. c) Crie uma
		 * ArrayList que terá todos os objetos de Pessoa;
		 * 
		 * Na classe Endereco faça o seguinte: a) Crie três atributos privados: um do
		 * tipo String para o logradouro, outro do tipo String para o complemento e um
		 * do tipo int para o número;
		 * 
		 * Na classe Principal faça o seguinte: a) Dentro do main crie vários objetos a
		 * partir da classe Pessoa;
		 * 
		 * b) Percorra a lista de Pessoas e chame o método toString da classe Pessoa
		 * para mostrar o nome de cada pessoa e seu endereço de contato.
		 * 
		 */
		
		Endereco endereco1 = new Endereco("Rua Doutor Paulo Aldinger", "Escola Lúcio esteves", 207);
		Pessoa pessoa1 = new Pessoa("Blau", endereco1);
		Endereco endereco2 = new Endereco("Rua São Paulo", "Furb Campus 2", 3502);
		Pessoa pessoa2 = new Pessoa("Léo", endereco2);
		Endereco endereco3 = new Endereco("Rua XV de novembro", "Escola Bom Jesus", 207);
		Pessoa pessoa3 = new Pessoa("Henrique", endereco3);
		
		for (Pessoa p : Pessoa.listaPessoa) {
			System.out.println(p.toString());
		}
		
	}
}
