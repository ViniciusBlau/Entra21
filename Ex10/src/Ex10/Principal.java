package Ex10;

public class Principal {
	public static void main(String[] args) {

		/*
		 * 
		 * Um matemático está necessitando de várias funções relacionadas a um número
		 * inteiro positivo. Suponha a definição de uma classe Inteiro Positivo que
		 * apresenta o seguinte atributo: um número X.
		 * 
		 * Implemente os seguintes métodos:
		 * 
		 * a) um método setValor, que realiza a consistência necessária para garantir
		 * que X seja um inteiro positivo;
		 * 
		 * b) um método para retornar o número X multiplicado por outro objeto de
		 * InteiroPositivo (este outro objeto é o objeto manipulado imediatamente antes
		 * deste);
		 * 
		 * c) um método para calcular o fatorial de X; Fatorial (X) = X * (X-1) * (X-2)
		 * * (X-3) * … * 2 * 1
		 * 
		 * d) um método para identificar os divisores inteiros de X e a quantidade de
		 * divisores. Exemplo: para o número 12, os divisores são 1, 2, 3, 4, 6, 12 e a
		 * quantidade de divisores é 6;
		 * 
		 * e) um método para calcular a série de Fibonacci formada por X elementos;
		 * Fibonacci = 1, 1, 2, 3, 5, 8, 13, …
		 */
		
		InteiroPositivo x5 = new InteiroPositivo(10);
		InteiroPositivo x2 = new InteiroPositivo(2);
		System.out.println(x5.multiplicadoInteiroPositivo(x2));
		x5.fatorial();
		
		System.out.println(x5.identificarDivisores());
		
		x5.fibonacci();
	}
}
