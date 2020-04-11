package model;

import java.util.Date;

/**
 *
 * @author Diego Sebastian
 */
public abstract class Persona {

    protected Documento documentoIdentidad;
    protected String nombres;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected Date fechaNacimiento;
    protected Genero genero;

    public Persona() {

    }

    public Persona(Documento documentoIdentidad,
            String nombres,
            String apellidoPaterno,
            String apellidoMaterno,
            Date fechaNacimiento,
            Genero genero) {
        this.documentoIdentidad = documentoIdentidad;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

    public Documento getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Genero getGenero() {
        return genero;
    }
    

}
