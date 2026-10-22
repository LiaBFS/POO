package aula2.encapsulamento;

public class ContaBancaria {
	
	private /** <- modificador de acesso**/ String titular;
	private double saldo;
	
	public void sacar(double valor) {
		if(valor > saldo) {
			throw new IllegalArgumentException("Saldo insuficiente");
		}
		
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		if(valor <= 0) {
			throw new IllegalArgumentException("Valor inválido");
		}
		
		saldo += valor;
	}
	
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
