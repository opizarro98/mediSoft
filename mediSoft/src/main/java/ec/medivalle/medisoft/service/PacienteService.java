package ec.medivalle.medisoft.service;

import ec.medivalle.medisoft.dao.Paciente;
import org.springframework.stereotype.Service;

@Service
public interface PacienteService {

    public Paciente nuevoPacinete(String nombre);

}
