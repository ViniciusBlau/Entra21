package Funcao;

public class Funcao {
	
	//Fórmula: p.s. TIPO NOME() {}
	public static String imprimirNome() {
		//dentro do escopo, a gente passa a ter um return
		String nome = "Vinicius Blau";
		return nome;
	}
	
	public static double soma(double numUm, double numDois) {
		double soma = numUm + numDois;
		return soma;
	}
	
	
	
	// metodo main por último
	public static void main(String[] args) {
		System.out.println(imprimirNome());
		
		System.out.println(soma(10.5, 11));
	}
}
