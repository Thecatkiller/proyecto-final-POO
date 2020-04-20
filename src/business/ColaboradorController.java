package business;

import complements.Constants;
import static complements.Constants.DATE_FORMATE_DD_MM_YYYY;
import static complements.Constants.FORMATO_FECHA_DD_MM_YYYY;
import complements.DataReader;
import exception.ColaboradorYaExisteException;
import exception.FechaInvalidaException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CargoColaborador;
import model.Colaborador;
import model.Documento;
import model.Genero;
import model.User;

/**
 *
 * @author Diego Sebastian
 */
public class ColaboradorController {

    public List<CargoColaborador> getCargosColaborador() {
        return DataReader.leerArchivoLista(Constants.Archivos.CARGOS_COLABORADOR);
    }

    public CargoColaborador getCargoColaboradorById(int id) {
        return getCargosColaborador()
                .stream()
                .filter(x -> x.getIdentificador() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Colaborador> getColaboradores() {
        return DataReader.leerArchivoLista(Constants.Archivos.COLABORADORES);
    }

    public Colaborador getColaboradorByDocumento(Documento documento) {
        return this.getColaboradores()
                .stream()
                .filter(x -> x.getDocumentoIdentidad().equals(documento))
                .findFirst()
                .orElse(null);
    }

    public Colaborador getColaboradorByUserId(int userId) {
        return this.getColaboradores()
                .stream()
                .filter(x -> {
                    User usuario = x.getUsuario();
                    if (usuario != null && usuario.getIdentificador() == userId) {
                        return true;
                    }
                    return false;
                })
                .findFirst()
                .orElse(null);
    }

    public void agregarColaborador(
            String nombres,
            String apellidoPaterno,
            String apellidoMaterno,
            Documento.TipoDocumento tipoDocumento,
            String numeroDocumento,
            String fechaNacimiento,
            Genero genero,
            double sueldo,
            CargoColaborador cargo,
            boolean agregarUsuario) throws FechaInvalidaException,
            ColaboradorYaExisteException {

        Documento documento = new Documento(
                tipoDocumento,
                numeroDocumento
        );

        Colaborador colaborador = this.getColaboradorByDocumento(documento);
        Date fechaNac = null;

        if (colaborador != null) {
            throw new ColaboradorYaExisteException();
        }

        try {
            fechaNac = DATE_FORMATE_DD_MM_YYYY.parse(fechaNacimiento);
        } catch (ParseException ex) {
            throw new FechaInvalidaException(FORMATO_FECHA_DD_MM_YYYY);
        }

        colaborador = new Colaborador(
                documento,
                nombres,
                apellidoPaterno,
                apellidoMaterno,
                fechaNac,
                genero,
                sueldo,
                cargo
        );

        DataReader.agregarRegistro(Constants.Archivos.COLABORADORES, colaborador);

        if (agregarUsuario) {
            colaborador = this.getColaboradorByDocumento(documento);
            if (colaborador != null) {
                SecurityController sController = new SecurityController();
                String usuario = nombres.substring(0, 3).toLowerCase()
                        + apellidoPaterno.toLowerCase().substring(0, 3);
                sController.agregarUsuario(usuario, usuario);
                Colaborador colaboradorModificado = null;
                try {
                    colaboradorModificado = colaborador.clone();
                    colaboradorModificado.setUsuario(sController.getUserByUsername(usuario));
                } catch (CloneNotSupportedException ex) {
                }
                DataReader.reemplazar(Constants.Archivos.COLABORADORES, colaborador, colaboradorModificado);
            }
        }

    }

}
