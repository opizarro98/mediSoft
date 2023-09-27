package ec.medivalle.medisoft.impl;

import com.sun.tools.jconsole.JConsoleContext;
import ec.medivalle.medisoft.dao.Paciente;
import ec.medivalle.medisoft.dao.Persona;
import ec.medivalle.medisoft.repository.PacienteRepository;
import ec.medivalle.medisoft.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Console;

public class PacienteImpl implements PacienteService {

    private PacienteRepository pacienteRepository;
    @Override
    public Paciente nuevoPacinete(String nombre) {
        Paciente savepaciente = new Paciente(
                "E","nuevo","abcd123",
                new Persona("E","1718218900","oscar","pizarro","098","098","av.Americas","aaaa@aaa",12,15,13)
                /*paciente.getTipo(),
                paciente.getUsuario(),
                paciente.getContrasena (),
                paciente.getPersona()*/
        );
        try{
            pacienteRepository.save(savepaciente);
            return savepaciente;
        }catch (Exception e){
            return null;
        }

    }

}
