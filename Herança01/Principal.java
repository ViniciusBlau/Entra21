package Herança01;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Gatos> listaGatos = new ArrayList<>();
		List<Aves> listaAves = new ArrayList<>();
		List<Primatas> listaPrimatas = new ArrayList<>();
		
		listaGatos.add(new Gatos("Jaguatirica", "Cleitin", "médio", "Selvas", "Brasil", "pardo", "listrado"));
		listaAves.add(new Aves("Canarinho", "Junin", "pequeno", "Mata Atlântica", "Brasil", "Amarelas", "Frutas"));
		listaPrimatas.add(new Primatas("Gorila", "Jorge", "grande", "Selvas", "Angola"));
		
		for (Gatos g : listaGatos) {
			System.out.println(g.toString());
		}
		for (Aves a : listaAves) {
			System.out.println(a.toString());
		}
		for (Primatas p : listaPrimatas) {
			System.out.println(p.toString());
		}

	}

}
