package br.unibh.escola.entidades;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "matricula") )
public class Professor extends Pessoa {
	
	@NotNull
	@Size(min = 5, max = 8)
	@Digits(fraction = 2, integer = 6)
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
