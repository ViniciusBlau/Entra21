package Herança4;

public abstract class Embarcacao {
	
	private String id;
	private String modelo;
	private int qtdpessoas;
	private double capacidadeCombustivel;
	private double queimaCombustivel;
	private int qtdBotesSalvaVidas;
	
	public Embarcacao(String id, String modelo, int qtdpessoas, double capacidadeCombustivel, double queimaCombustivel,
			int qtdBotesSalvaVidas) {
		super();
		setId(id);
		setModelo(modelo);
		setQtdpessoas(qtdpessoas);
		setCapacidadeCombustivel(capacidadeCombustivel);
		setQueimaCombustivel(queimaCombustivel);
		setQtdBotesSalvaVidas(qtdBotesSalvaVidas);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		if (id == null || id.isBlank()) {
			throw new IllegalArgumentException("ID de embarcação inválido!");
		}
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		if (modelo == null || modelo.isBlank()) {
			throw new IllegalArgumentException("Modelo de embarcação inválido!");
		}
		this.modelo = modelo;
	}
	public int getQtdpessoas() {
		return qtdpessoas;
	}
	public void setQtdpessoas(int qtdpessoas) {
		if (qtdpessoas < 0) {
			throw new IllegalArgumentException("Quantidade de pessoas inválidas!");
		}
		this.qtdpessoas = qtdpessoas;
	}
	public double getCapacidadeCombustivel() {
		return capacidadeCombustivel;
	}
	public void setCapacidadeCombustivel(double capacidadeCombustivel) {
		if (capacidadeCombustivel < 0) {
			throw new IllegalArgumentException("Quantidade de combustível inválida!");
		}
		this.capacidadeCombustivel = capacidadeCombustivel;
	}
	public double getQueimaCombustivel() {
		return queimaCombustivel;
	}
	public void setQueimaCombustivel(double queimaCombustivel) {
		if (queimaCombustivel < 0) {
			throw new IllegalArgumentException("Quantidade de queima de combustível inválida!");
		}
		this.queimaCombustivel = queimaCombustivel;
	}
	public int getQtdBotesSalvaVidas() {
		return qtdBotesSalvaVidas;
	}
	public void setQtdBotesSalvaVidas(int qtdBotesSalvaVidas) {
		if (qtdBotesSalvaVidas < 0) {
			throw new IllegalArgumentException("Quantidade de botes salva vidas inválida!");
		}
		this.qtdBotesSalvaVidas = qtdBotesSalvaVidas;
	}
	
	public boolean planejarViagem(double combustivel) {
		if (combustivel / queimaCombustivel > 0) {
			return true;	
		} else {
			return false;
		}
	}
	
	public abstract String verificaSeguranca();

	@Override
	public String toString() {
		return "Id: " + id + " - Modelo: " + modelo + " - Quantidade de pessoas: " + qtdpessoas + " - Capacidade de Combustivel: "
				+ capacidadeCombustivel + " - Queima de Combustivel: " + queimaCombustivel + " - Botes salva vidas: "
				+ qtdBotesSalvaVidas;
	}
	
}
