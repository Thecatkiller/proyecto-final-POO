package business;

import complements.Constants;
import static complements.Constants.STRING_EMPTY;
import complements.DataReader;
import exception.ProveedorYaExisteException;
import java.util.List;
import model.Documento;
import model.Proveedor;
import util.RandomStringUUID;

/**
 *
 * @author Diego Sebastian
 */
public class ProveedorController {

    public List<Proveedor> listarProveedores() {
        return DataReader.leerArchivoLista(Constants.Archivos.PROVEEDORES);
    }

    public Proveedor getProveedorById(String id) {
        return this.listarProveedores()
                .stream()
                .filter(x -> x.getCodigo().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Proveedor getProveedorByDocumento(
            Documento.TipoDocumento tipoDocumento,
            String numeroDocumento) {
        return this.listarProveedores()
                .stream()
                .filter(x -> x.getDocumento().getTipo().equals(tipoDocumento)
                && x.getDocumento().getCodigo().equals(numeroDocumento))
                .findFirst()
                .orElse(null);
    }

    public String registrarProveedor(
            String nombre,
            String razonSocial,
            String domicilio,
            String telefono,
            String celular,
            String sitioWeb,
            String email,
            Documento.TipoDocumento tipoDocumento,
            String numeroDocumento) throws ProveedorYaExisteException {

        String idProveedor = STRING_EMPTY;

        Proveedor proveedor = getProveedorByDocumento(
                tipoDocumento,
                numeroDocumento.trim()
        );

        if (proveedor != null) {
            throw new ProveedorYaExisteException();
        } else {
            idProveedor = RandomStringUUID.getUUID16();
            proveedor = new Proveedor(
                    idProveedor,
                    nombre,
                    razonSocial,
                    domicilio,
                    telefono,
                    celular,
                    sitioWeb,
                    email,
                    new Documento(tipoDocumento, numeroDocumento)
            );

            DataReader.agregarRegistro(Constants.Archivos.PROVEEDORES, proveedor);
        }
        return idProveedor;
    }

}
