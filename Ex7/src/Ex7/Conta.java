package Ex7;

import java.util.ArrayList;
import java.util.List;

public class Conta {

	/*
	 * Faça uma classe chamada Conta, com os atributos nome e saldo.
	 * 
	 * Faça um método para sacar dinheiro Outro método para depositar dinheiro E
	 * outro método para transferir dinheiro de uma conta para outra
	 */

	private String nome;
	private double saldo;
	public static List<Conta> listaConta = new ArrayList<Conta>();

	public Conta(String nome, double saldo) {
		setNome(nome);
		setSaldo(saldo);
		listaConta.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.isBlank() || nome.isEmpty() || nome == null) {
			System.out.println("Nome inexistente.");
		} else {
			this.nome = nome;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo < 0) {
			System.out.println("Saldo insuficiente pra retirar.");
		} else {
			this.saldo = saldo;
		}
	}

	public void retitarSaldo(double diminuir) {
		if (this.saldo < 0) {
			System.out.println("Saldo insuficiente pra retirar.");
		}
		this.setSaldo(this.getSaldo() - diminuir);
	}

	public void adicionarSaldo(double aumentar) {
		this.setSaldo(this.getSaldo() + aumentar);
	}

	public void transferirSaldo(double qtdTransferida, Conta conta3) {
		this.saldo -= qtdTransferida;
		conta3.adicionarSaldo(qtdTransferida);
		System.out.println("Transferência de " + qtdTransferida + " para " + conta3.getNome() + " realizada com sucesso.");
	}

	@Override

	public String toString() {
		return "Nome: " + getNome() + " - Saldo: " + getSaldo();
	}

}
