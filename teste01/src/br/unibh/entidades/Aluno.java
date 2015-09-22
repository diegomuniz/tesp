package br.unibh.entidades;

import java.util.Date;

/**
 * Classe concreta de Aluno
 * @author Diego Muniz
 * @veersion 1.0
 */
public class Aluno extends Pessoa {
	// Variaveis de instancia
	private String matricula;
	private Date dataAniversario;
	
	// Construtores
	
	/**
	 * Construtor padr�o
	 */
	public Aluno(){}
	
	/**
	 * Construtor apenas com os atributos b�sicos de Aluno
	 * @param matricula
	 * @param dataAniversario
	 */
	public Aluno(String matricula, Date dataAniversario) {
		super();
		this.matricula = matricula;
		this.dataAniversario = dataAniversario;
	}

	public Aluno(Long id, String nome, String cpf, String matricula, Date dataAniversario) {
		super(id, nome, cpf);
		this.matricula = matricula;
		this.dataAniversario = dataAniversario;
	}
	
	// Getters and Setters
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Date getDataAniversario() {
		return dataAniversario;
	}
	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", dataAniversario=" + dataAniversario + ", toString()="
				+ super.toString() + "]";
	}
		
}

