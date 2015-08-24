package br.edu.unoesc.controler;

import unoesc.edu.DAO.PacienteDAO;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.edu.unoesc.model.Medico;
import br.edu.unoesc.model.Paciente;

@Resource
public class PacienteController {

	private PacienteDAO daoPaciente;
	private Result result;

	public PacienteController(PacienteDAO daoPaciente, Result result) {
		this.daoPaciente = daoPaciente;
		this.result = result;
	}
	
	@Post
	@Path("/paciente/salvar")
	public void salvar(Paciente paciente){
		daoPaciente.save(paciente);
	}
	
	@Get
	@Path("/paciente/formulario")
	public void formulario(){
		
	}
	
	
	
	

}
