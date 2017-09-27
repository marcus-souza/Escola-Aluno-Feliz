package br.com.ClassesInternas;

import java.util.ArrayList;

public class Curso {
	private String nome;
	private Integer qtdSemestres;
	private ArrayList<Disciplina> disciplinas;
	private ArrayList<Aluno> alunos;
	
	public Curso(String nome, Integer qtdSemestres) {
		this.nome = nome;
		this.qtdSemestres = qtdSemestres;
	}

	public Curso(String nome, Integer qtdSemestres, ArrayList<Disciplina> disciplinas, ArrayList<Aluno> alunos) {
		this.nome = nome;
		this.qtdSemestres = qtdSemestres;
		this.disciplinas = disciplinas;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Integer getQtdSemestres() {
		return qtdSemestres;
	}

	public void setQtdSemestres(Integer qtdSemestres) {
		this.qtdSemestres = qtdSemestres;
	}
	
}
