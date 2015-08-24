package br.edu.unoesc.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@NamedQueries({
	
	@NamedQuery(name = Medico.BUSCA_MEDICOS, query = "from Medico"),

})


@Entity
public class Medico  {

private static final long serialVersionUID = -8573212437479754339L;


	
	public static final String  BUSCA_MEDICOS = "BUSCA_MEDICOS";
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codigo;
	
	@Column(nullable = false)
	private String nome;
	private String endereco;
	private String crm;
	
	
	
	
	
	public Medico() {
		super();
	}





	public Medico(String nome, String endereco, String crm) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.crm = crm;
	}





	public Long getCodigo() {
		return codigo;
	}





	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}





	public String getNome() {
		return nome;
	}





	public void setNome(String nome) {
		this.nome = nome;
	}





	public String getEndereco() {
		return endereco;
	}





	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}





	public String getCrm() {
		return crm;
	}





	public void setCrm(String crm) {
		this.crm = crm;
	}
	


}
