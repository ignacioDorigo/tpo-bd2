package interfaces.gui;

import aplicacion.Controlador;
import javax.swing.table.DefaultTableModel;

public class VentanaCarrito extends javax.swing.JFrame {
    private Controlador controlador;
    private Object[][] datos;
    public VentanaCarrito(Controlador controlador) {
        this.controlador = controlador;
        //this.datos = controlador.datosTablaCarrito();
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
        botonConfirmarCarrito = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCarrito = new javax.swing.JTable();
        labelTextoTotal = new javax.swing.JLabel();
        labelTotal = new javax.swing.JLabel();
        botonCarritoAnterior = new javax.swing.JButton();
        botonVaciarCarrito = new javax.swing.JButton();

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
                    .addComponent(BotonMisCompras)
                    .addComponent(BotonCerrarSesion)
                    .addComponent(BotonInicio))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(IzquierdaLayout.createSequentialGroup()
                .addComponent(botonCarrito)
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

        DefaultTableModel tableModel = new javax.swing.table.DefaultTableModel(new Object [][] {},
            new String [] {
                "ID","Nombre", "Cantidad", "SubTotal"
            }
        );

        for(Object[] fila : this.datos){
            tableModel.addRow(fila);
        }
        tablaCarrito.setModel(tableModel);
        jScrollPane1.setViewportView(tablaCarrito);

        labelTextoTotal.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14)); // NOI18N
        labelTextoTotal.setText("TOTAL");

        botonCarritoAnterior.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        botonCarritoAnterior.setForeground(new java.awt.Color(22, 22, 216));
        botonCarritoAnterior.setText("Carrito Anterior");
        botonCarritoAnterior.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonCarritoAnterior.setOpaque(false);
        botonCarritoAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCarritoAnteriorActionPerformed(evt);
            }
        });

        botonVaciarCarrito.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 12)); // NOI18N
        botonVaciarCarrito.setForeground(new java.awt.Color(22, 22, 216));
        botonVaciarCarrito.setText("Vaciar Carrito");
        botonVaciarCarrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonVaciarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVaciarCarritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DerechaLayout = new javax.swing.GroupLayout(Derecha);
        Derecha.setLayout(DerechaLayout);
        DerechaLayout.setHorizontalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DerechaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelTextoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(DerechaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(botonCarritoAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DerechaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(botonVaciarCarrito)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonConfirmarCarrito)
                .addGap(48, 48, 48))
        );
        DerechaLayout.setVerticalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DerechaLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(botonCarritoAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTextoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonConfirmarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonVaciarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57))
        );

        labelTotal.setText("");

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

    private void botonConfirmarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConfirmarCarritoActionPerformed

    }//GEN-LAST:event_botonConfirmarCarritoActionPerformed

    private void botonCarritoAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCarritoAnteriorActionPerformed
        if(controlador.estadoAnteriorCarrito()){
            VentanaCarrito ventana = new VentanaCarrito(controlador);
            ventana.setLocationRelativeTo(null);
            ventana.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_botonCarritoAnteriorActionPerformed

    private void botonVaciarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVaciarCarritoActionPerformed
        
        controlador.vaciarCarrito();
        VentanaCarrito ventana = new VentanaCarrito(controlador);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonVaciarCarritoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCerrarSesion;
    private javax.swing.JButton BotonInicio;
    private javax.swing.JButton BotonMisCompras;
    private javax.swing.JPanel Derecha;
    private javax.swing.JPanel Izquierda;
    private javax.swing.JButton botonCarrito;
    private javax.swing.JButton botonCarritoAnterior;
    private javax.swing.JButton botonConfirmarCarrito;
    private javax.swing.JButton botonMiPerfil;
    private javax.swing.JButton botonVaciarCarrito;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTextoTotal;
    private javax.swing.JLabel labelTotal;
    private javax.swing.JTable tablaCarrito;
    // End of variables declaration//GEN-END:variables
}
