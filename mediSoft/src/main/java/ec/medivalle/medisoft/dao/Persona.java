package ec.medivalle.medisoft.dao;

import jakarta.persistence.*;

@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_persona;
    @Column(nullable = false)
    private String tipo_persona;
    @Column(nullable = false)
    private String cedula;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @Column(nullable = false)
    private String telefono;
    @Column(nullable = false)
    private String celular;
    @Column(nullable = false)
    private String direccion;
    @Column(nullable = false)
    private String correo;
    @Column(nullable = false)
    private int pais_nacimiento;
    @Column(nullable = false)
    private int provincia_nacimiento;
    @Column(nullable = false)
    private int ciudad_nacimiento;

    public Persona() {
    }

    public Persona(String tipo_persona, String cedula, String nombre, String apellido, String telefono, String celular, String direccion, String correo, int pais_nacimiento, int provincia_nacimiento, int ciudad_nacimiento) {
        this.tipo_persona = tipo_persona;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.correo = correo;
        this.pais_nacimiento = pais_nacimiento;
        this.provincia_nacimiento = provincia_nacimiento;
        this.ciudad_nacimiento = ciudad_nacimiento;
    }

    public String getTipo_persona() {
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona) {
        this.tipo_persona = tipo_persona;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getPais_nacimiento() {
        return pais_nacimiento;
    }

    public void setPais_nacimiento(int pais_nacimiento) {
        this.pais_nacimiento = pais_nacimiento;
    }

    public int getProvincia_nacimiento() {
        return provincia_nacimiento;
    }

    public void setProvincia_nacimiento(int provincia_nacimiento) {
        this.provincia_nacimiento = provincia_nacimiento;
    }

    public int getCiudad_nacimiento() {
        return ciudad_nacimiento;
    }

    public void setCiudad_nacimiento(int ciudad_nacimiento) {
        this.ciudad_nacimiento = ciudad_nacimiento;
    }
}
