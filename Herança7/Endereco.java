package Herança7;

public class Endereco {
	
	private String pais;
	private String estado;
	private String cidade;
	private String logradouro;
	private String numero;
	
	public Endereco(String pais, String estado, String cidade, String logradouro, String numero) {
		setPais(pais);
		setEstado(estado);
		setCidade(cidade);
		setLogradouro(logradouro);
		setNumero(numero);
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		if (pais == null || pais.isBlank()) {
			throw new IllegalArgumentException("País inválido!");
		}
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		if (estado == null || estado.isBlank()) {
			throw new IllegalArgumentException("Estado inválido!");
		}
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		if (cidade == null || cidade.isBlank()) {
			throw new IllegalArgumentException("Cidade inválida!");
		}
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		if (logradouro == null || logradouro.isBlank()) {
			throw new IllegalArgumentException("Logradouro inválido!");
		}
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		if (numero == null || numero.isBlank()) {
			throw new IllegalArgumentException("Número inválido!");
		}
		this.numero = numero;
	}
	
	@Override
	
	public String toString() {
		return this.pais + " - " + this.estado + " - " + this.cidade + " - " +
				this.logradouro + " - " + this.numero;
	}
	
}

