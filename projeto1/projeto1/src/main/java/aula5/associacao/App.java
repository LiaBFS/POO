package aula5.associacao;

public class App {
	
	/**
	 Associações
	 
	 - papel = nome da variável que guardaremos a referencia do objeto q representa a associação
	 	-> Exemplo: Pessoa e Livro, dentro de uma relação se tornam Autor e Obra devido aos papéis
	 	
	 - nome da associação = descreve como funciona essa associação
	 	-> Exemplo: Autor escreve Obra / Obra é escrita por Autor
	 	
	 - indicadores de multiplicidade = quantos objetos podem ser interconectados
	 	-> Exemplo: 1 Autor pode escrever 0 ou várias Obras, porém uma Obra tem no mínimo 1, podendo ter vários Autor(es)
	 	
	 - navegabilidade = pode ser unidirecional (seta em uma direção) ou bidirecional (sem seta ou seta pra ambas direções)
	 	-> Unidirecional = apenas uma das classes 'conhece' e pode acessar a outra (que não tem acesso a primeira)
	 	
	 	-> Bidirecional = ambas as classes tem acesso uma a outra
	 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa p = new Pessoa("Lia");
		Veiculo v = new Veiculo("Uno", "Fiat", p);

	}

}
