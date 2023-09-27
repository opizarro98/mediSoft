package ec.medivalle.medisoft.repository;

import ec.medivalle.medisoft.dao.Paciente;
import ec.medivalle.medisoft.rest.PacienteController;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
    List<Paciente> findByUsuario(String Usuario);
}
