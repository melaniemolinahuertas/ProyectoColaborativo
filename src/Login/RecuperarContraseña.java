
package Login;

import javax.swing.JOptionPane;
public class RecuperarContraseña extends javax.swing.JFrame {

    public RecuperarContraseña() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogo1 = new javax.swing.JLabel();
        lblFondo1 = new javax.swing.JLabel();
        txtUsuario1 = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnEnviarSolicitud = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        lblCorreo = new javax.swing.JLabel();
        lblUsuario = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        lblLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo-photoaidcom-cropped__2_-removebg-preview (3).png"))); // NOI18N
        getContentPane().add(lblLogo1);
        lblLogo1.setBounds(180, 70, 130, 88);

        lblFondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Captura de pantalla 2025-05-20 232208.png"))); // NOI18N
        getContentPane().add(lblFondo1);
        lblFondo1.setBounds(0, 0, 433, 120);

        txtUsuario1.setBackground(new java.awt.Color(217, 217, 217));
        txtUsuario1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Usuario:"));
        getContentPane().add(txtUsuario1);
        txtUsuario1.setBounds(120, 180, 200, 60);

        txtCorreo.setBackground(new java.awt.Color(216, 216, 216));
        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Correo:"));
        getContentPane().add(txtCorreo);
        txtCorreo.setBounds(120, 260, 200, 60);

        btnEnviarSolicitud.setBackground(new java.awt.Color(102, 102, 255));
        btnEnviarSolicitud.setText("Enviar Solicitud");
        btnEnviarSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarSolicitudActionPerformed(evt);
            }
        });
        getContentPane().add(btnEnviarSolicitud);
        btnEnviarSolicitud.setBounds(140, 340, 140, 50);

        btnAtras.setBackground(new java.awt.Color(153, 153, 255));
        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras);
        btnAtras.setBounds(20, 420, 110, 40);

        lblCorreo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/pngtree-mail-icon-png-image_4516701.png"))); // NOI18N
        getContentPane().add(lblCorreo);
        lblCorreo.setBounds(60, 270, 60, 50);

        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/png-transparent-login-computer-icons-avatar-icon-monochrome-black-silhouette-removebg-preview-(1).png"))); // NOI18N
        lblUsuario.setText("jLabel2");
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(60, 180, 50, 50);

        setSize(new java.awt.Dimension(449, 502));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarSolicitudActionPerformed
        // TODO add your handling code here:
        String usuario= txtUsuario1.getText();
        String correo=txtCorreo.getText();
        
        GestionUsuario gestion= new GestionUsuario();
        Usuario u= gestion.buscarUsuario(usuario);
        
        if(u!= null && u.getCorreo().equals(correo)){
            JOptionPane.showMessageDialog(this,
                    "Se ha enviado al area correspondiente. \nEspere una nueva contraseña.");
        }
        else {
            JOptionPane.showMessageDialog(this, "Usuario o correo incorrecto. Verifique los datos.");
        }
    }//GEN-LAST:event_btnEnviarSolicitudActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        this.dispose(); 
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_btnAtrasActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RecuperarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuperarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuperarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuperarContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuperarContraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEnviarSolicitud;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblFondo1;
    private javax.swing.JLabel lblLogo1;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtUsuario1;
    // End of variables declaration//GEN-END:variables
}
