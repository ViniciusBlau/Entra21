package Herança6;

public class Smartphone extends Computador {
	
	private int operadora;
	private boolean cameraFrontal;
	
	public Smartphone(String modelo, double ram, double armazenamento, int operadora, boolean cameraFrontal) {
		super(modelo, ram, armazenamento);
		setOperadora(operadora);
		setCameraFrontal(cameraFrontal);
	}

	public int getOperadora() {
		return operadora;
	}

	public void setOperadora(int operadora) {
		if (operadora < 0) {
			throw new IllegalArgumentException("Operadora inválida!");
		}
		this.operadora = operadora;
	}

	public boolean isCameraFrontal() {
		return cameraFrontal;
	}

	public void setCameraFrontal(boolean cameraFrontal) {
		this.cameraFrontal = cameraFrontal;
	}
	
	public boolean tirarSelfie() {
		if (cameraFrontal == true) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean ligar(int firstNumber) {
		
		String number = ""+ firstNumber;
		String operator = ""+ operadora;
		
		if (number.startsWith(operator)) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public boolean rodarAplicacao(String app) {
		if (app.endsWith(".apk")) {
			return true;
		} else {
			return false;
		}
	}
	
	

}
