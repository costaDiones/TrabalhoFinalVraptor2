package unoesc.edu.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoesc.model.Medico;
import br.edu.unoesc.model.Pessoa;

public interface MedicoDAO extends JpaRepository<Medico, Long> {
	
	
	
	List<Medico> findByNomeLike(String nome);

}
