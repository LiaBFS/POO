package aula7.arraylist;

import java.util.ArrayList;

/**

	Vetor dinamicamente alocado = o array cresce conforme são acrescentado dados

**/

public class Turma {
	
	private ArrayList<Aluno> alunos;
	private String materia;
	
	public Turma(String materia) {
		
		setMateria(materia);
		alunos = new ArrayList();
		
	}
	
	public void adicionarAluno(Aluno a) {
		if(a==null) {
			throw new IllegalArgumentException("Aluno inválido");
		}
		alunos.add(a);
	}
	
	public Aluno getMaiorMedia() {
		Aluno maior = alunos.get(0);
		for(Aluno a: alunos) {
			if(a.getMedia()>maior.getMedia()) {
				maior = a;
			}
		}
		
		return maior;
	}
	
	public void removerAluno(Aluno a) {
		if(a==null) {
			throw new IllegalArgumentException("Aluno inválido");
		}
		alunos.remove(a);
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	

}
