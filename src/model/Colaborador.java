package model;

import business.LectorDatos;
import static complements.Constants.FORMATO_FECHA_DD_MM_YYYY;
import static complements.Constants.SEPARADOR_ARCHIVO;
import java.text.SimpleDateFormat;
import java.util.Date;

import business.ColaboradorController;
import static complements.Constants.DATE_FORMATE_DD_MM_YYYY;
import static complements.Constants.SEPARADOR_ARCHIVO_INTERNO;

/**
 *
 * @author Diego Sebastian
 */
public class Colaborador extends Persona implements LectorDatos {

    private double sueldo;
    private CargoColaborador cargo;

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
            CargoColaborador cargo) {

        super(documentoIdentidad,
                nombres,
                apellidoPaterno,
                apellidoMaterno,
                fechaNacimiento,
                genero);

        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public CargoColaborador getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return nombres + SEPARADOR_ARCHIVO_INTERNO
                + apellidoPaterno + SEPARADOR_ARCHIVO_INTERNO
                + apellidoMaterno + SEPARADOR_ARCHIVO_INTERNO
                + String.valueOf(sueldo) + SEPARADOR_ARCHIVO_INTERNO
                + documentoIdentidad.getTipo().name() + SEPARADOR_ARCHIVO_INTERNO
                + documentoIdentidad.getCodigo() + SEPARADOR_ARCHIVO_INTERNO
                + genero.name() + SEPARADOR_ARCHIVO_INTERNO
                + DATE_FORMATE_DD_MM_YYYY.format(fechaNacimiento) + SEPARADOR_ARCHIVO_INTERNO
                + String.valueOf(cargo.getIdentificador());
    }

    @Override
    public void leerObjeto(String linea) throws Exception {
        String[] datos = linea.split(SEPARADOR_ARCHIVO);
        ColaboradorController cController = new ColaboradorController();

        this.nombres = datos[0];
        this.apellidoPaterno = datos[1];
        this.apellidoMaterno = datos[2];
        this.sueldo = Double.parseDouble(datos[3]);
        this.documentoIdentidad = new Documento(Documento.TipoDocumento.valueOf(datos[4]), datos[5]);
        this.genero = Genero.valueOf(datos[6]);
        this.fechaNacimiento = DATE_FORMATE_DD_MM_YYYY.parse(datos[7]);
        this.cargo = cController.getCargoColaboradorById(Integer.parseInt(datos[8]));

    }

}
