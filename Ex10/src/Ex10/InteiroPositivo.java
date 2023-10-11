package Ex10;

public class InteiroPositivo {

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

	private int X;

	public InteiroPositivo(int x) {
		setX(x);
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		if (x > 0 && x == (int) x) {
			X = x;
		} else {
			throw new IllegalArgumentException("Ele não é positivo e nem inteiro.");
		}
	}

	/*
	 * b) um método para retornar o número X multiplicado por outro objeto de
	 * InteiroPositivo (este outro objeto é o objeto manipulado imediatamente antes
	 * deste);
	 */

	public String multiplicadoInteiroPositivo(InteiroPositivo multiplicar) {
		return "Multiplicação: " + this.X * multiplicar.getX();
	}

	/*
	 * c) um método para calcular o fatorial de X; Fatorial (X) = X * (X-1) * (X-2)
	 * * (X-3) * … * 2 * 1
	 */

	public void fatorial() {
		int fatorial = 1;
		for (int i = this.X; i > 1; i--) {
			fatorial *= i;
		}
		System.out.println("O fatorial de " + this.X + " é " + fatorial);
	}
	
	/*
	 * d) um método para identificar os divisores inteiros de X e a quantidade de
	 * divisores. Exemplo: para o número 12, os divisores são 1, 2, 3, 4, 6, 12 e a
	 * quantidade de divisores é 6;
	 */
	
	public String identificarDivisores() {
		int cont = 0;
		for (int i = 2; i < this.X; i++) {
			if (this.X % i == 0) {
				System.out.print(i + " - ");
				cont++;
			}
		}
		System.out.println("");
		return "Total divisores: " + cont;
	}
	
	/*
	 * e) um método para calcular a série de Fibonacci formada por X elementos;
		 * Fibonacci = 1, 1, 2, 3, 5, 8, 13, …
	 */
	//F{n}=F{n-1} + F{n-2}
	public void fibonacci() {
		
		int a = 1;
	    int b = 1;

	    System.out.print("Série de Fibonacci com " + X + " elementos: ");
	    System.out.print(a + " " + b + " ");

	    for (int i = 2; i < X; i++) {
	        int proximo = a + b;
	        System.out.print(proximo + " ");
	        a = b;
	        b = proximo;
	    }
	    
	    System.out.println();
		
	}
	
	
}
