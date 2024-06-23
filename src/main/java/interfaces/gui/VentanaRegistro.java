package interfaces.gui;

import aplicacion.Controlador;
import aplicacion.ResultadoRegistroUsuario;
import org.bson.Document;
import org.bson.types.ObjectId;


public class VentanaRegistro extends javax.swing.JFrame {
    private final Controlador controlador;
 
    public VentanaRegistro(Controlador controlador) {
        this.controlador = controlador;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelIzquierda = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        panelDerecha = new javax.swing.JPanel();
        LabelCrearCuenta = new javax.swing.JLabel();
        LabelNombreCompleto = new javax.swing.JLabel();
        cajaDocumento = new javax.swing.JTextField();
        LabelCorreo = new javax.swing.JLabel();
        cajaCorreo = new javax.swing.JTextField();
        LabelContrasena = new javax.swing.JLabel();
        cajaContrasena = new javax.swing.JPasswordField();
        LabelTengoCuenta = new javax.swing.JLabel();
        botonRegistrarse = new javax.swing.JButton();
        botonInicioSesion = new javax.swing.JButton();
        cajaNombre = new javax.swing.JTextField();
        LabelDocumento = new javax.swing.JLabel();
        cajaDireccion = new javax.swing.JTextField();
        LabelDireccion = new javax.swing.JLabel();
        campoObligatorioNombre = new javax.swing.JLabel();
        campoObligatorioCorreo = new javax.swing.JLabel();
        campoObligatorioContrasena = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Cuenta");
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(800, 500));
        panelPrincipal.setLayout(null);

        panelIzquierda.setBackground(new java.awt.Color(22, 22, 216));

        LabelTitulo.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        LabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        LabelTitulo.setText("TPO BD2");

        javax.swing.GroupLayout panelIzquierdaLayout = new javax.swing.GroupLayout(panelIzquierda);
        panelIzquierda.setLayout(panelIzquierdaLayout);
        panelIzquierdaLayout.setHorizontalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(LabelTitulo)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        panelIzquierdaLayout.setVerticalGroup(
            panelIzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIzquierdaLayout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(LabelTitulo)
                .addContainerGap(269, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelIzquierda);
        panelIzquierda.setBounds(0, 0, 400, 500);

        panelDerecha.setBackground(new java.awt.Color(255, 255, 255));

        LabelCrearCuenta.setBackground(new java.awt.Color(0, 0, 0));
        LabelCrearCuenta.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        LabelCrearCuenta.setText("Crear cuenta");

        LabelNombreCompleto.setBackground(new java.awt.Color(102, 102, 102));
        LabelNombreCompleto.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        LabelNombreCompleto.setText("Nombre completo");

        cajaDocumento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cajaDocumento.setForeground(new java.awt.Color(102, 102, 102));
        cajaDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaDocumentoActionPerformed(evt);
            }
        });

        LabelCorreo.setBackground(new java.awt.Color(102, 102, 102));
        LabelCorreo.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        LabelCorreo.setText("Correo electrónico");

        cajaCorreo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cajaCorreo.setForeground(new java.awt.Color(102, 102, 102));
        cajaCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaCorreoActionPerformed(evt);
            }
        });

        LabelContrasena.setBackground(new java.awt.Color(102, 102, 102));
        LabelContrasena.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        LabelContrasena.setText("Contraseña");

        cajaContrasena.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cajaContrasena.setForeground(new java.awt.Color(102, 102, 102));

        LabelTengoCuenta.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        LabelTengoCuenta.setText("Ya tengo una cuenta");

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

        LabelDocumento.setBackground(new java.awt.Color(102, 102, 102));
        LabelDocumento.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        LabelDocumento.setText("Documento");

        cajaDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cajaDireccion.setForeground(new java.awt.Color(102, 102, 102));

        LabelDireccion.setBackground(new java.awt.Color(102, 102, 102));
        LabelDireccion.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        LabelDireccion.setText("Dirección");

        campoObligatorioNombre.setForeground(new java.awt.Color(255, 51, 51));
        campoObligatorioNombre.setText("campo obligatorio");
        campoObligatorioNombre.setVisible(false);

        campoObligatorioCorreo.setForeground(new java.awt.Color(255, 51, 51));
        campoObligatorioCorreo.setText("campo inválido");
        campoObligatorioCorreo.setVisible(false);

        campoObligatorioContrasena.setForeground(new java.awt.Color(255, 51, 51));
        campoObligatorioContrasena.setText("campo obligatorio");
        campoObligatorioContrasena.setVisible(false);

        javax.swing.GroupLayout panelDerechaLayout = new javax.swing.GroupLayout(panelDerecha);
        panelDerecha.setLayout(panelDerechaLayout);
        panelDerechaLayout.setHorizontalGroup(
            panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDerechaLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDerechaLayout.createSequentialGroup()
                        .addGroup(panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelDireccion)
                            .addGroup(panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cajaDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                .addComponent(cajaCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                .addComponent(cajaContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                .addComponent(cajaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                .addGroup(panelDerechaLayout.createSequentialGroup()
                                    .addComponent(LabelNombreCompleto)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(campoObligatorioNombre))
                                .addGroup(panelDerechaLayout.createSequentialGroup()
                                    .addComponent(LabelContrasena)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(campoObligatorioContrasena))
                                .addComponent(LabelDocumento)
                                .addComponent(botonRegistrarse))
                            .addGroup(panelDerechaLayout.createSequentialGroup()
                                .addComponent(LabelCorreo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoObligatorioCorreo)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelDerechaLayout.createSequentialGroup()
                        .addGroup(panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDerechaLayout.createSequentialGroup()
                                .addComponent(LabelTengoCuenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonInicioSesion))
                            .addComponent(cajaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelCrearCuenta))
                        .addGap(0, 16, Short.MAX_VALUE))))
        );
        panelDerechaLayout.setVerticalGroup(
            panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDerechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelCrearCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNombreCompleto)
                    .addComponent(campoObligatorioNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelDocumento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelDireccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelCorreo)
                    .addComponent(campoObligatorioCorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cajaCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelContrasena)
                    .addComponent(campoObligatorioContrasena))
                .addGap(7, 7, 7)
                .addComponent(cajaContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botonRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTengoCuenta)
                    .addComponent(botonInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
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

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }

    private void botonInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
        VentanaAcceso va = new VentanaAcceso(controlador);
        va.setVisible(true);
        va.pack();
        va.setLocationRelativeTo(null);
        this.dispose();
    }

    private void cajaDocumentoActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {
        // Carga los datos de las cajas
        String nombre = cajaNombre.getText();
        String correo = cajaCorreo.getText();
        String contrasena = String.valueOf(cajaContrasena.getPassword());

        // Valida que se ingrese nombre, un correo con formato valido y contrasena para registrar usuario
        if (camposObligatorios(nombre, correo, contrasena)){

            Document infoUsuario = new Document("_id", new ObjectId())
                    .append("nombre", nombre)
                    .append("correo", correo)
                    .append("contrasena", contrasena);

            String documento = cajaDocumento.getText();
            if (!documento.isEmpty()){
                infoUsuario.append("documento", documento);
            }
            String direccion = cajaDireccion.getText();
            if (!direccion.isEmpty()){
                infoUsuario.append("direccion", direccion);
            }

            ResultadoRegistroUsuario resultado = controlador.registrarUsuario(infoUsuario);

            switch (resultado) {
                case USUARIO_EXISTENTE:
                    Controlador.logger.info("Error: Ya existe un usuario con con esa direccion de correo.");
                    usuarioExistente();
                    break;
                case ERROR_INESPERADO:
                    Controlador.logger.info("Registro fallido. Ocurrio un error inesperado.");
                    break;
                case USUARIO_CREADO:
                    VentanaUsuarioInicio vd = new VentanaUsuarioInicio(controlador);
                    vd.setLocationRelativeTo(null);
                    vd.setVisible(true);
                    this.dispose();
                    break;
            }
        }
        else {
            Controlador.logger.info("Registro fallido. Faltan campos obligatorios");
        }
    }

    private void cajaCorreoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }

    private boolean camposObligatorios(String nombre, String correo, String contrasena){
        // Despliega mensaje indicando los campos obligatorios vacios

        boolean nombreValido= !nombre.isEmpty();
        boolean correoValido= controlador.validarFormatoCorreo(correo);
        boolean contrasenaValida = !contrasena.isEmpty();

        campoObligatorioNombre.setVisible(false);
        campoObligatorioCorreo.setVisible(false);
        campoObligatorioContrasena.setVisible(false);

        if (!nombreValido){
            campoObligatorioNombre.setVisible(true);
        }
        if (!correoValido){
            campoObligatorioCorreo.setText("campo invalido");
            campoObligatorioCorreo.setVisible(true);
        }
        if (!contrasenaValida){
            campoObligatorioContrasena.setVisible(true);
        }
        return nombreValido && correoValido && contrasenaValida;
    }

    public void usuarioExistente(){
        campoObligatorioCorreo.setText("Ya existe una cuenta con este correo.");
        campoObligatorioCorreo.setVisible(true);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelContrasena;
    private javax.swing.JLabel LabelCorreo;
    private javax.swing.JLabel LabelCrearCuenta;
    private javax.swing.JLabel LabelDireccion;
    private javax.swing.JLabel LabelDocumento;
    private javax.swing.JLabel LabelNombreCompleto;
    private javax.swing.JLabel LabelTengoCuenta;
    private javax.swing.JLabel LabelTitulo;
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
    private javax.swing.JPanel panelDerecha;
    private javax.swing.JPanel panelIzquierda;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
