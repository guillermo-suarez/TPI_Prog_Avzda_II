package Vistas;

import Controlador.*;
import Modelo.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

public class MenuTipoSuelo extends javax.swing.JFrame {

    private List<Tiposuelo> listTipoSuelo;
    private Controlador controlador;
    private ListSelectionModel tblListModel;
    
    public MenuTipoSuelo(Controlador controlador) {
        initComponents();
        this.controlador = controlador;
        this.listTipoSuelo = new ArrayList<>();
        tblListModel = tblTiposSuelo.getSelectionModel();
        tblListModel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
                tblListModelValueChanged(evt);
            }
        });
        iniciarTabla();
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPanel1 = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTiposSuelo = new javax.swing.JTable();
        lblAviso = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnCultivo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu de Tipos de Suelo");
        setResizable(false);

        pnlPanel1.setPreferredSize(new java.awt.Dimension(324, 300));

        lblNumero.setText("Número:");

        txtNumero.setEditable(false);

        jLabel1.setText("Nombre:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        tblTiposSuelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Nombre"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTiposSuelo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblTiposSuelo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tblTiposSuelo);
        if (tblTiposSuelo.getColumnModel().getColumnCount() > 0) {
            tblTiposSuelo.getColumnModel().getColumn(0).setMaxWidth(75);
        }

        lblAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAviso.setToolTipText("");
        lblAviso.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnCultivo.setText("Agregar o modificar cultivos");
        btnCultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCultivoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPanel1Layout = new javax.swing.GroupLayout(pnlPanel1);
        pnlPanel1.setLayout(pnlPanel1Layout);
        pnlPanel1Layout.setHorizontalGroup(
            pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pnlPanel1Layout.createSequentialGroup()
                        .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumero)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addComponent(txtNumero)))
                    .addGroup(pnlPanel1Layout.createSequentialGroup()
                        .addComponent(lblAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnCultivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlPanel1Layout.setVerticalGroup(
            pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumero)
                    .addComponent(lblNumero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnBorrar)
                    .addComponent(btnActualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCultivo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(this.txtNombre.getText().equals("")) {
            this.lblAviso.setText("Ingrese un nombre válido.");
        } else {
            Tiposuelo ts = this.controlador.getTiposSuelo().get(this.tblTiposSuelo.getSelectedRow());
            ts.setNombre(this.txtNombre.getText());
            this.controlador.actualizarObjeto(ts);
            this.deseleccionarFila();
            this.iniciarTabla();
            this.lblAviso.setText("Tipo de suelo actualizado.");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(this.txtNombre.getText().equals("")) {
            this.lblAviso.setText("Ingrese un nombre válido.");
        } else {
            this.controlador.agregarObjeto(new Tiposuelo(this.txtNombre.getText()));
            this.txtNombre.setText("");
            this.iniciarTabla();
            this.lblAviso.setText("Tipo de suelo agregado.");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
        MenuPrincipal menu = new MenuPrincipal(controlador);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        //verificar que no este relacionado con algun cultivo
        Tiposuelo ts = this.controlador.getTiposSuelo().get(this.tblTiposSuelo.getSelectedRow());
        this.controlador.borrarObjeto(ts);
        this.deseleccionarFila();
        this.iniciarTabla();
        this.lblAviso.setText("Tipo de suelo borrado.");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnCultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCultivoActionPerformed
        Tiposuelo ts = this.controlador.getTiposSuelo().get(this.tblTiposSuelo.getSelectedRow());
        MenuSueloxCultivo msxc = new MenuSueloxCultivo(controlador, ts);
        msxc.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCultivoActionPerformed
    
    private void iniciarTabla() {
        listTipoSuelo = this.controlador.getTiposSuelo();
        DefaultTableModel tblModel = (DefaultTableModel) tblTiposSuelo.getModel();
        tblModel.setRowCount(0);
        for(Tiposuelo ts: this.listTipoSuelo) {
            String nroSuelo = String.valueOf(ts.getIdtiposuelo());
            String nombreSuelo = ts.getNombre();
            String[] tblData = {nroSuelo, nombreSuelo};
            tblModel.addRow(tblData);
        }
        this.btnAgregar.setEnabled(true);
        this.btnBorrar.setEnabled(false);
        this.btnActualizar.setEnabled(false);
        deseleccionarFila();
    }
    
    private void tblListModelValueChanged(ListSelectionEvent evt){
        if(this.tblListModel.getSelectedItemsCount() > 0) {
            this.btnAgregar.setEnabled(false);
            this.btnBorrar.setEnabled(true);
            this.btnActualizar.setEnabled(true);
            this.btnCultivo.setEnabled(true);
            this.txtNumero.setText((String) this.tblTiposSuelo.getValueAt(this.tblTiposSuelo.getSelectedRow(), 0));
            this.txtNombre.setText((String) this.tblTiposSuelo.getValueAt(this.tblTiposSuelo.getSelectedRow(), 1));
        }
    }
    
    private void deseleccionarFila() {
        this.tblListModel.clearSelection();
        this.txtNumero.setText("");
        this.txtNombre.setText("");
        this.btnAgregar.setEnabled(true);
        this.btnActualizar.setEnabled(false);
        this.btnBorrar.setEnabled(false);
        this.btnCultivo.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnCultivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JPanel pnlPanel1;
    private javax.swing.JTable tblTiposSuelo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
