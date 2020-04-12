package model;

import business.LectorDatos;
import business.ProductosController;
import static complements.Constants.SEPARADOR_ARCHIVO;
import static complements.Constants.SEPARADOR_ARCHIVO_INTERNO;

/**
 *
 * @author Diego Sebastian
 */
public class StockProducto implements LectorDatos {

    private static final ProductosController prdController = new ProductosController();

    private int cantidad;
    private Producto producto;

    @Override
    public String toString() {
        return this.cantidad + SEPARADOR_ARCHIVO_INTERNO + this.producto.getCodigo();
    }

    @Override
    public void leerObjeto(String linea) throws Exception {
        String[] datos = linea.split(SEPARADOR_ARCHIVO);
        this.cantidad = Integer.parseInt(datos[0]);
        this.producto = prdController.getProductoById(datos[1]);
    }

}
