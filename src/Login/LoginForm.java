
package Login;

import javax.swing.JOptionPane;
public class LoginForm extends javax.swing.JFrame {
  
    public LoginForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblRecuperar = new javax.swing.JLabel();
        lblFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        lblTitulo.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(204, 204, 255));
        lblTitulo.setText("INICIAR SESION");
        getContentPane().add(lblTitulo);
        lblTitulo.setBounds(180, 30, 180, 60);

        txtUsuario.setBackground(new java.awt.Color(217, 216, 216));
        txtUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuario"));
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(160, 190, 210, 60);

        txtContraseña.setBackground(new java.awt.Color(218, 218, 218));
        txtContraseña.setBorder(javax.swing.BorderFactory.createTitledBorder("Ingresar Contraseña"));
        getContentPane().add(txtContraseña);
        txtContraseña.setBounds(160, 260, 210, 60);

        btnIngresar.setBackground(new java.awt.Color(102, 102, 255));
        btnIngresar.setForeground(new java.awt.Color(0, 0, 51));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar);
        btnIngresar.setBounds(190, 340, 140, 40);

        lblUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/png-transparent-login-computer-icons-avatar-icon-monochrome-black-silhouette-removebg-preview-(1).png"))); // NOI18N
        getContentPane().add(lblUsuario);
        lblUsuario.setBounds(100, 190, 60, 50);

        lblContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/png-transparent-password-manager-computer-icons-password-strength-password-safe-chang-miscellaneous-password-strength-password-safe-thumbnail__2_-removebg-preview.png"))); // NOI18N
        getContentPane().add(lblContraseña);
        lblContraseña.setBounds(110, 270, 40, 40);

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/logo-photoaidcom-cropped__2_-removebg-preview (3).png"))); // NOI18N
        getContentPane().add(lblLogo);
        lblLogo.setBounds(210, 80, 110, 110);

        lblRecuperar.setForeground(new java.awt.Color(0, 0, 204));
        lblRecuperar.setText("<html><u>¿Olvidaste tu contraseña?</u></html> ");
        lblRecuperar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRecuperarMouseClicked(evt);
            }
        });
        getContentPane().add(lblRecuperar);
        lblRecuperar.setBounds(190, 400, 190, 16);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/Captura de pantalla 2025-05-20 232208.png"))); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(0, 0, 510, 140);

        setSize(new java.awt.Dimension(528, 484));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblRecuperarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRecuperarMouseClicked
        // TODO add your handling code here:
        RecuperarContraseña ventana= new RecuperarContraseña();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }//GEN-LAST:event_lblRecuperarMouseClicked

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        // TODO add your handling code here:
        String usuario= txtUsuario.getText();
        String contraseña= new String(txtContraseña.getPassword());
        
        GestionUsuario gestion= new GestionUsuario();
        
        if (usuario.isEmpty() || contraseña.isEmpty()){
            JOptionPane.showMessageDialog(this, 
                    "Por favor ingrese usuario y contraseña",
                    "Campos obligatorios", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (gestion.validarLogin(usuario,contraseña)) {
            JOptionPane.showMessageDialog(this, "Inicio de sesión exitosa");
            
            VentanaPrincipal ventanapr=new VentanaPrincipal();
            ventanapr.setVisible(true);
            this.dispose();      
        }
        else {
            JOptionPane.showMessageDialog(this, " ERROR. \nUsuario o contraseña incorrecta");
        }       
    }//GEN-LAST:event_btnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblRecuperar;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
