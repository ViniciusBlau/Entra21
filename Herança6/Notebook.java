package Herança6;

public class Notebook extends Computador {

	private double peso;
	
	public Notebook(String modelo, double ram, double armazenamento, double peso) {
		super(modelo, ram, armazenamento);
		setPeso(peso);
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
	
	public void aumentarRam(double aumentoRam) {
		double aumentoTotal = getRam() + aumentoRam;
		setRam(aumentoTotal);
	}

	@Override
	public boolean rodarAplicacao(String app) {
		if (app.endsWith(".exe")) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	
	public String toString() {
		return super.toString() + " - Peso: " + peso;
	}

}
