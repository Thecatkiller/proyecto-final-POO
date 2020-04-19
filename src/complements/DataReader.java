package complements;

import static business.LectorDatos.NOMBRE_METODO_LEER;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
            } else if (Double.class.equals(clazz) || double.class.equals(clazz)) {
                field.set(targetObject, Double.parseDouble(fieldValue.toString()));
            } else {
                field.set(targetObject, fieldValue);
            }

            return true;
        } catch (IllegalAccessException e) {
            return false;
        }
    }

    public static <Tipo> List<Tipo> leerArchivoLista(Constants.Archivos archivo) {
        final File archivoLeer = new File(archivo.getPath());
        List<Tipo> lista;
        try {
            final FileReader lector = new FileReader(archivoLeer);
            final BufferedReader buffer = new BufferedReader(lector);

            lista = new ArrayList<>();
            String linea;
            while ((linea = buffer.readLine()) != null) {
                Tipo obj = (Tipo) Class.forName(archivo.getModelPackage()).newInstance();
                Method method = obj.getClass().getMethod(NOMBRE_METODO_LEER, String.class);
                method.invoke(obj, linea);
                lista.add(obj);
            }

        } catch (Exception ex) {
            lista = null;
        }
        return lista;
    }

    public static void reemplazar(
            Constants.Archivos archivo,
            Object objInicial,
            Object objFinal
    ) {
        try {
            Path path = Paths.get(archivo.getPath());
            try (Stream<String> lines = Files.lines(path)) {
                String datoInicial = objInicial.toString();
                String datoFinal = objFinal.toString();

                System.out.println("Inicial : " + datoInicial);
                System.out.println("Final   : " + datoFinal);

                List<String> replaced = lines
                        .map(line -> {
                            if (((String) line).equals(datoInicial)) {
                                System.out.println("Coincide : " + line);
                                return datoFinal;
                            }
                            return line;
                        })
                        .collect(Collectors.toList());

                System.out.println();
                System.out.println("Listado : " + replaced);

                try (BufferedWriter writer = new BufferedWriter(
                        new FileWriter(archivo.getPath(), false)
                )) {
                    int contador = 0;
                    for (String line : replaced) {
                        if (contador == replaced.size() - 1) {
                            writer.write(line);
                        } else {
                            writer.write(line + System.lineSeparator());
                        }

                        contador++;
                    }
                }
            }
        } catch (IOException e) {

        }
    }

    public static void agregarRegistro(Constants.Archivos archivo, Object data) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo.getPath()));
            int lines = 0;
            if (reader.readLine() != null) {
                lines++;
            }
            reader.close();

            BufferedWriter writer = new BufferedWriter(
                    new FileWriter(archivo.getPath(), true) //Set true for append mode
            );
            if (lines > 0) {
                writer.newLine();   //Add new line
            }
            writer.write(data.toString());
            writer.close();
        } catch (Exception ex) {

        }
    }

    public static String getUsersProjectRootDirectory() {
        String envRootDir = System.getProperty("user.dir");
        Path rootDir = Paths.get(".").normalize().toAbsolutePath();
        if (rootDir.startsWith(envRootDir)) {
            return rootDir.toString();
        } else {
            throw new RuntimeException("Root dir not found in user directory.");
        }
    }

    public static void copyFile(File sourceFile, File destFile)
            throws IOException {
        if (!sourceFile.exists()) {
            return;
        }
        if (!destFile.exists()) {
            destFile.createNewFile();
        }
        FileChannel source = null;
        FileChannel destination = null;
        source = new FileInputStream(sourceFile).getChannel();
        destination = new FileOutputStream(destFile).getChannel();
        if (destination != null && source != null) {
            destination.transferFrom(source, 0, source.size());
        }
        if (source != null) {
            source.close();
        }
        if (destination != null) {
            destination.close();
        }

    }

}
