/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import business.ProductosController;
import static complements.Constants.DATE_FORMATE_DD_MM_YYYY;
import complements.TextPlaceholder;
import components.JIconTextField;
import components.JInternalFrameCustom;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import static javax.swing.JOptionPane.YES_OPTION;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import model.Producto;

/**
 *
 * @author Diego Sebastian
 */
public class frmProductosDetalle extends MasterJInternalFrame {

    private static final ProductosController prdController = new ProductosController();

    /**
     * Creates new form frmBusquedaProductosStock
     */
    public frmProductosDetalle() {
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

        jTxtBusquedaProducto = new components.JIconTextField("/resources/lupa_32.png");
        jPanel1 = new javax.swing.JPanel();
        jBtnAgregar = new javax.swing.JButton();
        jBtnEditar = new javax.swing.JButton();
        jBtnEliminar = new javax.swing.JButton();
        jBtnEtiqueta = new javax.swing.JButton();
        jBtnConfiguracion = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jChoiceTipoBusqueda = new java.awt.Choice();
        jSeparator4 = new javax.swing.JSeparator();
        jBtnImprimir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTblProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTxtBusquedaProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTxtBusquedaProducto.setForeground(new java.awt.Color(102, 102, 255));
        jTxtBusquedaProducto.setMargin(new java.awt.Insets(2, 40, 2, 2));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));

        jBtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/mas_32.png"))); // NOI18N
        jBtnAgregar.setPreferredSize(new java.awt.Dimension(65, 65));
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });

        jBtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/resumen_32.png"))); // NOI18N

        jBtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/basura_32.png"))); // NOI18N
        jBtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnEliminarActionPerformed(evt);
            }
        });

        jBtnEtiqueta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/venta.png"))); // NOI18N
        jBtnEtiqueta.setText("Etiqueta");
        jBtnEtiqueta.setPreferredSize(new java.awt.Dimension(65, 65));

        jBtnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/configuraciones_32.png"))); // NOI18N
        jBtnConfiguracion.setPreferredSize(new java.awt.Dimension(65, 65));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jChoiceTipoBusqueda.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jChoiceTipoBusqueda.setForeground(new java.awt.Color(102, 102, 255));
        jChoiceTipoBusqueda.setName(""); // NOI18N

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jBtnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/impresion_32.png"))); // NOI18N
        jBtnImprimir.setPreferredSize(new java.awt.Dimension(65, 65));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jBtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jBtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jBtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jBtnEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jChoiceTipoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jBtnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jBtnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(jBtnConfiguracion, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                            .addComponent(jBtnEtiqueta, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jBtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jSeparator3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator4))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jChoiceTipoBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );

        jTblProductos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jTblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Descripción", "Código", "Stock Actual", "Stock reservado", "Stock disponible", "Precio", "Categoría", "Unidad", "Principal proveedor", "Código ref.", "Marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTblProductos.setRowHeight(25);
        jScrollPane1.setViewportView(jTblProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtBusquedaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTxtBusquedaProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        agregarNuevoProducto();
    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jBtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnEliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_jBtnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnConfiguracion;
    private javax.swing.JButton jBtnEditar;
    private javax.swing.JButton jBtnEliminar;
    private javax.swing.JButton jBtnEtiqueta;
    private javax.swing.JButton jBtnImprimir;
    private java.awt.Choice jChoiceTipoBusqueda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTblProductos;
    private javax.swing.JTextField jTxtBusquedaProducto;
    // End of variables declaration//GEN-END:variables

    private void setContentAreaFilledToButtons() {
        jBtnConfiguracion.setContentAreaFilled(false);
        jBtnAgregar.setContentAreaFilled(false);
        jBtnEditar.setContentAreaFilled(false);
        jBtnEliminar.setContentAreaFilled(false);
        jBtnEtiqueta.setContentAreaFilled(false);
        jBtnImprimir.setContentAreaFilled(false);
    }

    private void mostrarRegistrosTabla() {
        DefaultTableModel model = (DefaultTableModel) jTblProductos.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();

        prdController.listarProductos().forEach(x -> {
            model.addRow(
                    new Object[]{
                        x.getNombre(),
                        x.getCodigo(),
                        0,
                        0,
                        0,
                        x.getPrecioVenta(),
                        x.getCategoriaProducto().getNombre(),
                        0,
                        "",
                        "",
                        x.getMarcaProducto().getNombre()
                    });
        });
    }

    private void agregarNuevoProducto() {
        frmRegistroProductos frmRegistroProductos = new frmRegistroProductos(this);
        frmRegistroProductos.setVisible(true);
    }

    @Override
    public void onChildClosing() {
        mostrarRegistrosTabla();
    }

    private void eliminar() {
        int indiceBorrar = jTblProductos.getSelectedRow();

        if (indiceBorrar >= 0) {
            int respuesta = JOptionPane.showConfirmDialog(
                    this, "¿Estas seguro de borrar este producto?",
                    "Borrar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE
            );

            if (YES_OPTION == respuesta) {
                String codigo = (String) jTblProductos.getModel().getValueAt(indiceBorrar, 1);
                prdController.eliminarProductoById(codigo);
                mostrarRegistrosTabla();
            }
        } else {
            showMessageDialog(this, "Debe elegir un registro para borrar !");
        }

    }

    private void inicializar() {
        new TextPlaceholder(" Encontrar producto por código o descripción ", jTxtBusquedaProducto);

        setContentAreaFilledToButtons();

        jChoiceTipoBusqueda.add("Mostrar: Todos los productos");
        jChoiceTipoBusqueda.add("Mostrar: Productos con poco stock");
        jChoiceTipoBusqueda.add("Mostrar: Solo productos ya vendidos");
        mostrarRegistrosTabla();

        jTxtBusquedaProducto.getDocument().addDocumentListener(new DocumentListener() {
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
                String texto = jTxtBusquedaProducto.getText().toLowerCase();

                if (!texto.isEmpty()) {
                    DefaultTableModel model = (DefaultTableModel) jTblProductos
                            .getModel();
                    model.getDataVector().removeAllElements();
                    model.fireTableDataChanged();

                    prdController.listarProductos()
                            .stream()
                            .filter(x -> x.getNombre().toLowerCase().contains(texto)
                            || x.getCodigo().toLowerCase().contains(texto)
                            )
                            .forEach(x -> {
                                model.addRow(
                                        new Object[]{
                                            x.getNombre(),
                                            x.getCodigo(),
                                            0,
                                            0,
                                            0,
                                            x.getPrecioVenta(),
                                            x.getCategoriaProducto().getNombre(),
                                            0,
                                            "",
                                            "",
                                            x.getMarcaProducto().getNombre()
                                        });
                            });
                } else {
                    mostrarRegistrosTabla();
                }
            }
        });

    }
}
