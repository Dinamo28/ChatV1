package chatv1;
import static chatv1.ChatFrame.bg;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Ventana extends javax.swing.JFrame {
    
    static Random rng = new Random();
    static ImageIcon BG = new ImageIcon("resources\\chat" + rng.nextInt(28) + ".jpg");
    static JLabel bg = new JLabel();
    
    public Ventana() {
        initComponents();
        setResizable(false);
        setSize(720,405);
        bg.setBounds(0, 0, 720, 405);
        bg.setIcon(BG);
        this.add(bg);
        repaint();
        userLabel.setVisible(false);
        userTF.setVisible(false);
        AliasTF.setVisible(false);
        passLabel.setVisible(false);
        passField.setVisible(false);
        confLabel.setVisible(false);
        RegisterB.setVisible(false);
        aliasLabel.setVisible(false);
        confPassField.setVisible(false);
        IPLabel.setVisible(false);
        IPTF.setVisible(false);
        
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
        IPLabel = new javax.swing.JLabel();
        IPTF = new javax.swing.JTextField();
        ExitB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        userLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        userLabel.setText("Username");
        userLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 3, true));
        userLabel.setOpaque(true);
        getContentPane().add(userLabel);
        userLabel.setBounds(60, 30, 70, 20);

        userTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTFActionPerformed(evt);
            }
        });
        getContentPane().add(userTF);
        userTF.setBounds(20, 50, 187, 30);

        passLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        passLabel.setText("Password");
        passLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 3, true));
        passLabel.setOpaque(true);
        getContentPane().add(passLabel);
        passLabel.setBounds(60, 130, 60, 20);

        RegisterB.setText("Register");
        RegisterB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBActionPerformed(evt);
            }
        });
        getContentPane().add(RegisterB);
        RegisterB.setBounds(40, 260, 110, 40);

        confLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        confLabel.setText("Confirm Password");
        confLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 3, true));
        confLabel.setOpaque(true);
        getContentPane().add(confLabel);
        confLabel.setBounds(40, 190, 110, 20);

        aliasLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        aliasLabel.setText("Alias");
        aliasLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 3, true));
        aliasLabel.setOpaque(true);
        getContentPane().add(aliasLabel);
        aliasLabel.setBounds(70, 80, 40, 20);
        getContentPane().add(AliasTF);
        AliasTF.setBounds(20, 100, 187, 30);

        buttonGroup1.add(RBregister);
        RBregister.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RBregister.setText("Register");
        RBregister.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 3, true));
        RBregister.setBorderPainted(true);
        RBregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBregisterActionPerformed(evt);
            }
        });
        getContentPane().add(RBregister);
        RBregister.setBounds(200, 310, 120, 30);

        buttonGroup1.add(RBlogin);
        RBlogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RBlogin.setText("Log In");
        RBlogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 3, true));
        RBlogin.setBorderPainted(true);
        RBlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBloginActionPerformed(evt);
            }
        });
        getContentPane().add(RBlogin);
        RBlogin.setBounds(420, 310, 100, 30);

        userLOG.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        userLOG.setText("Username");
        userLOG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 3, true));
        userLOG.setOpaque(true);
        getContentPane().add(userLOG);
        userLOG.setBounds(470, 60, 70, 20);

        TFuserLOG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFuserLOGActionPerformed(evt);
            }
        });
        getContentPane().add(TFuserLOG);
        TFuserLOG.setBounds(470, 80, 190, 30);

        passLOG.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        passLOG.setText("Password");
        passLOG.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 3, true));
        passLOG.setOpaque(true);
        getContentPane().add(passLOG);
        passLOG.setBounds(470, 120, 60, 20);

        LogInB.setText("Log In");
        LogInB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInBActionPerformed(evt);
            }
        });
        getContentPane().add(LogInB);
        LogInB.setBounds(520, 190, 110, 40);

        mainLabel.setFont(new java.awt.Font("MingLiU", 1, 18)); // NOI18N
        mainLabel.setText("Choose an option: ");
        mainLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 3, true));
        mainLabel.setOpaque(true);
        getContentPane().add(mainLabel);
        mainLabel.setBounds(240, 20, 190, 40);
        getContentPane().add(passField);
        passField.setBounds(20, 160, 190, 30);

        passField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passField1ActionPerformed(evt);
            }
        });
        getContentPane().add(passField1);
        passField1.setBounds(470, 140, 190, 30);
        getContentPane().add(confPassField);
        confPassField.setBounds(20, 210, 190, 30);

        IPLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        IPLabel.setText("IP:");
        IPLabel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 255), 3, true));
        IPLabel.setOpaque(true);
        getContentPane().add(IPLabel);
        IPLabel.setBounds(330, 120, 30, 20);
        getContentPane().add(IPTF);
        IPTF.setBounds(250, 140, 180, 30);

        ExitB.setText("EXIT");
        ExitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBActionPerformed(evt);
            }
        });
        getContentPane().add(ExitB);
        ExitB.setBounds(663, 0, 60, 23);

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
        String password = passField.getText();
        String confPass = confPassField.getText();
        String usuario = userTF.getText();
        String alias = AliasTF.getText();
        String ip = IPTF.getText();
        if((password.equals(confPass)) && (!confPass.equals("") && !usuario.equals("") && !alias.equals("") && !password.equals(""))){
            NewClass.guardarArchivosTxT(usuario, alias, password);
            Cliente1.flag=false;
            if (IPTF.getText().equalsIgnoreCase("default") || IPTF.getText().length()<1 ) {
                Cliente1.ip="127.0.0.1";
            }else Cliente1.ip=IPTF.getText();
            Cliente1.nombre=alias;
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
        IPTF.setVisible(true);
        IPLabel.setVisible(true);
        
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
        IPTF.setVisible(true);
        IPLabel.setVisible(true);
        
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
        boolean verificar = a.leerusernameYContraseña(pass, user);
        if (verificar == true) {
            JOptionPane.showMessageDialog(null, "Loggin in succeeded!");
            Cliente1.flag=false;
            if (IPTF.getText().equalsIgnoreCase("default") || IPTF.getText().length()<1 ) {
                Cliente1.ip="127.0.0.1";
            }else Cliente1.ip=IPTF.getText();
            Cliente1.nombre=NewClass.obtenerAlias(pass, user);
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

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        //System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    private void ExitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitBActionPerformed

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
    private javax.swing.JButton ExitB;
    private javax.swing.JLabel IPLabel;
    private javax.swing.JTextField IPTF;
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
