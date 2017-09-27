package br.com.ClassesInternas;

public class Recado {
	private String recado;
	private String data;
	private Aluno aluno;
	private Professor professor;

	public Recado(String recado, String data, Aluno aluno, Professor professor) {
		this.recado = recado;
		this.data = data;
		this.aluno = aluno;
		this.professor = professor;
	}
	
	public String getRecado() {
		return recado;
	}
	public void setRecado(String recado) {
		this.recado = recado;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}
