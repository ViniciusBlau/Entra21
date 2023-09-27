package Classe03;

public class Principal {
	public static void main(String[] args) {
		
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
		
		Mercado unidadeDeBlumenau = new Mercado();
		
		unidadeDeBlumenau.nmrMacasVenAno = 1000;
		unidadeDeBlumenau.precoMacas = 5.20;
		unidadeDeBlumenau.nmrLaranjasVenAno = 870;
		unidadeDeBlumenau.precoLaranjas = 4.35;
		
		Mercado unidadeDeJoinville = new Mercado();
		unidadeDeJoinville.nmrMacasVenAno = 1200;
		unidadeDeJoinville.precoMacas = 4.90;
		unidadeDeJoinville.nmrLaranjasVenAno = 800;
		unidadeDeJoinville.precoLaranjas = 4.75;
		
		Mercado unidadeDeFlorianopolis = new Mercado();
		unidadeDeFlorianopolis.nmrMacasVenAno = 1400;
		unidadeDeFlorianopolis.precoMacas = 5;
		unidadeDeFlorianopolis.nmrLaranjasVenAno = 1200;
		unidadeDeFlorianopolis.precoLaranjas = 5;
		
	}
}
