/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import business.ColaboradorController;
import components.JFocusedTextField;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.showMessageDialog;
import model.CargoColaborador;
import model.Documento;
import model.Genero;
import util.JTextFieldLimit;
import util.UIHelper;

/**
 *
 * @author Diego Sebastian
 */
public class frmRegistroTrabajadores extends javax.swing.JFrame {

    private static final ColaboradorController colaboradorController = new ColaboradorController();
    private final MasterJInternalFrame parent;

    /**
     * Creates new form frmRegistroTrabajadores
     *
     * @param parent
     */
    public frmRegistroTrabajadores(MasterJInternalFrame parent) {
        initComponents();
        super.setExtendedState(JFrame.MAXIMIZED_BOTH);
        inicializar();
        this.parent = parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelControles = new javax.swing.JPanel();
        jCmbCargo = new javax.swing.JComboBox<>();
        jCmbTipoDocumento = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTxtNombres = new JFocusedTextField(java.awt.Color.yellow,java.awt.Color.blue);
        jCmbSexo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jTxtApellidoPaterno = new JFocusedTextField(java.awt.Color.yellow,java.awt.Color.blue);
        jLabel11 = new javax.swing.JLabel();
        jTxtApellidoMaterno = new JFocusedTextField(java.awt.Color.yellow,java.awt.Color.blue);
        jTxtFechaNacimiento = new JFocusedTextField(java.awt.Color.yellow,java.awt.Color.blue);
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTxtDocumento = new JFocusedTextField(java.awt.Color.yellow,java.awt.Color.blue);
        jLabel15 = new javax.swing.JLabel();
        jTxtSueldo = new JFocusedTextField(java.awt.Color.yellow,java.awt.Color.blue);
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jBtnGuardar = new javax.swing.JButton();
        jLblCancelar = new javax.swing.JLabel();

        setTitle("Registro de Trabajadores");

        jCmbCargo.setMinimumSize(new java.awt.Dimension(28, 35));
        jCmbCargo.setPreferredSize(new java.awt.Dimension(28, 35));

        jCmbTipoDocumento.setMinimumSize(new java.awt.Dimension(28, 35));
        jCmbTipoDocumento.setPreferredSize(new java.awt.Dimension(28, 35));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Nombres");

        jTxtNombres.setMargin(new java.awt.Insets(2, 5, 2, 2));
        jTxtNombres.setMinimumSize(new java.awt.Dimension(9, 35));
        jTxtNombres.setPreferredSize(new java.awt.Dimension(6, 35));

        jCmbSexo.setMinimumSize(new java.awt.Dimension(28, 35));
        jCmbSexo.setPreferredSize(new java.awt.Dimension(28, 35));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel10.setText("Apellido Paterno");

        jTxtApellidoPaterno.setMargin(new java.awt.Insets(2, 5, 2, 2));
        jTxtApellidoPaterno.setMinimumSize(new java.awt.Dimension(9, 35));
        jTxtApellidoPaterno.setPreferredSize(new java.awt.Dimension(6, 35));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel11.setText("Apellido Materno");

        jTxtApellidoMaterno.setMargin(new java.awt.Insets(2, 5, 2, 2));
        jTxtApellidoMaterno.setMinimumSize(new java.awt.Dimension(9, 35));
        jTxtApellidoMaterno.setPreferredSize(new java.awt.Dimension(6, 35));

        jTxtFechaNacimiento.setMargin(new java.awt.Insets(2, 5, 2, 2));
        jTxtFechaNacimiento.setMinimumSize(new java.awt.Dimension(9, 35));
        jTxtFechaNacimiento.setPreferredSize(new java.awt.Dimension(6, 35));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("Fecha nacimiento");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel13.setText("Tipo documento");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel14.setText("Sexo");

        jTxtDocumento.setMargin(new java.awt.Insets(2, 5, 2, 2));
        jTxtDocumento.setMinimumSize(new java.awt.Dimension(9, 35));
        jTxtDocumento.setPreferredSize(new java.awt.Dimension(6, 35));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel15.setText("Documento");

        jTxtSueldo.setMargin(new java.awt.Insets(2, 5, 2, 2));
        jTxtSueldo.setMinimumSize(new java.awt.Dimension(9, 35));
        jTxtSueldo.setPreferredSize(new java.awt.Dimension(6, 35));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel16.setText("Sueldo");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel17.setText("Cargo");

        javax.swing.GroupLayout jPanelControlesLayout = new javax.swing.GroupLayout(jPanelControles);
        jPanelControles.setLayout(jPanelControlesLayout);
        jPanelControlesLayout.setHorizontalGroup(
            jPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelControlesLayout.createSequentialGroup()
                .addGroup(jPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelControlesLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelControlesLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTxtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTxtFechaNacimiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jCmbTipoDocumento, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCmbSexo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(25, 25, 25))
            .addGroup(jPanelControlesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelControlesLayout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jTxtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelControlesLayout.createSequentialGroup()
                        .addGroup(jPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelControlesLayout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)))
                        .addGroup(jPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTxtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanelControlesLayout.setVerticalGroup(
            jPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelControlesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCmbTipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelControlesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jBtnGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnGuardar.setText("<html>Guardar (F2)</html>");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        jLblCancelar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLblCancelar.setText("<html><u>Cancelar</u></html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanelControles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jBtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLblCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLblCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanelControles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed

    }//GEN-LAST:event_jBtnGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JComboBox<model.CargoColaborador> jCmbCargo;
    private javax.swing.JComboBox<model.Genero> jCmbSexo;
    private javax.swing.JComboBox<model.Documento.TipoDocumento> jCmbTipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLblCancelar;
    private javax.swing.JPanel jPanelControles;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTxtApellidoMaterno;
    private javax.swing.JTextField jTxtApellidoPaterno;
    private javax.swing.JTextField jTxtDocumento;
    private javax.swing.JTextField jTxtFechaNacimiento;
    private javax.swing.JTextField jTxtNombres;
    private javax.swing.JTextField jTxtSueldo;
    // End of variables declaration//GEN-END:variables

    private void inicializar() {
        colaboradorController.getCargosColaborador().forEach(x -> {
            jCmbCargo.addItem(x);
        });

        for (Documento.TipoDocumento doc : Documento.TipoDocumento.values()) {
            jCmbTipoDocumento.addItem(doc);
        }

        for (Genero genero : Genero.values()) {
            jCmbSexo.addItem(genero);
        }

        // Con esto se define una longitud maxima para los campos
        jTxtNombres.setDocument(new JTextFieldLimit(45));
        jTxtApellidoMaterno.setDocument(new JTextFieldLimit(45));
        jTxtApellidoPaterno.setDocument(new JTextFieldLimit(45));
        jTxtDocumento.setDocument(new JTextFieldLimit(12));
        jTxtSueldo.setDocument(new JTextFieldLimit(15));

        Action actionF2 = new AbstractAction(
                "<html>Guardar (F2)</html>") {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardar();
            }
        };

        UIHelper.bindKeyToButton(jBtnGuardar, actionF2, "F2");

    }

    private void nuevo() {
        UIHelper.limpiarControles(jPanelControles);
        UIHelper.cambiarEstadoControles(jPanelControles, true);
        jTxtNombres.requestFocus();
    }

    private void guardar() {
        boolean camposValidos = UIHelper.validarCampos(jPanelControles);

        if (!camposValidos) {
            showMessageDialog(this, "Ingrese todos los datos");
        } else {
            colaboradorController.agregarColaborador(
                    jTxtNombres.getText(),
                    jTxtApellidoPaterno.getText(),
                    jTxtApellidoMaterno.getText(),
                    (Documento.TipoDocumento) jCmbTipoDocumento.getSelectedItem(),
                    jTxtDocumento.getText(),
                    jTxtFechaNacimiento.getText(),
                    (Genero) jCmbSexo.getSelectedItem(),
                    Double.parseDouble(jTxtSueldo.getText()),
                    (CargoColaborador) jCmbCargo.getSelectedItem());

            nuevo();

            parent.onChildClosing();
            this.dispose();
        }
    }

}
