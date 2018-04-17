package model;

public class Empregado {
	private Integer idemp;
	private String nome;
	private String sobrenome;
	private String CPF;
	
	
	public Integer getIdemp() {
		return idemp;
	}
	public void setIdemp(Integer idemp) {
		this.idemp = idemp;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
}
