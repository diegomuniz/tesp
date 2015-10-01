package br.unibh.escola.entidades;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@PrimaryKeyJoinColumn
@Table(name="TB_PROFESSOR")
public class Professor extends Pessoa {
	
	@Column(nullable=true)
	@NotNull
	@Size(min = 5, max = 8)
	@Digits(fraction = 2, integer = 6)
	@Pattern(regexp = "\\d*", message = "must contain only numbers")
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
