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

    private List<Lote> listLotes;
    private Controlador controlador;
    private ListSelectionModel tblListModel;
    private Campo campo;
    private Lote loteSeleccionado;

    
    public MenuLotes(Controlador controlador, Campo campo) {
        initComponents();
        this.controlador = controlador;
        this.listLotes = new ArrayList<>();
        this.campo = campo;
        tblListModel = tblLotes.getSelectionModel();
        tblListModel.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent evt) {
                tblListModelValueChanged(evt);
            }
        });
        iniciarTabla();
        setVisible(true);
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
        btnSeparar = new javax.swing.JButton();
        btnUnir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú de Lotes");
        setResizable(false);

        pnlPanel1.setPreferredSize(new java.awt.Dimension(324, 300));

        lblNumero.setText("Lote:");

        txtNumeroLote.setEditable(false);

        jLabel1.setText("Metros:");

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
        tblLotes.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tblLotes.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tblLotes.setShowGrid(false);
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

        btnSeparar.setText("Separar lotes");
        btnSeparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSepararActionPerformed(evt);
            }
        });

        btnUnir.setText("Unir lotes");
        btnUnir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPanel1Layout = new javax.swing.GroupLayout(pnlPanel1);
        pnlPanel1.setLayout(pnlPanel1Layout);
        pnlPanel1Layout.setHorizontalGroup(
            pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pnlPanel1Layout.createSequentialGroup()
                        .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumero)
                            .addComponent(lblNumero1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCampo, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(txtNumeroLote))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumero2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMetros)
                            .addComponent(boxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnlPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                    .addGroup(pnlPanel1Layout.createSequentialGroup()
                        .addComponent(lblvariable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtras, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPanel1Layout.createSequentialGroup()
                                .addComponent(btnSeparar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUnir, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblvariable)
                    .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSeparar)
                        .addComponent(btnUnir)))
                .addGap(11, 11, 11)
                .addComponent(btnAtras)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProyectoActionPerformed
        // Si el lote seleccionado no tiene un proyecto activo...
        if(loteSeleccionado.tieneProyectoActivo() == null) {
            // Se va al menú para crear y empezar un proyecto
            MenuCrearProyecto mcp = new MenuCrearProyecto(controlador, loteSeleccionado);
            mcp.setVisible(true);
            dispose();
            // Si el lote seleccionado tiene un proyecto activo
        } else {
            // Se recupera dicho proyecto activo
            Proyecto proyectoActivo = loteSeleccionado.tieneProyectoActivo();
            /*for(Proyecto p: loteSeleccionado.getProyectos()) {
                if(!(p.getEstadoproyecto().getNombre().equals("Terminado")) && !(p.getEstadoproyecto().getNombre().equals("Cancelado"))) {
                    proyectoActivo = p;
                    break;
                }
            }*/
            // Y se va al menú para ver y modificar el proyecto activo
            this.dispose();
            MenuLaboreoProyecto mlp = new MenuLaboreoProyecto(controlador, proyectoActivo);
        }
    }//GEN-LAST:event_btnProyectoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
        MenuCampo mc = new MenuCampo(controlador);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(!controlador.esFloat(txtMetros.getText())) {
            this.lblvariable.setText("Ingrese valores válidos.");
        } else {
            loteSeleccionado.setSuperficie(Float.parseFloat(txtMetros.getText()));
            this.controlador.actualizarObjeto(loteSeleccionado);
            this.deseleccionarFila();
            this.iniciarTabla();
            this.lblvariable.setText("Lote actualizado.");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        this.campo.getLotes().remove(loteSeleccionado);
        this.controlador.actualizarObjeto(this.campo);
        this.controlador.borrarObjeto(loteSeleccionado);
        this.deseleccionarFila();
        this.iniciarTabla();
        this.lblvariable.setText("Lote borrado.");
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(!controlador.esFloat(txtMetros.getText())) {
            lblvariable.setText("Ingrese un valor valido");
        } else {
            String nombreSuelo = String.valueOf(boxTipo.getSelectedItem());
            Tiposuelo sueloSeleccionado = this.controlador.recuperarTiposuelo(nombreSuelo);
            Lote l = new Lote(this.campo, sueloSeleccionado, Float.parseFloat(txtMetros.getText()));
            campo.getLotes().add(l);
            controlador.agregarObjeto(l);
            controlador.actualizarEstadoCampo(this.campo);
            controlador.actualizarObjeto(this.campo);
            iniciarTabla();
            lblvariable.setText("Elemento agregado");
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnSepararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSepararActionPerformed
        Lote lote = (Lote) controlador.recuperarUno(Lote.class, Integer.parseInt((String)tblLotes.getValueAt(tblLotes.getSelectedRow(), 1)));
        new MenuSepararLotes(controlador,lote).setVisible(true);
        dispose();
    }//GEN-LAST:event_btnSepararActionPerformed

    private void btnUnirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnirActionPerformed
        String[] opciones = new String[2];
        opciones[0] = "Si";
        opciones[1] = "No";
        int opcion = JOptionPane.showOptionDialog(this, "Seguro?", "Unir un lote",
                0, JOptionPane.WARNING_MESSAGE, null, opciones, null);
        if(opcion == 0) {
            int [] index=tblLotes.getSelectedRows();
              Float metros = 0.0F;
            for(int i =0;i<tblLotes.getSelectedRowCount();i++)
            {
                metros+=Float.parseFloat((String) tblLotes.getValueAt(index[i], 3));
                Lote l = (Lote) controlador.recuperarUno(Lote.class, Integer.parseInt((String) tblLotes.getValueAt(index[i], 1)));
                l.setActivo(false);
                controlador.actualizarObjeto(l);
            }
            Campo c = (Campo) controlador.recuperarUno(Campo.class, Integer.parseInt((String) tblLotes.getValueAt(index[0], 0)));
            Tiposuelo tp = controlador.recuperarTiposuelo((String) tblLotes.getValueAt(index[0], 2));
            Lote nuevo = new Lote(c, tp, metros);
            c.getLotes().add(nuevo);        
            controlador.agregarObjeto(nuevo);
            controlador.actualizarObjeto(c);
            iniciarTabla();
          }        
    }//GEN-LAST:event_btnUnirActionPerformed
    
    public void iniciarTabla() {
        this.campo = (Campo) controlador.recuperarUno(Campo.class, campo.getIdcampo());
        this.txtCampo.setText(String.valueOf(this.campo.getIdcampo()));
        DefaultTableModel tblModel = (DefaultTableModel) tblLotes.getModel();
        tblModel.setRowCount(0);
        for(Lote l: campo.getLotes()) {
            if(l.isActivo())
            {String nroCampo = String.valueOf(campo.getIdcampo());
            String nroLote = String.valueOf(l.getIdlote());
            String tipoSuelo = l.getTiposuelo().getNombre();
            String metros = String.valueOf(l.getSuperficie());
            String estado = "No hay proyecto";
            Proyecto proyectoActivo = l.tieneProyectoActivo();
            if(proyectoActivo != null) {
                estado = proyectoActivo.getEstadoproyecto().getNombre();
            }
            /*for(Proyecto p: l.getProyectos()) {
               if (!(p.getEstadoproyecto().getNombre().equals("Terminado")) && !(p.getEstadoproyecto().getNombre().equals("Cancelado"))) {
                   bandera = p.getEstadoproyecto().getNombre();
                   break;
               }
            }*/
            String[] tblData = {nroCampo, nroLote,tipoSuelo, metros, estado};
            tblModel.addRow(tblData);}            
        }
        deseleccionarFila();
        for(Tiposuelo ts: controlador.getTiposSuelo()) {
            boxTipo.addItem(ts.getNombre());
        }
        if(campo.estaDadoDeBaja())
        {
        this.btnAgregar.setEnabled(false);
        this.btnBorrar.setEnabled(false);
        this.btnActualizar.setEnabled(false);
        this.btnProyecto.setEnabled(false);
        this.btnSeparar.setEnabled(false);
        this.btnUnir.setEnabled(false);            
        }
        else
        {            
        this.btnAgregar.setEnabled(true);
        this.btnBorrar.setEnabled(false);
        this.btnActualizar.setEnabled(false);
        this.btnProyecto.setEnabled(false);
        this.btnSeparar.setEnabled(false);
        this.btnUnir.setEnabled(false);
        }
    }
    
    private void tblListModelValueChanged(ListSelectionEvent evt){
        
        if(campo.estaDadoDeBaja())
        {
        this.btnAgregar.setEnabled(false);
        this.btnBorrar.setEnabled(false);
        this.btnActualizar.setEnabled(false);
        this.btnProyecto.setEnabled(false);
        this.btnSeparar.setEnabled(false);
        this.btnUnir.setEnabled(false);            
        }else
        if(this.tblListModel.getSelectedItemsCount() == 1) {
            this.btnAgregar.setEnabled(false);
            this.btnBorrar.setEnabled(true);
            this.btnActualizar.setEnabled(true);
            this.btnProyecto.setEnabled(true);
            this.btnSeparar.setEnabled(true);            
            int idLoteSeleccionado = Integer.parseInt((String) tblLotes.getValueAt(this.tblLotes.getSelectedRow(), 1));
            this.loteSeleccionado = (Lote) controlador.recuperarUno(Lote.class, idLoteSeleccionado);
            if(loteSeleccionado.getProyectos().size()>0)
            {
                btnBorrar.setEnabled(false);
            }
            this.txtNumeroLote.setText((String) this.tblLotes.getValueAt(this.tblLotes.getSelectedRow(), 0));
            this.txtMetros.setText((String) this.tblLotes.getValueAt(this.tblLotes.getSelectedRow(), 3));     
        }
        if(this.tblListModel.getSelectedItemsCount() > 1) {
            this.btnAgregar.setEnabled(false);
            this.btnBorrar.setEnabled(false);
            this.btnActualizar.setEnabled(false);
            this.btnProyecto.setEnabled(false);
            this.btnSeparar.setEnabled(false);
            this.btnUnir.setEnabled(true);
            int[] index = tblLotes.getSelectedRows();        
            int bandera=0;
            Tiposuelo tp = controlador.recuperarTiposuelo((String) tblLotes.getValueAt(index[0], 2));
            for(int i=0;i<tblLotes.getSelectedRowCount();i++)
            {
                Tiposuelo tpaux = controlador.recuperarTiposuelo((String) tblLotes.getValueAt(index[i], 2));
                if(!tp.equals(tpaux)||!tblLotes.getValueAt(index[i], 4).equals("No hay proyecto"))
                {
                    btnUnir.setEnabled(false);
                    break;
                }            
            }           
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
    private javax.swing.JButton btnSeparar;
    private javax.swing.JButton btnUnir;
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
