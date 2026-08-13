package aula2.questao1;

public class App {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		pessoa.peso=78;
		pessoa.altura=1.75;
		
		System.out.println("O imc é: "+pessoa.calcularIMC());
	}

}
