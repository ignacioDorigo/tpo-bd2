package interfaces.gui;

import aplicacion.Controlador;


public class VentanaAcceso extends javax.swing.JFrame {
    private Controlador controlador;
  
    public VentanaAcceso(Controlador controlador) {
        this.controlador = controlador;
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelIzquierda = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panelDerecha = new javax.swing.JPanel();
        iniciarSesion = new javax.swing.JLabel();
        labelCorreoElectronico = new javax.swing.JLabel();
        cajaCorreo = new javax.swing.JTextField();
        labelContrasena = new javax.swing.JLabel();
        cajaContrasena = new javax.swing.JPasswordField();
        botonInicioSesion = new javax.swing.JButton();
        labelNotienesCuenta = new javax.swing.JLabel();
        botonRegistrarme = new javax.swing.JButton();
        mensajeError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesión");
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(800, 500));
        panelPrincipal.setLayout(null);

        panelIzquierda.setBackground(new java.awt.Color(22, 22, 216));
        panelIzquierda.setMaximumSize(null);

        jLabel6.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bienvenidos");

        javax.swing.GroupLayout panelIzquierdaLayout = new javax.swing.GroupLayout(panelIzquierda);
        panelIzquierda.setLayout(panelIzquierdaLayout);
        panelIzquierdaLayout.setHorizontalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        panelIzquierdaLayout.setVerticalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jLabel6)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelIzquierda);
        panelIzquierda.setBounds(0, 0, 400, 500);

        panelDerecha.setBackground(new java.awt.Color(255, 255, 255));
        panelDerecha.setMaximumSize(null);
        panelDerecha.setPreferredSize(new java.awt.Dimension(400, 500));

        iniciarSesion.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        iniciarSesion.setText("Iniciar Sesión");

        labelCorreoElectronico.setBackground(new java.awt.Color(102, 102, 102));
        labelCorreoElectronico.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        labelCorreoElectronico.setText("Correo electrónico");

        cajaCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cajaCorreo.setForeground(new java.awt.Color(102, 102, 102));
        cajaCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaCorreoActionPerformed(evt);
            }
        });

        labelContrasena.setBackground(new java.awt.Color(102, 102, 102));
        labelContrasena.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        labelContrasena.setText("Contraseña");

        cajaContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaContrasenaActionPerformed(evt);
            }
        });

        botonInicioSesion.setBackground(new java.awt.Color(22, 22, 216));
        botonInicioSesion.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        botonInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        botonInicioSesion.setText("Iniciar Sesión");
        botonInicioSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioSesionActionPerformed(evt);
            }
        });

        labelNotienesCuenta.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        labelNotienesCuenta.setText("¿No tienes una cuenta?");

        botonRegistrarme.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        botonRegistrarme.setForeground(new java.awt.Color(22, 22, 216));
        botonRegistrarme.setText("Registrarme");
        botonRegistrarme.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarmeActionPerformed(evt);
            }
        });

        mensajeError.setForeground(new java.awt.Color(255, 51, 51));
        mensajeError.setText("El correo o la contraseña proporcionados son incorrectos");
        mensajeError.setVisible(false);

        javax.swing.GroupLayout panelDerechaLayout = new javax.swing.GroupLayout(panelDerecha);
        panelDerecha.setLayout(panelDerechaLayout);
        panelDerechaLayout.setHorizontalGroup(
            panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDerechaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mensajeError)
                    .addComponent(labelCorreoElectronico)
                    .addComponent(labelContrasena)
                    .addComponent(botonInicioSesion)
                    .addGroup(panelDerechaLayout.createSequentialGroup()
                        .addComponent(labelNotienesCuenta)
                        .addGap(18, 18, 18)
                        .addComponent(botonRegistrarme, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cajaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(iniciarSesion)
                    .addComponent(cajaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDerechaLayout.setVerticalGroup(
            panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDerechaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(iniciarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensajeError)
                .addGap(2, 2, 2)
                .addComponent(labelCorreoElectronico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(labelContrasena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(botonInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelNotienesCuenta)
                    .addComponent(botonRegistrarme))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelDerecha);
        panelDerecha.setBounds(400, 0, 400, 500);

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

    private void botonRegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        VentanaRegistro vr = new VentanaRegistro(controlador);
        vr.setVisible(true);
        vr.pack();
        vr.setLocationRelativeTo(null);
        this.dispose();
    }

    private void botonInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {
        String correo = cajaCorreo.getText();
        char[] aux = cajaContrasena.getPassword();
        String contrasena = new String(aux);
        if (controlador.validarDatosSesion(correo, contrasena)) {
            if (controlador.cargarSesion()){
                VentanaUsuarioInicio vd = new VentanaUsuarioInicio(controlador);
                vd.setLocationRelativeTo(null);
                vd.setVisible(true);
                this.dispose();
            }
            else {
                controlador.ventanaError();
            }
        }
        else {
            mensajeError.setVisible(true);
        }
    }

    private void cajaCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaCorreoActionPerformed

    private void cajaContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaContrasenaActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInicioSesion;
    private javax.swing.JButton botonRegistrarme;
    private javax.swing.JPasswordField cajaContrasena;
    private javax.swing.JTextField cajaCorreo;
    private javax.swing.JLabel iniciarSesion;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel labelContrasena;
    private javax.swing.JLabel labelCorreoElectronico;
    private javax.swing.JLabel labelNotienesCuenta;
    private javax.swing.JLabel mensajeError;
    private javax.swing.JPanel panelDerecha;
    private javax.swing.JPanel panelIzquierda;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
