package unoesc.edu.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.unoesc.model.Medicamento;

public interface MedicamentoDAO extends JpaRepository <Medicamento, Long> {

}
