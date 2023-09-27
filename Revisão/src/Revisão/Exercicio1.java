package Revisão;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		/*
		 * 1. O índice de massa corporal (IMC) é uma medida internacional usada para
		 * calcular se um pessoa está no peso ideal. O IMC é determinado pela divisão da
		 * massa do indivíduo pelo quadrado de sua altura, onde a massa está em
		 * quilogramas e a altura está em metros, de acordo com a fórmula:
		 * 
		 * IMC = Massa / Altura²
		 * 
		 * 
		 * 
		 * Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do
		 * indivíduo, de acordo com a seguinte tabela:
		 * 
		 * 
		 * 
		 * < 18.5 Magreza
		 * 
		 * 18.5 – 24.9 Saudável
		 * 
		 * 25.0 – 29.9 Sobrepeso
		 * 
		 * 30.0 – 34.9 Obesidade Grau I
		 * 
		 * 35.0 – 39.9 Obesidade Grau II (severa)
		 * 
		 * > 40.0 Obesidade Grau III (morbida)
		 */
		
		float imc = 0;
		
		System.out.println("Digite seu peso atual em KG: ");
		System.out.println("Digite sua altura atual em metros: ");
		float peso = s.nextFloat();
		float altura = s.nextFloat();
		
		imc = ( peso / (altura * altura));

		if (imc <= 18.5) {
			System.out.println("Magreza");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("Saudável");
		} else if (imc >= 25.0 && imc <= 29.9) {
			System.out.println("Sobrepeso");
		} else if (imc >= 30.0 && imc <= 34.9) {
			System.out.println("Obesidade Grau I");
		} else if (imc >= 35.0 && imc <= 39.9) {
			System.out.println("Obesidade Grau II (severa)");
		} else {
			System.out.println("Obesidade Grau III (mórbida)");
		}

	}

}
