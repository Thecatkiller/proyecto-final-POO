package business;

import complements.Constants;
import complements.DataReader;
import exception.CategoriaNoExisteException;
import exception.MarcaProductoNoExiste;
import exception.ProductoNoExisteException;
import exception.ProductoYaExisteException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import model.CategoriaProducto;
import model.Estado;
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
        List<Producto> listado = DataReader.leerArchivoLista(Constants.Archivos.PRODUCTOS);

        return listado
                .stream()
                .filter(x -> !x.getEstadoProducto().equals(Estado.ELIMINADO))
                .collect(Collectors.toList());
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

    public void eliminarProductoById(String codigo) {
        Producto producto = this.getProductoByCodigo(codigo);
        if (producto == null) {
            throw new ProductoNoExisteException();
        } else {
            try {
                Producto productoModificado = producto.clone();
                productoModificado.setEstadoProducto(Estado.ELIMINADO);
                DataReader.reemplazar(Constants.Archivos.PRODUCTOS, producto, productoModificado);
                System.out.println("Aca eliminar " + producto);
            } catch (CloneNotSupportedException ex) {
                Logger.getLogger(ProductosController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
