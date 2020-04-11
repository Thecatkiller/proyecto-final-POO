/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complements;

/**
 *
 * @author Diego Sebastian
 */
public final class Constants {

    private static final String PATH_ARCHIVOS = "src/resources/data/";
    public static final String SEPARADOR_ARCHIVO = "\\|";

    private Constants() {

    }

    public enum Archivos {
        USUARIOS("user.txt"),
        PRODUCTOS("productos.txt");

        private final String path;

        private Archivos(String path) {
            this.path = path;
        }

        public String getPath() {
            return PATH_ARCHIVOS + this.path;
        }

    }

}
