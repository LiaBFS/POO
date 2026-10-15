package aula10.polimorfismoInterface;

public class Leao extends Animal implements Carnivoro, Mamifero{

	public Leao(double peso) {
		super(peso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comerCarne() {
		
		System.out.println("nham nham");
		
	}

	@Override
	public void mamam() {
		System.out.println("glub glub");
		
	}
	
	

}
