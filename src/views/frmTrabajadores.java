/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import business.ColaboradorController;
import static complements.Constants.DATE_FORMATE_DD_MM_YYYY;
import complements.TextPlaceholder;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import model.Colaborador;
import model.User;

/**
 *
 * @author Diego Sebastian
 */
public class frmTrabajadores extends MasterJInternalFrame {

    private static final ColaboradorController cController = new ColaboradorController();

    /**
     * Creates new form frmTrabajadores
     */
    public frmTrabajadores() {
        initComponents();
        inicializar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBtnAgregar = new javax.swing.JButton();
        jBtnEditar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnConfiguracion = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jBtnImprimir = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jTxtBusquedaTrabajador = new components.JIconTextField("/resources/lupa_32.png");
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblTrabajadores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        jBtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/mas_32.png"))); // NOI18N
        jBtnAgregar.setText("Nuevo");
        jBtnAgregar.setContentAreaFilled(false);
        jBtnAgregar.setPreferredSize(new java.awt.Dimension(65, 65));
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });

        jBtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/resumen_32.png"))); // NOI18N
        jBtnEditar.setText("Editar");
        jBtnEditar.setContentAreaFilled(false);

        jBtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/prohibido_32.png"))); // NOI18N
        jBtnEliminar.setText("Dar de baja");
        jBtnEliminar.setContentAreaFilled(false);
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        jBtnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/configuraciones_32.png"))); // NOI18N
        jBtnConfiguracion.setContentAreaFilled(false);
        jBtnConfiguracion.setPreferredSize(new java.awt.Dimension(65, 65));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jBtnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/impresion_32.png"))); // NOI18N
        jBtnImprimir.setContentAreaFilled(false);
        jBtnImprimir.setPreferredSize(new java.awt.Dimension(65, 65));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jBtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jBtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jBtnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 320, Short.MAX_VALUE)
                .addComponent(jBtnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator1)
                                .addComponent(jBtnConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                .addComponent(jBtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(jSeparator2))
                            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))))
                .addGap(8, 8, 8))
        );

        jTxtBusquedaTrabajador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtBusquedaTrabajador.setForeground(new java.awt.Color(102, 102, 255));
        jTxtBusquedaTrabajador.setMargin(new java.awt.Insets(2, 40, 2, 2));

        jTblTrabajadores.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTblTrabajadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombres", "Apellido Paterno", "Apellido Materno", "Fecha Nacimiento", "Sexo", "Tipo Documento", "Documento", "Sueldo", "Cargo", "Estado", "Usuario", "Clave"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblTrabajadores.setRowHeight(25);
        jScrollPane1.setViewportView(jTblTrabajadores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtBusquedaTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxtBusquedaTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        agregarTrabajabador();
    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed

    }//GEN-LAST:event_jBtnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnConfiguracion;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnImprimir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTblTrabajadores;
    private javax.swing.JTextField jTxtBusquedaTrabajador;
    // End of variables declaration//GEN-END:variables

    private void agregarTrabajabador() {
        frmRegistroTrabajadores frmRegistroTrabajadores = new frmRegistroTrabajadores(this);
        frmRegistroTrabajadores.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    @Override
    public void onChildClosing() {
        mostrarRegistrosTabla();
    }

    private void mostrarRegistrosTabla(List<Colaborador> colaboradores) {
        DefaultTableModel model = (DefaultTableModel) jTblTrabajadores.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        colaboradores.forEach(x -> {
            User user = x.getUsuario();
            String usuario = "";
            String clave = "";
            if (user != null) {
                usuario = user.getUsuario();
                clave = user.getClave();
            }

            model.addRow(
                    new Object[]{
                        x.getNombres(),
                        x.getApellidoPaterno(),
                        x.getApellidoMaterno(),
                        x.getGenero().getDescripcion(),
                        DATE_FORMATE_DD_MM_YYYY.format(x.getFechaNacimiento()),
                        x.getDocumentoIdentidad().getTipo(),
                        x.getDocumentoIdentidad().getCodigo(),
                        x.getSueldo(),
                        x.getCargo().getNombreCargo(),
                        x.getEstado().toString(),
                        usuario,
                        clave
                    });
        });
    }

    private void mostrarRegistrosTabla() {
        mostrarRegistrosTabla(cController.getColaboradores());
    }

    private void inicializar() {
        new TextPlaceholder(" Encontrar trabajador por documento o nombres ", jTxtBusquedaTrabajador);
        mostrarRegistrosTabla();

        jTxtBusquedaTrabajador.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void changedUpdate(DocumentEvent e) {
                cambioTexto(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                cambioTexto(e);
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                cambioTexto(e);
            }

            public void cambioTexto(DocumentEvent e) {
                String texto = jTxtBusquedaTrabajador.getText().toLowerCase();

                if (!texto.isEmpty()) {
                    mostrarRegistrosTabla(
                            cController.getColaboradores()
                                    .stream()
                                    .filter(
                                            x -> x.getNombres()
                                                    .toLowerCase()
                                                    .contains(texto)
                                            || x.getDocumentoIdentidad()
                                                    .getCodigo()
                                                    .toLowerCase()
                                                    .contains(texto)
                                    ).collect(Collectors.toList())
                    );
                } else {
                    mostrarRegistrosTabla();
                }
            }
        }
        );
    }

}
