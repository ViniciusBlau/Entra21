package aula12;

public class Exemplo {

	public static void main(String[] args) {
		
		String[][] matriz = new String[3][2];
		
		matriz[0][0] = "Doritos";
		matriz[0][1] = "3";
		matriz[1][0] = "Chocolate";
		matriz[1][1] = "9";
		matriz[2][0] = "Sushi";
		matriz[2][1] = "7";
		
		System.out.println("Comida: " + matriz[1][0] + " | Votos: " + matriz[1][1]);
		System.out.println("Comida: " + matriz[2][0] + " | Votos: " + matriz[2][1]);
	}

}
