package Ex12;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Laboratorio {

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
	 * 
	 */

	/*
	 * Cada computador possui as seguintes informações: - número de série - modelo
	 * do processador - clock do processador em GHz - um boolean informando se pode
	 * ser feito overclock no processador - armazenamento do HDD - quantidade de
	 * memória - consumo de energia - potência da fonte
	 */
	DecimalFormat dc = new DecimalFormat("0.00");
	
	private String nmrSerie;
	private String modeloProcessador;
	private double clockProcessador;
	private boolean overclock;
	private int armazenamentoHD;
	private int qtdMemoria;
	private double consumoEnergia;
	private double potenciaFonte;
	public static List<Laboratorio> listaComputadores = new ArrayList<>();

	public Laboratorio(String nmrSerie, String modeloProcessador, double clockProcessador, int armazenamentoHD,
			int qtdMemoria, double consumoEnergia, double potenciaFonte) {

		setNmrSerie(nmrSerie);
		setModeloProcessador(modeloProcessador);
		setClockProcessador(clockProcessador);

		if (modeloProcessador.endsWith("K") || modeloProcessador.endsWith("KF") || modeloProcessador.endsWith("X")) {
			setOverclock(true);
		} else {
			setOverclock(false);
		}

		setArmazenamentoHD(armazenamentoHD);
		setQtdMemoria(qtdMemoria);
		setConsumoEnergia(consumoEnergia);
		setPotenciaFonte(potenciaFonte);
		listaComputadores.add(this);

	}

	public String getNmrSerie() {
		return nmrSerie;
	}

	public void setNmrSerie(String nmrSerie) {
		if (nmrSerie == null || nmrSerie.isBlank() || nmrSerie.isEmpty()) {
			throw new IllegalArgumentException("Sem número de série");
		}
		this.nmrSerie = nmrSerie;
	}

	public String getModeloProcessador() {
		return modeloProcessador;
	}

	public void setModeloProcessador(String modeloProcessador) {
		if (modeloProcessador == null || modeloProcessador.isBlank() || modeloProcessador.isEmpty()) {
			throw new IllegalArgumentException("Modelo do processador sem nome.");
		}
		this.modeloProcessador = modeloProcessador;
	}

	public double getClockProcessador() {
		return clockProcessador;
	}

	public void setClockProcessador(double clockProcessador) {
		if (clockProcessador <= 0) {
			throw new IllegalArgumentException("Sem clock do processador.");
		}
		this.clockProcessador = clockProcessador;
	}

	public boolean isOverclock() {
		return overclock;
	}

	public void setOverclock(boolean overclock) {
		this.overclock = overclock;
	}

	public int getArmazenamentoHD() {
		return armazenamentoHD;
	}

	public void setArmazenamentoHD(int armazenamentoHD) {
		if (armazenamentoHD <= 0) {
			throw new IllegalArgumentException("Sem armazenamento HD.");
		}
		this.armazenamentoHD = armazenamentoHD;
	}

	public int getQtdMemoria() {
		return qtdMemoria;
	}

	public void setQtdMemoria(int qtdMemoria) {
		if (qtdMemoria <= 0) {
			throw new IllegalArgumentException("Sem memóriam RAM.");
		}
		this.qtdMemoria = qtdMemoria;
	}

	public double getConsumoEnergia() {
		return consumoEnergia;
	}

	public void setConsumoEnergia(double consumoEnergia) {
		if (consumoEnergia <= 0) {
			throw new IllegalArgumentException("Sem consumo de energia.");
		}
		this.consumoEnergia = consumoEnergia;
	}

	public double getPotenciaFonte() {
		return potenciaFonte;
	}

	public void setPotenciaFonte(double potenciaFonte) {
		if (potenciaFonte <= 0) {
			throw new IllegalArgumentException("Sem a potência da fonte.");
		}
		this.potenciaFonte = potenciaFonte;
	}

	/*
	 * Faça: a) Um método que faça overclock no processador. O método deve ter como
	 * parâmetro o incremento em MHz que será feito de overclock. Os processadores
	 * só aceitam overclock até 10% do clock original. A cada 100 MHz que o clock
	 * sobe, o consumo do computador aumenta em 75W. O consumo do computador nunca
	 * deve ultrapassar 95% da potência da fonte. Note que o processador somente
	 * aceitará overclock caso a variável booleana de overclock for true. Caso não
	 * seja possível fazer o overclock, por qualquer uma das limitações, informe por
	 * que não foi possível.
	 */

	public void fazerOverclock(double incrementoMHz) {

		if (overclock) {
			double over = clockProcessador + incrementoMHz;

			if (over <= clockProcessador * 1.1) {
				double consumo = (over / 100) * 75;

				if (consumo + consumoEnergia <= potenciaFonte * 0.95) {
					clockProcessador = over;
					consumoEnergia += consumo;
					System.out.println("Overclock realizado com sucesso! Novo clock: " + dc.format(clockProcessador));
				} else {
					System.out.println("Não foi possível realizar o overclock por exceder os 95% de potência.");
				}

			} else {
				System.out.println(
						"Não foi possível realizar o overclock devido ao mesmo ultrapassar 10% do clock original.");
			}
		} else {
			System.out.println("Não foi possível realizar o clock, já que o mesmo está desativado.");
		}
	}

}
