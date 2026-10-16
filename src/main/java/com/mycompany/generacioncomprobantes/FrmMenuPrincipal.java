
package com.mycompany.generacioncomprobantes;


public class FrmMenuPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName());

   
    public FrmMenuPrincipal() {
        initComponents();
         cargarImagen();
    }

private void cargarImagen() {
    java.net.URL recurso = getClass().getResource(
        "/imagenes/comprobante.png"
    );

    if (recurso != null) {
        javax.swing.ImageIcon icono =
            new javax.swing.ImageIcon(recurso);

        java.awt.Image imagen = icono.getImage()
            .getScaledInstance(
                lblImagen.getWidth(),
                lblImagen.getHeight(),
                java.awt.Image.SCALE_SMOOTH
            );

        lblImagen.setIcon(new javax.swing.ImageIcon(imagen));
        lblImagen.setText("");
    } else {
        lblImagen.setText("Imagen no encontrada");
    }
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAcceder = new javax.swing.JButton();
        btnSalirActionPerformed = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generación de comprobantes - Francisco Mimiaga");
        setBackground(new java.awt.Color(204, 204, 204));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(0, 51, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Sistema de procesamiento de pedidos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Módulo: Generación de comprobantes");

        btnAcceder.setBackground(new java.awt.Color(0, 102, 204));
        btnAcceder.setForeground(new java.awt.Color(0, 255, 255));
        btnAcceder.setText("Acceder al módulo");
        btnAcceder.addActionListener(this::btnAccederActionPerformed);

        btnSalirActionPerformed.setBackground(new java.awt.Color(102, 204, 255));
        btnSalirActionPerformed.setForeground(new java.awt.Color(0, 0, 255));
        btnSalirActionPerformed.setText("Salir");
        btnSalirActionPerformed.addActionListener(this::btnSalirActionPerformedActionPerformed);

        lblImagen.setText("jLabel3");
        lblImagen.setPreferredSize(new java.awt.Dimension(320, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalirActionPerformed, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblImagen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAcceder)
                    .addComponent(btnSalirActionPerformed))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformedActionPerformed
      System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformedActionPerformed

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
FrmGeneracionComprobantes formulario =
        new FrmGeneracionComprobantes();

formulario.setLocationRelativeTo(this);
formulario.setVisible(true);

this.setVisible(false);       
    }//GEN-LAST:event_btnAccederActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FrmMenuPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnSalirActionPerformed;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblImagen;
    // End of variables declaration//GEN-END:variables
}
