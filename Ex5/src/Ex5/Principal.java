package Ex5;

import java.io.ObjectInputStream.GetField;

public class Principal {
	public static void main(String[] args) {
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
		
		Produtos produto1 = new Produtos("Enxada", "Arar a terra", 150, 12.5, 4);
		Produtos produto2 = new Produtos("Picareta", "Quebrar pedras", 40, 15.0, 2);
		Produtos produto3 = new Produtos("Machado", "Cortar árvores", 65, 16.0, 6);
		Produtos produto4 = new Produtos("Facão", "Cortar de tudo", 30, 8.0, 3);
		
		double materialMaisLeve = Integer.MAX_VALUE;
		Produtos nomeProdutoMaisLeve = null;
		double materialMaisCaro = Integer.MIN_VALUE;
		Produtos nomeProdutoMaisCaro = null;
		
		for (Produtos p : Produtos.listaMateriais) {
			
			p.adicionarEstoque(5);
			System.out.println("Estoque total agora: " + p.getEstoque());
			
			p.vendaEstoque(12);
			System.out.println("Estoque total após a venda: " + p.getEstoque());
			
			p.descontoProduto(0.30);
			System.out.println(p.toString());
			
			if (p.getPreco() > materialMaisCaro) {
				materialMaisCaro = p.getPreco();
				nomeProdutoMaisCaro = p;
			}
			if (p.getPeso() < materialMaisLeve) {
				materialMaisLeve = p.getPeso();
				nomeProdutoMaisLeve = p;
			}

		}
		System.out.println("Mais caro: " + nomeProdutoMaisCaro.getNome());
		System.out.println("Mais leve: " + nomeProdutoMaisLeve.getNome());
		System.out.println("Quantidade total do produto mais caro: " + nomeProdutoMaisCaro.maiorPesoTotal());
	}
}
