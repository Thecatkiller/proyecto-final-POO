/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import components.combobox.ComboBoxItemEditor;
import components.combobox.ComboBoxItemRenderer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Diego Sebastian
 */
public class JComboBoxAddItemsField extends JComboBox {

    private final DefaultComboBoxModel model;

    public JComboBoxAddItemsField(Object[] list) {
        super();
        model = new DefaultComboBoxModel();
        addElements(list);
        setRenderer(new ComboBoxItemRenderer());
        setEditor(new ComboBoxItemEditor());
    }

    private void addElements(Object[] list) {
        for (Object list1 : list) {
            model.addElement(list1);
        }
        this.setModel(model);
    }

}
