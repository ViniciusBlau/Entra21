package TrabalhoJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Lanchonete extends Estabelecimento {
    Scanner entrada = new Scanner(System.in);

    private int funcionarios;
    private double valorTotal;

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
        
        ArrayList<String> alimentos = new ArrayList<>();
    	ArrayList<Integer> quantidadeAlimentos = new ArrayList<>();

        while (true) {
        	
            System.out.println("Digite o número do alimento ou bebida que você deseja comprar (0 para encerrar): ");
            int escolhaAlimento = entrada.nextInt();
            
            if (escolhaAlimento == 0) {
                break;
            }

            System.out.println("Digite quantas unidades: ");
            int quantidadeAlimento = entrada.nextInt();
            quantidadeAlimentos.add(quantidadeAlimento);
            
            
            switch (escolhaAlimento) {
                case 1:
                    valorTotal += quantidadeAlimento * 10;
                    alimentos.add("Pipoca Salgada");
                    break;
                case 2:
                    valorTotal += quantidadeAlimento * 12;
                    alimentos.add("Pipoca Doce");
                    break;
                case 3:
                    valorTotal += quantidadeAlimento * 15;
                    alimentos.add("Doritos");
                    break;
                case 4:
                    valorTotal += quantidadeAlimento * 8;
                    alimentos.add("Bib's");
                    break;
                case 5:
                    valorTotal += quantidadeAlimento * 6;
                    alimentos.add("Guaraná Antártica");
                    break;
                case 6:
                    valorTotal += quantidadeAlimento * 6;
                    alimentos.add("Coca-Cola");
                    break;
                case 7:
                    valorTotal += quantidadeAlimento * 4;
                    alimentos.add("Água mineral");
                    break;
                default:
                    System.out.println("Número inválido!");
                    int index = quantidadeAlimentos.size() - 1;
                    quantidadeAlimentos.remove(index);
            }
        }
        this.valorTotal = valorTotal;
        System.out.println("Total a pagar: R$" + valorTotal);
        System.out.println("Alimentos na cesta: ");
        
        System.out.println("Alimentos: " + alimentos);
        System.out.println("Quantidade: " + quantidadeAlimentos);
    }

    @Override
    public String pagar(boolean pago2) {
        if (pago2) {
        	return "Pago";
        } else {
        	return "Não pago";
        }
    }

    @Override
    public String toString() {
        return "Forma de pagamento: " + getFormaPagamento() + " - Total a pagar: R$" + valorTotal + " - Conta: " + pagar(true);
    }
}
