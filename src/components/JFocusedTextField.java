/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author Diego Sebastian
 */
public class JFocusedTextField extends JTextField {

    private final Color focusBackgroundColor;
    private final Color focusLetterColor;
    private final Color nonFocusColor;
    private final Color nonFocusLetterColor;

    public JFocusedTextField() {
        super();
        this.nonFocusColor = this.focusBackgroundColor = super.getBackground();
        this.nonFocusLetterColor = this.focusLetterColor = super.getForeground();

        createFocusEvent();
    }

    public JFocusedTextField(Color focusBackgroundColor, Color focusLetterColor) {
        super();
        this.focusBackgroundColor = focusBackgroundColor;
        this.focusLetterColor = focusLetterColor;
        this.nonFocusColor = super.getBackground();
        this.nonFocusLetterColor = super.getForeground();
        createFocusEvent();
    }

    private void createFocusEvent() {
        java.awt.event.FocusListener myFocusListener = new java.awt.event.FocusListener() {
            @Override
            public void focusGained(java.awt.event.FocusEvent focusEvent) {
                JTextField src = (JTextField) focusEvent.getSource();
                src.setBackground(focusBackgroundColor);
                src.setForeground(focusLetterColor);
            }

            @Override
            public void focusLost(java.awt.event.FocusEvent focusEvent) {
                JTextField src = (JTextField) focusEvent.getSource();
                src.setBackground(nonFocusColor);

                String text = src.getText();
                src.setText("");
                src.setForeground(nonFocusLetterColor);
                src.setText(text);

            }
        };
        this.addFocusListener(myFocusListener);
    }

}
