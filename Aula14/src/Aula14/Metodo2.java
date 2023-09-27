// at Revisao/Revisao.Metodo2.main(Metodo2.java:10)
// Considerando oq está dentro do parênteses, a ordem é o nome do arquivo(no caso, Metodo2), a extensão(no caso
// .java) e por fim :linha onde está o erro(no caso :10).
// NÃO PODE CRIAR MÉTODOS DENTRO DA CLASSE MAIN
// NÃO PODE CRIAR UM MÉTODO DENTRO DE OUTRO MÉTODO
// NÃO POSSO CRIAR DOIS MÉTODOS COM O MESMO NOME


// Padrão de criação de arquivo
// 1 - Package
package Aula14;
// 2 - Classe (nome do arquivo)

public class Metodo2 {
	// 3 - Sempre criar métodos após a classe
	
	public static void corFavorita() {
		// obrigatoriamente parênteses
		// possui escopo
		// linhas de código
		System.out.println("Vermelho");
		
	}
	
	// 4 - Cria o método main
	
	public static void main(String[] args) {
		// para chamar um método: vou escrever o nome dele, sem esquecer dos parênteses
		corFavorita();
		
	}
}



