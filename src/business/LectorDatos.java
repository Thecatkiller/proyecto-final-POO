package business;

/**
 *
 * @author Diego Sebastian
 */
public interface LectorDatos {

    public static final String NOMBRE_METODO_LEER = "leerObjeto";
    public static final int INDICE_LECTOR_SPLIT = -1;

    void leerObjeto(String linea) throws Exception;
}
