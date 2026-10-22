package aula3.questao2;

public class ContaBancaria {
	
	private String numero;
	private String titular;
	private double saldo;
	
	
	public ContaBancaria(String numero, String titular) {
		setNumero(numero);
		setTitular(titular);
	}
	
	public void depositar(double quantia) {
		
		if(quantia <=0) {
			throw new IllegalArgumentException("Quantia inválida");
		}
		saldo += quantia;
		System.out.println("Saldo atual: "+saldo);
	}
	
	public void sacar(double quantia) {
		if(saldo < quantia || quantia <= 0) {
			throw new IllegalArgumentException("Saldo insuficiente");
		}
		saldo -= quantia;
		System.out.println("Saldo atual: "+saldo);
		
	}
	
	public void transferir(ContaBancaria destino, double valor) {
		
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		if(numero.isBlank() || numero == null) {
			throw new IllegalArgumentException("Numero da conta inválido");
		}
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		if(titular.isBlank() || titular == null) {
			throw new IllegalArgumentException("Numero da conta inválido");
		}
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
}
