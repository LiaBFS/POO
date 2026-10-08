package aula8.polimorfismo;

public abstract class Animal {
	
	
	private double peso;
	
	public Animal(double peso) {
		setPeso(peso);
	}
	
	//Subclasses são obrigadas a utilizar e 'mudar' o método para adequa-lo a elas
	public abstract void emitirSom();
	
	//Não deixa as subclasses alterarem
	public final void comer() {
		System.out.println("nham nham");
	}
	
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	} 
}
