package business;

import complements.Constants;
import complements.DataReader;
import exception.CategoriaNoExisteException;
import exception.MarcaProductoNoExiste;
import exception.ProductoYaExisteException;
import java.util.List;
import model.CategoriaProducto;
import model.Marca;
import model.Producto;
import util.RandomStringUUID;

/**
 *
 * @author Diego Sebastian
 */
public class ProductosController {

    public List<CategoriaProducto> listarCategoriasProducto() {
        return DataReader.leerArchivoLista(Constants.Archivos.CATEROGORIA_PRODUCTOS);
    }

    public List<Marca> listarMarcas() {
        return DataReader.leerArchivoLista(Constants.Archivos.MARCAS);
    }

    public List<Producto> listarProductos() {
        return DataReader.leerArchivoLista(Constants.Archivos.PRODUCTOS);
    }

    public Marca getMarcaByCodigo(int codigo) {
        return this.listarMarcas()
                .stream()
                .filter(x -> x.getCodigo() == codigo)
                .findFirst()
                .orElse(null);
    }

    public CategoriaProducto getCategoriaProductoById(int id) {
        return this.listarCategoriasProducto()
                .stream()
                .filter(x -> x.getCodigo() == id)
                .findFirst()
                .orElse(null);
    }

    public Producto getProductoByCodigo(String codigo) {
        return this.listarProductos()
                .stream()
                .filter(x -> x.getCodigo().equals(codigo))
                .findFirst()
                .orElse(null);
    }

    public void agregarProducto(
            boolean autoGenerateCode,
            String codigo,
            String nombre,
            double precioVenta,
            double precioCosto,
            boolean cambiarPrecio,
            String imagen,
            String codigoBarras,
            int idCategoriaProducto,
            int idMarcaProducto)
            throws ProductoYaExisteException, CategoriaNoExisteException {

        CategoriaProducto categoria = this.getCategoriaProductoById(idCategoriaProducto);
        Marca marca = this.getMarcaByCodigo(idMarcaProducto);
        if (categoria == null) {
            throw new CategoriaNoExisteException();
        } else if (marca == null) {
            throw new MarcaProductoNoExiste();
        }

        if (autoGenerateCode) {
            codigo = RandomStringUUID.getUUID16();
        }

        if (this.getProductoByCodigo(codigo) != null) {
            throw new ProductoYaExisteException();
        }

        Producto producto = new Producto(
                codigo,
                nombre,
                precioVenta,
                precioCosto,
                cambiarPrecio,
                categoria,
                imagen,
                codigoBarras,
                marca
        );

        DataReader.agregarRegistro(Constants.Archivos.PRODUCTOS, producto);
    }

}
