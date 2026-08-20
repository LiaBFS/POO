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
			System.out.println("Quantia inválida");
		} else {
			saldo +=quantia;
		}
		
	}
	
	public void sacar(double quantia) {
		if(saldo < quantia) {
			System.out.println("Saldo insuficiente");
		} else {
			saldo -= quantia;
		}
		System.out.println("Saldo atual: "+saldo);
		
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
