package TrabalhoJava;

import java.util.Scanner;

public class Lanchonete extends Estabelecimento {
	Scanner entrada = new Scanner(System.in);

	private int funcionarios;

	public Lanchonete(String formaPagamento, Endereco local, boolean funcionamento, int saidasEmergencia,
			int funcionarios) {
		super(formaPagamento, local, funcionamento, saidasEmergencia);
		setFuncionarios(funcionarios);
	}

	public int getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(int funcionarios) {
		if (funcionarios < 1 || funcionarios > 15) {
			throw new IllegalArgumentException("Funcionários inválidos!");
		}
		this.funcionarios = funcionarios;
	}

	public void comprar() {

		System.out.println("  ________________________________________");
		System.out.println("  |                                      |");
		System.out.println("  |         Alimentos e Bebidas          |");
		System.out.println("  |______________________________________|");
		System.out.println("  |                                      |");
		System.out.println("  |  1   Pipoca Salgada       R$ 10.00   |");
		System.out.println("  |  2   Pipoca Doce          R$ 12.00   |");
		System.out.println("  |  3   Doritos              R$ 15.00   |");
		System.out.println("  |  4   Bibs                 R$ 8.00    |");
		System.out.println("  |  5   Guaraná Antarctica   R$ 6.00    |");
		System.out.println("  |  6   Coca-cola            R$ 6.00    |");
		System.out.println("  |  7   Água                 R$ 4.00    |");
		System.out.println("  |______________________________________|");

		double valorTotal = 0;

		while (true) {
			
			System.out.println("Digite o número do alimento ou bebida que você deseja comprar (0 para encerrar): ");
			int escolhaAlimento = entrada.nextInt();

			if (escolhaAlimento == 0) {
				break;
			}

			System.out.println("Digite a quantidade: ");
			int quantidadeAlimento = entrada.nextInt();

			switch (escolhaAlimento) {
			case 1:
				valorTotal += quantidadeAlimento * 10;
				break;
			case 2:
				valorTotal += quantidadeAlimento * 12;
				break;
			case 3:
				valorTotal += quantidadeAlimento * 15;
				break;
			case 4:
				valorTotal += quantidadeAlimento * 8;
				break;
			case 5:
				valorTotal += quantidadeAlimento * 6;
				break;
			case 6:
				valorTotal += quantidadeAlimento * 6;
				break;
			case 7:
				valorTotal += quantidadeAlimento * 4;
				break;
			default:
				System.out.println("Número inválido!");
			}
		}

		System.out.println("Total a pagar: R$" + valorTotal);
	}

	

	@Override
	public String pagar(boolean pago) {
		if (pago) {
			return "Pago";
		} else {
			return "Não Pago";
		}

	}

	@Override
	public String toString() {
		return "Pagamento: " + pagar(true);
	}

}
