package Ex6;


public class Principal {

	public static void main(String[] args) {
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
		
		Cardapio pizza1 = new Cardapio("Portuguesa", "Cebola", "Presunto", "Queijo", true, 30, 50);
		Cardapio pizza2 = new Cardapio("Marguerita", "Tomate", "Queijo", "Salsinha", true, 30, 45);
		Cardapio pizza3 = new Cardapio("3 Queijos", null, "Mussarela", "Provolone", true, 35, 40);
		Cardapio pizza4 = new Cardapio("Frango c/ Catupiry", "Frango", "Queijo", "Catupiry", true, 40, 10);
		Cardapio pizza5 = new Cardapio("Milho c/ Bacon", "Milho", "Bacon", "Queijo", true, 40, 20);		
		
		double economica = Integer.MAX_VALUE;
		Cardapio nomePizza = null;
		
		for (Cardapio p : Cardapio.listaPizzas) {
			p.mudarIngredientes("Pepperoni");
			System.out.print(p.getIng1() + " ");
			System.out.print(p.getIng2() + " ");
			System.out.println(p.getIng3() + " ");
			
			if(p.maisEconomica() < economica) {
				economica = p.maisEconomica();
				nomePizza = p;
			}
			
		}
		System.out.println(nomePizza.toString());
	}

}
