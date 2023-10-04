package Ex3;

import java.util.ArrayList;
import java.util.List;

public class Floricultura {

	/*
	 * Em um sistema de uma floricultura deve se guardar o nome da flor, o preço,
	 * nome do cliente que comprou a flor e se a flor é para presente ou não.
	 * 
	 * Crie 5 objetos de flor e as coloque em uma Array List
	 * 
	 * Responda: a) Quem comprou a flor mais cara? b) Qual o nome da flor mais cara?
	 */
	
	private String nomeFlor;
	private double precoFlor;
	private String nomeCliente;
	private boolean presente;
	public static List<Floricultura> listaFlores = new ArrayList<>();
	
	public Floricultura(String nomeFlor, double precoFlor, String nomeCliente, boolean presente) {
		setNomeFlor(nomeFlor);;
		setPrecoFlor(precoFlor);;
		setNomeCliente(nomeCliente);;
		setPresente(presente);
		listaFlores.add(this);
	}

	public String getNomeFlor() {
		return nomeFlor;
	}

	public void setNomeFlor(String nomeFlor) {
		if (nomeFlor.isBlank() || nomeFlor.isEmpty() || nomeFlor == null) {
			System.out.println("Flor sem nome.");
		} else {
			this.nomeFlor = nomeFlor;	
		}
		
	}

	public double getPrecoFlor() {
		return precoFlor;
	}

	public void setPrecoFlor(double precoFlor) {
		if (precoFlor < 0) {
			System.out.println("Erro, as flores estão sem preço.");
		} else {
			this.precoFlor = precoFlor;	
		}
		
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		if (nomeCliente.isBlank() || nomeCliente.isEmpty() || nomeCliente == null) {
			System.out.println("Cliente sem nome.");
		} else {
			this.nomeCliente = nomeCliente;	
		}
	}

	public boolean isPresente() {
		return presente;
	}

	public void setPresente(boolean presente) {
		this.presente = presente;
	}
	
	public String toString() {
		return "Nome flor: " + nomeFlor + " - Preço flor: " + precoFlor + " - Nome cliente: " + nomeCliente
				+ " - Presente: " + presente;
	}
	
}
