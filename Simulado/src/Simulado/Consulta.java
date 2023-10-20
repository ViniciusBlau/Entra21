package Simulado;

import java.util.ArrayList;
import java.util.List;

public class Consulta {

	private String nomeCliente;
	private String categoria;
	private int anoCadastro;
	private double saldo;
	private String nomeGerente;
	public static List<Consulta> listaConsulta = new ArrayList<>();
	
	public Consulta(String nomeCliente, String categoria, int anoCadastro, double saldo, String nomeGerente) {
		super();
		setNomeCliente(nomeCliente);
		setCategoria(categoria);
		setAnoCadastro(anoCadastro);
		setSaldo(saldo);
		setNomeGerente(nomeGerente);
		listaConsulta.add(this);
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		if (nomeCliente == null || nomeCliente.isBlank() || nomeCliente.isEmpty()) {
			throw new IllegalArgumentException("Cliente sem nome!");
		}
		this.nomeCliente = nomeCliente;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		if (categoria == null || categoria.isBlank() || categoria.isEmpty()) {
			throw new IllegalArgumentException("Sem categoria!!");
		} 
		this.categoria = categoria;
	}

	public int getAnoCadastro() {
		return anoCadastro;
	}

	public void setAnoCadastro(int anoCadastro) {
		if (anoCadastro <= 0) {
			throw new IllegalArgumentException("Ano de cadatro inválido!");
		}
		this.anoCadastro = anoCadastro;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo <= 0) {
			throw new IllegalArgumentException("Saldo inválido!");
		}
		this.saldo = saldo;
	}

	public String getNomeGerente() {
		return nomeGerente;
	}

	public void setNomeGerente(String nomeGerente) {
		if (nomeGerente == null || nomeGerente.isBlank() || nomeGerente.isEmpty()) {
			throw new IllegalArgumentException("Nome de gerente inválido!");
		} 
		this.nomeGerente = nomeGerente;
	}
	
	@Override
	
	public String toString() {
		return "Nome: " + getNomeCliente() + " - Categoria: " + getCategoria() + " - Ano de Cadastro: " +
				getAnoCadastro() + " - Saldo: " + getSaldo() + " - Gerente: " + getNomeGerente();
	}
	
	
}
