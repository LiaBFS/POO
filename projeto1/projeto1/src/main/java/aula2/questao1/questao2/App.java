package aula2.questao1.questao2;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pessoa p = new Pessoa();
		
		System.out.println("Altura: ");
		p.altura = sc.nextDouble();
		
		System.out.println("Peso: ");
		p.peso = sc.nextDouble();
		
		System.out.println("Seu imc é: "+p.calcularIMC());
	}

}
