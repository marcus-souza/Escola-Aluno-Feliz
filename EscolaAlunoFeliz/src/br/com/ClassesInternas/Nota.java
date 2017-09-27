package br.com.ClassesInternas;

public class Nota {
	private Double nota;
	private Disciplina disciplina;
	private Aluno aluno;
	public Nota(Double nota, Disciplina disciplina, Aluno aluno) {
		super();
		this.nota = nota;
		this.disciplina = disciplina;
		this.aluno = aluno;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	public Disciplina getDisciplina() {
		return disciplina;
	}
	public Aluno getAluno() {
		return aluno;
	}
	
}
