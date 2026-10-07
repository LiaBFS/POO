package aula6.heranca;

public class App {
	
/**
	
	Relação Universo Parte-Todo ( -<>)
	
		- Agregação (seta losango não preenchida)
		
			Mais comum, menos rígido
		
		- Composição (seta losango preenchida)
		
	Heranças
	
		- Permite copiar a implementação de uma Superclasse para demais Subclasses
		
	**/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Copo co = new Copo(350,0);
		
		Caneca ca = new Caneca(500,300);
		
		System.out.println("Copo capacidade: "+co.getCapacidade()+" / Copo conteudo: "+co.getConteudo());
		System.out.println("Caneca capacidade: "+ca.getCapacidade()+" / Caneca conteudo: "+ca.getConteudo());
	}

}
