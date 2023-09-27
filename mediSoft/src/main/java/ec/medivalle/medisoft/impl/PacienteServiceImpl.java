package ec.medivalle.medisoft.impl;

import ec.medivalle.medisoft.dao.Paciente;
import ec.medivalle.medisoft.dao.Persona;
import ec.medivalle.medisoft.repository.PacienteRepository;
import ec.medivalle.medisoft.repository.PersonaRepository;
import ec.medivalle.medisoft.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private  PacienteRepository pacienteRepository;
    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public Paciente nuevoPacinete(String nombre) {
        Persona savepersona = new Persona("D","171828686","Oscar Fernando","Pizarro Gordillo","098","098","av.Americas","aaaa@aaa",12,15,13);
        Paciente savepaciente = new Paciente(
                "D",crearUsuario(savepersona),"abcd123",savepersona

                /*paciente.getTipo(),
                paciente.getUsuario(),
                paciente.getContrasena (),
                paciente.getPersona()*/
        );
        try{
            personaRepository.save(savepersona);
            pacienteRepository.save(savepaciente);
            System.out.println("Paciente creado corectamente");
            return savepaciente;
        }catch (Exception e){
            return null;
        }

    }

    public String crearUsuario(Persona persona){
        String usuario = "";
        int contador = 0;
        String[] apellidos = persona.getApellido().split(" ");
        Boolean usuarioEncontrado = true;
        usuario = persona.getNombre().substring(0,1).toLowerCase() + apellidos[0].toLowerCase();
        System.out.println("//// NOMBRE USUARIO ES: " + usuario);
        while (usuarioEncontrado){
            if(pacienteRepository.findByUsuario(usuario).isEmpty()){
                usuarioEncontrado = false;
            }else{
                usuario = usuario+String.valueOf(contador).toLowerCase();
                System.out.println("// EL USUARIO YA ESTA USADO, EL NUEVO SERA: "+ usuario);
            }
        }
        return usuario;
    }

}
