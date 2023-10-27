package Herança2;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<AlunoEtevi> listaEtevi = new ArrayList<>();
		List<AlunoFURB> listaFurb = new ArrayList<>();
		
		listaEtevi.add(new AlunoEtevi("Henrique", 21, 0));
		listaFurb.add(new AlunoFURB("Maria Eduarda", 21, 'v', "Ciência da computação", "Tênis de mesa"));
		listaFurb.add(new AlunoFURB("Vinicius Blau", 18, 'v', "Análise e desenvolvimento de Sistemas", "Vôlei"));
		
		for (AlunoEtevi ae : listaEtevi) {
			System.out.println(ae.toString());
		}
		for (AlunoFURB af :listaFurb) {
			System.out.println(af.toString());
			if (af.getNome().equals("Maria Eduarda")) {
				af.trancarCurso();
				System.out.println(af.toString());
			}
			
		}
		
		
		//maju.trancarCurso();
		
		//System.out.println(maju.toString());

	}

}
