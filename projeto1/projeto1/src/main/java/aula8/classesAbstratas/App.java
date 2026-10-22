package aula8.classesAbstratas;

public class App {
	
	
	/**
	 
	 Classes abstratas representam um conceito extremamente genérica, que não pode criar nada por si mesmo, necessitando de mais informação
	 
	 	- Exemplo: Classe Animal é abstrata por não existe um animal sem espécie, como por exemplo sua subclasse Cachorro
	 
	 */

	public static void main(String[] args) {
		
		OncaPintuda c = new OncaPintuda(10, "Nina");
		c.comer();
		c.emitirSom();

	}

}
