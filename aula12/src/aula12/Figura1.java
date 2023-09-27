package aula12;

public class Figura1 {

	public static void main(String[] args) {
		
		int linhas = 4;
		int colunas = 4;

		char[][] matriz = new char[linhas][colunas];

		for (int i = 0; i < linhas; i++) {
			for (int j = 0; j < colunas; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
