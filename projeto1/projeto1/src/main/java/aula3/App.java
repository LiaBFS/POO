package aula3;

public class App {
	
	/**
	
	STACK = espaço da memória garantido para a execução do código 
	
	HEAP = espaço de memória reserva que pode ser solicitado caso necessário
	
	
	"Variável por tipo de referência"
	
	 **/
	

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Lia",18);
		
		System.out.println(p1.getNome());
		System.out.println(p1.getIdade());
	}

}