package Classe05;

import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Crie uma classe chamada Circulo que tenha o atributo raio
		 * 
		 * Calcule a área de 5 objetos diferentes de Circulo
		 * 
		 * Para obter o valor de PI, use a função Math.PI do Java
		 */
		DecimalFormat df = new DecimalFormat("0.00");
	
		Circulo circulo1 = new Circulo();
		circulo1.raio = 3.2;
		circulo1.pi = Math.PI;
		
		System.out.println(df.format(circulo1.calcularArea()));
		
		Circulo circulo2 = new Circulo();
		circulo2.raio = 3.3;
		circulo2.pi = Math.PI;
		
		System.out.println(df.format(circulo2.calcularArea()));
		
		Circulo circulo3 = new Circulo();
		circulo3.raio = 3.4;
		circulo3.pi = Math.PI;
		
		System.out.println(df.format(circulo3.calcularArea()));
		
		Circulo circulo4 = new Circulo();
		circulo4.raio = 3.5;
		circulo4.pi = Math.PI;
		
		System.out.println(df.format(circulo4.calcularArea()));
		
		Circulo circulo5 = new Circulo();
		circulo5.raio = 3.6;
		circulo5.pi = Math.PI;
		
		System.out.println(df.format(circulo5.calcularArea()));
		
	}

}
