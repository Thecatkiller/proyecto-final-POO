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
public class ProductoYaExisteException extends GeneralException {

    public ProductoYaExisteException() {
        super("El producto ya existe !");
    }
}
