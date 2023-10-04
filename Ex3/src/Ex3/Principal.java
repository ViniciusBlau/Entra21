package Ex3;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Em um sistema de uma floricultura deve se guardar o nome da flor, o preço,
		 * nome do cliente que comprou a flor e se a flor é para presente ou não.
		 * 
		 * Crie 5 objetos de flor e as coloque em uma Array List
		 * 
		 * Responda: a) Quem comprou a flor mais cara? b) Qual o nome da flor mais cara?
		 */
		
		Floricultura cliente01 = new Floricultura("Orquídeas", 15, "Bruna", true);
		Floricultura cliente02 = new Floricultura("Rosas", 12, "Blau", true);
		Floricultura cliente03 = new Floricultura("Rosas Brancas", 14, "Léo", true);
		Floricultura cliente04 = new Floricultura("Girassol", 40, "Henrique", true);
		Floricultura cliente05 = new Floricultura("Planta Carnívora", 30, "Eduardo", true);
		
		double florMaisCara = Integer.MIN_VALUE;
		String nomePagouFlorMaisCara = "";
		String nomeFlorMaisCara = "";
		
		for (Floricultura f : Floricultura.listaFlores) {
			System.out.println(f.toString());
			if (f.getPrecoFlor() > florMaisCara) {
				florMaisCara = f.getPrecoFlor();
				nomeFlorMaisCara = f.getNomeFlor();
				nomePagouFlorMaisCara = f.getNomeCliente();
			}
		}
		
		System.out.println("O nome da flor mais cara é: " + nomeFlorMaisCara);
		System.out.println("A pessoa que tem a flor mais cara é o: " + nomePagouFlorMaisCara);
		
	}

}
