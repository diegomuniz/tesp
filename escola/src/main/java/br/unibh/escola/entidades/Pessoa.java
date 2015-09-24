package br.unibh.escola.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@XmlRootElement
@Table(uniqueConstraints = @UniqueConstraint(columnNames = "cpf") )
public abstract class Pessoa {

	@Id
	@GeneratedValue
	private Long id;

	@NotNull
	@NotEmpty
	@Size(min = 5, max = 100)
	@Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")
	private String nome;

	@NotNull
	@NotEmpty
	@Size(min = 11, max = 11)
	@Digits(fraction = 0, integer = 11)
	private String cpf;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	

}
