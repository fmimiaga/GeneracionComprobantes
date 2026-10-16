
package com.mycompany.generacioncomprobantes;


public class FrmGeneracionComprobantes extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FrmGeneracionComprobantes.class.getName());

    
    public FrmGeneracionComprobantes() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        txtNumeroPedido = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtProceso = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Generación de comprobantes - Francisco Mimiaga");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Generación de comprobantes");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Número de pedido:");

        btnIniciar.setBackground(new java.awt.Color(0, 51, 204));
        btnIniciar.setForeground(new java.awt.Color(51, 255, 255));
        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(this::btnIniciarActionPerformed);

        btnRegresar.setBackground(new java.awt.Color(153, 204, 255));
        btnRegresar.setForeground(new java.awt.Color(0, 51, 204));
        btnRegresar.setText("Regresar al menú");
        btnRegresar.addActionListener(this::btnRegresarActionPerformed);

        txtProceso.setColumns(20);
        txtProceso.setRows(5);
        jScrollPane1.setViewportView(txtProceso);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNumeroPedido, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(jLabel1))))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtNumeroPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnIniciar)
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
  

    String numeroPedido = txtNumeroPedido.getText().trim();

    if (numeroPedido.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(
            this,
            "Ingresa el número de pedido antes de iniciar.",
            "Dato obligatorio",
            javax.swing.JOptionPane.WARNING_MESSAGE
        );

        txtNumeroPedido.requestFocus();
        return;
    }

    txtProceso.setText("");
    btnIniciar.setEnabled(false);

    ProcesoComprobante proceso = new ProcesoComprobante(
    numeroPedido,
    mensaje -> javax.swing.SwingUtilities.invokeLater(() -> {
        txtProceso.append(mensaje + "\n");
    }),
    () -> javax.swing.SwingUtilities.invokeLater(() -> {
        btnIniciar.setEnabled(true);
    })
);

    Thread hilo = new Thread(proceso);
    hilo.start();

    }//GEN-LAST:event_btnIniciarActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
    
FrmMenuPrincipal menu = new FrmMenuPrincipal();

menu.setLocationRelativeTo(this);
menu.setVisible(true);

this.dispose();

    }//GEN-LAST:event_btnRegresarActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new FrmGeneracionComprobantes().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtNumeroPedido;
    private javax.swing.JTextArea txtProceso;
    // End of variables declaration//GEN-END:variables
}
