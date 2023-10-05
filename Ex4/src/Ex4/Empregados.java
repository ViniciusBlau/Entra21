package Ex4;

import java.util.ArrayList;
import java.util.List;

public class Empregados {

	/*
	 * Crie uma classe Empregado que terá como atributos: Identificação Nome
	 * Sobrenome Salário
	 * 
	 * Crie métodos para: Saber o salário anual do empregado Saber o nome completo
	 * do empregado Modificar o salário, o parâmetro do método deve ser o percentual
	 * de aumento Imprima o toString do usuário que após o aumento ficou com o maior
	 * do salário
	 * 
	 */
	
	private int id;
	private String nomeSobrenome;
	private double salario;
	public static List<Empregados> listaEmpregados = new ArrayList<>();

	public Empregados(int id, String nomeSobrenome, double salario) {
		setId(id);
		setNomeSobrenome(nomeSobrenome);;
		setSalario(salario);
		listaEmpregados.add(this);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if (id < 1) {
			System.out.println("Sem ID.");
		} else {
			this.id = id;
		}
	}
	
	public String getNomeSobrenome() {
		return nomeSobrenome;
	}

	public void setNomeSobrenome(String nomeSobrenome) {
		if (nomeSobrenome.isBlank() || nomeSobrenome.isEmpty() || nomeSobrenome == null) {
			System.out.println("Nome e sobrenome em branco.");
		} else {
			this.nomeSobrenome = nomeSobrenome;	
		}
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario < 0) {
			System.out.println("Sem salário.");
		} else {
			this.salario = salario;	
		}
	}
	
	public String rendaAnual() {
		return "Nome: " + this.nomeSobrenome + " - Salário anual: " + (this.salario * 12) + " ";
	}
	
	public String imprimirNome() {
		return this.nomeSobrenome;
	}
	
	public void modificarSalario(double salarioNovo) {
		this.setSalario((salario * salarioNovo) + this.salario);
	}
	
	@Override
	
	public String toString() {
		return "" + getNomeSobrenome() + " teve o maior salário anual: " + getSalario();
	}
	
}
