package aula9.lista6;

public class ContaEspecial extends ContaBancaria{
	
	
	private double limiteCredito;
	
	

	public ContaEspecial(String numero, Cliente titular, double limiteCredito) {
		super(numero,titular);
		setLimiteCredito(limiteCredito);
	}

	public double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}
	
	
	public void sacar(double valor){
		if(valor > (limiteCredito+getSaldo())) {
			throw new IllegalArgumentException("Limite indisponivel");
		}
		setSaldo(getSaldo()-valor);
	}

}
