package aula8.polimorfismo;

public class App {
	
	
	
public static void main(String[] args) {
		
		Cachorro c = new Cachorro(10, "Nina");
		c.comer();
		c.emitirSom();
		ouvirSom(c);

	}

	public static void ouvirSom(Animal a) {
		a.emitirSom();
	}

}
