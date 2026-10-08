package aula8.polimorfismo;

public class Cachorro extends Animal {
	
	private String nome;

	public Cachorro(double peso, String nome) {
		super(peso);
		setNome(nome);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("AUAUAU");
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
