package br.com.horacio.beans;

public class Professor extends Pessoa {
	
	private String curso;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String mostrarOiProfessor() {
		return "Olá Professor " + this.getNome();
	}
}
