package interfaces.gui;

import aplicacion.Controlador;

public class VentanaAdminFacturas extends javax.swing.JFrame {
    private Controlador controlador;
  
    public VentanaAdminFacturas(Controlador controlador) {
        this.controlador = controlador;
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Izquierda = new javax.swing.JPanel();
        botonUsuarios = new javax.swing.JButton();
        botonFacturas = new javax.swing.JButton();
        Derecha = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador - Facturas");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Izquierda.setBackground(new java.awt.Color(22, 22, 216));
        Izquierda.setMaximumSize(null);

        botonUsuarios.setBackground(new java.awt.Color(22, 22, 216));
        botonUsuarios.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        botonUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        botonUsuarios.setText("Usuarios");
        botonUsuarios.setToolTipText("");
        botonUsuarios.setBorder(null);
        botonUsuarios.setBorderPainted(false);
        botonUsuarios.setContentAreaFilled(false);
        botonUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUsuariosActionPerformed(evt);
            }
        });

        botonFacturas.setBackground(new java.awt.Color(22, 22, 216));
        botonFacturas.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        botonFacturas.setForeground(new java.awt.Color(255, 255, 255));
        botonFacturas.setText("<HTML><U>Facturas</U></HTML>");
        botonFacturas.setBorder(null);
        botonFacturas.setBorderPainted(false);
        botonFacturas.setContentAreaFilled(false);
        botonFacturas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonFacturas.setFocusPainted(false);
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
                    .addComponent(botonFacturas)
                    .addGroup(IzquierdaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(botonUsuarios)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        IzquierdaLayout.setVerticalGroup(
            IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IzquierdaLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(botonUsuarios)
                .addGap(18, 18, 18)
                .addComponent(botonFacturas)
                .addContainerGap(382, Short.MAX_VALUE))
        );

        jPanel1.add(Izquierda);
        Izquierda.setBounds(0, 0, 160, 500);

        Derecha.setBackground(new java.awt.Color(255, 255, 255));
        Derecha.setMaximumSize(null);
        Derecha.setPreferredSize(new java.awt.Dimension(400, 500));

        javax.swing.GroupLayout DerechaLayout = new javax.swing.GroupLayout(Derecha);
        Derecha.setLayout(DerechaLayout);
        DerechaLayout.setHorizontalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        DerechaLayout.setVerticalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
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

    private void botonUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUsuariosActionPerformed
        VentanaAdminUsuarios ventana = new VentanaAdminUsuarios(controlador);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonUsuariosActionPerformed

    private void botonFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFacturasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonFacturasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Derecha;
    private javax.swing.JPanel Izquierda;
    private javax.swing.JButton botonFacturas;
    private javax.swing.JButton botonUsuarios;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
