package aula1;

/**

CLASSES E HIERARQUIA DE CLASSES

1. Classes

	Determinam como o objeto tem que ser (abstração)

	- Objeto é a concretização de uma abstração

	Exemplo: 

		

		class Carro {

			String modelo
			Int kmRodado
			Int ano
		}

		As características do carro juntas formam um contexto (classe)

		

2. Atributos e operações
	Classes:

		- Possuem características (atributos)

		- Possuem ações (métodos)


**/


public class App {

	public static void main(String[] args) {
		
		Carro carro = new Carro();
		carro.marca = "BYD";
		carro.kmRodado = 1000;
		
		System.out.println("Marca: "+ carro.marca + "\n"+ "Km rodados: "+ carro.kmRodado);
		
		carro.andar(500);
		System.out.println("Km rodado: "+carro.kmRodado);
		
		Cachorro cachorro = new Cachorro();
		cachorro.nome = "Nina";
		cachorro.raca = "Salsicha";
		cachorro.latir();
	
	}

}