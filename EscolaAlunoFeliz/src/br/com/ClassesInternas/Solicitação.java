package br.com.ClassesInternas;

public class Solicitação {
	private String codigo;
	private String tipo;
	private String data;
	private Aluno aluno;
	private Disciplina disciplina;
	
	public Solicitação(String codigo, String tipo, String data, Aluno aluno, Disciplina disciplina) {
		this.codigo = codigo;
		this.tipo = tipo;
		this.data = data;
		this.aluno = aluno;
		this.disciplina = disciplina;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
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

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	
}
