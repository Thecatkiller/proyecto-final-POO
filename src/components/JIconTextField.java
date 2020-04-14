/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

/**
 *
 * @author Diego Sebastian
 */
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JTextField;

public class JIconTextField extends JTextField {

    private BufferedImage image;

    public JIconTextField(String iconPath) {
        super();
        try {
            image = ImageIO.read(getClass().getResource(iconPath));
        } catch (Exception ex) {
            image = null;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        if (image != null) {
            int centerPoint = (getHeight() - image.getHeight()) / 2;
            g.drawImage(image, 10, centerPoint, this);
        }

    }

}
