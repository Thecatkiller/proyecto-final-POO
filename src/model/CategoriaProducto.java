package model;

import business.LectorDatos;
import static complements.Constants.SEPARADOR_ARCHIVO;
import static complements.Constants.SEPARADOR_ARCHIVO_INTERNO;

/**
 *
 * @author Diego Sebastian
 */
public class CategoriaProducto implements LectorDatos {

    private int codigo;
    private String nombre;
    private String descripcion;

    @Override
    public String toString() {
        return this.codigo + SEPARADOR_ARCHIVO_INTERNO
                + this.nombre + SEPARADOR_ARCHIVO_INTERNO
                + this.descripcion;
    }

    @Override
    public void leerObjeto(String linea) throws Exception {
        String[] datos = linea.split(SEPARADOR_ARCHIVO, INDICE_LECTOR_SPLIT);
        this.codigo = Integer.parseInt(datos[0]);
        this.nombre = datos[1];
        this.descripcion = datos[2];
    }

    public CategoriaProducto() {
    }

    public CategoriaProducto(int codigo, String nombre, String descripcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
