package model;

import business.LectorDatos;
import static business.LectorDatos.INDICE_LECTOR_SPLIT;
import static complements.Constants.SEPARADOR_ARCHIVO;
import static complements.Constants.SEPARADOR_ARCHIVO_INTERNO;

/**
 *
 * @author Diego Sebastian
 */
public class Marca implements LectorDatos {

    private int codigo;
    private String nombre;

    public Marca() {
    }

    public Marca(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return this.codigo + SEPARADOR_ARCHIVO_INTERNO
                + this.nombre;
    }

    @Override
    public void leerObjeto(String linea) throws Exception {
        String[] datos = linea.split(SEPARADOR_ARCHIVO, INDICE_LECTOR_SPLIT);
        this.codigo = Integer.parseInt(datos[0]);
        this.nombre = datos[1];
    }
}
