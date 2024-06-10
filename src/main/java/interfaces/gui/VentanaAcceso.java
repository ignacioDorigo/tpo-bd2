package interfaces.gui;

import aplicacion.Controlador;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaAcceso extends javax.swing.JFrame {
    private Controlador controlador;
  
    public VentanaAcceso(Controlador controlador) {
        this.controlador = controlador;
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Left = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cajaCorreo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cajaContrasena = new javax.swing.JPasswordField();
        botonInicioSesion = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        botonRegistrarme = new javax.swing.JButton();
        mensajeError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Right.setBackground(new java.awt.Color(22, 22, 216));
        Right.setMaximumSize(null);

        jLabel6.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Bienvenidos");

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGroup(RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel5))
                    .addGroup(RightLayout.createSequentialGroup()
                        .addContainerGap(130, Short.MAX_VALUE)
                        .addComponent(jLabel6)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightLayout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addComponent(jLabel5)
                .addGap(45, 45, 45)
                .addComponent(jLabel6)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        jPanel1.add(Right);
        Right.setBounds(0, 0, 400, 500);

        Left.setBackground(new java.awt.Color(255, 255, 255));
        Left.setMaximumSize(null);
        Left.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 1, 24)); // NOI18N
        jLabel1.setText("Iniciar Sesión");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel2.setText("Correo electrónico");

        cajaCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cajaCorreo.setForeground(new java.awt.Color(102, 102, 102));
        cajaCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaCorreoActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel3.setText("Contraseña");

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

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel4.setText("¿No tienes una cuenta?");

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
        mensajeError.setText("El correo electrónico o la contraseña proporcionados son incorrectos");
        mensajeError.setVisible(false);

        javax.swing.GroupLayout LeftLayout = new javax.swing.GroupLayout(Left);
        Left.setLayout(LeftLayout);
        LeftLayout.setHorizontalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mensajeError)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(botonInicioSesion)
                    .addGroup(LeftLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(botonRegistrarme, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cajaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cajaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LeftLayout.setVerticalGroup(
            LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mensajeError)
                .addGap(2, 2, 2)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(botonInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(LeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(botonRegistrarme))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        jPanel1.add(Left);
        Left.setBounds(400, 0, 400, 500);

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
            controlador.cargarSesion();
            VentanaInicio vd = new VentanaInicio(controlador);
            vd.addWindowListener(new WindowAdapter() {
                public void windowClosed(WindowEvent e) {
                    controlador.cerrarSesion();
                }
            });
            vd.setLocationRelativeTo(null);
            vd.setVisible(true);
            this.dispose();
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
    private javax.swing.JPanel Left;
    private javax.swing.JPanel Right;
    private javax.swing.JButton botonInicioSesion;
    private javax.swing.JButton botonRegistrarme;
    private javax.swing.JPasswordField cajaContrasena;
    private javax.swing.JTextField cajaCorreo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensajeError;
    // End of variables declaration//GEN-END:variables
}
