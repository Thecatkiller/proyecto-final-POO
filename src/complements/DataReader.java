package complements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Diego Sebastian
 */
public final class DataReader {

    private DataReader() {

    }

    /**
     * Sets a field value on a given object
     *
     * @param targetObject the object to set the field value on
     * @param fieldName exact name of the field
     * @param fieldValue value to set on the field
     * @return true if the value was successfully set, false otherwise
     */
    private static boolean setField(Object targetObject, String fieldName, Object fieldValue) {
        Field field;
        try {
            field = targetObject.getClass().getDeclaredField(fieldName);
        } catch (NoSuchFieldException e) {
            field = null;
        }
        Class superClass = targetObject.getClass().getSuperclass();
        while (field == null && superClass != null) {
            try {
                field = superClass.getDeclaredField(fieldName);
            } catch (NoSuchFieldException e) {
                superClass = superClass.getSuperclass();
            }
        }
        if (field == null) {
            return false;
        }
        field.setAccessible(true);
        try {
            Class<?> clazz = field.getType();

            if (Long.class.equals(clazz) || long.class.equals(clazz)) {
                field.set(targetObject, Long.parseLong(fieldValue.toString()));
            } else if (Integer.class.equals(clazz) || int.class.equals(clazz)) {
                field.set(targetObject, Integer.parseInt(fieldValue.toString()));
            } else {
                field.set(targetObject, fieldValue);
            }

            return true;
        } catch (IllegalAccessException e) {
            return false;
        }
    }

    public static <T> List<T> leerArchivoLista(Constants.Archivos archivo) {
        final File archivoLeer = new File(archivo.getPath());
        List<T> lista = null;
        try {
            final FileReader lector = new FileReader(archivoLeer);
            final BufferedReader buffer = new BufferedReader(lector);

            String linea = buffer.readLine();

            String[] cabecera = linea.split(Constants.SEPARADOR_ARCHIVO);
            lista = new ArrayList<>();

            while ((linea = buffer.readLine()) != null) {
                String[] partes = linea.split(Constants.SEPARADOR_ARCHIVO);

                T obj = (T) Class.forName("model.User").newInstance();

                for (int i = 0; i < cabecera.length; i++) {
                    setField(obj, cabecera[i], partes[i]);
                }

                lista.add(obj);
            }

        } catch (Exception ex) {
            lista = null;
        }
        return lista;
    }

}
