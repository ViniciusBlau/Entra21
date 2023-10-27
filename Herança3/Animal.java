package Herança3;

public abstract class Animal {
	
	private String especie;
	private boolean estimacao;
	private double peso;
	
	public Animal(String especie, boolean estimacao, double peso) {
		super();
		setEspecie(especie);
		setEstimacao(estimacao);
		setPeso(peso);
	}
	
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		if (especie.equalsIgnoreCase("cachorro") || especie.equalsIgnoreCase("gato")) {
			this.especie = especie;	
		} else {
			throw new IllegalArgumentException("Espécie inválida!");
		}
		
	}
	public boolean isEstimacao() {
		return estimacao;
	}
	public void setEstimacao(boolean estimacao) {
		this.estimacao = estimacao;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if (peso < 0) {
			throw new IllegalArgumentException("Peso inválido!");
		}
		this.peso = peso;
	}
	
	public abstract String som();
	
	@Override
	public String toString() {
		return "Espécie: " + this.especie + " - Estimação: " + this.estimacao + " - Peso: " + this.peso;
	}
	
}
