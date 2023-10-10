package Ex8;

public class Carro {
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

	private double velocidade;

	public Carro(double velocidade) {
		setVelocidade(velocidade);
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}

	/*
	 * Implemente os métodos: acelerar(double): void, que deve modificar o conteúdo
	 * do atributo velocidade para velocidade + parâmetro recebido (usar
	 * setVelocidade), mas desde que o valor do parâmetro seja maior ou igual a zero
	 * e menor que 20. Senão, imprime a mensagem “Não foi possível acelerar” e
	 * mantém o valor atual do atributo velocidade.
	 */

	public void acelerar(double acelera) {
		if (acelera >= 0 && acelera < 20) {
			this.setVelocidade(this.velocidade + acelera);
		} else {
			System.out.println("Não foi possível acelerar.");
		}
	}

	/*
	 * reduzir(double): void, quem odifica o conteúdo do atributo velocidade para
	 * velocidade - parâmetro recebido (usar setVelocidade), mas desde que o valor
	 * do parâmetro seja maior ou igual a zero e menor que 30. Senão, imprime a
	 * mensagem “Não foi possível reduzir” e mantém o valor atual do atributo
	 * velocidade.
	 */

	public void freiar(double freia) {
		if (freia >= 0 && freia < 30) {
			this.setVelocidade(this.velocidade - freia);
		} else {
			System.out.println("Não foi possível reduzir.");
		}
	}
	
	@Override
	
	public String toString() {
		return "Velocidade do carro: " + this.velocidade + " Km/h.";
	}

}
