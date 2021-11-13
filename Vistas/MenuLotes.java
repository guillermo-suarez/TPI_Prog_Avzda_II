/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.*;
import Modelo.*;
import DAO.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

/**
 *
 * @author Guillermo
 */
public class MenuLotes extends javax.swing.JFrame {
    private Lote loteSeleccionado;
    private List<Lote> listLotes;
    private Controlador controlador;
    private ListSelectionModel tblListModel;
    private Campo campo;

    
    public MenuLotes(Controlador controlador, Campo campo) {
        this.controlador = controlador;
        this.listLotes = new ArrayList<>(campo.getLotes());
        this.campo=campo;                
        initComponents();
        tblListModel = tblLotes.getSelectionModel();
        tblListModel.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent evt) {
                tblListModelValueChanged(evt);
            }
        });
        iniciarTabla();        
        this.txtCampo.setText(String.valueOf(this.campo.getIdcampo()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPanel1 = new javax.swing.JPanel();
        lblNumero = new javax.swing.JLabel();
        txtNumeroLote = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtMetros = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLotes = new javax.swing.JTable();
        btnAtras = new javax.swing.JButton();
        lblvariable = new javax.swing.JLabel();
        lblNumero1 = new javax.swing.JLabel();
        txtCampo = new javax.swing.JTextField();
        lblNumero2 = new javax.swing.JLabel();
        boxTipo = new javax.swing.JComboBox<>();
        btnProyecto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú de Lotes");
        setResizable(false);

        pnlPanel1.setPreferredSize(new java.awt.Dimension(324, 300));

        lblNumero.setText("Lote:");

        txtNumeroLote.setEditable(false);

        jLabel1.setText("Metros:");

        txtMetros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMetrosActionPerformed(evt);
            }
        });

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

        tblLotes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Campo", "Lote", "Tipo suelo", "Metros", "Proyecto"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLotes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblLotes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblLotes.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblLotes);
        if (tblLotes.getColumnModel().getColumnCount() > 0) {
            tblLotes.getColumnModel().getColumn(0).setMaxWidth(75);
        }

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        lblNumero1.setText("Campo:");

        txtCampo.setEditable(false);

        lblNumero2.setText("Tipo de suelo:");

        boxTipo.setModel(new javax.swing.DefaultComboBoxModel<>());

        btnProyecto.setText("Modificar proyecto");
        btnProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProyectoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPanel1Layout = new javax.swing.GroupLayout(pnlPanel1);
        pnlPanel1.setLayout(pnlPanel1Layout);
        pnlPanel1Layout.setHorizontalGroup(
            pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPanel1Layout.createSequentialGroup()
                        .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumero)
                            .addComponent(lblNumero1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumeroLote, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(txtCampo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumero2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMetros)
                            .addComponent(boxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPanel1Layout.createSequentialGroup()
                        .addComponent(lblvariable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtras)))
                .addContainerGap())
        );
        pnlPanel1Layout.setVerticalGroup(
            pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMetros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero)
                    .addComponent(lblNumero2)
                    .addComponent(boxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnBorrar)
                    .addComponent(btnActualizar)
                    .addComponent(btnProyecto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAtras)
                    .addComponent(lblvariable))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        dispose();
        MenuCampo MenuC =new MenuCampo(controlador);
        MenuC.setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(this.txtMetros.getText().equals("")) {
            this.lblvariable.setText("Ingrese valores válidos.");
        } else {
            if(this.boxTipo.getSelectedItem().equals(""))
            {
                this.lblvariable.setText("Ingrese valores válidos.");
            }
            else
            {   
                loteSeleccionado.setSuperficie(Float.parseFloat(txtMetros.getText()));
                for(Tiposuelo ts : this.controlador.getTiposSuelo())
                {
                    if(ts.getNombre().equals(((String)boxTipo.getSelectedItem())))
                    {                    
                        loteSeleccionado.setTiposuelo(ts);
                        break;
                    }
                 }
                this.controlador.actualizarObjeto(loteSeleccionado);
                this.deseleccionarFila();
                this.iniciarTabla();
                this.lblvariable.setText("Estado de proyecto actualizado.");                
            }
            
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
            
        this.controlador.borrarObjeto(loteSeleccionado);
        this.campo.getLotes().remove(loteSeleccionado);     
        this.controlador.actualizarObjeto(campo);
        this.deseleccionarFila();
        this.iniciarTabla();
        this.lblvariable.setText("Lote borrado.");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if("".equals(txtMetros.getText()))
        {
            lblvariable.setText("Ingrese un valor valido");
        }
        else
        {
            if("".equals(boxTipo.getSelectedItem()))
            {
                lblvariable.setText("Ingrese un valor valido");
            }
            else
            {
                Tiposuelo aux = null;
                String s= (String) (boxTipo.getSelectedItem());
                for (Tiposuelo ts: controlador.getTiposSuelo())
                {
                    if(ts.getNombre().equals(s))
                    {
                        aux=ts;
                    }
                }
                Lote l = new Lote(campo, aux, Float.parseFloat(txtMetros.getText()));
                controlador.agregarObjeto(l);     
                campo.getLotes().add(l);
                controlador.actualizarObjeto(campo); 
                iniciarTabla();
                lblvariable.setText("Elemento agregado");
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProyectoActionPerformed
        Lote aux=null;
        if ((this.tblLotes.getValueAt(this.tblLotes.getSelectedRow(), 4))== "No hay proyecto") 
        {
            for(Lote lote: listLotes)
            {
                if(lote.getIdlote()==Integer.parseInt((String)tblLotes.getValueAt(this.tblLotes.getSelectedRow(), 1)))
                {
                    aux=lote;
                }
            }         
            MenuCrearProyecto mcp = new MenuCrearProyecto(controlador, aux);
            mcp.setVisible(true);
            dispose();
        }
        else
        {
           //
        }
    }//GEN-LAST:event_btnProyectoActionPerformed

    private void txtMetrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMetrosActionPerformed
        
    }//GEN-LAST:event_txtMetrosActionPerformed
    public void iniciarTabla() {   
        campo = controlador.getCampos().get(campo.getIdcampo()-1);
        listLotes=new ArrayList<>(campo.getLotes());
        DefaultTableModel tblModel = (DefaultTableModel) tblLotes.getModel();
        tblModel.setRowCount(0);
        for(Lote l: this.listLotes) {
            String bandera = "No hay proyecto";
            String nroCampo = String.valueOf(campo.getIdcampo());
            String nroLote = String.valueOf(l.getIdlote());
            String tipoSuelo = l.getTiposuelo().getNombre();
            String metros = String.valueOf(l.getSuperficie());
            for(Proyecto p: l.getProyectos())
            {
               if (!p.getEstadoproyecto().getNombre().equals("Terminado")&&!p.getEstadoproyecto().getNombre().equals("Cancelado"))
               {
                   bandera = p.getEstadoproyecto().getNombre();
                   break;
               }
            }
            String[] tblData = {nroCampo, nroLote,tipoSuelo, metros, bandera};
            tblModel.addRow(tblData);
        }
        boxTipo.removeAllItems();
        for(Tiposuelo ts: controlador.getTiposSuelo())
        {
            boxTipo.addItem(ts.getNombre());
        }
        this.btnAgregar.setEnabled(true);
        this.btnBorrar.setEnabled(false);
        this.btnActualizar.setEnabled(false);
        this.btnProyecto.setEnabled(false);
        deseleccionarFila();
    }   
        
    
    private void tblListModelValueChanged(ListSelectionEvent evt){
        if(this.tblListModel.getSelectedItemsCount() > 0) {
        this.btnAgregar.setEnabled(false);
        this.btnBorrar.setEnabled(true);
        this.btnActualizar.setEnabled(true);
        this.btnProyecto.setEnabled(true);
        this.txtNumeroLote.setText((String) this.tblLotes.getValueAt(this.tblLotes.getSelectedRow(), 1));
        this.txtMetros.setText((String) this.tblLotes.getValueAt(this.tblLotes.getSelectedRow(), 3));
        loteSeleccionado=listLotes.get(tblLotes.getSelectedRow());
    }
    }
        private void deseleccionarFila() {
        this.tblListModel.clearSelection();
        this.txtNumeroLote.setText("");
        this.txtMetros.setText("");
        this.btnProyecto.setEnabled(false);
        this.btnBorrar.setEnabled(false);
        this.btnActualizar.setEnabled(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxTipo;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnProyecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblNumero1;
    private javax.swing.JLabel lblNumero2;
    private javax.swing.JLabel lblvariable;
    private javax.swing.JPanel pnlPanel1;
    private javax.swing.JTable tblLotes;
    private javax.swing.JTextField txtCampo;
    private javax.swing.JTextField txtMetros;
    private javax.swing.JTextField txtNumeroLote;
    // End of variables declaration//GEN-END:variables
}
