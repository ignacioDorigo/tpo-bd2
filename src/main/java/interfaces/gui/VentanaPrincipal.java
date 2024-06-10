package interfaces.gui;


import aplicacion.Controlador;


public class VentanaPrincipal extends javax.swing.JFrame {
    
    private Controlador controlador;
    public VentanaPrincipal() {
        this.controlador = new Controlador();
        initComponents();
    }

    public static void main(String[] args) {
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setLocationRelativeTo(null);
        vp.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BotonAdministrador = new javax.swing.JButton();
        BotonUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TPO BD2");
        setMinimumSize(null);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(22, 22, 216));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SISTEMA DE COMPRAS");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        BotonAdministrador.setBackground(new java.awt.Color(22, 22, 216));
        BotonAdministrador.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        BotonAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        BotonAdministrador.setText("ADMINISTRADOR");
        BotonAdministrador.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonAdministrador.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAdministradorActionPerformed(evt);
            }
        });

        BotonUsuario.setBackground(new java.awt.Color(22, 22, 216));
        BotonUsuario.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        BotonUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotonUsuario.setText("USUARIO");
        BotonUsuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(BotonAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addComponent(BotonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAdministradorActionPerformed
        VentanaAdminUsuarios ventana = new VentanaAdminUsuarios(controlador);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonAdministradorActionPerformed

    private void BotonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUsuarioActionPerformed
        VentanaAcceso va = new VentanaAcceso(controlador);
        va.setLocationRelativeTo(null);
        va.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonUsuarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAdministrador;
    private javax.swing.JButton BotonUsuario;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
