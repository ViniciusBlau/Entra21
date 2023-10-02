package Classe09;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Para efetuar o recolhimento do Imposto de Renda a Receita Federal tem o NOME,
		 * CPF, UF (RS, PR e SC) e RENDA ANUAL. EX: Nome: João da Silva CPF:
		 * 123.456.789-00 UF: PR RendaAnual: R$40.000
		 * 
		 * Para o cálculo do imposto a pagar de cada contribuinte, considere o seguinte:
		 * 
		 * Nível de Renda Anual Alíquota 0 a 4.000 0% 4.001 a 9.000 5,8% 9.001 a 25.000
		 * 15% 25.001 a 35.000 27,5% acima de 35.000 30%
		 * 
		 * 
		 * Sendo assim, deve-se calcular o imposto a pagar do seguinte modo: Imposto a
		 * pagar = Renda Anual * Alíquota
		 * 
		 * Crie 5 objetos da classe Contribuinte e coloque-os em um vetor.
		 * 
		 * Calcule: a) Quem mais paga imposto. b) Quem menos paga imposto. c) Qual o
		 * total de imposto pago entre os 5 contribuintes?
		 */
		
		ImpostoDeRenda joao = new ImpostoDeRenda("João", "608.460.150-21", "SC", 2000);
		ImpostoDeRenda marcos = new ImpostoDeRenda("Marcos", "735.621.040-14", "RJ", 9400);
		ImpostoDeRenda mateus = new ImpostoDeRenda("Mateus", "630.661.860-08", "SP", 14000);
		ImpostoDeRenda leonardo = new ImpostoDeRenda("Leonardo", "119.883.510-90", "RS", 90000);
		ImpostoDeRenda samuel = new ImpostoDeRenda("Samuel", "049.686.730-00", "MS", 12000);
		
		ImpostoDeRenda vetor[] = new ImpostoDeRenda[5];
		vetor[0] = joao;
		vetor[1] = marcos;
		vetor[2] = mateus;
		vetor[3] = leonardo;
		vetor[4] = samuel;
		
		double maior = Integer.MIN_VALUE;
		String nomeMaior = "";
		double menor = Integer.MAX_VALUE;
		String nomeMenor = "";
		double aux = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			aux += vetor[i].impostos();
			if (vetor[i].impostos() > maior) {
				maior = vetor[i].impostos();
				nomeMaior = vetor[i].getNome();
			}
			if (vetor[i].impostos() < menor) {
				menor = vetor[i].impostos();
				nomeMenor = vetor[i].getNome();
			}
		}
		System.out.println("Mais paga impostos: " + nomeMaior + ", ele paga: " + maior);
		System.out.println("Menos paga impostos: " + nomeMenor + ", ele paga: " + menor);
		System.out.println("O 5 contribuem com : " + aux + " reais.");
	}

}
