package aula10.polimorfismoInterface;

public abstract class Animal {
	
	private double peso;
	

	public Animal(double peso) {
		setPeso(peso);
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	

}
