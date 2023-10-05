package Ex4;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Crie uma classe Empregado que terá como atributos: Identificação Nome
		 * Sobrenome Salário
		 * 
		 * Crie métodos para: Saber o salário anual do empregado Saber o nome completo
		 * do empregado Modificar o salário, o parâmetro do método deve ser o percentual
		 * de aumento Imprima o toString do usuário que após o aumento ficou com o maior
		 * do salário
		 */
		
		Empregados empregado01 = new Empregados(1, "Vinicius Blau", 9000);
		Empregados empregado02 = new Empregados(2 , "Bruna Winter", 6000);
		Empregados empregado03 = new Empregados(3, "Léo vizu", 3000);
		
		double maisSalario = Integer.MIN_VALUE;
		
		for (Empregados e : Empregados.listaEmpregados) {
			
			System.out.println(e.rendaAnual());
			e.modificarSalario(0.30);
			
			if (e.getSalario() > maisSalario) {
				maisSalario = e.getSalario();
				System.out.println(e.toString());
			}
			
		}
	}

}
