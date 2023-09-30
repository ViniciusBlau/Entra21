package Classe08;

public class Aeronave {
	/*
	 * Faça uma classe chamada Aeronave. Com os atributos: Passageiros. Velocidade
	 * máxima. Capacidade de combustível. Queima de combustível por minuto.
	 * 
	 * Crie 4 objetos de sua preferência.
	 * 
	 * 
	 * Calcule: a) Qual das aeronaves pode ficar no ar por mais tempo? b) Qual
	 * aeronave leva o maior número de passageiros? c) Considerando que os aviões
	 * estão em velocidade máxima, qual deles consegue voar mais longe?
	 */

	private String aviao;
	private int passageiros;
	private int velMax;
	private int combustivel;
	private double combustivelMin;

	public Aeronave(String aviao, int passageiros, int velMax, int combustivel, double combustivelMin) {
		setAviao(aviao);
		setPassageiros(passageiros);
		setVelMax(velMax);
		setCombustivel(combustivel);
		setCombustivelMin(combustivelMin);
	}

	public String getAviao() {
		return aviao;
	}

	public void setAviao(String aviao) {
		if (aviao.isBlank() || aviao.isEmpty() || aviao == null) {
			System.out.println("Sem nome o aviao.");
		} else {
			this.aviao = aviao;
		}
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		if (passageiros < 0) {
			System.out.println("Sem passageiros.");
		} else {
			this.passageiros = passageiros;
		}
	}

	public int getVelMax() {
		return velMax;
	}

	public void setVelMax(int velMax) {
		if (velMax < 0) {
			System.out.println("Avião parado.");
		} else {
			this.velMax = velMax;
		}

	}

	public int getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(int combustivel) {
		if (combustivel < 0) {
			System.out.println("Sem capacidade.");
		} else {
			this.combustivel = combustivel;
		}

	}

	public double getCombustivelMin() {
		return combustivelMin;
	}

	public void setCombustivelMin(double combustivelMin) {
		if (combustivelMin < 0) {
			System.out.println("Tá estragado o motor.");
		} else {
			this.combustivelMin = combustivelMin;
		}
	}

	public double tempoNoAr() {
		return combustivel / combustivelMin;
	}
	
	public double maisLonge() {
		return velMax * tempoNoAr();
	}

}
