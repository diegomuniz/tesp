package br.unibh.escola.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table (name = "TB_SALA",
		uniqueConstraints = @UniqueConstraint (columnNames= "codigo"))
@NamedQueries({
@NamedQuery(name="Sala.findByName", query = "select a from Sala a where a.codigo like :nome")
})
public class Sala {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank
	@Pattern (regexp= "[A-Z]{2}[0-9]{3}", message="Deve ser fornecido com padrão AANNN")
	@Column (nullable = false, columnDefinition= "CHAR(5)")
	private String codigo;
	
	@DecimalMin("5")
	@DecimalMax("100")
	@Column (nullable = false, length=100)
	private int capacidade;
	
	
	@Column (name= "possui_quadro_branco", nullable= false)
	private boolean possuiQuadroBranco;
	
	@Column (name= "possui_data_show", nullable= false)
	private boolean possuiDataShow;
	
	@Column (name= "possui_computador", nullable= false)
	private boolean possuiComputador;
	
	@Column (nullable= true, columnDefinition= "VARCHAR(255)")
	private String observacao;
	
	@NotNull
	@DecimalMin("1")
	@DecimalMax("3")
	@Column (nullable= false)
	private int status;
	
	@Temporal (TemporalType.DATE)
	@Column (name= "data_termino_manutencao", nullable= true)
	private Date dataTerminoManutencao;

	public Sala (){};
	
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

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the capacidade
	 */
	public int getCapacidade() {
		return capacidade;
	}

	/**
	 * @param capacidade the capacidade to set
	 */
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	/**
	 * @return the possuiQuadroBranco
	 */
	public boolean isPossuiQuadroBranco() {
		return possuiQuadroBranco;
	}

	/**
	 * @param possuiQuadroBranco the possuiQuadroBranco to set
	 */
	public void setPossuiQuadroBranco(boolean possuiQuadroBranco) {
		this.possuiQuadroBranco = possuiQuadroBranco;
	}

	/**
	 * @return the possuiDataShow
	 */
	public boolean isPossuiDataShow() {
		return possuiDataShow;
	}

	/**
	 * @param possuiDataShow the possuiDataShow to set
	 */
	public void setPossuiDataShow(boolean possuiDataShow) {
		this.possuiDataShow = possuiDataShow;
	}

	/**
	 * @return the possuiComputador
	 */
	public boolean isPossuiComputador() {
		return possuiComputador;
	}

	/**
	 * @param possuiComputador the possuiComputador to set
	 */
	public void setPossuiComputador(boolean possuiComputador) {
		this.possuiComputador = possuiComputador;
	}

	/**
	 * @return the observacao
	 */
	public String getObservacao() {
		return observacao;
	}

	/**
	 * @param observacao the observacao to set
	 */
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
		this.status = status;
	}

	/**
	 * @return the dataTerminoManutencao
	 */
	public Date getDataTerminoManutencao() {
		return dataTerminoManutencao;
	}

	/**
	 * @param dataTerminoManutencao the dataTerminoManutencao to set
	 */
	public void setDataTerminoManutencao(Date dataTerminoManutencao) {
		this.dataTerminoManutencao = dataTerminoManutencao;
	}
	
}