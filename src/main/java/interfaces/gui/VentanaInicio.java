package interfaces.gui;

import aplicacion.Controlador;
import javax.swing.table.DefaultTableModel;

public class VentanaInicio extends javax.swing.JFrame {
    private Controlador controlador;
    private Object[][] datos;
    public VentanaInicio(Controlador controlador) {
        this.controlador = controlador;
        this.datos = controlador.datosTablaProductos();
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Izquierda = new javax.swing.JPanel();
        BotonCerrarSesion = new javax.swing.JButton();
        BotonInicio = new javax.swing.JButton();
        BotonMisCompras = new javax.swing.JButton();
        botonCarrito = new javax.swing.JButton();
        botonMiPerfil = new javax.swing.JButton();
        Derecha = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        cajaID = new javax.swing.JTextField();
        cajaCantidad = new javax.swing.JTextField();
        botonAgregarAlCarrito = new javax.swing.JButton();
        labelIDProducto = new javax.swing.JLabel();
        labelCantidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));
        jPanel1.setLayout(null);

        Izquierda.setBackground(new java.awt.Color(22, 22, 216));
        Izquierda.setMaximumSize(null);

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

        BotonInicio.setBackground(new java.awt.Color(22, 22, 216));
        BotonInicio.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        BotonInicio.setForeground(new java.awt.Color(255, 255, 255));
        BotonInicio.setText("<HTML><U>Inicio</U></HTML>");
        BotonInicio.setToolTipText("");
        BotonInicio.setBorder(null);
        BotonInicio.setContentAreaFilled(false);
        BotonInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonInicio.setFocusPainted(false);
        BotonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInicioActionPerformed(evt);
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

        javax.swing.GroupLayout IzquierdaLayout = new javax.swing.GroupLayout(Izquierda);
        Izquierda.setLayout(IzquierdaLayout);
        IzquierdaLayout.setHorizontalGroup(
            IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IzquierdaLayout.createSequentialGroup()
                .addGroup(IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IzquierdaLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonMiPerfil)
                            .addComponent(botonCarrito)
                            .addComponent(BotonMisCompras)
                            .addComponent(BotonCerrarSesion)))
                    .addGroup(IzquierdaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotonInicio)))
                .addContainerGap(22, Short.MAX_VALUE))
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

        jScrollPane1.setBorder(null);

        DefaultTableModel tableModel = new javax.swing.table.DefaultTableModel(new Object [][] {},
            new String [] {
                "ID", "Nombre", "Precio", "Stock"
            }
        );

        for(Object[] fila : this.datos){
            tableModel.addRow(fila);
        }
        tablaProductos.setModel(tableModel);
        tablaProductos.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tablaProductos);

        cajaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaIDActionPerformed(evt);
            }
        });

        botonAgregarAlCarrito.setBackground(new java.awt.Color(22, 22, 216));
        botonAgregarAlCarrito.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 12)); // NOI18N
        botonAgregarAlCarrito.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregarAlCarrito.setText("AGREGAR");
        botonAgregarAlCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonAgregarAlCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarAlCarritoActionPerformed(evt);
            }
        });

        labelIDProducto.setText("ID Producto");

        labelCantidad.setText("Cantidad");

        javax.swing.GroupLayout DerechaLayout = new javax.swing.GroupLayout(Derecha);
        Derecha.setLayout(DerechaLayout);
        DerechaLayout.setHorizontalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DerechaLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(DerechaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaID, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIDProducto))
                .addGap(18, 18, 18)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DerechaLayout.createSequentialGroup()
                        .addComponent(cajaCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(botonAgregarAlCarrito))
                    .addComponent(labelCantidad))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DerechaLayout.setVerticalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DerechaLayout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelIDProducto)
                    .addComponent(labelCantidad))
                .addGap(18, 18, 18)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cajaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregarAlCarrito))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel1.add(Derecha);
        Derecha.setBounds(160, 0, 840, 500);

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

    private void BotonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInicioActionPerformed
        VentanaInicio ventana = new VentanaInicio(controlador);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonInicioActionPerformed

    private void BotonMisComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMisComprasActionPerformed
        VentanaMisCompras ventana = new VentanaMisCompras(controlador);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BotonMisComprasActionPerformed

    private void botonCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCarritoActionPerformed
        VentanaCarrito ventana = new VentanaCarrito(controlador);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonCarritoActionPerformed

    private void botonMiPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMiPerfilActionPerformed
        VentanaMiPerfil ventana = new VentanaMiPerfil(controlador);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonMiPerfilActionPerformed

    private void botonAgregarAlCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarAlCarritoActionPerformed
        String identificador = cajaID.getText();
        String textoCantidad = cajaCantidad.getText();

        if (identificador.isEmpty() || textoCantidad.isEmpty() || !textoCantidad.matches("\\d+")) {
            // si cualquiera de las cajas de texto estan vacias o el texto cantidad no es un numero termina el metodo
            return;
        }
        int cantidad = Integer.parseInt(textoCantidad);
        // valida que el id ingresado este en la tabla productos.
        if (controlador.existeProductoEnMatriz(this.datos, identificador)){
            controlador.agregarProductoCarrito(identificador, cantidad);
        }
        else {
            controlador.ventanaError();
        }
        cajaID.setText("");
        cajaCantidad.setText("");

    }//GEN-LAST:event_botonAgregarAlCarritoActionPerformed

    private void cajaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrarSesion;
    private javax.swing.JButton BotonInicio;
    private javax.swing.JButton BotonMisCompras;
    private javax.swing.JPanel Derecha;
    private javax.swing.JPanel Izquierda;
    private javax.swing.JButton botonAgregarAlCarrito;
    private javax.swing.JButton botonCarrito;
    private javax.swing.JButton botonMiPerfil;
    private javax.swing.JTextField cajaCantidad;
    private javax.swing.JTextField cajaID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCantidad;
    private javax.swing.JLabel labelIDProducto;
    private javax.swing.JTable tablaProductos;
    // End of variables declaration//GEN-END:variables
}
