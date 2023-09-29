package Classe06;

public class Mercado {

	/*
	 * tribua valores às variáveis da classe Mercado para cada um dos objetos de
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

	private int qtdMacas;
	private double valorMacas;
	private int qtdLaranjas;
	private double valorLaranjas;
	private String localidade;

	public Mercado(int qtdMacas, double valorMacas, int qtdLaranjas, double valorLaranjas, String localidade) {
		setQtdMacas(qtdMacas);
		setValorMacas(valorMacas);
		setQtdLaranjas(qtdLaranjas);
		setValorLaranjas(valorLaranjas);
		setLocalidade(localidade);
	}

	public double getQtdMacas() {
		return qtdMacas;
	}

	public void setQtdMacas(int qtdMacas) {
		if (qtdMacas < 0) {
			System.out.println("Erro, sem maçãs.");
		} else {
			this.qtdMacas = qtdMacas;
		}
	}

	public double getValorMacas() {
		return valorMacas;
	}

	public void setValorMacas(double valorMacas) {
		if (valorMacas < 0) {
			System.out.println("Erro, maçãs sem valor.");
		} else {
			this.valorMacas = valorMacas;

		}
	}

	public double getQtdLaranjas() {
		return qtdLaranjas;
	}

	public void setQtdLaranjas(int qtdLaranjas) {
		if (qtdLaranjas < 0) {
			System.out.println("Erro, sem laranjas.");
		} else {
			this.qtdLaranjas = qtdLaranjas;
		}
	}

	public double getValorLaranjas() {
		return valorLaranjas;
	}

	public void setValorLaranjas(double valorLaranjas) {
		if (valorLaranjas < 0) {
			System.out.println("Erro, laranjas sem valor.");
		}
		this.valorLaranjas = valorLaranjas;
	}

	public String getLocalidade() {
		return localidade;
	}

	public void setLocalidade(String localidade) {
		if (localidade.isBlank() || localidade.isEmpty() || localidade == null) {
			System.out.println("Erro, nenhuma franquia adicionada.");
		} else {
			this.localidade = localidade;

		}
	}
	
	public double lucroMacas() {
		return qtdMacas * valorMacas;
	}
	
	public double lucroLaranjas() {
		return qtdLaranjas * valorLaranjas;
	}
	
	public double lucroTotal() {
		return lucroMacas() + lucroLaranjas();
	}
	
	@Override
	public String toString() {
		return "Locais: " + this.getLocalidade();
	}
	
	
}
