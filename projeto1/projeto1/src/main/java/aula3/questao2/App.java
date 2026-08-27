package aula3.questao2;

public class App {

	public static void main(String[] args) {
		
		ContaBancaria c = new ContaBancaria("123456-12", "Lia");
		ContaBancaria c2 = new ContaBancaria("123456-99", "Maria");
		
		c.depositar(100);
		c2.depositar(300);
		
		System.out.println("Saldo atual conta 1: "+c.getSaldo());
		System.out.println("Saldo atual conta 2: "+c2.getSaldo());
		
		c2.transferir(c, 250);
		
		System.out.println("Saldo atual conta 1: "+c.getSaldo());
		System.out.println("Saldo atual conta 2: "+c2.getSaldo());
		
	}

}
