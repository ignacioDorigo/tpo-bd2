
package interfaces.gui;


import aplicacion.Controlador;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaHomePage extends javax.swing.JFrame {
    private Controlador controlador;
  
    public VentanaHomePage(Controlador controlador) {
        this.controlador = controlador;
        initComponents();
        setExtendedState(VentanaHomePage.MAXIMIZED_BOTH);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Izquierda = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        BotonCerrarSesion = new javax.swing.JButton();
        BotonCatalogo1 = new javax.swing.JButton("<HTML><U>YOUR TEXT HERE</U></HTML>");
        BotonMisCompras = new javax.swing.JButton();
        Derecha = new javax.swing.JPanel();
        bienvenido1 = new javax.swing.JLabel();
        LabelNombreUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Izquierda.setBackground(new java.awt.Color(22, 22, 216));
        Izquierda.setMaximumSize(null);

        BotonCerrarSesion.setBackground(new java.awt.Color(22, 22, 216));
        BotonCerrarSesion.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
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

        BotonCatalogo1.setBackground(new java.awt.Color(22, 22, 216));
        BotonCatalogo1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        BotonCatalogo1.setForeground(new java.awt.Color(255, 255, 255));
        BotonCatalogo1.setText("Inicio");
        BotonCatalogo1.setToolTipText("");
        BotonCatalogo1.setBorder(null);
        BotonCatalogo1.setContentAreaFilled(false);
        BotonCatalogo1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCatalogo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCatalogo1ActionPerformed(evt);
            }
        });

        BotonMisCompras.setBackground(new java.awt.Color(22, 22, 216));
        BotonMisCompras.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
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

        javax.swing.GroupLayout IzquierdaLayout = new javax.swing.GroupLayout(Izquierda);
        Izquierda.setLayout(IzquierdaLayout);
        IzquierdaLayout.setHorizontalGroup(
            IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IzquierdaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IzquierdaLayout.createSequentialGroup()
                        .addComponent(BotonMisCompras)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel5))
                    .addComponent(BotonCerrarSesion)
                    .addComponent(BotonCatalogo1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        IzquierdaLayout.setVerticalGroup(
            IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IzquierdaLayout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(BotonCatalogo1)
                .addGroup(IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IzquierdaLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel5))
                    .addGroup(IzquierdaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BotonMisCompras)))
                .addGap(18, 18, 18)
                .addComponent(BotonCerrarSesion)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        jPanel1.add(Izquierda);
        Izquierda.setBounds(0, 0, 140, 500);

        Derecha.setBackground(new java.awt.Color(255, 255, 255));
        Derecha.setMaximumSize(null);
        Derecha.setPreferredSize(new java.awt.Dimension(400, 500));

        bienvenido1.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        bienvenido1.setForeground(new java.awt.Color(22, 22, 216));
        bienvenido1.setText("Bienvenido, ");

        LabelNombreUsuario.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        LabelNombreUsuario.setForeground(new java.awt.Color(22, 22, 216));
        LabelNombreUsuario.setText(controlador.getUsuario().getNombre());

        javax.swing.GroupLayout DerechaLayout = new javax.swing.GroupLayout(Derecha);
        Derecha.setLayout(DerechaLayout);
        DerechaLayout.setHorizontalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DerechaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(bienvenido1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNombreUsuario)
                .addContainerGap(279, Short.MAX_VALUE))
        );
        DerechaLayout.setVerticalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DerechaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LabelNombreUsuario)
                    .addComponent(bienvenido1))
                .addContainerGap(446, Short.MAX_VALUE))
        );

        jPanel1.add(Derecha);
        Derecha.setBounds(140, 0, 660, 500);

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

    private void BotonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarSesionActionPerformed
        VentanaAcceso va = new VentanaAcceso(controlador);
        va.setLocationRelativeTo(null);
        va.pack();
        this.dispose();
        va.setVisible(true);
        controlador.cerrarSesion();
    }//GEN-LAST:event_BotonCerrarSesionActionPerformed

    private void BotonCatalogo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCatalogo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCatalogo1ActionPerformed

    private void BotonMisComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMisComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonMisComprasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCatalogo1;
    private javax.swing.JButton BotonCerrarSesion;
    private javax.swing.JButton BotonMisCompras;
    private javax.swing.JPanel Derecha;
    private javax.swing.JPanel Izquierda;
    private javax.swing.JLabel LabelNombreUsuario;
    private javax.swing.JLabel bienvenido1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
