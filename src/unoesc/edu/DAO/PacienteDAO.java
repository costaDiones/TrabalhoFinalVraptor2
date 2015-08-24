package unoesc.edu.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoesc.model.Medico;
import br.edu.unoesc.model.Paciente;

public interface PacienteDAO extends JpaRepository <Paciente, Long> {

	
	
	List<Paciente> findByNomeLike(String nome);
}
