package Vistas;

import Controlador.Controlador;
import Modelo.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

public class MenuSueloxCultivo extends javax.swing.JFrame {

    private Controlador controlador;
    private Tiposuelo tiposuelo;
    private ListSelectionModel tblListModel;

    public MenuSueloxCultivo(Controlador controlador, Tiposuelo tiposuelo) {
        initComponents();
        this.controlador = controlador;
        this.tiposuelo = tiposuelo;
        txtSuelo.setText(tiposuelo.getNombre());
        tblListModel = tblCultivo.getSelectionModel();
        tblListModel.addListSelectionListener(new ListSelectionListener () {
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                tblListModelValueChanged(evt);
            }
        });
        iniciarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTipoSuelo = new javax.swing.JLabel();
        lblCultivo = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        txtSuelo = new javax.swing.JTextField();
        boxCultivo = new javax.swing.JComboBox<>();
        btnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCultivo = new javax.swing.JTable();
        btnAtras = new javax.swing.JButton();
        lblVariable = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú de Cultivos de un Tipo de Suelo");
        setResizable(false);

        lblTipoSuelo.setText("Tipo de suelo:");

        lblCultivo.setText("Cultivo:");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        txtSuelo.setEditable(false);

        boxCultivo.setModel(new javax.swing.DefaultComboBoxModel<>());
        boxCultivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxCultivoActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        tblCultivo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cultivo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCultivo.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblCultivo.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblCultivo);

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCultivo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTipoSuelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boxCultivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSuelo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnAtras))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSuelo)
                    .addComponent(lblTipoSuelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boxCultivo)
                    .addComponent(lblCultivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVariable, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        for(Cultivoxtiposuelo cxts: tiposuelo.getCultivoxtiposuelos()) {
            if(cxts.getCultivo().getNombre() == tblCultivo.getValueAt(tblCultivo.getSelectedRow(), 0)) {
                this.controlador.borrarObjeto(cxts);
                tiposuelo.getCultivoxtiposuelos().remove(cxts);
                break;
            }
        }
        iniciarTabla();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Cultivo aux = null;
        for(Cultivo c: controlador.getCultivos()) {
            if(boxCultivo.getSelectedItem().equals(c.getNombre())) {
                aux = c;
            }
        }  
        Cultivoxtiposuelo cxts = new Cultivoxtiposuelo(aux, tiposuelo);
        controlador.agregarObjeto(cxts);
        tiposuelo.getCultivoxtiposuelos().add(cxts);
        controlador.actualizarObjeto(tiposuelo);
        lblVariable.setText("Elemento agregado");
        iniciarTabla();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
        MenuTipoSuelo mts = new MenuTipoSuelo(controlador);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void boxCultivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxCultivoActionPerformed
        deseleccionarFila();
    }//GEN-LAST:event_boxCultivoActionPerformed

    private void tblListModelValueChanged(ListSelectionEvent evt) {
        if(tblListModel.getSelectedItemsCount() > 0) {
            this.btnAgregar.setEnabled(false);
            this.btnBorrar.setEnabled(true);
        }
    }
    
    private void deseleccionarFila() {
        this.tblListModel.clearSelection();
        this.btnAgregar.setEnabled(true);
        this.btnBorrar.setEnabled(false);
    }
    
    private void iniciarTabla() {
        tiposuelo = controlador.getTiposSuelo().get(tiposuelo.getIdtiposuelo() - 1);
        DefaultTableModel tblModel = (DefaultTableModel) tblCultivo.getModel();
        tblModel.setRowCount(0);
        boxCultivo.removeAllItems();
        btnBorrar.setEnabled(false);
        for(Cultivo c :this.controlador.getCultivos()) {
            int bandera = 0;
            for(Cultivoxtiposuelo cxts: this.tiposuelo.getCultivoxtiposuelos()) {
                if (c.equals(cxts.getCultivo()))
                    bandera = 1;
            }
            if(bandera == 0) {
               boxCultivo.addItem(c.getNombre()); 
            } else {
                String[] tblData = {c.getNombre()};
                tblModel.addRow(tblData);
            }
        }
        if(boxCultivo.getItemCount() == 0) {
            btnAgregar.setEnabled(false);
        } else {
            btnAgregar.setEnabled(true);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCultivo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCultivo;
    private javax.swing.JLabel lblTipoSuelo;
    private javax.swing.JLabel lblVariable;
    private javax.swing.JTable tblCultivo;
    private javax.swing.JTextField txtSuelo;
    // End of variables declaration//GEN-END:variables
}
