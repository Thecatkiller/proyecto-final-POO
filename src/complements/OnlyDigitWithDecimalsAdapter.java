/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complements;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Diego Sebastian
 */
public class OnlyDigitWithDecimalsAdapter extends KeyAdapter {

    private final int maxDecimalLength;

    public OnlyDigitWithDecimalsAdapter() {
        super();
        this.maxDecimalLength = 2;
    }

    public OnlyDigitWithDecimalsAdapter(int maxDecimalLength) {
        super();
        this.maxDecimalLength = maxDecimalLength;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        JTextField jTxt = ((JTextField) e.getSource());
        if (c == '.') {
            long contadorPunto
                    = jTxt.getText()
                            .chars()
                            .filter(ch -> ch == '.').count();
            if (contadorPunto > 0) {
                e.consume();
            }
        } else if (!((c >= '0') && (c <= '9')
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE))) {
            e.consume();
        } else {
            long contadorPunto
                    = jTxt.getText()
                            .chars()
                            .filter(ch -> ch == '.').count();
            if (contadorPunto > 0) {
                boolean longitudExcedida = (jTxt.
                        getText()
                        .split("\\.", -1)[1]).length() == maxDecimalLength;

                if (longitudExcedida) {
                    e.consume();
                }
            }
        }
    }
}
