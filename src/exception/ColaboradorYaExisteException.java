/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception;

/**
 *
 * @author Diego Sebastian
 */
public class ColaboradorYaExisteException extends GeneralException {

    public ColaboradorYaExisteException() {
        super("El colaborador ya se encuentra registrado !");
    }
}
