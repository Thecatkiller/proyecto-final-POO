/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components.combobox;

import java.awt.Color;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicComboBoxEditor;

/**
 *
 * @author Diego Sebastian
 */
public class ComboBoxItemEditor extends BasicComboBoxEditor {

    private final JPanel panel = new JPanel();
    private final JLabel labelItem = new JLabel();
    private String selectedValue;

    public ComboBoxItemEditor() {
        panel.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1.0;
        constraints.insets = new Insets(2, 5, 2, 2);

        labelItem.setOpaque(false);
        labelItem.setHorizontalAlignment(JLabel.LEFT);
        //labelItem.setForeground(Color.RED);

        panel.add(labelItem, constraints);
        //panel.setBackground(Color.BLUE);
    }

    @Override
    public Component getEditorComponent() {
        return this.panel;
    }

    @Override
    public Object getItem() {
        return this.selectedValue;
    }

    @Override
    public void setItem(Object item) {
        if (item == null) {
            return;
        }

        labelItem.setText(item.toString());
        //labelItem.setIcon(new ImageIcon(countryItem[1]));
    }
}
