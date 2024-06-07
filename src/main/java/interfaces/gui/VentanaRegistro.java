
package interfaces.gui;


import aplicacion.Controlador;
import aplicacion.InfoRegistroDTO;

public class VentanaRegistro extends javax.swing.JFrame {
    private final Controlador controlador;
 
    public VentanaRegistro(Controlador controlador) {
        this.controlador = controlador;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cajaDocumento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cajaCorreo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        cajaContrasena = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        botonRegistrarse = new javax.swing.JButton();
        botonInicioSesion = new javax.swing.JButton();
        cajaNombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cajaDireccion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        campoObligatorioNombre = new javax.swing.JLabel();
        campoObligatorioNombre.setVisible(false);
        campoObligatorioCorreo = new javax.swing.JLabel();
        campoObligatorioCorreo.setVisible(false);
        campoObligatorioContrasena = new javax.swing.JLabel();
        campoObligatorioContrasena.setVisible(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(22, 22, 216));

        jLabel2.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TPO BD2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addContainerGap(269, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 500);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel4.setText("Crear cuenta");

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel5.setText("Nombre completo");

        cajaDocumento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cajaDocumento.setForeground(new java.awt.Color(102, 102, 102));
        cajaDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaDocumentoActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel6.setText("Correo electrónico");

        cajaCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cajaCorreo.setForeground(new java.awt.Color(102, 102, 102));
        cajaCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaCorreoActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel7.setText("Contraseña");

        cajaContrasena.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cajaContrasena.setForeground(new java.awt.Color(102, 102, 102));

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel8.setText("Ya tengo una cuenta");

        botonRegistrarse.setBackground(new java.awt.Color(22, 22, 216));
        botonRegistrarse.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        botonRegistrarse.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrarse.setText("Registrarse");
        botonRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });

        botonInicioSesion.setFont(new java.awt.Font("Microsoft YaHei", 1, 12)); // NOI18N
        botonInicioSesion.setForeground(new java.awt.Color(22, 22, 216));
        botonInicioSesion.setText("Iniciar sesión");
        botonInicioSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInicioSesionActionPerformed(evt);
            }
        });

        cajaNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cajaNombre.setForeground(new java.awt.Color(102, 102, 102));
        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(102, 102, 102));
        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel9.setText("Documento");

        cajaDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cajaDireccion.setForeground(new java.awt.Color(102, 102, 102));

        jLabel10.setBackground(new java.awt.Color(102, 102, 102));
        jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        jLabel10.setText("Dirección");

        campoObligatorioNombre.setForeground(new java.awt.Color(255, 51, 51));
        campoObligatorioNombre.setText("campo obligatorio");

        campoObligatorioCorreo.setForeground(new java.awt.Color(255, 51, 51));
        campoObligatorioCorreo.setText("campo invalido");

        campoObligatorioContrasena.setForeground(new java.awt.Color(255, 51, 51));
        campoObligatorioContrasena.setText("campo obligatorio");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cajaDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                .addComponent(cajaCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                .addComponent(cajaContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                .addComponent(cajaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(campoObligatorioNombre))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(campoObligatorioContrasena))
                                .addComponent(jLabel9)
                                .addComponent(botonRegistrarse))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoObligatorioCorreo)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonInicioSesion))
                            .addComponent(cajaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(0, 16, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(campoObligatorioNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoObligatorioCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoObligatorioContrasena))
                .addGap(7, 7, 7)
                .addComponent(cajaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(botonInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(400, 0, 400, 500);

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

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaNombreActionPerformed

    private void botonInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInicioSesionActionPerformed
        // TODO add your handling code here:
        VentanaAcceso va = new VentanaAcceso(controlador);
        va.setVisible(true);
        va.pack();
        va.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_botonInicioSesionActionPerformed

    private void cajaDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaDocumentoActionPerformed

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        InfoRegistroDTO reg = new InfoRegistroDTO();
        boolean operacionExitosa = false;
        // Carga los datos de las cajas
        String nombre = cajaNombre.getText();
        String documento = cajaDocumento.getText();
        String direccion = cajaDireccion.getText();
        String correo = cajaCorreo.getText();
        char[] aux = cajaContrasena.getPassword();
        String contrasena = new String(aux);

        // Valida que se ingrese nombre, un correo valido y contrasena para registrar usuario
        if (!nombre.isEmpty() && controlador.validarFormatoCorreo(correo) && !contrasena.isEmpty()){
            reg.nombre = nombre;
            reg.correo = correo;
            reg.contrasena = contrasena;
            if (!documento.isEmpty()){
                reg.documento = documento;
            }
            if (!direccion.isEmpty()){
                reg.direccion = direccion;
            }
            operacionExitosa = controlador.crearUsuario(reg);
            Controlador.logger.info("Registro validado");

        }

        else {
            Controlador.logger.info("Registro fallido. Faltan campos obligatorios");
            camposObligatorios(nombre, correo, contrasena);
        }
        // si el registro fue exitoso se abre la ventana de homepage
        if(operacionExitosa){
            VentanaHomePage vh = new VentanaHomePage(controlador);
            vh.setVisible(true);
            vh.pack();
            vh.setLocationRelativeTo(null);
            this.dispose();
        }

    }//GEN-LAST:event_botonRegistrarseActionPerformed

    private void cajaCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaCorreoActionPerformed

    private void camposObligatorios(String nombre, String correo, String contrasena){
        // Despliega mensaje indicando los campos obligatorios vacios

        boolean nombreValido= !nombre.isEmpty();
        boolean correValido= controlador.validarFormatoCorreo(correo);
        boolean contrasenaValida = !contrasena.isEmpty();

        campoObligatorioNombre.setVisible(false);
        campoObligatorioCorreo.setVisible(false);
        campoObligatorioContrasena.setVisible(false);

        if (!nombreValido){
            campoObligatorioNombre.setVisible(true);
        }
        if (!correValido){
            campoObligatorioCorreo.setVisible(true);
        }
        if (!contrasenaValida){
            campoObligatorioContrasena.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonInicioSesion;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JPasswordField cajaContrasena;
    private javax.swing.JTextField cajaCorreo;
    private javax.swing.JTextField cajaDireccion;
    private javax.swing.JTextField cajaDocumento;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JLabel campoObligatorioContrasena;
    private javax.swing.JLabel campoObligatorioCorreo;
    private javax.swing.JLabel campoObligatorioNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
