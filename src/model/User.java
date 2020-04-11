/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import business.LectorDatos;
import static complements.Constants.SEPARADOR_ARCHIVO;

/**
 *
 * @author Diego Sebastian
 */
public class User implements LectorDatos {

    private int identificador;
    private String usuario;
    private String clave;

    public User() {

    }

    public User(int identificador, String usuario, String clave) {
        this.identificador = identificador;
        this.usuario = usuario;
        this.clave = clave;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    @Override
    public void leerObjeto(String linea) {
        String[] datos = linea.split(SEPARADOR_ARCHIVO);
        this.identificador = Integer.parseInt(datos[0]);
        this.usuario = datos[1];
        this.clave = datos[2];
    }

}
