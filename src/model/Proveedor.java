package model;

import business.LectorDatos;
import static complements.Constants.SEPARADOR_ARCHIVO;
import static complements.Constants.SEPARADOR_ARCHIVO_INTERNO;

/**
 *
 * @author Diego Sebastian
 */
public class Proveedor implements LectorDatos {

    private String codigo;
    private String nombre;
    private String razonSocial;
    private String domicilio;
    private String telefono;
    private String celular;
    private String sitioWeb;
    private String email;
    private Documento documento;

    public Proveedor() {
    }

    public Proveedor(
            String codigo,
            String nombre,
            String razonSocial,
            String domicilio,
            String telefono,
            String celular,
            String sitioWeb,
            String email,
            Documento documento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.celular = celular;
        this.sitioWeb = sitioWeb;
        this.email = email;
        this.documento = documento;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCelular() {
        return celular;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public String getEmail() {
        return email;
    }

    public Documento getDocumento() {
        return documento;
    }

    @Override
    public String toString() {
        return this.codigo + SEPARADOR_ARCHIVO_INTERNO
                + this.nombre + SEPARADOR_ARCHIVO_INTERNO
                + this.razonSocial + SEPARADOR_ARCHIVO_INTERNO
                + this.domicilio + SEPARADOR_ARCHIVO_INTERNO
                + this.telefono + SEPARADOR_ARCHIVO_INTERNO
                + this.celular + SEPARADOR_ARCHIVO_INTERNO
                + this.sitioWeb + SEPARADOR_ARCHIVO_INTERNO
                + this.email + SEPARADOR_ARCHIVO_INTERNO
                + this.documento;
    }

    @Override
    public void leerObjeto(String linea) throws Exception {
        String[] datos = linea.split(SEPARADOR_ARCHIVO);
        this.codigo = datos[0];
        this.nombre = datos[1];
        this.razonSocial = datos[2];
        this.domicilio = datos[3];
        this.telefono = datos[4];
        this.celular = datos[5];
        this.sitioWeb = datos[6];
        this.email = datos[7];
        this.documento = new Documento(Documento.TipoDocumento.valueOf(datos[8]), datos[9]);
    }

}
