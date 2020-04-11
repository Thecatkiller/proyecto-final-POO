package model;

/**
 *
 * @author Diego Sebastian
 */
public enum Genero {   
    MASCULINO("Masculino"),
    FEMENINO("Femenino"),
    NO_BINARIO("No binario");
    
    private final String descripcion;
    
    Genero(String descripcion){
        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
}
