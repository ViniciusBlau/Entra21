package Revisão;

public class Exercicio7 {

	public static void main(String[] args) {

		/*
		 * 7. Crie essa matriz:
		 * 
		 * 
		 * 
		 * 2104 3 399900
		 * 
		 * 1600 3 329900
		 * 
		 * 2400 3 369000
		 * 
		 * 1416 2 232000
		 * 
		 * 3000 4 539900
		 * 
		 * 1985 4 299900
		 * 
		 * 1534 3 314900
		 * 
		 * 1427 3 199000
		 * 
		 * 1380 3 212000
		 * 
		 * 1494 3 242500
		 * 
		 * 1940 4 240000
		 * 
		 * 2000 3 347000
		 * 
		 * 1890 3 330000
		 * 
		 * 4478 5 699900
		 * 
		 * 1268 3 259900
		 * 
		 * 
		 * 
		 * A primeira coluna é o tamanho da casa
		 * 
		 * A segunda coluna é a quantidade de quartos
		 * 
		 * A terceira coluna é o preço
		 * 
		 * 
		 * 
		 * Determinar:
		 * 
		 * a) Qual é a média dos preços das casas?
		 * 
		 * b) Quanto custa a menor casa? E quantos quartos tem a casa mais cara?
		 * 
		 * c) Qual a diferença de tamanho da casa com o maior número de quartos para a
		 * casa com o menor número de quartos?
		 */
		
		int precoCasas = 0;
		int menorCasa = 0;
		int mediaPrecos = 0;
		int casaMaisCara = 0;
		int menor = Integer.MAX_VALUE;
		int maior = Integer.MIN_VALUE;
		int tamanhoMaiorQuartos = Integer.MIN_VALUE;
		int maisQuartos = 0;
		int tamanhoMenorQuartos = Integer.MAX_VALUE;
		int menosQuartos = 0;
		
		int[][] matriz = { 
				{ 2104, 3, 399900 }, 
				{ 1600, 3, 329900 }, 
				{ 2400, 3, 369000 }, 
				{ 1416, 2, 232000 },
				{ 3000, 4, 539900 }, 
				{ 1985, 4, 299900 }, 
				{ 1534, 3, 314900 }, 
				{ 1427, 3, 199000 }, 
				{ 1380, 3, 212000 },
				{ 1494, 3, 242500 }, 
				{ 1940, 4, 240000 }, 
				{ 2000, 3, 347000 }, 
				{ 1890, 3, 330000 }, 
				{ 4478, 5, 699900 },
				{ 1268, 3, 259900 } 
				};

		// A
		for (int j = 0; j < matriz.length; j++) {

			precoCasas += matriz[j][2];
			mediaPrecos = precoCasas / matriz.length;

		}

		// B1
		for (int j = 0; j < matriz.length; j++) {
			if (matriz[j][0] < menor) {
				menor = matriz[j][0];
				menorCasa = matriz[j][2];
			}
		}

		// B2
		for (int j = 0; j < matriz.length; j++) {
			if (matriz[j][2] > maior) {
				maior = matriz[j][2];
				casaMaisCara = matriz[j][1];
			}

		}

		// C

		for (int j = 0; j < matriz.length; j++) {
			if (matriz[j][1] > tamanhoMaiorQuartos) {
				tamanhoMaiorQuartos = matriz[j][1];
				maisQuartos = matriz[j][0]; 
			}
			if (matriz[j][1] < tamanhoMenorQuartos) {
				tamanhoMenorQuartos = matriz[j][1];
				menosQuartos = matriz[j][0];
			}
		}

		System.out.println("A média dos preços é: " + mediaPrecos);
		System.out.println("A menor casa custa: " + menorCasa);
		System.out.println("A casa mais cara possue: " + casaMaisCara + " quartos.");
		System.out.println("Diferença de " + (maisQuartos - menosQuartos) + " metros.");

	}

}