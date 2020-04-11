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

}
