package Ex5;

import java.util.ArrayList;
import java.util.List;

public class Produtos {
	/*
	 * Crie um sistema para uma loja de materiais de construção Os objetos terão os
	 * atributos: Nome, descrição, preço, peso e estoque
	 * 
	 * Crie um método para adicionar mais unidades da peça ao estoque. Crie um
	 * método para a venda desse produto, podendo ser vendidos até o mesmo número de
	 * peças que tem no estoque. Crie um método para colocar o produto em promoção,
	 * o parâmetro do método deve ser a porcentagem do desconto.
	 * 
	 * Calcule: a) Qual o nome do material mais caro b) Qual o nome do material mais
	 * leve c) Quanto que pesa a quantidade total do produto mais caro, ou seja, a
	 * quantidade multiplicado pelo peso
	 */
	
	private String nome;
	private String descricao;
	private double preco;
	private double peso;
	private int estoque;
	public static List<Produtos> listaMateriais = new ArrayList<>();
	
	public Produtos(String nome, String descricao, double preco, double peso, int estoque) {
		setNome(nome);
		setDescricao(descricao);
		setPreco(preco);
		setPeso(peso);
		setEstoque(estoque);
		listaMateriais.add(this);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome.isBlank() || nome.isEmpty() || nome == null) {
			System.out.println("Sem nenhum nome.");
		} else {
			this.nome = nome;	
		}
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		if (descricao.isBlank() || descricao.isEmpty() || descricao == null) {
			System.out.println("Sem descrição.");
		} else {
			this.descricao = descricao;	
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
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		if (peso < 0) {
			System.out.println("Sem peso.");
		} else {
			this.peso = peso;
		}
	}
	
	public int getEstoque() {
		return estoque;
	}
	
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	public double maiorPesoTotal() {
		return getPeso() * getEstoque();
	}
	
	public void adicionarEstoque(int adicionar) {
		this.setEstoque(this.getEstoque() + adicionar);
	}
	public void vendaEstoque(int retirar) {
		
		if (getEstoque() < retirar ) {
			System.out.println("Sem produtos o suficiente");
		} else {
			this.setEstoque(this.getEstoque() - retirar);	
		}
	}
	public void descontoProduto(double desconto) {
		this.setPreco(this.getPreco() -(this.getPreco() * desconto));
	}
	
	@Override
	
	public String toString() {
		return "Material: " + getNome() + " - Valor: " + getPreco() + " - Peso: " + getPeso() + " - Peso quantidade: " + maiorPesoTotal();
	}
	
}
