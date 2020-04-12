package model;

import business.LectorDatos;
import static complements.Constants.SEPARADOR_ARCHIVO;
import static complements.Constants.SEPARADOR_ARCHIVO_INTERNO;

/**
 *
 * @author Diego Sebastian
 */
public class Producto implements LectorDatos {

    private String codigo;
    private String nombre;
    private double precio;

    public Producto() {
    }

    public Producto(String codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return this.codigo + SEPARADOR_ARCHIVO_INTERNO
                + this.nombre + SEPARADOR_ARCHIVO_INTERNO
                + this.precio;
    }

    @Override
    public void leerObjeto(String linea) throws Exception {
        String[] datos = linea.split(SEPARADOR_ARCHIVO);
        this.codigo = datos[0];
        this.nombre = datos[1];
        this.precio = Double.parseDouble(datos[2]);
    }

}
