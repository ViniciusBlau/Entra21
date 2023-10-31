package Herança7;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public abstract class Funcionario {

	private String id;
	private Endereco endereco;
	private LocalDate dataNascimento;
	private String nome;
	private double salario;
	private LocalDate dataIngresso;
	private ArrayList<String> habilidades = new ArrayList<>();

	public Funcionario(String id, Endereco endereco, LocalDate dataNascimento, String nome, double salario,
			LocalDate dataIngresso, ArrayList<String> habilidades) {
		super();
		setId(id);
		setEndereco(endereco);
		setDataNascimento(dataNascimento);
		setNome(nome);
		setSalario(salario);
		setDataIngresso(dataIngresso);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		if (id == null || id.isBlank()) {
			throw new IllegalArgumentException("Id inválido!");
		}
		this.id = id;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		if (endereco == null) {
			throw new IllegalArgumentException("Endereço inválido!");
		}
		this.endereco = endereco;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		if (dataNascimento == null) {
			throw new IllegalArgumentException("Data de nascimento inválida!");
		}
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("Nome inválido!");
		}
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario < 0) {
			throw new IllegalArgumentException("Salário inválido!");
		}
		this.salario = salario;
	}

	public LocalDate getDataIngresso() {
		return dataIngresso;
	}

	public void setDataIngresso(LocalDate dataIngresso) {
		if (dataIngresso == null) {
			throw new IllegalArgumentException("Data de ingresso inválida!");
		}
		this.dataIngresso = dataIngresso;
	}

	public ArrayList<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(ArrayList<String> habilidades) {
		if (habilidades == null || habilidades.isEmpty()) {
			throw new IllegalArgumentException("Nada baby.");
		}
		this.habilidades = habilidades;
	}

	public int getIdade() {

		LocalDate dataAtual2 = LocalDate.now();
		Period periodo = Period.between(dataIngresso, dataAtual2);
		return periodo.getYears();
	}

	public double calcularSalarioAnual() {

		double salarioAnual = 0;

		for (int i = 0; i < 12; i++) {
			salarioAnual += salario;
		}
		return salarioAnual;
	}

	public void adicionarHabilidade(String skill) {
		habilidades.add(skill);
	}

	public int calcularAnosDeEmpresa() {

		LocalDate dataAtual = LocalDate.now();
		Period periodo = Period.between(dataIngresso, dataAtual);
		return periodo.getYears();

	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", endereco=" + endereco + ", dataNascimento=" + dataNascimento + ", nome="
				+ nome + ", salario=" + salario + ", dataIngresso=" + dataIngresso + ", habilidades=" + habilidades
				+ "]";
	}

}
