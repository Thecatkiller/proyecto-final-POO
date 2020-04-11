package business;

/**
 *
 * @author Diego Sebastian
 */
public interface LectorDatos {

    public static final String NOMBRE_METODO_LEER = "leerObjeto";

    void leerObjeto(String linea) throws Exception;
}
