package ec.medivalle.medisoft.dao;

import jakarta.persistence.*;

@Entity
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_paciente;
    @Column
    private String tipo;
    @Column
    private String usuario;
    @Column
    private String contrasena;
    @OneToOne
    @JoinColumn(name = "id_persona_paciente")
    private Persona persona;

    public Paciente() {
    }

    public Paciente(String tipo, String usuario, String contrasena, Persona persona) {
        this.tipo = tipo;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.persona = persona;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
