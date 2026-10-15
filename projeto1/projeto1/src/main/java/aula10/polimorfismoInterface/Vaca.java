package aula10.polimorfismoInterface;

public class Vaca extends Animal implements Herbivoro, Mamifero{

	

	public Vaca(double peso) {
		super(peso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comerPlantas() {
		
		System.out.println("nhec nhec");
		
	}

	@Override
	public void mamam() {

		System.out.println("glub glub");
		
	}
	
	

}
