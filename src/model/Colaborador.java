package model;

import java.util.Date;

/**
 *
 * @author Diego Sebastian
 */
public class Colaborador extends Persona {

    private final double sueldo;
    private final CargoColaborador cargo;

    public Colaborador(
            Documento documentoIdentidad,
            String nombres,
            String apellidoPaterno,
            String apellidoMaterno,
            Date fechaNacimiento,
            Genero genero,
            double sueldo,
            CargoColaborador cargo) {

        super(documentoIdentidad,
                nombres,
                apellidoPaterno,
                apellidoMaterno,
                fechaNacimiento,
                genero);
        
        this.sueldo = sueldo;
        this.cargo = cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public CargoColaborador getCargo() {
        return cargo;
    }

}
