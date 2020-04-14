/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import components.JInternalFrameCustom;
import java.awt.Dimension;
import java.util.HashMap;
import javax.swing.JInternalFrame;

/**
 *
 * @author Diego Sebastian
 */
public class frmProductos extends JInternalFrameCustom {

    private enum Formularios {
        PRODUCTOS
    }

    private static HashMap<Formularios, JInternalFrame> mapFormularios = new HashMap<>();

    /**
     * Creates new form frmProductos
     */
    public frmProductos() {
        initComponents();
        inicializar();
        irAProductos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jBtnProductos = new components.SquareButton();
        jButton2 = new components.SquareButton();
        jButton3 = new components.SquareButton();
        jButton4 = new components.SquareButton();
        jInternalFramePrincipal = new JInternalFrameCustom();

        jBtnProductos.setText("Productos");
        jBtnProductos.setFocusable(false);
        jBtnProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnProductos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnProductosActionPerformed(evt);
            }
        });

        jButton2.setText("Operaciones de Stock");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton3.setText("Proveedores");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jButton4.setText("Inventario");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jInternalFramePrincipal.setVisible(true);

        javax.swing.GroupLayout jInternalFramePrincipalLayout = new javax.swing.GroupLayout(jInternalFramePrincipal.getContentPane());
        jInternalFramePrincipal.getContentPane().setLayout(jInternalFramePrincipalLayout);
        jInternalFramePrincipalLayout.setHorizontalGroup(
            jInternalFramePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFramePrincipalLayout.setVerticalGroup(
            jInternalFramePrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jInternalFramePrincipal)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 475, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(jBtnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jInternalFramePrincipal)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jBtnProductos, jButton2, jButton3, jButton4});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnProductosActionPerformed
        irAProductos();
    }//GEN-LAST:event_jBtnProductosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnProductos;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JInternalFrame jInternalFramePrincipal;
    // End of variables declaration//GEN-END:variables

    public void irAProductos() {
        setFullSizeJInternalFrame(Formularios.PRODUCTOS);
    }

    private void inicializar() {
        frmProductosDetalle frmProductosDetalle = new frmProductosDetalle();
        //frmProductosDetalle.setLocation(-1, -24);
        jInternalFramePrincipal.add(frmProductosDetalle);

        mapFormularios.put(Formularios.PRODUCTOS, frmProductosDetalle);
    }

    private void setFullSizeJInternalFrame(Formularios formulario) {

        for (Formularios form : Formularios.values()) {
            mapFormularios.get(form).setVisible(false);
        }

        Dimension d = jInternalFramePrincipal.getSize();
        mapFormularios.get(formulario).setVisible(true);
        mapFormularios.get(formulario).setSize(d.width, d.height);
    }
}
