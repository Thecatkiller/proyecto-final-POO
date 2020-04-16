/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components.combobox;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Diego Sebastian
 */
public class ComboBoxItemRenderer extends JPanel implements ListCellRenderer {

    private final JLabel labelItem = new JLabel() {
        @Override
        public Dimension getPreferredSize() {
            return new Dimension(super.getWidth(), 30);
        }
    };

    public ComboBoxItemRenderer() {
        super.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weightx = 1.0;
        constraints.insets = new Insets(2, 8, 2, 2);

        //labelItem.setOpaque(true);
        labelItem.setHorizontalAlignment(JLabel.LEFT);
        labelItem.setFont(new java.awt.Font("Tahoma", 0, 12));
        super.add(labelItem, constraints);
        //super.setBackground(Color.red);
    }

    @Override
    public Component getListCellRendererComponent(
            JList list,
            Object value,
            int index,
            boolean isSelected,
            boolean cellHasFocus
    ) {

        // set country name
        labelItem.setText(value.toString());

        // set country flag
        //labelItem.setIcon(new ImageIcon(countryItem[1]));
        if (isSelected) {
            labelItem.setBackground(Color.BLUE);
            labelItem.setForeground(Color.BLUE);
        } else {
            labelItem.setBackground(Color.LIGHT_GRAY);
            labelItem.setForeground(Color.BLACK);

        }

        return this;
    }
}
