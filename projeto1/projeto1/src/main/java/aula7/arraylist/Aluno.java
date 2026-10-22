package aula7.arraylist;

public class Aluno {
	
	private String nome;
	private String matricula;
	private double media;
	
	public Aluno(String nome, String matricula, double media) {
		setNome(nome);
		setMatricula(matricula);
		setMedia(media);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	
	

}
