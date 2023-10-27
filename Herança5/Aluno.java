package Herança5;

public class Aluno extends Pessoa{
	
	private String tipoDeAssociacao;
	private boolean pagamentoEmAtraso;
	
	public Aluno(String nome, String telefone, Endereco endereco, String email) {
		super(nome, telefone, endereco, email);
		setTipoDeAssociacao(email);
		setPagamentoEmAtraso(pagamentoEmAtraso);
	}

	public String getTipoDeAssociacao() {
		return tipoDeAssociacao;
	}

	public void setTipoDeAssociacao(String tipoDeAssociacao) {
		if (tipoDeAssociacao == null || tipoDeAssociacao.isBlank()) {
			throw new IllegalArgumentException("Tipo de associação inválida!");
		}
		this.tipoDeAssociacao = tipoDeAssociacao;
	}

	public boolean isPagamentoEmAtraso() {
		return pagamentoEmAtraso;
	}

	public void setPagamentoEmAtraso(boolean pagamentoEmAtraso) {
		if (pagamentoEmAtraso == true) {
			System.out.println("Pagamento atrasado!");
		}
		this.pagamentoEmAtraso = pagamentoEmAtraso;
	}
	
	@Override
	
	public String toString() {
		return super.toString() + " - Tipo de Associação: " + this.tipoDeAssociacao
				+ " - Pagamento Atrasado: " + this.pagamentoEmAtraso;
	}

	
}
