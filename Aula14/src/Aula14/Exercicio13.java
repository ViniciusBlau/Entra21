package Aula14;

import java.util.Scanner;

public class Exercicio13 {

	/*
	 * George Lucas utiliza uma fórmula para criar os nomes dos personagens em suas
	 * histórias (Jar Jar Binks, ObiWan Kenobi, etc). A fórmula, supostamente, é:
	 * 
	 * Seu primeiro nome na série Star Wars: i.Pegue as três primeiras letras de seu
	 * sobrenome ii.Adicione a ele as duas primeiras letras de seu nome
	 * 
	 * Seu sobrenome na série Star Wars: i.Pegue as duas primeiras letras do
	 * sobrenome de solteira de sua mãe ii.Adicione a ele as três primeiras letras
	 * do nome da cidade onde você nasceu
	 * 
	 * 
	 * Crie um método chamado generateStarWarsName que gera um nome completo Star
	 * Wars conforme descrito. Printe o seu nome Star Wars
	 * 
	 * As entradas serão os nomes completos.
	 */
	
	public static void generateStarWarsName(String firstName, String lastName,
											String lastNameMom, String city) {
		
		System.out.print(lastName.charAt(0));
		System.out.print(lastName.charAt(1));
		System.out.print(lastName.charAt(2));
		System.out.print(firstName.charAt(0));
		System.out.print(firstName.charAt(1));
		System.out.print(" ");
		System.out.print(lastNameMom.charAt(0));
		System.out.print(lastNameMom.charAt(1));
		System.out.print(city.charAt(0));
		System.out.print(city.charAt(1));
		System.out.print(city.charAt(2));
		
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro nome: ");
		String firstName = s.next();
		System.out.println("Digite seu último nome: ");
		String lastName = s.next();
		System.out.println("Digite o sobrenome de solteiro da sua mãe: ");
		String lastNameMom = s.next();
		System.out.println("Digite o nome da cidade que você nasceu: ");
		String city = s.next();
		
		generateStarWarsName(firstName, lastName, lastNameMom, city);
		
		s.close();
	}

}
