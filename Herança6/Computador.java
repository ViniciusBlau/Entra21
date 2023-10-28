package Herança6;

public abstract class Computador {
	
	private String modelo;
	private double ram;
	private double armazenamento;
	
	public Computador(String modelo, double ram, double armazenamento) {
		super();
		setModelo(modelo);
		setRam(ram);
		setArmazenamento(armazenamento);
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if (modelo == null || modelo.isBlank()) {
			throw new IllegalArgumentException("Modelo inválido!");
		}
		this.modelo = modelo;
	}
	public double getRam() {
		return ram;
	}
	public void setRam(double ram) {
		if (ram < 0) {
			throw new IllegalArgumentException("RAM inválida!");
		}
		this.ram = ram;
	}
	public double getArmazenamento() {
		return armazenamento;
	}
	public void setArmazenamento(double armazenamento) {
		if (armazenamento < 0) {
			throw new IllegalArgumentException("Armazenamento inválido");
		}
		this.armazenamento = armazenamento;
	}
	
	public String ligarOuDesligar(boolean botao) {
		if (botao == true) {
			return "Ligando!";
		} else {
			return "Desligando!";
		}
	}
	
	public abstract boolean rodarAplicacao(String app);
	
	@Override
	
	public String toString() {
		return "Modelo: " + modelo + " - RAM: " + ram + " - Armazenamento: " + armazenamento;
	}
	
}
