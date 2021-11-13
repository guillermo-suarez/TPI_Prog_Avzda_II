package Vistas;

import Controlador.Controlador;
import Modelo.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
        btnActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu de Proyecto");
        setPreferredSize(null);
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

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnActualizar))
                            .addComponent(boxEstadoP, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
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
                        .addContainerGap())))
        );
        pnlPanel1Layout.setVerticalGroup(
            pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEstadoProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar))
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
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
        MenuLotes ml = new MenuLotes(controlador, this.proyecto.getLote().getCampo());
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnCancelarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarPActionPerformed
        for (Estadoproyecto x: this.controlador.getEstadosProyecto()) {
            if("Cancelado".equals(x.getNombre())) {
               this.proyecto.setEstadoproyecto(x);
               break;
            }
        }
        controlador.actualizarObjeto(proyecto);
        String c = proyecto.getLote().getCampo().verEstadoActualizado();
        for(Estadocampo ec:controlador.getEstadosCampo())
        {
            if(ec.getNombre().equals(c))
                proyecto.getLote().getCampo().setEstadocampo(ec);
        }
        controlador.actualizarObjeto(proyecto.getLote().getCampo());
        iniciarTabla();
        lblvariable.setText("Proyecto cancelado");
    }//GEN-LAST:event_btnCancelarPActionPerformed

    private void btnNextLaboreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextLaboreoActionPerformed
        // Recuperamos el numero de orden del laboreo que se esta terminando
        int ultimoOrden = 0;
        for(int i = 0; i < tblLaboreos.getRowCount(); i++) {
            if((Integer.valueOf((String) tblLaboreos.getValueAt(i, 0))) > ultimoOrden) {
                ultimoOrden = (Integer.valueOf((String) tblLaboreos.getValueAt(i, 0)));
            }
        }
        // Recuperamos el ultimo laboreo: aquel que se esta terminando ahora
        Laboreo ultimoLaboreo = null;
        for(Cultivoxlaboreo cxl: this.proyecto.getCultivo().getCultivoxlaboreos()) {
            if(cxl.getOrden() == ultimoOrden) {
                ultimoLaboreo = cxl.getLaboreo();
                break;
            }
        }
        // Ahora recuperamos el proyectoxlaboreo correspondiente
        Proyectoxlaboreo ultimoPxL = null;
        for(Proyectoxlaboreo pxl: this.proyecto.getProyectoxlaboreos()) {
            if(pxl.getLaboreo().getIdlaboreo() == ultimoLaboreo.getIdlaboreo()) {
                ultimoPxL = pxl;
                break;
            }
        }
        // Le ponemos la fechaFin y lo guardamos
        ultimoPxL.setFechafin(new Date());
        controlador.actualizarObjeto(ultimoPxL);
        // Si el último laboreo que se hizo fue el ultimo, se debe terminar el proyecto
        if(ultimoOrden == proyecto.getCultivo().getCultivoxlaboreos().size()) {
            for(Estadoproyecto ep: controlador.getEstadosProyecto()) {
                if(ep.getNombre().equals("Terminado")) {
                    proyecto.setEstadoproyecto(ep);
                    controlador.actualizarObjeto(proyecto);
                    break;
                }
            }
            String nuevoEstadoDelCampo = this.proyecto.getLote().getCampo().verEstadoActualizado();
            for(Estadocampo ec: controlador.getEstadosCampo()) {
                if(ec.getNombre().equals(nuevoEstadoDelCampo)) {
                    this.proyecto.getLote().getCampo().setEstadocampo(ec);
                    controlador.actualizarObjeto(this.proyecto.getLote().getCampo());
                    break;
                }
            }
        // Si no, empezar el siguiente laboreo
        } else {
            Laboreo proximoLaboreo = null;
            for(Cultivoxlaboreo cxl: this.proyecto.getCultivo().getCultivoxlaboreos()) {
                if(cxl.getOrden() == (ultimoOrden + 1)) {
                    proximoLaboreo = cxl.getLaboreo();
                    break;
                }
            }
            Proyectoxlaboreo nuevoPxL = new Proyectoxlaboreo(proximoLaboreo, proyecto, new Date(), null);
            proyecto.getProyectoxlaboreos().add(nuevoPxL);
            controlador.actualizarObjeto(proyecto);
            controlador.agregarObjeto(nuevoPxL);
        }
        iniciarTabla();
    }//GEN-LAST:event_btnNextLaboreoActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        for(Estadoproyecto ep: this.controlador.getEstadosProyecto()) {
            if(ep.getNombre().equals((String) boxEstadoP.getSelectedItem())) {
                this.proyecto.setEstadoproyecto(ep);
                break;
            }
        }
        controlador.actualizarObjeto(proyecto);
        iniciarTabla();
        lblvariable.setText("Proyecto actualizado");
    }//GEN-LAST:event_btnActualizarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxEstadoP;
    private javax.swing.JButton btnActualizar;
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
        int idCAux = proyecto.getLote().getCampo().getIdcampo();
        int idLAux = proyecto.getLote().getIdlote();
        int idPAux = proyecto.getIdproyecto();
        for(Campo c: controlador.getCampos()) {
            if(c.getIdcampo() == idCAux) {
                for(Lote l: c.getLotes()) {
                    if(l.getIdlote() == idLAux) {
                        for(Proyecto p: l.getProyectos()) {
                            if(p.getIdproyecto() == idPAux) {
                                this.proyecto = p;
                                break;
                            }
                        }
                        break;
                    }
                }
                break;
            }
        }
        listLxP = new ArrayList<>(this.proyecto.getProyectoxlaboreos());
        DefaultTableModel tblModel = (DefaultTableModel) tblLaboreos.getModel();
        tblModel.setRowCount(0);
        String orden = null;
        for(Proyectoxlaboreo aux: listLxP) {
            for(Cultivoxlaboreo cxl: aux.getProyecto().getCultivo().getCultivoxlaboreos()) {
                if(cxl.getLaboreo().equals(aux.getLaboreo())) {
                    orden = String.valueOf(cxl.getOrden());
                    break;
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
        //Cargar el combobox de estadoproyecto
        boxEstadoP.removeAllItems();
        //Si el proyecto esta terminado...
        if(proyecto.getEstadoproyecto().getNombre().equals("Terminado")) {
            boxEstadoP.addItem("Terminado");
            boxEstadoP.setEnabled(false);
        //Si el proyecto esta cancelado...
        } else if(proyecto.getEstadoproyecto().getNombre().equals("Cancelado")) {
            boxEstadoP.addItem("Cancelado");
            boxEstadoP.setEnabled(false);
        //Si el proyecto no esta ni terminado ni cancelado...
        } else {
            //Se cargan todos los estadosproyecto que no sean terminado ni cancelado
            for(Estadoproyecto ep : controlador.getEstadosProyecto()) {
                if(!(ep.getNombre().equals("Terminado")) && !(ep.getNombre().equals("Cancelado"))) {
                    boxEstadoP.addItem(ep.getNombre());
                }
            }
            //Preseleccionar el estado actual del proyecto en el combobox
            for(int i = 0; i < boxEstadoP.getItemCount(); i++) {
                if(((String) boxEstadoP.getItemAt(i)).equals(proyecto.getEstadoproyecto().getNombre())) {
                    boxEstadoP.setSelectedIndex(i);
                    break;
                }
            }
        }
    }
}
