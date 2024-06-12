package interfaces.gui;

import aplicacion.Controlador;
import javax.swing.table.DefaultTableModel;

public class VentanaAdminProductos extends javax.swing.JFrame {
    private Controlador controlador;
    private Object[][] datos;
    public VentanaAdminProductos(Controlador controlador) {
        this.controlador = controlador;
        this.datos = controlador.datosTablaProductos();
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        Izquierda = new javax.swing.JPanel();
        botonUsuarios = new javax.swing.JButton();
        botonProductos = new javax.swing.JButton();
        botonFacturas = new javax.swing.JButton();
        Derecha = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        cajaIdentificador = new javax.swing.JTextField();
        cajaNuevoPrecio = new javax.swing.JTextField();
        labelIDProducto = new javax.swing.JLabel();
        labelNuevoPrecio = new javax.swing.JLabel();
        botonModificarPrecio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador - Usuarios");
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(800, 500));
        panelPrincipal.setLayout(null);

        Izquierda.setBackground(new java.awt.Color(22, 22, 216));
        Izquierda.setMaximumSize(null);

        botonUsuarios.setBackground(new java.awt.Color(22, 22, 216));
        botonUsuarios.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        botonUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        botonUsuarios.setText("Usuarios");
        botonUsuarios.setToolTipText("");
        botonUsuarios.setBorder(null);
        botonUsuarios.setContentAreaFilled(false);
        botonUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonUsuarios.setFocusPainted(false);
        botonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUsuariosActionPerformed(evt);
            }
        });

        botonProductos.setBackground(new java.awt.Color(22, 22, 216));
        botonProductos.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        botonProductos.setForeground(new java.awt.Color(255, 255, 255));
        botonProductos.setText("<HTML><U>Productos</U></HTML>");
        botonProductos.setBorder(null);
        botonProductos.setContentAreaFilled(false);
        botonProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProductosActionPerformed(evt);
            }
        });

        botonFacturas.setBackground(new java.awt.Color(22, 22, 216));
        botonFacturas.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        botonFacturas.setForeground(new java.awt.Color(255, 255, 255));
        botonFacturas.setText("Facturas");
        botonFacturas.setBorder(null);
        botonFacturas.setContentAreaFilled(false);
        botonFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFacturasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IzquierdaLayout = new javax.swing.GroupLayout(Izquierda);
        Izquierda.setLayout(IzquierdaLayout);
        IzquierdaLayout.setHorizontalGroup(
            IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IzquierdaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonProductos)
                    .addGroup(IzquierdaLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonUsuarios)
                            .addComponent(botonFacturas))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        IzquierdaLayout.setVerticalGroup(
            IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IzquierdaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(botonUsuarios)
                .addGap(18, 18, 18)
                .addComponent(botonFacturas)
                .addGap(18, 18, 18)
                .addComponent(botonProductos)
                .addContainerGap(339, Short.MAX_VALUE))
        );

        panelPrincipal.add(Izquierda);
        Izquierda.setBounds(0, 0, 160, 500);

        Derecha.setBackground(new java.awt.Color(255, 255, 255));
        Derecha.setMaximumSize(null);
        Derecha.setPreferredSize(new java.awt.Dimension(400, 500));

        DefaultTableModel tableModel = new javax.swing.table.DefaultTableModel(new Object [][] {},
            new String [] {
                "ID", "Nombre", "Precio", "Stock"
            }
        );

        for(Object[] fila : this.datos){
            tableModel.addRow(fila);
        }
        tablaProductos.setModel(tableModel);
        jScrollPane1.setViewportView(tablaProductos);

        cajaIdentificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaIdentificadorActionPerformed(evt);
            }
        });

        cajaNuevoPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNuevoPrecioActionPerformed(evt);
            }
        });

        labelIDProducto.setText("ID Producto");

        labelNuevoPrecio.setText("Nuevo Precio");

        botonModificarPrecio.setBackground(new java.awt.Color(22, 22, 216));
        botonModificarPrecio.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        botonModificarPrecio.setForeground(new java.awt.Color(255, 255, 255));
        botonModificarPrecio.setText("MODIFICAR");
        botonModificarPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonModificarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarPrecioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DerechaLayout = new javax.swing.GroupLayout(Derecha);
        Derecha.setLayout(DerechaLayout);
        DerechaLayout.setHorizontalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DerechaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(DerechaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIDProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DerechaLayout.createSequentialGroup()
                        .addComponent(cajaNuevoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonModificarPrecio))
                    .addComponent(labelNuevoPrecio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DerechaLayout.setVerticalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DerechaLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIDProducto)
                    .addComponent(labelNuevoPrecio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaIdentificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaNuevoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificarPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelPrincipal.add(Derecha);
        Derecha.setBounds(160, 0, 650, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void botonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUsuariosActionPerformed
        VentanaAdminUsuarios ventana = new VentanaAdminUsuarios(controlador);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonUsuariosActionPerformed

    private void botonProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProductosActionPerformed
        // DEBERIA ACTUALIZAR VENTANA EN LUGAR DE CARGAR TODO DE NUEVO
        
        VentanaAdminProductos ventana = new VentanaAdminProductos(controlador);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonProductosActionPerformed

    private void botonFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFacturasActionPerformed
        VentanaAdminFacturas ventana = new VentanaAdminFacturas(controlador);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonFacturasActionPerformed

    private void cajaIdentificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaIdentificadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaIdentificadorActionPerformed

    private void cajaNuevoPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNuevoPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNuevoPrecioActionPerformed

    private void botonModificarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarPrecioActionPerformed
        String identificador = cajaIdentificador.getText();
        String precio = cajaNuevoPrecio.getText();
    }//GEN-LAST:event_botonModificarPrecioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Derecha;
    private javax.swing.JPanel Izquierda;
    private javax.swing.JButton botonFacturas;
    private javax.swing.JButton botonModificarPrecio;
    private javax.swing.JButton botonProductos;
    private javax.swing.JButton botonUsuarios;
    private javax.swing.JTextField cajaIdentificador;
    private javax.swing.JTextField cajaNuevoPrecio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelIDProducto;
    private javax.swing.JLabel labelNuevoPrecio;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
