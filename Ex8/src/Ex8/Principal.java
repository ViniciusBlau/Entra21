package Ex8;

public class Principal {
	public static void main(String[] args) {
		/*
		 * Deseja-se criar uma classe para controlar a velocidade do carro.
		 * 
		 * Implemente os métodos: acelerar(double): void, que deve modificar o conteúdo
		 * do atributo velocidade para velocidade + parâmetro recebido (usar
		 * setVelocidade), mas desde que o valor do parâmetro seja maior ou igual a zero
		 * e menor que 20. Senão, imprime a mensagem “Não foi possível acelerar” e
		 * mantém o valor atual do atributo velocidade.
		 * 
		 * reduzir(double): void, quem odifica o conteúdo do atributo velocidade para
		 * velocidade - parâmetro recebido (usar setVelocidade), mas desde que o valor
		 * do parâmetro seja maior ou igual a zero e menor que 30. Senão, imprime a
		 * mensagem “Não foi possível reduzir” e mantém o valor atual do atributo
		 * velocidade.
		 */
		
		Carro carro = new Carro(70);
		
		carro.acelerar(40);
		carro.freiar(45);
		
		System.out.println(carro.toString());
		
	}
}
