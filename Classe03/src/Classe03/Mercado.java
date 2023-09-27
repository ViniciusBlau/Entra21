package Classe03;

public class Mercado {
	/*
	 * Crie uma classe denominada Mercado.
	 * 
	 * Essa classe terá 4 atributos, as informações que deverão ser guardadas são:
	 * Número de maçãs vendidas por ano. Preço de venda das maçãs. Número de
	 * laranjas vendidas por ano. Preço de venda das laranjas.
	 * 
	 * Crie 3 objetos da classe Mercado chamados:
	 * 
	 * unidadeDeBlumenau unidadeDeJoinville unidadeDeFlorianopolis
	 */
	
	int nmrMacasVenAno;
	double precoMacas;
	int nmrLaranjasVenAno;
	double precoLaranjas;
	
	public String imprimirResultados() {
		return " " + nmrMacasVenAno + " maçãs - " + precoMacas + " reais - " + nmrLaranjasVenAno
				+ " laranjas - " + precoLaranjas + " reais";
	}
	
}
