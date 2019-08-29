package chatv1;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
public class Ventana extends javax.swing.JFrame {
    public Ventana() {
        initComponents();
        setResizable(false);
        setSize(676,469);
        userLabel.setVisible(false);
        userTF.setVisible(false);
        AliasTF.setVisible(false);
        passLabel.setVisible(false);
        passField.setVisible(false);
        confLabel.setVisible(false);
        RegisterB.setVisible(false);
        aliasLabel.setVisible(false);
        confPassField.setVisible(false);
        
        userLOG.setVisible(false);
        TFuserLOG.setVisible(false);
        passLOG.setVisible(false);
        passField1.setVisible(false);
        LogInB.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        userLabel = new javax.swing.JLabel();
        userTF = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        RegisterB = new javax.swing.JButton();
        confLabel = new javax.swing.JLabel();
        aliasLabel = new javax.swing.JLabel();
        AliasTF = new javax.swing.JTextField();
        RBregister = new javax.swing.JRadioButton();
        RBlogin = new javax.swing.JRadioButton();
        userLOG = new javax.swing.JLabel();
        TFuserLOG = new javax.swing.JTextField();
        passLOG = new javax.swing.JLabel();
        LogInB = new javax.swing.JButton();
        mainLabel = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        passField1 = new javax.swing.JPasswordField();
        confPassField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        userLabel.setText("Username");
        getContentPane().add(userLabel);
        userLabel.setBounds(290, 10, 110, 20);

        userTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTFActionPerformed(evt);
            }
        });
        getContentPane().add(userTF);
        userTF.setBounds(220, 40, 187, 30);

        passLabel.setText("Password");
        getContentPane().add(passLabel);
        passLabel.setBounds(290, 160, 100, 20);

        RegisterB.setText("Register");
        RegisterB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBActionPerformed(evt);
            }
        });
        getContentPane().add(RegisterB);
        RegisterB.setBounds(260, 320, 110, 40);

        confLabel.setText("Confirm Password");
        getContentPane().add(confLabel);
        confLabel.setBounds(270, 230, 150, 20);

        aliasLabel.setText("Alias");
        getContentPane().add(aliasLabel);
        aliasLabel.setBounds(290, 80, 80, 20);
        getContentPane().add(AliasTF);
        AliasTF.setBounds(220, 100, 187, 30);

        buttonGroup1.add(RBregister);
        RBregister.setText("Register");
        RBregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBregisterActionPerformed(evt);
            }
        });
        getContentPane().add(RBregister);
        RBregister.setBounds(120, 400, 120, 30);

        buttonGroup1.add(RBlogin);
        RBlogin.setText("Log In");
        RBlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBloginActionPerformed(evt);
            }
        });
        getContentPane().add(RBlogin);
        RBlogin.setBounds(410, 400, 100, 30);

        userLOG.setText("Username");
        getContentPane().add(userLOG);
        userLOG.setBounds(470, 60, 100, 20);

        TFuserLOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFuserLOGActionPerformed(evt);
            }
        });
        getContentPane().add(TFuserLOG);
        TFuserLOG.setBounds(470, 100, 190, 30);

        passLOG.setText("Password");
        getContentPane().add(passLOG);
        passLOG.setBounds(480, 130, 90, 30);

        LogInB.setText("Log In");
        LogInB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInBActionPerformed(evt);
            }
        });
        getContentPane().add(LogInB);
        LogInB.setBounds(480, 300, 110, 40);

        mainLabel.setFont(new java.awt.Font("MingLiU", 0, 18)); // NOI18N
        mainLabel.setText("Choose an option: ");
        getContentPane().add(mainLabel);
        mainLabel.setBounds(230, 130, 190, 40);
        getContentPane().add(passField);
        passField.setBounds(220, 190, 190, 30);

        passField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passField1ActionPerformed(evt);
            }
        });
        getContentPane().add(passField1);
        passField1.setBounds(470, 180, 190, 30);
        getContentPane().add(confPassField);
        confPassField.setBounds(220, 250, 190, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTFActionPerformed
        
    }//GEN-LAST:event_userTFActionPerformed

    private void userTFKeyTyped(java.awt.event.KeyEvent evt){
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
    }
    private void RegisterBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBActionPerformed
        String password = passField.getText();;
        String confPass = confPassField.getText();
        String usuario = userTF.getText();
        String alias = AliasTF.getText();
        if((password.equals(confPass)) && (!confPass.equals("") && !usuario.equals("") && !alias.equals("") && !password.equals(""))){
            //JOptionPane.showMessageDialog(null, "Register succeed!", "Registered.", JOptionPane.INFORMATION_MESSAGE);
            NewClass.guardarArchivosTxT(usuario, alias, password);
            ChatFrame cf = new ChatFrame();
            cf.setVisible(true);
            close();
            
        }else{
            JOptionPane.showMessageDialog(null, "Information error.","ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_RegisterBActionPerformed

    private void RBregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBregisterActionPerformed
        userLabel.setVisible(true);
        userTF.setVisible(true);
        AliasTF.setVisible(true);
        passLabel.setVisible(true);
        passField.setVisible(true);
        confLabel.setVisible(true);
        RegisterB.setVisible(true);
        aliasLabel.setVisible(true);
        confPassField.setVisible(true);
        
        userLOG.setVisible(false);
        TFuserLOG.setVisible(false);
        passLOG.setVisible(false);
        passField1.setVisible(false);
        LogInB.setVisible(false);
        
        mainLabel.setVisible(false);
    }//GEN-LAST:event_RBregisterActionPerformed

    private void RBloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBloginActionPerformed
        userLOG.setVisible(true);
        TFuserLOG.setVisible(true);
        passLOG.setVisible(true);
        passField1.setVisible(true);
        LogInB.setVisible(true);
        
        userLabel.setVisible(false);
        userTF.setVisible(false);
        AliasTF.setVisible(false);
        passLabel.setVisible(false);
        passField.setVisible(false);
        confLabel.setVisible(false);
        RegisterB.setVisible(false);
        aliasLabel.setVisible(false);
        confPassField.setVisible(false);
        mainLabel.setVisible(false);
    }//GEN-LAST:event_RBloginActionPerformed

    private void LogInBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInBActionPerformed
        String user = TFuserLOG.getText();
        String pass = passField1.getText();
        NewClass a = new NewClass();
        boolean verificar = a.leerCorreoYContraseña(pass, user);
        if (verificar == true) {
            JOptionPane.showMessageDialog(null, "Loggin in succeeded!");
            ChatFrame cf = new ChatFrame();
            cf.setVisible(true);
            close();
        } else {
            JOptionPane.showMessageDialog(null, "Something went wrong, try again ");
        }
    }//GEN-LAST:event_LogInBActionPerformed

    private void passField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passField1ActionPerformed

    private void TFuserLOGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFuserLOGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFuserLOGActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    private void close(){
        WindowEvent winClosingEvent = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField AliasTF;
    private javax.swing.JButton LogInB;
    private javax.swing.JRadioButton RBlogin;
    private javax.swing.JRadioButton RBregister;
    private javax.swing.JButton RegisterB;
    private javax.swing.JTextField TFuserLOG;
    private javax.swing.JLabel aliasLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel confLabel;
    private javax.swing.JPasswordField confPassField;
    private javax.swing.JLabel mainLabel;
    public static javax.swing.JPasswordField passField;
    private javax.swing.JPasswordField passField1;
    private javax.swing.JLabel passLOG;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel userLOG;
    private javax.swing.JLabel userLabel;
    public static javax.swing.JTextField userTF;
    // End of variables declaration//GEN-END:variables
}
