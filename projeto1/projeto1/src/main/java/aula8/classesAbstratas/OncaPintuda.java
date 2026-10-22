package aula8.classesAbstratas;

public class OncaPintuda extends Animal {
	
	private String nome;

	public OncaPintuda(double peso, String nome) {
		super(peso);
		setNome(nome);
	}
	
	@Override
	public void emitirSom() {
		
		System.out.println("UAGGGHRHR");
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
