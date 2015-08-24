package br.edu.unoesc.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;





@Entity
public class Consulta implements Serializable {

	
	
	
	private static final long serialVersionUID = 7206941679669981934L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	
	@Column(nullable = false)
	private Double valor;
	private String data;

	@ManyToOne(targetEntity = Medico.class)
	@JoinColumn(name = "codmedico")
	private Medico medico;
	
	


	@ManyToOne(targetEntity = Paciente.class)
	@JoinColumn(name = "codpaciente")
	private Paciente pacientes;
	
	@ManyToOne(targetEntity = Medicamento.class)
	@JoinColumn(name = "codmedicamento")
	private Medicamento medicamento;


	public Consulta() {
		super();
	}

	public Consulta(Double valor, String data, Medico medicos,
			Paciente pacientes, Medicamento medicamento) {
		super();
		this.valor = valor;
		this.data = data;
		this.medico = medicos;
		this.pacientes = pacientes;
		this.medicamento = medicamento;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Medico getMedicos() {
		return medico;
	}

	public void setMedicos(Medico medicos) {
		this.medico = medicos;
	}

	public Paciente getPacientes() {
		return pacientes;
	}

	public void setPacientes(Paciente pacientes) {
		this.pacientes = pacientes;
	}
	

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
