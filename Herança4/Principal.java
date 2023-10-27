package Herança4;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Transatlantico> listaTransatlantico = new ArrayList<>();
		List<Lancha> listaLanchas = new ArrayList<>();
		
		listaTransatlantico.add(new Transatlantico("Vinicius", "Blau", 500, 1200, 30, 501, 2021, 600));
		listaTransatlantico.add(new Transatlantico("Léo", "Charada", 300, 1000, 15, 158, 2018, 200));
		listaLanchas.add(new Lancha("Lancha", "1", 5, 20, 3, 1, 60));
		listaLanchas.add(new Lancha("Lanhca", "2", 10, 90, 4, 3, 95));
		
		for (Transatlantico t : listaTransatlantico) {
			t.adicionaBotes(20);
			System.out.println(t.toString());
		}
		for (Lancha l : listaLanchas) {
			System.out.println(l.toString());
			System.out.println("Tempo de viagem: " + l.tempoViagem(400));
		}
		
	}

}
