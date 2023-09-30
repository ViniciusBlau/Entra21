package Classe08;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Faça uma classe chamada Aeronave. Com os atributos: Passageiros. Velocidade
		 * máxima. Capacidade de combustível. Queima de combustível por minuto.
		 * 
		 * Crie 4 objetos de sua preferência.
		 * 
		 * 
		 * Calcule: a) Qual das aeronaves pode ficar no ar por mais tempo? b) Qual
		 * aeronave leva o maior número de passageiros? c) Considerando que os aviões
		 * estão em velocidade máxima, qual deles consegue voar mais longe?
		 */
		
		Aeronave aviaoUm = new Aeronave("Latam", 10, 400, 450, 21.5);
		Aeronave aviaoDois = new Aeronave("Azul", 14, 800, 300, 21.3);
		Aeronave aviaoTres = new Aeronave("Emirates", 52, 650, 400, 22.1);
		
		Aeronave vetor[] = new Aeronave[3];
		vetor[0] = aviaoUm;
		vetor[1] = aviaoDois;
		vetor[2] = aviaoTres;
		
		double maisTempoAr = Integer.MIN_VALUE;
		double maisPassageiros = Integer.MIN_VALUE;
		double maisLongo = Integer.MIN_VALUE;
		String nomeTempoAr = "";
		String nomeMaisPassageiros = "";
		String nomeMaisLongo = "";
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].tempoNoAr() > maisTempoAr) {
				maisTempoAr = vetor[i].tempoNoAr();
				nomeTempoAr = vetor[i].getAviao();
			}
			if (vetor[i].getPassageiros() > maisPassageiros ) {
				maisPassageiros = vetor[i].getPassageiros();
				nomeMaisPassageiros = vetor[i].getAviao();
			}
			
			if (vetor[i].maisLonge() > maisLongo) {
				maisLongo = vetor[i].maisLonge();
				nomeMaisLongo = vetor[i].getAviao();
			}
			
		}
		
		System.out.println("O avião que mais fica no ar é o da: " + nomeTempoAr);
		System.out.println("O avião com mais espaço é o da: " + nomeMaisPassageiros);
		System.out.println("O avião que vai mais longe é o da: " + nomeMaisLongo);
		
	}

}
