/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complements;

import java.text.SimpleDateFormat;

/**
 *
 * @author Diego Sebastian
 */
public final class Constants {

    public static final String STRING_EMPTY = "";
    private static final String PATH_ARCHIVOS = "src/resources/data/";
    public static final String PATH_RECURSOS = "\\src\\resources\\";
    public static final String SEPARADOR_ARCHIVO = "\\|";
    public static final String SEPARADOR_ARCHIVO_INTERNO = "|";
    public static final String FORMATO_FECHA_DD_MM_YYYY = "dd-MM-yyyy";

    public static final SimpleDateFormat DATE_FORMATE_DD_MM_YYYY = new SimpleDateFormat(FORMATO_FECHA_DD_MM_YYYY);

    private Constants() {

    }

    public enum Archivos {
        USUARIOS("user.txt", "model.User"),
        PRODUCTOS("productos.txt", "model.Producto"),
        CARGOS_COLABORADOR("cargo.txt", "model.CargoColaborador"),
        CATEROGORIA_PRODUCTOS("categoria_productos.txt", "model.CategoriaProducto"),
        COLABORADORES("colaboradores.txt", "model.Colaborador"),
        PROVEEDORES("proveedor.txt", "model.Proveedor"),
        MARCAS("marcas.txt", "model.Marca");

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
