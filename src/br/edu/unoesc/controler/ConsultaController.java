package br.edu.unoesc.controler;

import org.jboss.logging.annotations.Pos;

import unoesc.edu.DAO.ConsultaDAO;
import unoesc.edu.DAO.MedicamentoDAO;
import unoesc.edu.DAO.MedicoDAO;
import unoesc.edu.DAO.PacienteDAO;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.edu.unoesc.model.Consulta;
import br.edu.unoesc.model.Medicamento;

@Resource
public class ConsultaController {

	private ConsultaDAO daoConsulta;
	private MedicoDAO medicoDao;
	private PacienteDAO pacienteDao;
	private MedicamentoDAO medicamentoDao;
	private Result result;

	
	
	
	
	public ConsultaController(ConsultaDAO daoConsulta, MedicoDAO medicoDao,
			PacienteDAO pacienteDao, MedicamentoDAO medicamentoDao,
			Result result) {
		this.daoConsulta = daoConsulta;
		this.medicoDao = medicoDao;
		this.pacienteDao = pacienteDao;
		this.medicamentoDao = medicamentoDao;
		this.result = result;
	}


	@Post
	@Path("/consulta/salvar")
	public void salvar(Consulta consulta) {

		daoConsulta.save(consulta);
	}
	
	
	@Get
	@Path("/consulta/formulario")
	public void formulario() {
		
		result.include("listaDePacientes", pacienteDao.findAll());
		result.include("listaDeMedico", medicoDao.findAll());
		result.include("listaDeMedicamento", medicamentoDao.findAll());

	}
	
	

}
