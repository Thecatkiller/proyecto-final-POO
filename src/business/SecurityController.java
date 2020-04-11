package business;

import complements.Constants;
import complements.DataReader;
import java.util.List;
import model.User;

/**
 *
 * @author Diego Sebastian
 */
public class SecurityController {

    public User login(String username, String password) {

        List<User> usuarios = DataReader.leerArchivoLista(Constants.Archivos.USUARIOS);

        return new User(1, null, null);
    }

}
