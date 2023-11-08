package TrabalhoJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Endereco endereco01 = new Endereco("Rua São Paulo", "Blumenau", "SC", "Brasil", 1254);

		Cinema cinema01 = new Cinema("dinheiro", endereco01, true, 1, "Bebelo", "comédia");

		System.out.println("Digite o assento que deseja reservar(A1 - D4): ");
		int assento = entrada.nextInt();
		cinema01.reserva(assento);

		while (assento != 0) {

			System.out.println("Digite o assento que deseja reservar(A1 - D4), ou 'sair' para encerrar: ");
			assento = entrada.nextInt();
			if (assento > 31 || assento < 0) {
				System.out.println("Assento inválido!");
			} else {
				cinema01.reserva(assento);
			}

		}

		System.out.println(cinema01.toString());

	}

}
