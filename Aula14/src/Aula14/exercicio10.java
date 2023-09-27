package Aula14;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio10 {

	/*
	 * Faça um programa que calcule o perímetro e a área de um retângulo
	 * 
	 * (Passe a altura e a largura como parâmetros da função)
	 */

	public static void retangulo(double altura, double base, double perimetro, double area) {
		DecimalFormat dc = new DecimalFormat("0.00");
		
		perimetro = (altura + altura) + (base + base);
		area = base * altura;
		
		System.out.println("O perímetro do retângulo é: " + dc.format(perimetro));
		System.out.println("A área do retângulo é: " + dc.format(area));
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double perimetro = 0;
		double area = 0;
		
		System.out.println("Digite a altura e a base do retângulo:  ");
		double altura = s.nextDouble();
		double base = s.nextDouble();
		
		retangulo(altura, base, perimetro, area);
		
		
		s.close();
	}

}
