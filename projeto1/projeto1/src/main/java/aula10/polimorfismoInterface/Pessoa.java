package aula10.polimorfismoInterface;

public class Pessoa extends Animal implements Onivoro, Mamifero {

	public Pessoa(double peso) {
		super(peso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comerPlantas() {

		System.out.println("nhec nhec");
		
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
