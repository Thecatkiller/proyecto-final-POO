package model;

import static complements.Constants.SEPARADOR_ARCHIVO_INTERNO;

/**
 *
 * @author Diego Sebastian
 */
public class Documento {

    private TipoDocumento tipo;
    private String codigo;

    public enum TipoDocumento {
        DNI("DNI"),
        PASAPORTE("Pasaporte"),
        CARNET_EXTRANJERIA("Carnet Extranjeria"),
        RUC("RUC"),
        PARTIDA_NACIMIENTO("Partida Nacimiento");

        private final String descripcion;

        private TipoDocumento(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return this.descripcion;
        }

        @Override
        public String toString() {
            return this.descripcion;
        }

    }

    public Documento(TipoDocumento tipo, String codigo) {
        this.tipo = tipo;
        this.codigo = codigo;
    }

    public TipoDocumento getTipo() {
        return tipo;
    }

    public void setTipo(TipoDocumento tipo) {
        this.tipo = tipo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return this.tipo.name() + SEPARADOR_ARCHIVO_INTERNO + this.codigo;
    }

}
