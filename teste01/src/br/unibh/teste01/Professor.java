package br.unibh.teste01;

import java.math.BigDecimal;

public class Professor extends Pessoa {
	// Variaveis de instância
	private BigDecimal salario;
	
	// Getters and Setters 

	public BigDecimal getSalario() {
		return salario;
	}
	
	// Construtores
	/**
	 * Construtor
	 */
	public Professor(){}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public Professor(BigDecimal salario) {
		super();
		this.salario = salario;
	}

	public Professor(Long id, String nome, String cpf, BigDecimal salario) {
		super(id, nome, cpf);
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Professor [salario=" + salario + ", getId()=" + getId() + ", getNome()=" + getNome() + ", getCpf()="
				+ getCpf() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
		
}
