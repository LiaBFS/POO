package aula2.encapsulamento;

public class App {
	
	
	/**
	
	Encapsulamento:
	
	Métodos acessores: get (ler o conteúdo da variável) / set (alterar o conteúdo da variável)
	
	
	Baixo acoplamento:
	
	O encapsulamento permite ocultar informações que não são necessárias para a comunicação entre classes
	
	**/
	
	
	/**
	
	Código sem encapsulamento

	public static void main(String[] args) {
		
		ContaBancaria c = new ContaBancaria();
		c.titular = "Lia";
		c.saldo = 300;
		
		System.out.println("Saldo atual: "+c.saldo);
		c.saldo = 3000000;
		
		
		System.out.println("Saldo atual: "+c.saldo);

	} **/
	
	//Código com encapsulamento
	
	public static void main(String[] args) {
		
		ContaBancaria c = new ContaBancaria();
		c.setTitular("Lia");
		
		c.depositar(300);
		System.out.println("Saldo atual: "+c.getSaldo());
		
		c.depositar(300);
		System.out.println("Saldo atual: "+c.getSaldo());
		
		c.sacar(200);
		System.out.println("Saldo atual: "+c.getSaldo());
		
		c.sacar(400);
		System.out.println("Saldo atual: "+c.getSaldo());
	}

}
