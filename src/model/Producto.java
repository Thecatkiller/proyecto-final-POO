package model;

import business.LectorDatos;
import business.ProductosController;
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
    private String imagen;
    private String codigoBarras;
    private CategoriaProducto categoriaProducto;

    public Producto() {
    }

    public Producto(
            String codigo,
            String nombre,
            double precio,
            CategoriaProducto categoriaProducto,
            String imagen,
            String codigoBarras) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.categoriaProducto = categoriaProducto;
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

    public CategoriaProducto getCategoriaProducto() {
        return categoriaProducto;
    }

    public String getImagen() {
        return imagen;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    @Override
    public String toString() {
        return this.codigo + SEPARADOR_ARCHIVO_INTERNO
                + this.categoriaProducto.getCodigo() + SEPARADOR_ARCHIVO_INTERNO
                + this.nombre + SEPARADOR_ARCHIVO_INTERNO
                + this.precio + SEPARADOR_ARCHIVO_INTERNO
                + this.imagen + SEPARADOR_ARCHIVO_INTERNO
                + this.codigoBarras;
    }

    @Override
    public void leerObjeto(String linea) throws Exception {
        String[] datos = linea.split(SEPARADOR_ARCHIVO, INDICE_LECTOR_SPLIT);
        final ProductosController pController = new ProductosController();
        this.codigo = datos[0];
        this.categoriaProducto = pController.getCategoriaProductoById(Integer.parseInt(datos[1]));
        this.nombre = datos[2];
        this.precio = Double.parseDouble(datos[3]);
        this.imagen = datos[4];
        this.codigoBarras = datos[5];

    }

}
