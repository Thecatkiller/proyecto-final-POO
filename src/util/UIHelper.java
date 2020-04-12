package util;

import complements.Constants;
import java.awt.Component;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

/**
 *
 * @author Diego Sebastian
 */
public final class UIHelper {

    private UIHelper() {

    }

    public static void bindKeyToButton(JButton btn, Action action, String keyStroke) {
        action.putValue(Action.ACCELERATOR_KEY, KeyStroke.getKeyStroke(keyStroke));
        btn.setAction(action);
        btn.getActionMap().put(keyStroke, action);
        btn.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(
                (KeyStroke) action.getValue(Action.ACCELERATOR_KEY), keyStroke);
    }

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
