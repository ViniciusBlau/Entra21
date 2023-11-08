package TrabalhoJava;

public class Endereco {

	private String logradouro;
	private String cidade;
	private String estado;
	private String pais;
	private int numero;

	public Endereco(String logradouro, String cidade, String estado, String pais, int numero) {
		setLogradouro(logradouro);
		setCidade(cidade);
		setEstado(estado);
		setPais(pais);
		setNumero(numero);
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		if (cidade == null || cidade.isBlank()) {
			throw new IllegalArgumentException("Cidade inválida!");
		}
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		if (estado == null || estado.isBlank()) {
			throw new IllegalArgumentException("Estado inserido inválido");
		}
		this.estado = estado;
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero < 0) {
			throw new IllegalArgumentException("Número inválido!");
		}
		this.numero = numero;
	}

	@Override
	public String toString() {
		return " País: " + this.pais + " - Estado: " + this.estado + " - Logradouro: " + this.logradouro + " - Número: "
				+ this.numero;
	}


}