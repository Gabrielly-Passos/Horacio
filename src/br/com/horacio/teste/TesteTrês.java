package br.com.horacio.teste;

import br.com.horacio.beans.Professor;

public class TesteTrês {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Professor professor = new Professor();
		
		professor.setNome("Rafael");
		professor.setIdade(50);
		professor.setSexo('M');
		professor.setCurso(" Professor de Desenvolvimento de Sistemas");
		
		System.out.println("Nome Aluno " +  professor.getNome() 
		+ "\nIdade do Aluno " + professor.getIdade()
        + "\nSexo do Aluno " + professor.getSexo()	);
		
		System.out.println(professor.mostrarOiProfessor());
	   
	}

}
