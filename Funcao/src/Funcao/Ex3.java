package Funcao;

import java.util.Scanner;

public class Ex3 {
	
	public static String perimetro(double base, double altura, double perimetro) {
		return "O perímetro do retângulo é: " + (base+base+altura+altura);
	}
	public static String area(double base, double altura, double area) {
		return "A área do retângulo é: " + (base*altura);
	}


	public static void main(String[] args) {
		/*
		 * Faça um programa que calcule o perímetro e a área de um retângulo.
		 * 
		 * Retornar os valores calculados
		 */
		
		Scanner s = new Scanner(System.in);
		
		double perimetro = 0;
		double area = 0;
		
		System.out.println("Digite a base: ");
		double base = s.nextDouble();
		System.out.println("Digite a altura: ");
		double altura = s.nextDouble();

		
		System.out.println(perimetro(base, altura, perimetro));
		System.out.println(area(base, altura, area));
		
		s.close();
	}

}
