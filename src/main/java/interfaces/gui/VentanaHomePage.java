package interfaces.gui;


import aplicacion.Controlador;

public class VentanaHomePage extends javax.swing.JFrame {
    private Controlador controlador;

    public VentanaHomePage(Controlador controlador) {
        this.controlador = controlador;
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel1 = new javax.swing.JPanel();
        Izquierda = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        BotonCatalogo = new javax.swing.JButton();
        BotonMisCompras = new javax.swing.JButton();
        BotonCerrarSesion1 = new javax.swing.JButton();
        Derecha = new javax.swing.JPanel();
        LabelNombreUsuario = new javax.swing.JLabel();
        bienvenido1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.setLayout(null);

        Izquierda.setBackground(new java.awt.Color(22, 22, 216));
        Izquierda.setMaximumSize(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gatitoo.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BotonCatalogo.setBackground(new java.awt.Color(22, 22, 216));
        BotonCatalogo.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        BotonCatalogo.setForeground(new java.awt.Color(255, 255, 255));
        BotonCatalogo.setText("Catálogo");
        BotonCatalogo.setBorder(null);
        BotonCatalogo.setContentAreaFilled(false);
        BotonCatalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCatalogoActionPerformed(evt);
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

        BotonCerrarSesion1.setBackground(new java.awt.Color(22, 22, 216));
        BotonCerrarSesion1.setFont(new java.awt.Font("Yu Gothic UI", 1, 18)); // NOI18N
        BotonCerrarSesion1.setForeground(new java.awt.Color(255, 255, 255));
        BotonCerrarSesion1.setText("Cerrar sesión");
        BotonCerrarSesion1.setBorder(null);
        BotonCerrarSesion1.setContentAreaFilled(false);
        BotonCerrarSesion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCerrarSesion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarSesion1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IzquierdaLayout = new javax.swing.GroupLayout(Izquierda);
        Izquierda.setLayout(IzquierdaLayout);
        IzquierdaLayout.setHorizontalGroup(
            IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IzquierdaLayout.createSequentialGroup()
                .addGroup(IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IzquierdaLayout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jLabel5))
                    .addGroup(IzquierdaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonCatalogo)
                            .addComponent(BotonMisCompras)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonCerrarSesion1))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        IzquierdaLayout.setVerticalGroup(
            IzquierdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IzquierdaLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(21, 21, 21)
                .addComponent(BotonCatalogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonMisCompras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonCerrarSesion1)
                .addContainerGap(252, Short.MAX_VALUE))
        );

        jPanel1.add(Izquierda);
        Izquierda.setBounds(0, 0, 190, 500);

        Derecha.setBackground(new java.awt.Color(255, 255, 255));
        Derecha.setMaximumSize(null);

        LabelNombreUsuario.setFont(new java.awt.Font("Yu Gothic UI", 1, 36)); // NOI18N
        LabelNombreUsuario.setForeground(new java.awt.Color(22, 22, 216));
        LabelNombreUsuario.setText(controlador.getUsuario().getNombre());

        bienvenido1.setFont(new java.awt.Font("Yu Gothic UI", 0, 24)); // NOI18N
        bienvenido1.setForeground(new java.awt.Color(22, 22, 216));
        bienvenido1.setText("Bienvenido, ");

        javax.swing.GroupLayout DerechaLayout = new javax.swing.GroupLayout(Derecha);
        Derecha.setLayout(DerechaLayout);
        DerechaLayout.setHorizontalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DerechaLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(bienvenido1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNombreUsuario)
                .addContainerGap(281, Short.MAX_VALUE))
        );
        DerechaLayout.setVerticalGroup(
            DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DerechaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(DerechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bienvenido1)
                    .addComponent(LabelNombreUsuario))
                .addContainerGap(423, Short.MAX_VALUE))
        );

        DerechaLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {LabelNombreUsuario, bienvenido1});

        jPanel1.add(Derecha);
        Derecha.setBounds(189, 0, 610, 500);

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
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }

    private void BotonCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCatalogoActionPerformed
        
    }//GEN-LAST:event_BotonCatalogoActionPerformed

    private void BotonMisComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMisComprasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonMisComprasActionPerformed

    private void BotonCerrarSesion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarSesion1ActionPerformed
        VentanaAcceso va = new VentanaAcceso(controlador);
        va.setLocationRelativeTo(null);
        va.pack();
        this.dispose();
        va.setVisible(true);
        controlador.cerrarSesion();
    }

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCatalogo;
    private javax.swing.JButton BotonCerrarSesion1;
    private javax.swing.JButton BotonMisCompras;
    private javax.swing.JPanel Derecha;
    private javax.swing.JPanel Izquierda;
    private javax.swing.JLabel LabelNombreUsuario;
    private javax.swing.JLabel bienvenido1;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
