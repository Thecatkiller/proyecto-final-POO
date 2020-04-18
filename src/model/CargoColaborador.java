package model;

import business.LectorDatos;
import static complements.Constants.SEPARADOR_ARCHIVO;

/**
 *
 * @author Diego Sebastian
 */
public class CargoColaborador implements LectorDatos {

    public CargoColaborador() {

    }

    private int identificador;
    private String nombreCargo;

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public CargoColaborador(int identificador, String nombreCargo) {
        this.identificador = identificador;
        this.nombreCargo = nombreCargo;
    }

    @Override
    public String toString() {
        return nombreCargo;
    }

    @Override
    public void leerObjeto(String linea) {
        String[] datos = linea.split(SEPARADOR_ARCHIVO, INDICE_LECTOR_SPLIT);
        this.identificador = Integer.parseInt(datos[0]);
        this.nombreCargo = datos[1];
    }

}
