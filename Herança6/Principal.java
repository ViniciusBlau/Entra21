package Herança6;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Notebook> listaNotebooks = new ArrayList<>();
		List<Smartphone> listaCelulares = new ArrayList<>();
		
		listaCelulares.add(new Smartphone("Samsung", 9, 256, 5985, true));
		listaCelulares.add(new Smartphone("Iphone", 6, 512, 154, true));
		listaNotebooks.add(new Notebook("LG", 16, 256, 2));
		listaNotebooks.add(new Notebook("MacBook", 8, 128, 1));
		
		for (Smartphone c : listaCelulares) {
			System.out.println("Celular: " + c.toString());
			System.out.println("Tira selfie: " + c.tirarSelfie());
			System.out.println("Ligação: " + c.ligar(154));
			System.out.println("Roda o app: " + c.rodarAplicacao("blaze.apk"));
		}
		for (Notebook n : listaNotebooks) {
			System.out.println("Notebook - " + n.toString());
			n.aumentarRam(12);
			System.out.println("Nova GB RAM: " + n.getRam());
			System.out.println("Roda o app: " + n.rodarAplicacao("tigrinho.exe"));

		}
		
	}

}
