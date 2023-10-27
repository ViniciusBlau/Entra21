package Herança3;

public class Cachorro extends Animal {

	private String raca;
	
	public Cachorro(String especie, boolean estimacao, double peso, String raca) {
		super(especie, estimacao, peso);
		setRaca(raca);
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		if (raca == null || raca.isBlank()) {
			throw new IllegalArgumentException("Raça inválida!");
		}
		this.raca = raca;
	}
	
	@Override
	
	public String toString() {
		return super.toString() + " - Raça: " + this.raca;
	}

	@Override
	public String som() {
		return "Au Au";
	}
	
}
