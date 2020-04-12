package exception;

/**
 *
 * @author Diego Sebastian
 */
public class ProveedorYaExisteException extends RuntimeException {

    public ProveedorYaExisteException() {
        super("El proveedor ya existe !");
    }
}
