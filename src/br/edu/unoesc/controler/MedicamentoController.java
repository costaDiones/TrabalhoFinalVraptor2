package br.edu.unoesc.controler;

import org.jboss.logging.annotations.Pos;

import unoesc.edu.DAO.MedicamentoDAO;
import unoesc.edu.DAO.MedicoDAO;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.edu.unoesc.model.Medicamento;
import br.edu.unoesc.model.Medico;



@Resource
public class MedicamentoController {
	
	private MedicamentoDAO daoMedicamento;
	private Medicamento medicamentoEditar;
	private Result result;
	
	
	
	
	
	public MedicamentoController(MedicamentoDAO daoMedicamento, Result result) {
		super();
		this.daoMedicamento = daoMedicamento;
		this.result = result;
	}
	
	
	
	
	@Post
	@Path("/medicamento/salvar")
	public void salvar(Medicamento medicamento) {
		daoMedicamento.save(medicamento);
	}
	
	
	@Get
	@Path("/medicamento/formulario")
	public void formulario() {

	}
	
	

}
