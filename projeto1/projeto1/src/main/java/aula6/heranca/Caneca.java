package aula6.heranca;

public class Caneca {
	
	private int capacidade;
	private int conteudo;
	
	
	
	public Caneca(int capacidade, int conteudo) {
		setCapacidade(capacidade);
		setConteudo(conteudo);
	}
	
	public void beber(int quantidade) {
		if(quantidade>conteudo) {
			conteudo =0;
		} 
		conteudo -= quantidade;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		if(capacidade <=0) {
			throw new IllegalArgumentException("Capacidade invalida");
		}
		this.capacidade = capacidade;
	}
	public int getConteudo() {
		return conteudo;
	}
	public void setConteudo(int conteudo) {
		if(conteudo>capacidade) {
			throw new IllegalArgumentException("Conteudo invalido");
		}
		this.conteudo = conteudo;
	}
	
	

}