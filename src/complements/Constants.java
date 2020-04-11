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

    public static final String STRING_EMPTY = "";
    private static final String PATH_ARCHIVOS = "src/resources/data/";
    public static final String SEPARADOR_ARCHIVO = "\\|";

    private Constants() {

    }

    public enum Archivos {
        USUARIOS("user.txt", "model.User"),
        PRODUCTOS("productos.txt", "model.Product"),
        CARGOS_COLABORADOR("cargo.txt", "model.CargoColaborador");

        private final String path;
        private final String modelPackage;

        private Archivos(String path, String modelPackage) {
            this.modelPackage = modelPackage;
            this.path = path;
        }

        public String getPath() {
            return PATH_ARCHIVOS + this.path;
        }

        public String getModelPackage() {
            return this.modelPackage;
        }
    }

}
