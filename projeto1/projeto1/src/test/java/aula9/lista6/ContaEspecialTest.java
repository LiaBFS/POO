package aula9.lista6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContaEspecialTest {

	@Test
	void testSaqueValorMaiorQueSaldo() {
		Cliente cliente = new Cliente("Lia", "Rua Aguas Negras, 455");
		ContaEspecial conta = new ContaEspecial("984930182", cliente, 100);
		double esperado =30;
		
		conta.depositar(20);
		conta.sacar(50);
		double resultado = conta.getSaldo();
		
		assertEquals(esperado, resultado, 0.009);
	}
	
	@Test
	void testSaqueMaiorQueLimite() {
		Cliente cliente = new Cliente("Lia", "Rua Aguas Negras, 455");
		ContaEspecial conta = new ContaEspecial("984930182", cliente, 100);
		conta.depositar(20);
		
		Exception ex = assertThrows(IllegalArgumentException.class,
				() -> {
					conta.sacar(120.01);
				});
				
				
	}

}
