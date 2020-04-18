/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import components.JInternalFrameCustom;

/**
 *
 * @author Diego Sebastian
 */
public abstract class MasterJInternalFrame extends JInternalFrameCustom {

    public abstract void onChildClosing();

}
