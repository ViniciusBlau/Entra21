package Herança01;

public class Aves extends Animais {
	
	private String corPenas;
	private String tipoAlimentos;

	public Aves(String raca, String nomeId, String porte, String habitat, String paisOrigem, String corPenas
			, String tipoAlimentos) {
		super(raca, nomeId, porte, habitat, paisOrigem);
		setCorPenas(corPenas);
		setTipoAlimentos(tipoAlimentos);
	}

	public String getCorPenas() {
		return corPenas;
	}

	public void setCorPenas(String corPenas) {
		if (corPenas == null || corPenas.isBlank()) {
			throw new IllegalArgumentException("Cor de penas inválidas!");
		}
		this.corPenas = corPenas;
	}

	public String getTipoAlimentos() {
		return tipoAlimentos;
	}

	public void setTipoAlimentos(String tipoAlimentos) {
		if (tipoAlimentos == null || tipoAlimentos.isBlank()) {
			throw new IllegalArgumentException("Tipo de alimentação inválida!");
		}
		this.tipoAlimentos = tipoAlimentos;
	}
	
	@Override
	
	public String toString() {
		return super.toString() + " - Cor penas: " + this.corPenas +
				" - Tipo de alimentação: " + getTipoAlimentos();
	}
	
}
