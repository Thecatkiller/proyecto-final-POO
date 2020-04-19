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
    private double precioVenta;
    private double precioCosto;
    private String imagen;
    private String codigoBarras;
    private CategoriaProducto categoriaProducto;
    private Marca marcaProducto;
    private boolean cambiarPrecio;
    private Estado estadoProducto;

    public Producto() {
    }

    public Producto(
            String codigo,
            String nombre,
            double precioVenta,
            double precioCosto,
            boolean cambiarPrecio,
            CategoriaProducto categoriaProducto,
            String imagen,
            String codigoBarras,
            Marca marcaProducto,
            Estado estadoProducto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.precioCosto = precioCosto;
        this.cambiarPrecio = cambiarPrecio;
        this.categoriaProducto = categoriaProducto;
        this.imagen = imagen;
        this.codigoBarras = codigoBarras;
        this.marcaProducto = marcaProducto;
        this.estadoProducto = estadoProducto;
    }

    public Producto(String codigo,
            String nombre,
            double precioVenta,
            double precioCosto,
            boolean cambiarPrecio,
            CategoriaProducto categoriaProducto,
            String imagen,
            String codigoBarras,
            Marca marcaProducto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.precioCosto = precioCosto;
        this.cambiarPrecio = cambiarPrecio;
        this.categoriaProducto = categoriaProducto;
        this.imagen = imagen;
        this.codigoBarras = codigoBarras;
        this.marcaProducto = marcaProducto;
        this.estadoProducto = Estado.ACTIVO;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
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

    public Marca getMarcaProducto() {
        return marcaProducto;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public double getPrecioCosto() {
        return precioCosto;
    }

    public boolean isCambiarPrecio() {
        return cambiarPrecio;
    }

    public Estado getEstadoProducto() {
        return estadoProducto;
    }

    @Override
    public String toString() {
        return this.codigo + SEPARADOR_ARCHIVO_INTERNO
                + this.categoriaProducto.getCodigo() + SEPARADOR_ARCHIVO_INTERNO
                + this.nombre + SEPARADOR_ARCHIVO_INTERNO
                + this.precioVenta + SEPARADOR_ARCHIVO_INTERNO
                + this.precioCosto + SEPARADOR_ARCHIVO_INTERNO
                + this.cambiarPrecio + SEPARADOR_ARCHIVO_INTERNO
                + this.imagen + SEPARADOR_ARCHIVO_INTERNO
                + this.codigoBarras + SEPARADOR_ARCHIVO_INTERNO
                + this.getMarcaProducto().getCodigo() + SEPARADOR_ARCHIVO_INTERNO
                + this.getEstadoProducto().name();
    }

    @Override
    public void leerObjeto(String linea) throws Exception {
        String[] datos = linea.split(SEPARADOR_ARCHIVO, INDICE_LECTOR_SPLIT);
        final ProductosController pController = new ProductosController();
        this.codigo = datos[0];
        this.categoriaProducto = pController.getCategoriaProductoById(Integer.parseInt(datos[1]));
        this.nombre = datos[2];
        this.precioVenta = Double.parseDouble(datos[3]);
        this.precioCosto = Double.parseDouble(datos[4]);
        this.cambiarPrecio = Boolean.valueOf(datos[5]);
        this.imagen = datos[6];
        this.codigoBarras = datos[7];
        this.marcaProducto = pController.getMarcaByCodigo(Integer.parseInt(datos[8]));
        this.estadoProducto = Estado.valueOf(datos[9]);
    }

}
