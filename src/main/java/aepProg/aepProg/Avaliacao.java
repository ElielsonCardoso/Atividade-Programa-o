package aepProg.aepProg;

public class Avaliacao {
	private float nota;
	private Aluno aluno;
	private Disciplina disciplina;
	
	public Avaliacao(Aluno aluno, Disciplina disciplina, float nota) {
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.nota = nota;
	}
	
	public Aluno getAluno() {
		return this.aluno;
	}
	
	public Disciplina getDisciplina() {
		return this.disciplina;
	}
	
	public float getNota() {
		return this.nota;
	}
}
