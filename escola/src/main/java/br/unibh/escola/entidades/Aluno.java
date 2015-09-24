package br.unibh.escola.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Classe concreta de Aluno
 * 
 * @author Diego Muniz
 * @version 1.0
 */

@Entity
@XmlRootElement
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "matricula") )
public class Aluno extends Pessoa {

	@NotNull
	@NotEmpty
	@Size(min = 8, max = 8)
	@Digits(fraction = 0, integer = 8)
	private String matricula;

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
