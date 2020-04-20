package model;

import business.LectorDatos;
import static complements.Constants.SEPARADOR_ARCHIVO;
import java.util.Date;

import business.ColaboradorController;
import business.SecurityController;
import static complements.Constants.DATE_FORMATE_DD_MM_YYYY;
import static complements.Constants.SEPARADOR_ARCHIVO_INTERNO;

/**
 *
 * @author Diego Sebastian
 */
public class Colaborador extends Persona implements LectorDatos, Cloneable {

    private double sueldo;
    private CargoColaborador cargo;
    private User usuario;

    public Colaborador() {

    }

    public Colaborador(
            Documento documentoIdentidad,
            String nombres,
            String apellidoPaterno,
            String apellidoMaterno,
            Date fechaNacimiento,
            Genero genero,
            double sueldo,
            CargoColaborador cargo,
            User usuario) {

        super(documentoIdentidad,
                nombres,
                apellidoPaterno,
                apellidoMaterno,
                fechaNacimiento,
                genero);

        this.sueldo = sueldo;
        this.cargo = cargo;
        this.usuario = usuario;
    }

    public Colaborador(
            Documento documentoIdentidad,
            String nombres,
            String apellidoPaterno,
            String apellidoMaterno,
            Date fechaNacimiento,
            Genero genero,
            double sueldo,
            CargoColaborador cargo) {

        super(documentoIdentidad,
                nombres,
                apellidoPaterno,
                apellidoMaterno,
                fechaNacimiento,
                genero);

        this.sueldo = sueldo;
        this.cargo = cargo;
        this.usuario = null;
    }

    public double getSueldo() {
        return sueldo;
    }

    public CargoColaborador getCargo() {
        return cargo;
    }

    public User getUsuario() {
        return usuario;
    }

    public void setUsuario(User usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        int userId = -1;
        if (usuario != null) {
            userId = usuario.getIdentificador();
        }
        return nombres + SEPARADOR_ARCHIVO_INTERNO
                + apellidoPaterno + SEPARADOR_ARCHIVO_INTERNO
                + apellidoMaterno + SEPARADOR_ARCHIVO_INTERNO
                + String.valueOf(sueldo) + SEPARADOR_ARCHIVO_INTERNO
                + documentoIdentidad.getTipo().name() + SEPARADOR_ARCHIVO_INTERNO
                + documentoIdentidad.getCodigo() + SEPARADOR_ARCHIVO_INTERNO
                + genero.name() + SEPARADOR_ARCHIVO_INTERNO
                + DATE_FORMATE_DD_MM_YYYY.format(fechaNacimiento) + SEPARADOR_ARCHIVO_INTERNO
                + String.valueOf(cargo.getIdentificador()) + SEPARADOR_ARCHIVO_INTERNO
                + userId;
    }

    @Override
    public void leerObjeto(String linea) throws Exception {
        String[] datos = linea.split(SEPARADOR_ARCHIVO, INDICE_LECTOR_SPLIT);
        ColaboradorController cController = new ColaboradorController();
        SecurityController cSecurity = new SecurityController();
        this.nombres = datos[0];
        this.apellidoPaterno = datos[1];
        this.apellidoMaterno = datos[2];
        this.sueldo = Double.parseDouble(datos[3]);
        this.documentoIdentidad = new Documento(Documento.TipoDocumento.valueOf(datos[4]), datos[5]);
        this.genero = Genero.valueOf(datos[6]);
        this.fechaNacimiento = DATE_FORMATE_DD_MM_YYYY.parse(datos[7]);
        this.cargo = cController.getCargoColaboradorById(Integer.parseInt(datos[8]));
        int userId = Integer.parseInt(datos[9]);
        if (userId != -1) {
            this.usuario = cSecurity.getUserById(userId);
        }
    }

    @Override
    public Colaborador clone() throws CloneNotSupportedException {
        return (Colaborador) super.clone();
    }

}
