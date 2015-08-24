package br.edu.unoesc.model;

import javax.persistence.Entity;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;



@NamedQueries({
	
	@NamedQuery(name = Paciente.BUSCA_PACIENTES, query = "from Paciente"),

})

@Entity
public class Paciente extends Pessoa {

	
	public static final String  BUSCA_PACIENTES = "BUSCA_PACIENTES";
	
	
	private static final long serialVersionUID = -1334485861522563986L;
	

	private String cpf;

	public Paciente() {
		super();
	}

	public Paciente(String nome, String endereco, String cpf) {
		super(nome, endereco);
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
