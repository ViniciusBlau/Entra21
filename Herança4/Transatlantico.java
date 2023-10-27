package Herança4;

public class Transatlantico extends Embarcacao {

	private int anoBatismo;
	private int capacidadeBoteSalvaVidas;

	public Transatlantico(String id, String modelo, int qtdpessoas, double capacidadeCombustivel,
			double queimaCombustivel, int qtdBotesSalvaVidas, int anoBatismo, int capacidadeBoteSalvaVidas) {
		super(id, modelo, qtdpessoas, capacidadeCombustivel, queimaCombustivel, qtdBotesSalvaVidas);
		setAnoBatismo(anoBatismo);
		setCapacidadeBoteSalvaVidas(capacidadeBoteSalvaVidas);
	}

	public int getAnoBatismo() {
		return anoBatismo;
	}

	public void setAnoBatismo(int anoBatismo) {
		if (anoBatismo < 0) {
			throw new IllegalArgumentException("Lancha não foi batizada!");
		}
		this.anoBatismo = anoBatismo;
	}

	public int getCapacidadeBoteSalvaVidas() {
		return capacidadeBoteSalvaVidas;
	}

	public void setCapacidadeBoteSalvaVidas(int capacidadeBoteSalvaVidas) {
		this.capacidadeBoteSalvaVidas = capacidadeBoteSalvaVidas;
	}

	public void adicionaBotes(int botes) {
		capacidadeBoteSalvaVidas += botes;
	}

	@Override
	public String verificaSeguranca() {
		if ((capacidadeBoteSalvaVidas * getQtdBotesSalvaVidas()) >= getQtdpessoas()) {
			return "Botes Ok";
		} else {
			return "Alerta: embarcação necessitando de mais botes!";
		}

	}

	@Override

	public String toString() {
		return super.toString() + "- Ano de Batismo: " + anoBatismo + " - Capacidade de botes salva vidas: "
				+ capacidadeBoteSalvaVidas;
	}

}
