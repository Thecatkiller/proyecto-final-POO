package business;

import complements.Constants;
import complements.DataReader;
import java.util.List;
import model.Producto;

/**
 *
 * @author Diego Sebastian
 */
public class ProductosController {

    public List<Producto> listarProductos() {
        return DataReader.leerArchivoLista(Constants.Archivos.PRODUCTOS);
    }

    public void agregarProducto(String codigo, String nombre, double precio) {
        Producto producto = new Producto(codigo, nombre, precio);
        DataReader.agregarRegistro(Constants.Archivos.PRODUCTOS, producto);
    }

}
