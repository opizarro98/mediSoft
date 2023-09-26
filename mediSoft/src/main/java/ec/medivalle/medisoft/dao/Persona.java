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
    private int nombre;
    @Column(nullable = false)
    private int telefono;
    @Column(nullable = false)
    private int celular;
    @Column(nullable = false)
    private int direccion;
    @Column(nullable = false)
    private int correo;
    @Column(nullable = false)
    private int pais_nacimiento;
    @Column(nullable = false)
    private int provincia_nacimiento;
    @Column(nullable = false)
    private int ciudad_nacimiento;

    public Persona() {
    }

    public Persona(String cedula, int nombre, int telefono, int celular, int direccion, int correo, int pais_nacimiento, int provincia_nacimiento, int ciudad_nacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.celular = celular;
        this.direccion = direccion;
        this.correo = correo;
        this.pais_nacimiento = pais_nacimiento;
        this.provincia_nacimiento = provincia_nacimiento;
        this.ciudad_nacimiento = ciudad_nacimiento;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public int getCorreo() {
        return correo;
    }

    public void setCorreo(int correo) {
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
