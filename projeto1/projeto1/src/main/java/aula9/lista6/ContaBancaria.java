package aula9.lista6;

public class ContaBancaria {
	 
	private String numero;
	private Cliente titular;
	private double saldo;
 
	public ContaBancaria(String numero, Cliente titular) {
		setNumero(numero);
		setTitular(titular);
		saldo = 0;
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
	
	public Cliente getTitular() {
		return titular;
	}
 
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
 
	public double getSaldo() {
		return saldo;
	}
	
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
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