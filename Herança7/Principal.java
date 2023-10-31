package Herança7;

import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		ArrayList<Empregado> listaEmpregados = new ArrayList<>();
		ArrayList<Gerente> listaGerente = new ArrayList<>();
		ArrayList<String> listaHabilidades = new ArrayList<>();

		Endereco endereco01 = new Endereco("Brasil", "SC", "Blumenau", "Rua Doutor Paulo Aldinger", "207");
		LocalDate ingresso01 = LocalDate.of(2019, 11, 12);
		LocalDate nascimento01 = LocalDate.of(2002, 07, 22);

		Endereco endereco02 = new Endereco("Brasil", "SC", "Blumenau", "Rua SP", "1690");
		LocalDate ingresso02 = LocalDate.of(2012, 02, 01);
		LocalDate nascimento02 = LocalDate.of(1992, 10, 24);

		Gerente gerente01 = new Gerente("01", endereco01, nascimento01, "Blau", 8000, ingresso01, listaHabilidades, "01");
		Empregado empregado01 = new Empregado("01", endereco02, nascimento02, "LEO", 3000, ingresso02, listaHabilidades, "02", gerente01);

		empregado01.sairDoSindicato();
		empregado01.comissao(0.05);
		gerente01.demitirEmpregado(empregado01);
		System.out.println(empregado01.toString());
		System.out.println(gerente01.toString());
		System.out.println(empregado01.getSalario());
		
		
	}

}
