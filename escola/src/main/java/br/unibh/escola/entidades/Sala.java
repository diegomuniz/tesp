package br.unibh.escola.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

/**
 * Classe concreta de Aluno
 * 
 * @author Diego Muniz
 * @version 1.0
 */

@Entity
@PrimaryKeyJoinColumn
@Table(name="TB_SALA", uniqueConstraints = @UniqueConstraint(columnNames = "codigo") )
public class Sala {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=5, nullable=false, columnDefinition="CHAR(5)")
	@NotBlank
	@NotNull
	@Pattern(regexp = "[A-Z]{2}[0-9]{3}", message = "Duas letras e 3 numeros")
	private String codigo;
	
	@NotNull
	@Column(nullable=false, length=3)
	@Min(5)
	@Max(100)
	private int capacidade;
	
	@NotNull
	@Column(nullable=false, name="possui_quadro_branco")
	private boolean possuiQuadroBranco;
	
	@NotNull
	@Column(nullable=false, name="possui_data_show")
	private boolean possuiDataShow;
	
	@NotNull
	@Column(nullable=false, name="possui_computador")
	private boolean possuiComputador;
	
	@NotNull
	@Column(nullable=true, columnDefinition="VARCHAR(255)")
	private String observacao;
	
	@NotNull
	@Column(nullable=false, length=1)
	@Min(1)
	@Max(3)
	@Pattern(regexp = "[1-3]1", message = "1 - Ativo, 2 - Em Manutenção, 3 - Desativo")
	private int status;
	
	@Column(name="data_termino_manutencao", nullable=true)
	@Temporal(TemporalType.DATE)
	private Date dataTerminoManutencao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public Date getDataTerminoManutencao() {
		return dataTerminoManutencao;
	}

	public void setDataTerminoManutencao(Date dataTerminoManutencao) {
		this.dataTerminoManutencao = dataTerminoManutencao;
	}

	public boolean isPossuiQuadroBranco() {
		return possuiQuadroBranco;
	}

	public void setPossuiQuadroBranco(boolean possuiQuadroBranco) {
		this.possuiQuadroBranco = possuiQuadroBranco;
	}

	public boolean isPossuiDataShow() {
		return possuiDataShow;
	}

	public void setPossuiDataShow(boolean possuiDataShow) {
		this.possuiDataShow = possuiDataShow;
	}

	public boolean isPossuiComputador() {
		return possuiComputador;
	}

	public void setPossuiComputador(boolean possuiComputador) {
		this.possuiComputador = possuiComputador;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Sala(Long id, String codigo, int capacidade, boolean possuiQuadroBranco, boolean possuiDataShow,
			boolean possuiComputador, String observacao, int status, Date dataTerminoManutencao) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.capacidade = capacidade;
		this.possuiQuadroBranco = possuiQuadroBranco;
		this.possuiDataShow = possuiDataShow;
		this.possuiComputador = possuiComputador;
		this.observacao = observacao;
		this.status = status;
		this.dataTerminoManutencao = dataTerminoManutencao;
	}
	
}
