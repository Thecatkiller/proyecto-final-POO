package business;

import complements.Constants;
import complements.DataReader;
import exception.UsuarioSeEncuentraBloqueadoException;
import exception.UsuarioYaExisteException;
import java.util.List;
import java.util.stream.Collectors;
import model.Colaborador;
import model.Estado;
import model.User;
import util.RandonInteger;

/**
 *
 * @author Diego Sebastian
 */
public class SecurityController {

    public void agregarUsuario(String usuario, String clave)
            throws UsuarioYaExisteException {

        if (this.getUserByUsername(usuario) != null) {
            throw new UsuarioYaExisteException();
        }

        List<Integer> listadoEnteros = this.listarUsuarios()
                .stream()
                .map(x -> x.getIdentificador()).collect(Collectors.toList());

        int userId = RandonInteger.getInt(listadoEnteros);

        User objUsuario = new User(userId, usuario, clave);
        DataReader.agregarRegistro(Constants.Archivos.USUARIOS, objUsuario);
    }

    public List<User> listarUsuarios() {
        return DataReader.leerArchivoLista(Constants.Archivos.USUARIOS);
    }

    public User login(String username, String password)
            throws UsuarioSeEncuentraBloqueadoException {
        List<User> usuarios = DataReader.leerArchivoLista(Constants.Archivos.USUARIOS);

        ColaboradorController cController = new ColaboradorController();

        User objUsuario = usuarios.stream()
                .filter((usuario) -> usuario.getUsuario().equals(username)
                && usuario.getClave().equals(password))
                .findFirst()
                .orElse(null);

        if (objUsuario != null) {
            Colaborador colaborador = cController.getColaboradorByUserId(objUsuario.getIdentificador());
            if (colaborador != null) {
                if (!colaborador.getEstado().equals(Estado.ACTIVO)) {
                    throw new UsuarioSeEncuentraBloqueadoException();
                }
            }
        }

        return objUsuario;
    }

    public User getUserById(int userId) {
        return this.listarUsuarios()
                .stream()
                .filter(x -> x.getIdentificador() == userId)
                .findFirst()
                .orElse(null);
    }

    public User getUserByUsername(String username) {
        return this.listarUsuarios()
                .stream()
                .filter(x -> x.getUsuario().equals(username))
                .findFirst()
                .orElse(null);
    }

}
