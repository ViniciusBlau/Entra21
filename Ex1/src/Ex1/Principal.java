package Ex1;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Faça uma classe chamada Retangulo, com os atributos altura e largura. Faça um
		 * método para descobrir a área e outro para descobrir o perímetro. Crie 10
		 * objetos de Retangulo.
		 * 
		 * Imprima o toString do retângulo com a maior área e o toString do retângulo
		 * com o maior perímetro
		 */
		
		Retangulo r1 = new Retangulo(5, 2);
		Retangulo r2 = new Retangulo(6, 3);
		Retangulo r3 = new Retangulo(7, 4);
		Retangulo r4 = new Retangulo(8, 5);
		Retangulo r5 = new Retangulo(5, 6);
		Retangulo r6 = new Retangulo(4, 7);
		Retangulo r7 = new Retangulo(3, 8);
		Retangulo r8 = new Retangulo(9, 9);
		Retangulo r9 = new Retangulo(2, 2);
		Retangulo r10 = new Retangulo(7, 3);
		
		double maiorArea = Integer.MIN_VALUE;
		double maiorPerimetro = Integer.MIN_VALUE;
		
		for (Retangulo r : Retangulo.listaRetangulo) {
			if (r.perimetro() > maiorPerimetro) {
				maiorPerimetro = r.perimetro();
			}
			if (r.area() > maiorArea) {
				maiorArea = r.area();
			}
		}
		System.out.println("O retângulo com maior perímetro tem: " + maiorPerimetro);
		System.out.println("O retângulo com maior área tem: " + maiorArea);
	}

}
