package Ex1;

import java.util.ArrayList;
import java.util.List;

public class Retangulo {

	/*
	 * Faça uma classe chamada Retangulo, com os atributos altura e largura. Faça um
	 * método para descobrir a área e outro para descobrir o perímetro. Crie 10
	 * objetos de Retangulo.
	 * 
	 * Imprima o toString do retângulo com a maior área e o toString do retângulo
	 * com o maior perímetro
	 */
	
	private double altura;
	private double largura;
	public static List<Retangulo> listaRetangulo = new ArrayList<>();
	
	public Retangulo(double altura, double largura) {
		setAltura(altura);
		setLargura(largura);
		listaRetangulo.add(this);
	}
	
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		if (altura <= 0) {
			System.out.println("Erro, sem altura");;
		} else {
			this.altura = altura;
		}
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		if (largura < 0 ) {
			System.out.println("Erro, sem largura");
		} else {
			this.largura = largura;	
		}
	}
	
	public double perimetro() {
		return (largura*2) + (altura*2);
	}
	
	public double area() {
		return (largura * altura);
	}
	
	@Override
	public String toString() {
		return "A altura do retângulo é " + getAltura() + " metros, e a largura é " + getLargura() + " metros.";
	}

}
