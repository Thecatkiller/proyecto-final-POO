/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import javax.swing.plaf.InternalFrameUI;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Diego Sebastian
 */
public class JInternalFrameCustom extends javax.swing.JInternalFrame {

    public JInternalFrameCustom() {
        super();
        super.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
    }

    @Override
    public void setUI(InternalFrameUI ui) {
        super.setUI(ui); // this gets called internally when updating the ui and makes the northPane reappear
        BasicInternalFrameUI frameUI = (BasicInternalFrameUI) getUI(); // so...
        if (frameUI != null) {
            frameUI.setNorthPane(null); // lets get rid of it
        }
    }
}
