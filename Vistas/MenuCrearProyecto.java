package Vistas;

import Controlador.Controlador;
import Modelo.*;
import java.util.Date;

public class MenuCrearProyecto extends javax.swing.JFrame {
    
    private Lote lote;
    private Controlador controlador;
    private Proyecto p;
    
    public MenuCrearProyecto(Controlador controlador, Lote lote) {        
        initComponents();
        this.lote = lote;
        this.controlador = controlador;
        p = null;
        iniciarTabla();
    }

    
    public void iniciarTabla(){    
    txtCampo.setText(String.valueOf(lote.getCampo().getIdcampo()));
    txtLote.setText(String.valueOf(lote.getIdlote()));
    txtSuelo.setText(String.valueOf(lote.getTiposuelo().getNombre()));
    lote.getTiposuelo().getCultivoxtiposuelos().forEach((cxts) -> {
        boxCultivo.addItem(cxts.getCultivo().getNombre());
    });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCampo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLote = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSuelo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        boxCultivo = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear un proyecto");
        setResizable(false);

        jLabel1.setText("Creando un proyecto");

        jLabel2.setText("Campo:");

        txtCampo.setEditable(false);

        jLabel3.setText("Lote:");

        txtLote.setEditable(false);

        jLabel4.setText("Tipo de suelo:");

        txtSuelo.setEditable(false);

        jLabel5.setText("Cultivo:");

        boxCultivo.setEditable(true);
        boxCultivo.setModel(new javax.swing.DefaultComboBoxModel<>());

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel7.setText("Estado del proyecto:");

        jTextField1.setEditable(false);
        jTextField1.setText("En preparación");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxCultivo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSuelo))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtLote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtSuelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(boxCultivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        /*Proyecto p = new Proyecto();
        Proyectoxlaboreo pxl = new Proyectoxlaboreo();
        p.setLote(lote);
        pxl.setFechainicio(new Date());
        pxl.setFechafin(null);*/
        Cultivo cultivoS = null;
        Estadoproyecto estadoproyectoS = null;
        Laboreo primerLaboreo = new Laboreo();
        for(Cultivo c: controlador.getCultivos()) {
            if(c.getNombre().equals((String)boxCultivo.getSelectedItem())) {
                cultivoS = c;
                //p.setCultivo(c);                
                break;
            }    
           
        }
        for(Estadoproyecto ep: controlador.getEstadosProyecto()) {
            if(ep.getNombre().equals("En preparación")) {
                estadoproyectoS = ep;
                //p.setEstadoproyecto(ep);
                break;
            }
        }
        for(Cultivoxlaboreo cxl: cultivoS.getCultivoxlaboreos()) {
            // Buscamos el Cultivoxlaboreo que tenga orden == 1 de ese Cultivo
            if(cxl.getOrden() == 1) {
                for(Laboreo l: controlador.getLaboreos()) {
                    if(l.getIdlaboreo() == cxl.getLaboreo().getIdlaboreo()) {
                        primerLaboreo = l;
                        break;
                    }
                }
                //primerLaboreo = cxl.getLaboreo();
                //pxl.setLaboreo(cxl.getLaboreo());
                break;
            }
        }
        this.p = new Proyecto(cultivoS, estadoproyectoS, lote);
        //pxl.setProyecto(p);
        controlador.agregarObjeto(p);
        Proyectoxlaboreo pxl = new Proyectoxlaboreo(primerLaboreo, p, new Date(), null);
        controlador.agregarObjeto(pxl);
        //Proyecto aux = p;
        lote.getProyectos().add(p);
        controlador.actualizarObjeto(lote);
        MenuLaboreoProyecto mlp = new MenuLaboreoProyecto(this.controlador, p);
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        MenuLotes ml = new MenuLotes(controlador, lote.getCampo());
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxCultivo;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtCampo;
    private javax.swing.JTextField txtLote;
    private javax.swing.JTextField txtSuelo;
    // End of variables declaration//GEN-END:variables
}
