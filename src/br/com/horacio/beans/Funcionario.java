package br.com.horacio.beans;

public class Funcionario  extends Pessoa{

	private int cargaHoraria;
	
	private double salario;

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	} 
	
	public double mostrarSalarioFinal() {
		return "Seu Salario é: " + this.getSalario();
		
	}
	
}

