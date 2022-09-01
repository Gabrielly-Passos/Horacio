package br.com.horacio.teste;

import br.com.horacio.beans.Aluno;

public class TesteDois {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aluno aluno = new Aluno();
		
		aluno.setNome("Gabrielly");
		aluno.setIdade(22);
		aluno.setSexo('M');
		aluno.setMatricula("212101");
		aluno.setCurso("Desenvolvimento de Sistemas");
		
		System.out.println("Nome Aluno " +  aluno.getNome() 
		+ "\nIdade do Aluno " + aluno.getIdade()
        + "\nSexo do Aluno " + aluno.getSexo()	
        + "\nMatricula do Aluno " + aluno.getMatricula()
				);
		
		System.out.println(aluno.mostrarOiAluno());

	}

}
