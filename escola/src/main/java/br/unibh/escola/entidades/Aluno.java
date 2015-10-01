package br.unibh.escola.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Classe concreta de Aluno
 * 
 * @author Diego Muniz
 * @version 1.0
 */

@Entity
@PrimaryKeyJoinColumn
@Table(name="TB_ALUNO", uniqueConstraints = @UniqueConstraint(columnNames = "matricula") )
public class Aluno extends Pessoa {

	@Column(length=8, nullable=false, columnDefinition="CHAR(11)")
	@NotNull
	@NotBlank
	@Size(max = 8)
	@Digits(fraction = 0, integer = 8)
	@Pattern(regexp = "[A-Za-z\\d]*", message = "must contain only numbers")
	private String matricula;

	@Column(name="data_aniversario", nullable=true)
	@Temporal(TemporalType.DATE)
	private Date dataAniversario;

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

}
