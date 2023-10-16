package Ex11;

public class Endereco {
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
	
	private String logradouro;
	private String complemento;
	private int numero;
	
	public Endereco(String logradouro, String complemento, int numero) {
		setLogradouro(logradouro);
		setComplemento(complemento);
		setNumero(numero);
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		if (logradouro == null || logradouro.isBlank() || logradouro.isEmpty()) {
			throw new IllegalArgumentException("Sem logradouro.");
		}
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		if (complemento == null || complemento.isBlank() || complemento.isEmpty()) {
			throw new IllegalArgumentException("Sem complemento.");
		}
		this.complemento = complemento;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if (numero <= 0) {
			throw new IllegalArgumentException("Número inválido.");
		}
		this.numero = numero;
	}
	
	@Override
	
	public String toString() {
		return logradouro + ", " + numero + " - " + complemento;
	}
	
}
