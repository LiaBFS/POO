package aula10.polimorfismoInterface;

public class App {

	public static void main(String[] args) {
		
		/**
		 
		 Interface:
		 Protocolo ou comportamento padrão que classes que não interagem seguirão
		 
		 Java não tem multiplicidade mas utiliza Interfaces para suprir essa necessidade
		 
		 **/
		
		Pessoa p = new Pessoa(45);
		
		Animal a =p;
		Onivoro o =p;
		Carnivoro c =p;
		Herbivoro h =p;

	}

}
