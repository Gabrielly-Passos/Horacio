package br.com.horacio.teste;

import br.com.horacio.beans.Funcionario;


public class TesteUm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Funcionario funcionario = new Funcionario(); 
		 
		 funcionario.setNome("Gaby");
		 funcionario.setIdade(22);
		 funcionario.setSexo('F');
		 funcionario.setCargaHoraria(40);
		 
		 
		 System.out.println("Nome é  " + funcionario.getNome() +
				 "\nA Idade é " + funcionario.getIdade() +
				 "\nSexo é " + funcionario.getSexo() + 
				 "\nCarga Horaria é : " + funcionario.getCargaHoraria()
				 
				 );
		 
		 System.out.println(funcionario.mostrarSalarioFinal());

	}
 
}
