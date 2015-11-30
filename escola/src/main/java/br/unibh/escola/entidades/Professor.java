package br.unibh.escola.entidades;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TB_PROFESSOR")
@PrimaryKeyJoinColumn
@NamedQueries({
@NamedQuery(name="Professor.findByName", query = "select a from Professor a where a.nome like :nome")
})
public class Professor extends Pessoa {
	// Variaveis de inst�ncia
	
	@NotNull
	@DecimalMin(value = "500.00")
	@DecimalMax(value = "100000.00")
	@Column(nullable=false)
	private BigDecimal salario;
	public static Double BONUS = 0.1D;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="professor")
	private List<Disciplina> disciplinas;
	
	// Getters and Setters 

	public BigDecimal getSalario() {
		return salario;
	}
	
	public static Double getBONUS() {
		return BONUS;
	}

	public static void setBONUS(Double bONUS) {
		BONUS = bONUS;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((salario == null) ? 0 : salario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Professor other = (Professor) obj;
		if (salario == null) {
			if (other.salario != null)
				return false;
		} else if (!salario.equals(other.salario))
			return false;
		return true;
	}
	
	
	
	
		
}