package interfaces.gui;

import aplicacion.Controlador;

public class VentanaCarritoBOCETO extends javax.swing.JFrame {
    private Controlador controlador;
  
    public VentanaCarritoBOCETO(Controlador controlador) {
        this.controlador = controlador;
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Izquierda = new javax.swing.JPanel();
        BotonInicio = new javax.swing.JButton();
        botonMiPerfil = new javax.swing.JButton();
        botonCarrito = new javax.swing.JButton();
        BotonMisCompras = new javax.swing.JButton();
        BotonCerrarSesion = new javax.swing.JButton();
        Derecha = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelCarritoItem = new javax.swing.JPanel();
        ItemCarrito = new javax.swing.JPanel();
        labelNombreProducto = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        labelCantidad = new javax.swing.JLabel();
        botonConfirmarCarrito = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Carrito");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Izquierda.setBackground(new java.awt.Color(22, 22, 216));
        Izquierda.setMaximumSize(null);

        BotonInicio.setBackground(new java.awt.Color(22, 22, 216));
        BotonInicio.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        BotonInicio.setForeground(new java.awt.Color(255, 255, 255));
        BotonInicio.setText("Inicio");
        BotonInicio.setToolTipText("");
        BotonInicio.setBorder(null);
        BotonInicio.setContentAreaFilled(false);
        BotonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioActionPerformed(evt);
            }
        });

        botonMiPerfil.setBackground(new java.awt.Color(22, 22, 216));
        botonMiPerfil.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        botonMiPerfil.setForeground(new java.awt.Color(255, 255, 255));
        botonMiPerfil.setText("Mi Perfil");
        botonMiPerfil.setBorder(null);
        botonMiPerfil.setContentAreaFilled(false);
        botonMiPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMiPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMiPerfilActionPerformed(evt);
            }
        });

        botonCarrito.setBackground(new java.awt.Color(22, 22, 216));
        botonCarrito.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        botonCarrito.setForeground(new java.awt.Color(255, 255, 255));
        botonCarrito.setText("<HTML><U>Carrito</U></HTML>");
        botonCarrito.setBorder(null);
        botonCarrito.setContentAreaFilled(false);
        botonCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCarritoActionPerformed(evt);
            }
        });

        BotonMisCompras.setBackground(new java.awt.Color(22, 22, 216));
        BotonMisCompras.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        BotonMisCompras.setForeground(new java.awt.Color(255, 255, 255));
        BotonMisCompras.setText("Mis compras");
        BotonMisCompras.setBorder(null);
        BotonMisCompras.setContentAreaFilled(false);
        BotonMisCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonMisCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMisComprasActionPerformed(evt);
            }
        });

        BotonCerrarSesion.setBackground(new java.awt.Color(22, 22, 216));
        BotonCerrarSesion.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        BotonCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        BotonCerrarSesion.setText("Cerrar sesión");
        BotonCerrarSesion.setBorder(null);
        BotonCerrarSesion.setContentAreaFilled(false);
        BotonCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IzquierdaLayout = new javax.swing.GroupLayout(Izquierda);
        Izquierda.setLayout(IzquierdaLayout);
        IzquierdaLayout.setHorizontalGroup(
            IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IzquierdaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonMiPerfil)
                    .addComponent(botonCarrito)
                    .addComponent(BotonMisCompras)
                    .addComponent(BotonCerrarSesion)
                    .addComponent(BotonInicio))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        IzquierdaLayout.setVerticalGroup(
            IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IzquierdaLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(BotonInicio)
                .addGap(18, 18, 18)
                .addComponent(botonMiPerfil)
                .addGap(18, 18, 18)
                .addComponent(botonCarrito)
                .addGap(18, 18, 18)
                .addComponent(BotonMisCompras)
                .addGap(18, 18, 18)
                .addComponent(BotonCerrarSesion)
                .addContainerGap(228, Short.MAX_VALUE))
        );

        jPanel1.add(Izquierda);
        Izquierda.setBounds(0, 0, 160, 500);

        Derecha.setBackground(new java.awt.Color(255, 255, 255));
        Derecha.setMaximumSize(null);
        Derecha.setPreferredSize(new java.awt.Dimension(400, 500));

        ItemCarrito.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        labelNombreProducto.setText("Nombre");

        labelPrecio.setText("Precio Total");

        labelCantidad.setText("Cantidad");

        javax.swing.GroupLayout ItemCarritoLayout = new javax.swing.GroupLayout(ItemCarrito);
        ItemCarrito.setLayout(ItemCarritoLayout);
        ItemCarritoLayout.setHorizontalGroup(
            ItemCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemCarritoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(labelNombreProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(labelCantidad)
                .addGap(46, 46, 46)
                .addComponent(labelPrecio)
                .addGap(30, 30, 30))
        );
        ItemCarritoLayout.setVerticalGroup(
            ItemCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ItemCarritoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(ItemCarritoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombreProducto)
                    .addComponent(labelPrecio)
                    .addComponent(labelCantidad))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelCarritoItemLayout = new javax.swing.GroupLayout(panelCarritoItem);
        panelCarritoItem.setLayout(panelCarritoItemLayout);
        panelCarritoItemLayout.setHorizontalGroup(
            panelCarritoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarritoItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ItemCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        panelCarritoItemLayout.setVerticalGroup(
            panelCarritoItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCarritoItemLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(ItemCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        ItemCarrito.getAccessibleContext().setAccessibleParent(jScrollPane1);

        jScrollPane1.setViewportView(panelCarritoItem);

        botonConfirmarCarrito.setBackground(new java.awt.Color(22, 22, 216));
        botonConfirmarCarrito.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        botonConfirmarCarrito.setForeground(new java.awt.Color(255, 255, 255));
        botonConfirmarCarrito.setText("CONFIRMAR");
        botonConfirmarCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonConfirmarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConfirmarCarritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DerechaLayout = new javax.swing.GroupLayout(Derecha);
        Derecha.setLayout(DerechaLayout);
        DerechaLayout.setHorizontalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DerechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DerechaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonConfirmarCarrito)
                .addGap(38, 38, 38))
        );
        DerechaLayout.setVerticalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DerechaLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botonConfirmarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jPanel1.add(Derecha);
        Derecha.setBounds(160, 0, 640, 500);

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

    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonInicioActionPerformed

    private void botonMiPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMiPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMiPerfilActionPerformed

    private void botonCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCarritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCarritoActionPerformed

    private void BotonMisComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMisComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonMisComprasActionPerformed

    private void BotonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarSesionActionPerformed
        VentanaAcceso va = new VentanaAcceso(controlador);
        va.setLocationRelativeTo(null);
        va.pack();
        this.dispose();
        va.setVisible(true);
        controlador.cerrarSesion();
    }//GEN-LAST:event_BotonCerrarSesionActionPerformed

    private void botonConfirmarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarCarritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonConfirmarCarritoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrarSesion;
    private javax.swing.JButton BotonInicio;
    private javax.swing.JButton BotonMisCompras;
    private javax.swing.JPanel Derecha;
    private javax.swing.JPanel ItemCarrito;
    private javax.swing.JPanel Izquierda;
    private javax.swing.JButton botonCarrito;
    private javax.swing.JButton botonConfirmarCarrito;
    private javax.swing.JButton botonMiPerfil;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelNombreProducto;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JPanel panelCarritoItem;
    // End of variables declaration//GEN-END:variables
}
