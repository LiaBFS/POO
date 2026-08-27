package aula4;

public class Calculadora {
	
	public int somar(int a, int b) {
		return a+b;
	}
	
	public double multiplicar(double a, double b) {
		return a*b;
	}
	
	public double dividir(int a, int b) {
		if(b==0) {
			throw new IllegalArgumentException("Divisão por 0");
		}
		return a/b;
	}

}
