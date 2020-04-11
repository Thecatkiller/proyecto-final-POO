package business;

import complements.Constants;
import complements.DataReader;
import java.util.List;
import model.CargoColaborador;

/**
 *
 * @author Diego Sebastian
 */
public class ColaboradorController {

    public List<CargoColaborador> getCargosColaborador() {
        return DataReader.leerArchivoLista(Constants.Archivos.CARGOS_COLABORADOR);
    }

    public Long agregarColaborador(
            String nombres,
            String apellidoPaterno,
            String apellidoMaterno,
            String tipoDocumento,
            String numeroDocumento,
            String fechaNacimiento) {
        return -1l;
    }

}
