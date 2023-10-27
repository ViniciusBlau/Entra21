package Herança4;

public class Lancha extends Embarcacao {

	private double velMax;
	
	public Lancha(String id, String modelo, int qtdpessoas, double capacidadeCombustivel,
			double queimaCombustivel, int qtdBotesSalvaVidas, double velMax) {
		super(id, modelo, qtdpessoas, capacidadeCombustivel, queimaCombustivel, qtdBotesSalvaVidas);
		setVelMax(velMax);
	}

	public double getVelMax() {
		return velMax;
	}

	public void setVelMax(double velMax) {
		if (velMax < 1) {
			throw new IllegalArgumentException("Velocidade da lancha inválida!");
		}
		this.velMax = velMax;
	}
	
	public String tempoViagem(double distancia) {
		/*
		 * tempo = distância / velocidade_média
		print("O tempo estimado é de %5.2f horas" % tempo)
		# Opcional: imprimir o tempo em horas, minutos e segundos
		tempo_s = int(tempo * 3600)  # convertemos de horas para segundos
		horas = int(tempo_s / 3600)  # parte inteira
		tempo_s = int(tempo_s % 3600)  # o resto
		minutos = int(tempo_s / 60)
		segundos = int(tempo_s % 60)
		print("%05d:%02d:%02d" % (horas, minutos, segundos))
		 */
		double tempo = distancia / velMax ;
		int horas = (int) tempo;
		int minutos = (int) ((tempo - horas) * 60);
		int segundos = (int) ((tempo * 3600) - (horas * 3600) - (minutos * 60));
		return "Tempo: " + horas + ":" + minutos + ":" + segundos;
	}

	@Override
	public String verificaSeguranca() {
		if (getQtdBotesSalvaVidas() > 0) {
			return "Botes Ok!";
		} else {
			return "Alerta: embarcação necessitando de mais botes!";
		}
	}
	
	@Override
	
	public String toString() {
		return super.toString() + " - Velocidade Máxima: " + velMax;
	}

}
