package Ex6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Cardapio {
	/*
	 * Uma pizzaria tem 5 pizzas em seu cardápio.
	 * 
	 * Cada pizza tem um nome, 3 ingredientes, um boolean referente à borda,
	 * diâmetro e preço.
	 * 
	 * Crie 5 objetos de pizza e os coloque em uma Array List.
	 * 
	 * Crie um método para mudar algum dos ingredientes da pizza, caso alguns dos
	 * ingredientes da pizza tenha sido iniciado como null, substitua esse
	 * ingrediente pelo novo, caso contrário, mude o terceiro ingrediente.
	 * 
	 * Qual é a pizza mais barata por área?
	 * 
	 */

	private String nome;
	private String ing1;
	private String ing2;
	private String ing3;
	private boolean borda;
	private double diametro;
	private double preco;
	public static List<Cardapio> listaPizzas = new ArrayList<>();

	public Cardapio(String nome, String ing1, String ing2, String ing3, boolean borda, double diametro, double preco) {
		setNome(nome);
		setIng1(ing1);
		setIng2(ing2);
		setIng3(ing3);
		setBorda(borda);
		setDiametro(diametro);
		setPreco(preco);
		listaPizzas.add(this);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.isBlank() || nome.isEmpty() || nome == null) {
			System.out.println("Pizza sem nome.");
		} else {
			this.nome = nome;
		}
	}

	public String getIng1() {
		return ing1;
	}

	public void setIng1(String ing1) {
		this.ing1 = ing1;
	}

	public String getIng2() {
		return ing2;
	}

	public void setIng2(String ing2) {
		this.ing2 = ing2;
	}

	public String getIng3() {
		return ing3;
	}

	public void setIng3(String ing3) {
		this.ing3 = ing3;
	}

	public boolean isBorda() {
		return borda;
	}

	public void setBorda(boolean borda) {
		this.borda = borda;
	}

	public double getDiametro() {
		return diametro;
	}

	public void setDiametro(double diametro) {
		if (diametro < 0) {
			System.out.println("Sem diâmetro;");
		} else {
			this.diametro = diametro;
		}
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0) {
			System.out.println("Sem preço.");
		} else {
			this.preco = preco;
		}

	}

	public void mudarIngredientes(String novo) {
		if (getIng1() == null) {
			this.setIng1(novo);
		} else if (getIng2() == null) {
			this.setIng2(novo);
		} else {
			this.setIng3(novo);
		}
	}
	
	public double maisEconomica() {
		return getPreco() / getDiametro();
	}
	
	@Override
	
	public String toString() {
		return "Pizza mais econômica: " + getNome() + " - CM p/ real: " + maisEconomica();
	}

}
