package aula9.lista6;

public class ContaBancaria {
	 
	private String numero;
	private String titular;
	private double saldo;
 
	public ContaBancaria(String numero, String titular) {
		setNumero(numero);
		setTitular(titular);
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setNumero(String numero) {
		if (numero == null || numero.trim().isEmpty()) {
			throw new IllegalArgumentException("Numero invalido");
		}
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		if (titular == null || titular.trim().isEmpty()) {
			throw new IllegalArgumentException("Titular invalido");
		}
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
 
 
	public void depositar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("Valor invalido");
		}
		saldo += valor;
	}
	
	public void sacar(double valor) {
		if (saldo < valor || valor < 0) {
			throw new IllegalArgumentException("Valor invalido");
		}
		
		saldo -= valor;
	}
	
	public void transferir(ContaBancaria destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
	}
	
	
	
}