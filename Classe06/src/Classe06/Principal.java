package Classe06;

public class Principal {

	public static void main(String[] args) {
		
		Conta contaUm = new Conta();
		
		contaUm.saldo = 1500.60;
		contaUm.proprietario = "Blau";
		contaUm.idConta = 1;
		
		System.out.println("Proprietário: " + contaUm.proprietario);
		System.out.println("ID da conta: " + contaUm.idConta);
		System.out.println("Saldo: " + contaUm.saldo);

	}

}
