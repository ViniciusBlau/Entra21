package Herança3;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Cachorro> listaCachorros = new ArrayList<>();
		List<Gato> listaGatos = new ArrayList<>();
		
		listaCachorros.add(new Cachorro("Cachorro", true, 5, "Salsicha Mini"));
		listaCachorros.add(new Cachorro("Cachorro", true, 18, "Pastor Alemão Capa preta"));
		listaGatos.add(new Gato("Gato", false, 3, true));
		listaGatos.add(new Gato("Gato", true, 5, true));
		
		for (Gato g : listaGatos) {
			System.out.println(g.toString());
			g.som(); 
		}
		
		for (Cachorro c : listaCachorros) {
			System.out.println(c.toString());
			System.out.println(c.som());
		}
		
		
		
	}

}
