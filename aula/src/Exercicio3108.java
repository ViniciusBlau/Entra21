package aula;
import java.util.Scanner;

public class Exercicio3108 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("VocÊ quer continuar operando?");
		char resposta = scan.next().charAt(0);
		while (resposta != 'n') {

			System.out.println("Entre com dois numeros desejados");
			int numeroUm = scan.nextInt();
			int numeroDois = scan.nextInt();

			System.out.println("Agora digite a operação desejada");
			int operacao = scan.nextInt();

			double variavelAuxiliar = 0;
			switch (operacao) {
			case 1:
				variavelAuxiliar = numeroUm + numeroDois;

			case 2:
				variavelAuxiliar = numeroUm / numeroDois;

			case 3:
				variavelAuxiliar = numeroUm * numeroDois;

			case 4:
				variavelAuxiliar = numeroUm - numeroDois;

				break;

			default:
				System.out.println("Valor Inválido");
				break;
			}

			System.out.println("Você quer continuar operando?");
			resposta = scan.next().charAt(0);
		}

	}

}
