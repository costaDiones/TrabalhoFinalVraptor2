package br.edu.unoesc.controler;

import unoesc.edu.DAO.MedicoDAO;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.edu.unoesc.model.Medico;
import br.edu.unoesc.model.Pessoa;

@Resource
public class MedicoController {

	private MedicoDAO daoMedico;
	private Medico medicoEditar;
	private Result result;

	public MedicoController(MedicoDAO daoMedico, Result result) {

		this.daoMedico = daoMedico;
		this.result = result;
	}

	@Post
	@Path("/medico/salvar")
	public void salvar(Medico medico) {

		daoMedico.save(medico);

		result.forwardTo(this).lista(null);
	}

	@Get
	@Path("/medico/formulario")
	public void formulario() {
		result.include("medico", medicoEditar);

	}

	@Get
	@Path("/medico/lista")
	public void lista(Medico medico) {

		if (medico != null) {

			String p = "%" + medico.getNome() + "%";
			result.include("listaDePessoas", daoMedico.findByNomeLike(p));
		} else {
			result.include("listaDePessoas", daoMedico.findAll());

		}

	}

	@Get
	@Path("/medico/excluir/{medico.codigo}")
	public void excluir(Medico medico) {
		daoMedico.delete(medico);
		result.forwardTo(this).lista(null);
	}

	@Get
	@Path("/medico/editar/{medico.codigo}")
	public void editar(Medico medico) {
		medicoEditar = daoMedico.findOne(medico.getCodigo());
		result.forwardTo(this).formulario();
	}

}
