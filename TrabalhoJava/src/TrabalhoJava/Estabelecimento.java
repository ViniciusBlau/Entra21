package TrabalhoJava;

public abstract class Estabelecimento {

	private String formaPagamento;
	private Endereco local;
	private boolean funcionamento;
	private int saidasEmergencia;

	public Estabelecimento(String formaPagamento, Endereco local, boolean funcionamento, int saidasEmergencia) {
		super();
		setFormaPagamento(formaPagamento);
		setLocal(local);
		setFuncionamento(funcionamento);
		setSaidasEmergencia(saidasEmergencia);
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		if (formaPagamento.equalsIgnoreCase("dinheiro") || formaPagamento.equalsIgnoreCase("crédito")
				|| formaPagamento.equalsIgnoreCase("débito")) {
			this.formaPagamento = formaPagamento;
		} else {
			throw new IllegalArgumentException("Forma de pagamento inválida!");
		}

	}

	public Endereco getLocal() {
		return local;
	}

	public void setLocal(Endereco local) {
		if (local == null) {
			throw new IllegalArgumentException("Endereço nulo!");
		}
		this.local = local;
	}

	public boolean isFuncionamento() {
		return funcionamento;
	}

	public void setFuncionamento(boolean funcionamento) {
		if (funcionamento == false) {
			throw new IllegalArgumentException("Estabelecimento fechado!");
		}
		this.funcionamento = funcionamento;
	}

	public int getSaidasEmergencia() {
		return saidasEmergencia;
	}

	public void setSaidasEmergencia(int saidasEmergencia) {
		if (saidasEmergencia < 1) {
			throw new IllegalArgumentException("Estabelecimento fechado, sem saídas" + " de emergência!");
		}
		this.saidasEmergencia = saidasEmergencia;
	}

	public abstract boolean pagar();

	@Override

	public String toString() {
		return "Forma de pagamento: " + this.formaPagamento + " - Local: " + this.local + " - Funcionando: "
				+ this.funcionamento + " - Saidas de emergência: " + this.saidasEmergencia;
	}

}
