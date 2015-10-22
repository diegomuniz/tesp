package br.unibh.escola.entidades;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@PrimaryKeyJoinColumn
@Table(name="TB_PROFESSOR")
@NamedQueries({
@NamedQuery(name="Professor.findByName", query = "select a from Professor a where a.nome like :nome")
})
public class Professor extends Pessoa {
	
	@Column(nullable=true, columnDefinition="DECIMAL(14,2)")
	@NotNull
	@DecimalMin("500")
	@DecimalMax("100000")
	private BigDecimal salario;
	
	public static Double BONUS = 0.1D;
	
	
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	public static Double getBONUS() {
		return BONUS;
	}
	public static void setBONUS(Double bONUS) {
		BONUS = bONUS;
	}


}
