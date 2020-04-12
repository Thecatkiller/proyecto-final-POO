/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import util.UIHelper;

/**
 *
 * @author Diego Sebastian
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
        bindKeys();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnRegistroTrabajadores = new javax.swing.JButton();
        jbtnRegistroProductos = new javax.swing.JButton();
        jbtnIngresoStock = new javax.swing.JButton();
        jbtnPuntoVenta = new javax.swing.JButton();
        jbtnRegistroProveedores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbtnRegistroTrabajadores.setText("<html><p>Registro Trabajadores</p><p style=\"text-align: center;\"> ( F1 ) </p></html>");
        jbtnRegistroTrabajadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistroTrabajadoresActionPerformed(evt);
            }
        });

        jbtnRegistroProductos.setText("<html><p>Registro Productos</p><p style=\"text-align: center;\"> ( F2 ) </p></html>");
        jbtnRegistroProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistroProductosActionPerformed(evt);
            }
        });

        jbtnIngresoStock.setText("<html><p>Ingreso Stock</p><p style=\"text-align: center;\"> ( F3 ) </p></html>");
        jbtnIngresoStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnIngresoStockActionPerformed(evt);
            }
        });

        jbtnPuntoVenta.setText("<html><p>Punto de venta</p><p style=\"text-align: center;\"> ( F4 ) </p></html>");
        jbtnPuntoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPuntoVentaActionPerformed(evt);
            }
        });

        jbtnRegistroProveedores.setText("<html><p>Registro Proveedores</p><p style=\"text-align: center;\"> ( F5 ) </p></html>");
        jbtnRegistroProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistroProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnRegistroTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnRegistroProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnRegistroProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnIngresoStock, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPuntoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnRegistroTrabajadores, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRegistroProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jbtnRegistroProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jbtnIngresoStock, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jbtnPuntoVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnRegistroTrabajadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistroTrabajadoresActionPerformed

    }//GEN-LAST:event_jbtnRegistroTrabajadoresActionPerformed

    private void jbtnRegistroProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistroProductosActionPerformed

    }//GEN-LAST:event_jbtnRegistroProductosActionPerformed

    private void jbtnIngresoStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnIngresoStockActionPerformed

    }//GEN-LAST:event_jbtnIngresoStockActionPerformed

    private void jbtnPuntoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPuntoVentaActionPerformed

    }//GEN-LAST:event_jbtnPuntoVentaActionPerformed

    private void jbtnRegistroProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistroProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnRegistroProveedoresActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnIngresoStock;
    private javax.swing.JButton jbtnPuntoVenta;
    private javax.swing.JButton jbtnRegistroProductos;
    private javax.swing.JButton jbtnRegistroProveedores;
    private javax.swing.JButton jbtnRegistroTrabajadores;
    // End of variables declaration//GEN-END:variables

    private void registroTrabajadores() {
        frmRegistroTrabajadores frm = new frmRegistroTrabajadores();
        frm.setVisible(true);
    }

    private void registroProductos() {
        frmRegistroProductos frm = new frmRegistroProductos();
        frm.setVisible(true);
    }

    private void ingresoStock() {
        frmIngresoStock frm = new frmIngresoStock();
        frm.setVisible(true);
    }

    private void puntoVenta() {
        frmPuntoVenta frm = new frmPuntoVenta();
        frm.setVisible(true);
    }

    private void registroProveedor() {
        frmRegistroProveedor frm = new frmRegistroProveedor();
        frm.setVisible(true);
    }

    private void bindKeys() {
        Action actionF1 = new AbstractAction("<html><p>Registro Trabajadores</p><p style=\"text-align: center;\"> ( F1 ) </p></html>") {
            @Override
            public void actionPerformed(ActionEvent e) {
                registroTrabajadores();
            }
        };
        Action actionF2 = new AbstractAction("<html><p>Registro Productos</p><p style=\"text-align: center;\"> ( F2 ) </p></html>") {
            @Override
            public void actionPerformed(ActionEvent e) {
                registroProductos();
            }
        };
        Action actionF3 = new AbstractAction("<html><p>Ingreso Stock</p><p style=\"text-align: center;\"> ( F3 ) </p></html>") {
            @Override
            public void actionPerformed(ActionEvent e) {
                ingresoStock();
            }
        };
        Action actionF4 = new AbstractAction("<html><p>Punto de venta</p><p style=\"text-align: center;\"> ( F4 ) </p></html>") {
            @Override
            public void actionPerformed(ActionEvent e) {
                puntoVenta();
            }
        };
        Action actionF5 = new AbstractAction("<html><p>Registro Proveedores</p><p style=\"text-align: center;\"> ( F5 ) </p></html>") {
            @Override
            public void actionPerformed(ActionEvent e) {
                registroProveedor();
            }
        };

        UIHelper.bindKeyToButton(jbtnRegistroTrabajadores, actionF1, "F1");
        UIHelper.bindKeyToButton(jbtnRegistroProductos, actionF2, "F2");
        UIHelper.bindKeyToButton(jbtnIngresoStock, actionF3, "F3");
        UIHelper.bindKeyToButton(jbtnPuntoVenta, actionF4, "F4");
        UIHelper.bindKeyToButton(jbtnRegistroProveedores, actionF5, "F5");
    }

}
