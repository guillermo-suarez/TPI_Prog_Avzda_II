package Vistas;

import Controlador.Controlador;
import Modelo.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class MenuLaboreoProyecto extends javax.swing.JFrame {

    private final Controlador controlador;
    private Proyecto proyecto;
    private List<Proyectoxlaboreo> listLxP;
    
    public MenuLaboreoProyecto(Controlador controlador, Proyecto proyecto) {
        this.controlador = controlador;
        this.proyecto = proyecto;
        initComponents();
        iniciarTabla();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPanel1 = new javax.swing.JPanel();
        lblLote = new javax.swing.JLabel();
        txtNumeroLote = new javax.swing.JTextField();
        lblProyecto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLaboreos = new javax.swing.JTable();
        btnAtras = new javax.swing.JButton();
        lblvariable = new javax.swing.JLabel();
        lblCampo = new javax.swing.JLabel();
        txtCampo = new javax.swing.JTextField();
        lblEstadoProyecto = new javax.swing.JLabel();
        boxEstadoP = new javax.swing.JComboBox<>();
        txtProyecto = new javax.swing.JTextField();
        lblCultivo = new javax.swing.JLabel();
        txtCultivo = new javax.swing.JTextField();
        btnNextLaboreo = new javax.swing.JButton();
        btnCancelarP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu de Proyecto");
        setResizable(false);

        pnlPanel1.setPreferredSize(new java.awt.Dimension(324, 300));

        lblLote.setText("Lote:");

        txtNumeroLote.setEditable(false);

        lblProyecto.setText("Proyecto:");

        tblLaboreos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Orden", "Laboreo", "Fecha Inicio", "Fecha Fin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLaboreos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tblLaboreos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblLaboreos);

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        lblCampo.setText("Campo:");

        txtCampo.setEditable(false);

        lblEstadoProyecto.setText("Estado proyecto:");

        boxEstadoP.setModel(new javax.swing.DefaultComboBoxModel<>());
        boxEstadoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxEstadoPActionPerformed(evt);
            }
        });

        txtProyecto.setEditable(false);

        lblCultivo.setText("Cultivo:");

        txtCultivo.setEditable(false);

        btnNextLaboreo.setText("Comenzar siguiente laboreo");
        btnNextLaboreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextLaboreoActionPerformed(evt);
            }
        });

        btnCancelarP.setText("Cancelar proyecto");
        btnCancelarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPanel1Layout = new javax.swing.GroupLayout(pnlPanel1);
        pnlPanel1.setLayout(pnlPanel1Layout);
        pnlPanel1Layout.setHorizontalGroup(
            pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPanel1Layout.createSequentialGroup()
                        .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLote)
                            .addComponent(lblCampo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumeroLote)
                            .addComponent(txtCampo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProyecto)
                            .addComponent(lblCultivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProyecto)
                            .addComponent(txtCultivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlPanel1Layout.createSequentialGroup()
                                .addComponent(lblEstadoProyecto)
                                .addGap(109, 109, 109))
                            .addGroup(pnlPanel1Layout.createSequentialGroup()
                                .addComponent(boxEstadoP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(21, 21, 21))))
                    .addGroup(pnlPanel1Layout.createSequentialGroup()
                        .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlPanel1Layout.createSequentialGroup()
                                .addComponent(lblvariable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlPanel1Layout.createSequentialGroup()
                                .addComponent(btnNextLaboreo, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCancelarP, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(21, 21, 21))))
        );
        pnlPanel1Layout.setVerticalGroup(
            pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstadoProyecto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCampo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLote)
                    .addComponent(lblCultivo)
                    .addComponent(txtCultivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boxEstadoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelarP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNextLaboreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblvariable))
                    .addGroup(pnlPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(422, 422, 422))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
        MenuLotes ml = new MenuLotes(controlador, this.proyecto.getLote().getCampo());
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnCancelarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarPActionPerformed

    private void boxEstadoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxEstadoPActionPerformed
        if(boxEstadoP.getSelectedItem().equals(""))
        {
            
        } else {
            
        }
    }//GEN-LAST:event_boxEstadoPActionPerformed

    private void btnNextLaboreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextLaboreoActionPerformed
        
    }//GEN-LAST:event_btnNextLaboreoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxEstadoP;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCancelarP;
    private javax.swing.JButton btnNextLaboreo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCampo;
    private javax.swing.JLabel lblCultivo;
    private javax.swing.JLabel lblEstadoProyecto;
    private javax.swing.JLabel lblLote;
    private javax.swing.JLabel lblProyecto;
    private javax.swing.JLabel lblvariable;
    private javax.swing.JPanel pnlPanel1;
    private javax.swing.JTable tblLaboreos;
    private javax.swing.JTextField txtCampo;
    private javax.swing.JTextField txtCultivo;
    private javax.swing.JTextField txtNumeroLote;
    private javax.swing.JTextField txtProyecto;
    // End of variables declaration//GEN-END:variables

    private void iniciarTabla() {
        listLxP = new ArrayList<>(this.proyecto.getProyectoxlaboreos());
        //listLxP = (List<Proyectoxlaboreo>) this.proyecto.getProyectoxlaboreos();
        DefaultTableModel tblModel = (DefaultTableModel) tblLaboreos.getModel();
        tblModel.setRowCount(0);
        String orden = null;
        for(Proyectoxlaboreo aux: listLxP) {
            for(Cultivoxlaboreo cxl: aux.getProyecto().getCultivo().getCultivoxlaboreos()) {
                if(cxl.getLaboreo().equals(aux.getLaboreo())) {
                    orden = String.valueOf(cxl.getOrden());
                    //break;
                }
            }
            String laboreo = aux.getLaboreo().getNombre();
            DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");  
            String fechainicio = dateFormat.format(aux.getFechainicio());
            String fechafin = null;
            if(aux.getFechafin() != null) {
                fechafin = dateFormat.format(aux.getFechafin()); 
            }
            String[] tblData = {orden, laboreo, fechainicio, fechafin};
            tblModel.addRow(tblData);                     
        }
        
        this.txtCampo.setText(String.valueOf(proyecto.getLote().getCampo().getIdcampo()));
        this.txtNumeroLote.setText(String.valueOf(proyecto.getLote().getIdlote()));
        this.txtProyecto.setText(String.valueOf(proyecto.getIdproyecto()));
        this.txtCultivo.setText(proyecto.getCultivo().getNombre());
        
        boxEstadoP.removeAllItems();
        for(Estadoproyecto ep : controlador.getEstadosProyecto()) {
            if(!(ep.getNombre().equals("Terminado")) && !(ep.getNombre().equals("Cancelado"))) {
                boxEstadoP.addItem(ep.getNombre());
            }
        }
    }
}
