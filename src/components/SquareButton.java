package components;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

/**
 *
 * @author Diego Sebastian
 */
public class SquareButton extends JButton {

    private static final java.awt.Color COLOR_BTN_ACTIVO = Color.red;

    public SquareButton(String s) {
        super(s);
    }

    public SquareButton() {
        super();
        //super.setOpaque(false);
        //super.setFocusPainted(false);
        //super.setBorderPainted(false);
        //super.setContentAreaFilled(false);
        super.setBorder(new SolidBorder());
    }

    /*@Override
    public Dimension getPreferredSize() {
        Dimension d = super.getPreferredSize();
        int s = (int) (d.getWidth() < d.getHeight() ? d.getHeight() : d.getWidth());
        return new Dimension(s, s);
    }*/
}
