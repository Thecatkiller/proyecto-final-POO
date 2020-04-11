/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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

}
