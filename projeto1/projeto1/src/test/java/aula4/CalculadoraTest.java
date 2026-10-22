package aula4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testeSomar() {
		Calculadora c = new Calculadora();
		int valor1 = 32;
		int valor2 = 10;
		
		int esperado = 42;
		int resultado = c.somar(valor1, valor2);
		assertEquals(esperado, resultado);
	}
	
	@Test
	void testeMultiplicar() {
		Calculadora c = new Calculadora();
		double valor1 = 1.0;
		double valor2 = 12.0;
		
		double esperado = 12.0;
		double tolerancia = 0;
		double resultado = c.multiplicar(valor1, valor2);
		assertEquals(esperado, resultado, tolerancia);
	}
	
	@Test
	void testeDividirPorZero() {
		Calculadora c = new Calculadora();
		
		Exception ex = assertThrows(IllegalArgumentException.class, 
				() -> {
					int valor1 = 42;
					int valor2 = 0;
					c.dividir(valor1, valor2);
				});
		
		
	}

}
