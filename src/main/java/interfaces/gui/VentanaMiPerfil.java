package interfaces.gui;

import aplicacion.Controlador;
import org.bson.Document;

public class VentanaMiPerfil extends javax.swing.JFrame {
    private Controlador controlador;
    private Document usuario;
    public VentanaMiPerfil(Controlador controlador) {
        this.controlador = controlador;
        this.usuario = controlador.getUsuario();
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
        labelNombre = new javax.swing.JLabel();
        labelDatosUsuario = new javax.swing.JLabel();
        labelCorreo = new javax.swing.JLabel();
        labelDocumento = new javax.swing.JLabel();
        labelDireccion = new javax.swing.JLabel();
        infoNombre = new javax.swing.JLabel();
        infoCorreo = new javax.swing.JLabel();
        infoDocumento = new javax.swing.JLabel();
        infoDireccion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi Perfil");
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
        botonMiPerfil.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        botonMiPerfil.setForeground(new java.awt.Color(255, 255, 255));
        botonMiPerfil.setText("<HTML><U>Mi Perfil</U></HTML>");
        botonMiPerfil.setBorder(null);
        botonMiPerfil.setContentAreaFilled(false);
        botonMiPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMiPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMiPerfilActionPerformed(evt);
            }
        });

        botonCarrito.setBackground(new java.awt.Color(22, 22, 216));
        botonCarrito.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        botonCarrito.setForeground(new java.awt.Color(255, 255, 255));
        botonCarrito.setText("Carrito");
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
                    .addComponent(botonCarrito)
                    .addComponent(BotonMisCompras)
                    .addComponent(BotonCerrarSesion)
                    .addComponent(BotonInicio))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(IzquierdaLayout.createSequentialGroup()
                .addComponent(botonMiPerfil)
                .addGap(0, 0, Short.MAX_VALUE))
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

        labelNombre.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        labelNombre.setText("Nombre: ");

        labelDatosUsuario.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        labelDatosUsuario.setText("Datos Usuario");

        labelCorreo.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        labelCorreo.setText("Correo:");

        labelDocumento.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        labelDocumento.setText("Documento:");

        labelDireccion.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        labelDireccion.setText("Direccion: ");

        infoNombre.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        infoNombre.setText("-");
        infoNombre.setText(this.usuario.getString("nombre"));

        infoCorreo.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        infoCorreo.setText("-");
        infoCorreo.setText(usuario.getString("correo"));

        infoDocumento.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        infoDocumento.setText("-");
        infoDocumento.setText(usuario.getString("documento"));

        infoDireccion.setFont(new java.awt.Font("Yu Gothic UI", 0, 16)); // NOI18N
        infoDireccion.setText("-");
        infoDireccion.setText(usuario.getString("direccion"));

        javax.swing.GroupLayout DerechaLayout = new javax.swing.GroupLayout(Derecha);
        Derecha.setLayout(DerechaLayout);
        DerechaLayout.setHorizontalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DerechaLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DerechaLayout.createSequentialGroup()
                        .addComponent(labelDireccion)
                        .addGap(18, 18, 18)
                        .addComponent(infoDireccion))
                    .addGroup(DerechaLayout.createSequentialGroup()
                        .addComponent(labelDocumento)
                        .addGap(18, 18, 18)
                        .addComponent(infoDocumento))
                    .addGroup(DerechaLayout.createSequentialGroup()
                        .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelNombre)
                            .addComponent(labelCorreo))
                        .addGap(18, 18, 18)
                        .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoNombre)
                            .addComponent(infoCorreo))))
                .addContainerGap(456, Short.MAX_VALUE))
            .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DerechaLayout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(labelDatosUsuario)
                    .addContainerGap(433, Short.MAX_VALUE)))
        );
        DerechaLayout.setVerticalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DerechaLayout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(infoNombre))
                .addGap(18, 18, 18)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCorreo)
                    .addComponent(infoCorreo))
                .addGap(18, 18, 18)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDocumento)
                    .addComponent(infoDocumento))
                .addGap(18, 18, 18)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDireccion)
                    .addComponent(infoDireccion))
                .addContainerGap(221, Short.MAX_VALUE))
            .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DerechaLayout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addComponent(labelDatosUsuario)
                    .addContainerGap(417, Short.MAX_VALUE)))
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
        VentanaInicio ventana = new VentanaInicio(controlador);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();      
    }//GEN-LAST:event_BotonInicioActionPerformed

    private void botonMiPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMiPerfilActionPerformed
        VentanaMiPerfil ventana = new VentanaMiPerfil(controlador);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_botonMiPerfilActionPerformed

    private void botonCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCarritoActionPerformed
        VentanaCarrito ventana = new VentanaCarrito(controlador);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_botonCarritoActionPerformed

    private void BotonMisComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMisComprasActionPerformed
        VentanaMisPedidos ventana = new VentanaMisPedidos(controlador);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();  
    }//GEN-LAST:event_BotonMisComprasActionPerformed

    private void BotonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarSesionActionPerformed
        VentanaAcceso va = new VentanaAcceso(controlador);
        va.setLocationRelativeTo(null);
        va.pack();
        this.dispose();
        va.setVisible(true);
        controlador.cerrarSesion();
    }//GEN-LAST:event_BotonCerrarSesionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrarSesion;
    private javax.swing.JButton BotonInicio;
    private javax.swing.JButton BotonMisCompras;
    private javax.swing.JPanel Derecha;
    private javax.swing.JPanel Izquierda;
    private javax.swing.JButton botonCarrito;
    private javax.swing.JButton botonMiPerfil;
    private javax.swing.JLabel infoCorreo;
    private javax.swing.JLabel infoDireccion;
    private javax.swing.JLabel infoDocumento;
    private javax.swing.JLabel infoNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCorreo;
    private javax.swing.JLabel labelDatosUsuario;
    private javax.swing.JLabel labelDireccion;
    private javax.swing.JLabel labelDocumento;
    private javax.swing.JLabel labelNombre;
    // End of variables declaration//GEN-END:variables
}
