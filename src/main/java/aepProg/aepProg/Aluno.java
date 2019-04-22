package aepProg.aepProg;

public class Aluno {
	private String nome;
	private int ra;
	
	public Aluno (int ra, String nome){
		this.ra = ra;
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public int getRa(){
		return this.ra;
	}
}
