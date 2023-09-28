package Classe06;

public class Mercado {

	/*
	 * Utilizando a classe Mercado.
	 * 
	 * Atribua valores às variáveis da classe Mercado para cada um dos objetos de
	 * Mercado.
	 * 
	 * Sendo que o preço de compra dos produtos foi igual em todos os mercados.
	 * 
	 * Calcule: a) Quem teve o maior lucro vendendo maçãs? b) Quem teve o maior
	 * lucro vendendo laranjas? c) Qual das lojas teve o maior lucro nesse ano
	 * específico? d) Qual das lojas teve o menor lucro? e) Qual das lojas ficou no
	 * "meio" em termos de lucro? f) Juntando as 3 lojas, a franquia teve um lucro
	 * maior vendendo maçãs ou laranjas?
	 */

	private int qntMacas;
	private double precoMacas;
	private int qtdLaranjas;
	private double precoLaranjas;
	private String localidade;
	
	public Mercado(int qntMacas, double precoMacas, int qtdLaranjas, double precoLaranjas, String localidade) {
		
		this.qntMacas = qntMacas;
		this.precoMacas = precoMacas;
		this.qtdLaranjas = qtdLaranjas;
		this.precoLaranjas = precoLaranjas;
		this.localidade = localidade;
		
	}

	public int getQntMacas() {
		return qntMacas;
	}

	public void setQntMacas(int qntMacas) {
		if (qntMacas < 0) {
			System.out.println("Erro, sem maçãs.");
		} else {
			this.qntMacas = qntMacas;
		}

	}

	public double getPrecoMacas() {
		return precoMacas;
	}

	public void setPrecoMacas(double precoMacas) {
		if (precoMacas < 0) {
			System.out.println("Erro, maças sem preço.");
		} else {
			this.precoMacas = precoMacas;
		}

	}

	public int getQtdLaranjas() {
		return qtdLaranjas;
	}

	public void setQtdLaranjas(int qtdLaranjas) {
		if (qtdLaranjas < 0) {
			System.out.println("Erro, sem laranjas.");
		} else {
			this.qtdLaranjas = qtdLaranjas;
		}
	}

	public double getPrecoLaranjas() {
		return precoLaranjas;
	}

	public void setPrecoLaranjas(double precoLaranjas) {
		if (precoLaranjas < 0) {
			System.out.println("Erro, laranjas sem preço.");
		}
		this.precoLaranjas = precoLaranjas;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		if (localidade.isBlank() || localidade.isEmpty() || localidade == null) {
			System.out.println("Erro, localização inválida.");
		} else {
			this.localidade = localidade;
		}
	}
	
	
	
	
	
}
