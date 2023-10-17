package Ex12;

import java.text.DecimalFormat;

public class Principal {

	public static void main(String[] args) {

		/*
		 * Implemente um programa para ler o cadastro de um laboratório de informática.
		 * No laboratório existem N computadores.
		 * 
		 * Cada computador possui as seguintes informações: - número de série - modelo
		 * do processador - clock do processador em GHz - um boolean informando se pode
		 * ser feito overclock no processador - armazenamento do HDD - quantidade de
		 * memória - consumo de energia - potência da fonte
		 * 
		 * O boolean referente ao overclock não deve ser passado como parâmetro do
		 * construtor, mas atribuido true no construtor caso o modelo do processador
		 * termine em 'K' ou 'KF' ou 'X' e false caso não termine.
		 * 
		 * Faça: a) Um método que faça overclock no processador. O método deve ter como
		 * parâmetro o incremento em MHz que será feito de overclock. Os processadores
		 * só aceitam overclock até 10% do clock original. A cada 100 MHz que o clock
		 * sobe, o consumo do computador aumenta em 75W. O consumo do computador nunca
		 * deve ultrapassar 95% da potência da fonte. Note que o processador somente
		 * aceitará overclock caso a variável booleana de overclock for true. Caso não
		 * seja possível fazer o overclock, por qualquer uma das limitações, informe por
		 * que não foi possível.
		 * 
		 * b) Um método que informe o armazenamento total desse laboratório
		 * 
		 * c) O laboratório está pensando em implementar mais 3 salas iguais a essa no
		 * prédio. Eles querem saber antes qual o impacto do total de computadores nos
		 * gastos de energia elétrica. Informe qual a potência mínima em Watts que o
		 * circuito elétrico deve ter para acomodar todas as salas. A potência mínima é
		 * calculada a partir do consumo total e adicionado 10% por questões de
		 * segurança. Assumindo que eles vão rodar por uma média de 12 horas por dia,
		 * informe também o gasto de energia elétrica que a empresa terá com essas 3
		 * salas. Considere o preço da energia elétrica 71 centavos por KW/h.
		 */
		DecimalFormat dc = new DecimalFormat("0.00");
		
		Laboratorio computador1 = new Laboratorio("SN001", "Intel Core i7-13700KF", 5.4, 512, 16, 500, 850);
		Laboratorio computador2 = new Laboratorio("SN002", "AMD Ryzen 9 5950X", 4.9, 1000, 32, 500, 1000);
		Laboratorio computador3 = new Laboratorio("SN003", "Intel Core i5-9400F", 4.1, 256, 8, 400, 600);
		Laboratorio computador4 = new Laboratorio("SN004", "AMD Ryzen 7 3700X",  4.4, 512, 16, 450, 550);
		
		double armazenamentoTotal = 0;
		double consumoTotal = 0;
		double consumoTotal2 = 0;
		double consumoTotal3 = 0;
		double valorParaPagar = 0;
		double potenciaMinima = 0;
		
		for (Laboratorio c : Laboratorio.listaComputadores) {
			c.fazerOverclock(0.20);
			armazenamentoTotal += c.getArmazenamentoHD();
			consumoTotal += c.getConsumoEnergia();
		}
		
		consumoTotal2 = consumoTotal * 3;
		potenciaMinima += consumoTotal2 + (consumoTotal2 * 0.10);
		
		consumoTotal3 = (potenciaMinima * 12 * 30) / 1000;
		valorParaPagar = consumoTotal3 * 0.71;
		
		System.out.println("Armazenamento total: " + armazenamentoTotal);
		System.out.println("Potência mínima em Watts que o circuíto deve ter para as 3 salas: " + dc.format(potenciaMinima) + " Watts.");
		System.out.println("A empresa deverá pagar R$" + dc.format(valorParaPagar) + " em um mês des uso das 3 salas.");
	}

}
