package Herança01;

public class Gatos extends Animais {
	
	private String corPelagem;
	private String tiposManchas;
	
	public Gatos(String raca, String nomeId, String porte, String habitat, String paisOrigem, String corPelagem
			,String tiposManchas) {
		super(raca, nomeId, porte, habitat, paisOrigem);
		setCorPelagem(corPelagem);
		setTiposManchas(tiposManchas);
	}

	public String getCorPelagem() {
		return corPelagem;
	}

	public void setCorPelagem(String corPelagem) {
		if (corPelagem.equals("pardo") || "preto".equals(corPelagem)) {
	        this.corPelagem = corPelagem;
	    } else {
	        throw new IllegalArgumentException("Pelagem inválida!");
	    }
		
	}
	
	public String getTiposManchas() {
		return tiposManchas;
	}

	public void setTiposManchas(String tiposManchas) {
		if ("ausente".equals(tiposManchas) || "pintado".equals(tiposManchas) || "listrado".equals(tiposManchas)) {
			this.tiposManchas = tiposManchas;	
		} else {
			throw new IllegalArgumentException("Tipo de mancha inválido!");
		}
	    
	}
	
	@Override
	
	public String toString() {
		return super.toString() + "- Pelagem: " + getCorPelagem() + 
				" - Manchas: " + getTiposManchas();
	}
	
}
