package business;

import complements.Constants;
import static complements.Constants.DATE_FORMATE_DD_MM_YYYY;
import complements.DataReader;
import java.text.ParseException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CargoColaborador;
import model.Colaborador;
import model.Documento;
import model.Genero;

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

    public Colaborador getColaboradorByDocumento(String documento) {
        return this.getColaboradores()
                .stream()
                .filter(x -> x.getDocumentoIdentidad().getCodigo().equals(documento))
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
            CargoColaborador cargo) {

        Documento documento = new Documento(
                tipoDocumento,
                numeroDocumento
        );

        Colaborador colaborador = null;
        try {
            colaborador = new Colaborador(
                    documento,
                    nombres,
                    apellidoPaterno,
                    apellidoMaterno,
                    DATE_FORMATE_DD_MM_YYYY.parse(fechaNacimiento),
                    genero,
                    sueldo,
                    cargo
            );
        } catch (ParseException ex) {
            Logger.getLogger(ColaboradorController.class.getName()).log(Level.SEVERE, null, ex);
        }

        DataReader.agregarRegistro(Constants.Archivos.COLABORADORES, colaborador);

    }

}
