package util;

import complements.Constants;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;

/**
 *
 * @author Diego Sebastian
 */
public class UIHelper {

    public static void cambiarEstadoControles(JPanel jPanelControles, boolean activo) {
        Component[] components = jPanelControles.getComponents();
        for (Component component : components) {
            if (component.getClass().equals(JLabel.class) == false) {
                component.setEnabled(activo);
            }
        }
    }

    public static void limpiarControles(JPanel jPanelControles) {
        Component[] components = jPanelControles.getComponents();
        for (Component component : components) {
            if (component.getClass().equals(JTextField.class)) {
                ((JTextField) component).setText("");
            } else if (component.getClass().equals(JComboBox.class)) {
                ((JComboBox) component).setSelectedIndex(-1);
            }
        }
    }

    /**
     * Retorna true en caso los datos ingresados en los campos de texto o
     * combobox sean válidos.
     *
     * @param jPanelControles contenedor donde se encuentran los controles
     * @return true en caso los campos sean validos
     */
    public static boolean validarCampos(JPanel jPanelControles) {
        Component[] components = jPanelControles.getComponents();
        for (Component component : components) {
            if (component.getClass().equals(JTextField.class)) {
                if (Constants.STRING_EMPTY.equals(((JTextField) component).getText().trim())) {
                    return false;
                }
            } else if (component.getClass().equals(JComboBox.class)) {
                if (((JComboBox) component).getSelectedIndex() == -1) {
                    return false;
                }
            }
        }
        return true;
    }

}
