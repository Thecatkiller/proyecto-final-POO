package model;

/**
 *
 * @author Diego Sebastian
 */
public class CargoColaborador {
    
    private int identificador;
    private String nombreCargo;

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public CargoColaborador(int identificador, String nombreCargo) {
        this.identificador = identificador;
        this.nombreCargo = nombreCargo;
    }
    
    
}
