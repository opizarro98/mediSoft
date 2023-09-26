package ec.medivalle.medisoft.dao;

import jakarta.persistence.*;

@Entity
@Table(name = "medicard")
public class Medicard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_medicard;
    @Column
    private String codigo;
    @Column
    private String llave_seguridad;
    @OneToOne
    @JoinColumn(name = "id_medicard_paciente")
    private Paciente paciente;

    public Medicard() {
    }

    public Medicard(String codigo, String llave_seguridad, Paciente paciente) {
        this.codigo = codigo;
        this.llave_seguridad = llave_seguridad;
        this.paciente = paciente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLlave_seguridad() {
        return llave_seguridad;
    }

    public void setLlave_seguridad(String llave_seguridad) {
        this.llave_seguridad = llave_seguridad;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
