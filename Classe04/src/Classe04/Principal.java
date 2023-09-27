package Classe04;

public class Principal {

	public static void main(String[] args) {
		/*
		 * A partir das representações abaixo dos objetos de uma classe Produto. Escreva
		 * o código necessário para suportar tais objetos. Ou seja, o código necessário
		 * para criar a classe e instanciar os objetos de modo que fiquem com o estado
		 * apresentado.
		 * 
		 * produto1: Produto nome = “Caderno” descricao = “Caderno em espiral tamanho
		 * médio” precoUnitario = 4,50 desconto = 15
		 * 
		 * 
		 * produto2: Produto nome = “Caneta ESF” descricao = “Caneta esferográfica 5mm”
		 * precoUnitario = 1,20 desconto = 2
		 * 
		 * 
		 * produto3: Produto nome = “Esquadro” descricao = “Esquadro de acrílico 20 cm”
		 * precoUnitario = 2,35 desconto = 10
		 * 
		 */
		
		Produtos produto1 = new Produtos("Caderno", "Caderno em espiral tamanho médio", 4.50, 15);
		
		Produtos produto2 = new Produtos("Caneta ESF", "Caneta esferográfica 5mm", 1.20, 2);
		
		Produtos produto3 = new Produtos("Esquadro", "Esquadro de acrílico 20 cm", 2.35, 10);
		
		System.out.println(produto1.imprimirInformacoes());
		System.out.println(produto2.imprimirInformacoes());
		System.out.println(produto3.imprimirInformacoes());
		
	}

}
