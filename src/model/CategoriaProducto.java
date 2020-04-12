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

    @Override
    public String toString() {
        return this.codigo + SEPARADOR_ARCHIVO_INTERNO
                + this.nombre;
    }

    @Override
    public void leerObjeto(String linea) throws Exception {
        String[] datos = linea.split(SEPARADOR_ARCHIVO);
        this.codigo = Integer.parseInt(datos[0]);
        this.nombre = datos[1];
    }

    public CategoriaProducto() {
    }

    public CategoriaProducto(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

}
