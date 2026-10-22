package aula7.arraylist;

public class App {

	public static void main(String[] args) {
	
		Turma t = new Turma("POO");
		
		Aluno a1 = new Aluno("Lia", "123456", 9);
		Aluno a2 = new Aluno("Maria", "654321", 9);
		Aluno a3 = new Aluno("CU", "121212", 3);
		
		t.adicionarAluno(a1);
		t.adicionarAluno(a2);
		t.adicionarAluno(a3);
		
		//for normal
		
		/**
		for(int i=0; i<t.getAlunos().size(); i++) {
			Aluno a = t.getAlunos().get(i);
			System.out.println(a.getNome());
		}
		**/
		
		
		//for each
		
		for(Aluno a: t.getAlunos()) {
			System.out.println(a.getNome());
		}
		
		System.out.println("Maior media: "+t.getMaiorMedia().getNome());
	}

}
