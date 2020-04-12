package business;

import complements.Constants;
import complements.DataReader;
import java.util.List;
import model.CategoriaProducto;
import model.Producto;

/**
 *
 * @author Diego Sebastian
 */
public class ProductosController {

    public List<CategoriaProducto> listarCategoriasProducto() {
        return DataReader.leerArchivoLista(Constants.Archivos.CATEROGORIA_PRODUCTOS);
    }

    public CategoriaProducto getCategoriaProductoById(int id) {
        return this.listarCategoriasProducto()
                .stream()
                .filter(x -> x.getCodigo() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Producto> listarProductos() {
        return DataReader.leerArchivoLista(Constants.Archivos.PRODUCTOS);
    }

    public void agregarProducto(
            String codigo,
            String nombre,
            double precio,
            int idCategoriaProducto) {

        Producto producto = new Producto(
                codigo,
                nombre,
                precio,
                this.getCategoriaProductoById(idCategoriaProducto)
        );

        DataReader.agregarRegistro(Constants.Archivos.PRODUCTOS, producto);
    }

}
