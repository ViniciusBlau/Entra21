package Ex7;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Faça uma classe chamada Conta, com os atributos nome e saldo.
		 * 
		 * Faça um método para sacar dinheiro Outro método para depositar dinheiro E
		 * outro método para transferir dinheiro de uma conta para outra
		 */
		Scanner s = new Scanner(System.in);
		
		Conta conta1 = new Conta("Blau", 500);
		Conta conta3 = new Conta("Camilla", 400);
		Conta conta2 = new Conta("Bruna", 300);
		
		System.out.println("Digite o quanto deseja sacar nas contas: ");
		double diminuir = s.nextDouble();
		
		System.out.println("Digite o quanto deseja depositar na conta: ");
		double aumentar = s.nextDouble();
		
		conta1.retitarSaldo(diminuir);
		conta2.adicionarSaldo(aumentar);
		conta1.transferirSaldo(aumentar, conta3);
		
		System.out.println(conta2.toString());
		
		System.out.println("De qual conta deseja transferir? ");
		String conta = s.next();
		
		for (Conta c : Conta.listaConta) {
			if (c.listaConta.equals(conta)) {
				c.transferirSaldo(aumentar, conta2);
			}
		}
		System.out.println(conta2.toString());
		

	}

}
