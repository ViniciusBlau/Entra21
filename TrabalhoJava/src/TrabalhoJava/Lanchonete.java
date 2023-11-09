package TrabalhoJava;

public class Lanchonete extends Estabelecimento {

	private String alimento;
	private String bebida;
	private boolean pagamento;

	public Lanchonete(String formaPagamento, Endereco local, boolean funcionamento, int saidasEmergencia,
			String alimento, String bebida, String pagamento) {
		super(formaPagamento, local, funcionamento, saidasEmergencia);
		setAlimento(alimento);
		setBebida(bebida);
		setPagamento(funcionamento);
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		if (alimento == null || alimento.isBlank()) {
			throw new IllegalArgumentException("Alimento inválido!");
		}
		this.alimento = alimento;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		if (bebida == null || bebida.isBlank()) {
			throw new IllegalArgumentException("Bebida inválida!");
		}
		this.bebida = bebida;
	}

	public boolean isPagamento() {
		return pagamento;
	}

	public void setPagamento(boolean pagamento) {
		this.pagamento = pagamento;
	}

	@Override
	public String pagar(boolean pago) {
		if (pago) {
			return "Pago";	
		} else {
			return "Não Pago";
		}
		
	}

	@Override
	public String toString() {
		return "Alimento: " + this.alimento + " Bebida: " + " Pagamento: " + this.pagamento;
	}

}
