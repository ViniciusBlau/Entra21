package Herança01;

public abstract class Animais {
	
	private String raca;
	private String nomeId;
	private String porte;
	private String habitat;
	private String paisOrigem;
	
	public Animais(String raca, String nomeId, String porte, String habitat, String paisOrigem) {
		super();
		setRaca(raca);
		setNomeId(nomeId);
		setPorte(porte);
		setHabitat(habitat);
		setPaisOrigem(paisOrigem);
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		if (raca == null || raca.isBlank()) {
			throw new IllegalArgumentException("Sem raça!");
		}
		this.raca = raca;
	}

	public String getNomeId() {
		return nomeId;
	}

	public void setNomeId(String nomeId) {
		if (nomeId == null || nomeId.isBlank()) {
			throw new IllegalArgumentException("Sem nome de identificação!");
		}
		this.nomeId = nomeId;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		if ("pequeno".equals(porte) || "médio".equals(porte) || "grande".equals(porte)) {
			this.porte = porte;
		} else {
			throw new IllegalArgumentException("Porte inválido!");
		}
		
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		if (habitat == null || habitat.isBlank()) {
			throw new IllegalArgumentException("Sem habitat!");
		}
		this.habitat = habitat;
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		if (paisOrigem == null || paisOrigem.isBlank()) {
			throw new IllegalArgumentException("Sem país de origem!");
		}
		this.paisOrigem = paisOrigem;
	}
	
	@Override
	
	public String toString() {
		return "Raça: " + this.raca + " - Nome: " + this.nomeId + " - Porte: " + this.porte + " - Habitat: " +
				this.habitat + " - País de origem: " + this.paisOrigem;
	}
	
}
