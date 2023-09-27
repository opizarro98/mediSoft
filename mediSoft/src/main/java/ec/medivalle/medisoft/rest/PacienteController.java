package ec.medivalle.medisoft.rest;
import ec.medivalle.medisoft.dao.Paciente;
import ec.medivalle.medisoft.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/paciente")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;
    @CrossOrigin(origins = "http://localhost:8080")
    @RequestMapping(value = "/crearPaciente",
            method = RequestMethod.GET)
    @ResponseBody
    public String crearAlumniRest(@RequestBody String nombre) {
        try{
            Paciente p = new Paciente();
            pacienteService.nuevoPacinete(nombre);
            return "Se creo correctamente el paciente";
        }catch (Exception ex){
            return "Error al crear el paciente";
        }


    }
}
