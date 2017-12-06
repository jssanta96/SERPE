/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;
import javax.swing.ImageIcon;
import Dao.UserDao;
import Logica.View;

/**
 *
 * @author Director
 */
public class LoginInterface extends javax.swing.JFrame {

    public  LoginInterface() {
       
        initComponents();
        this.setTitle("LES");
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LESlogo.png")).getImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        forgotPass1 = new javax.swing.JButton();
        textLogin1 = new javax.swing.JLabel();
        submitLogin1 = new javax.swing.JButton();
        textFieldPass1 = new javax.swing.JPasswordField();
        iconPass1 = new javax.swing.JLabel();
        IconAccount1 = new javax.swing.JLabel();
        iconUser1 = new javax.swing.JLabel();
        textFieldAccount1 = new javax.swing.JTextField();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        forgotPass1.setBackground(new java.awt.Color(231, 231, 231));
        forgotPass1.setFont(new java.awt.Font("SansSerif", 1, 10)); // NOI18N
        forgotPass1.setForeground(new java.awt.Color(127, 0, 0));
        forgotPass1.setText("Olvido Su Contraseña?");
        forgotPass1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        forgotPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forgotPass1ActionPerformed(evt);
            }
        });
        getContentPane().add(forgotPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 134, 19));

        textLogin1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        textLogin1.setForeground(new java.awt.Color(102, 102, 102));
        textLogin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textLogin1.setText("INICIA SESION");
        getContentPane().add(textLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 303, 28));

        submitLogin1.setBackground(new java.awt.Color(127, 0, 0));
        submitLogin1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        submitLogin1.setForeground(new java.awt.Color(255, 255, 255));
        submitLogin1.setText("Acceder");
        submitLogin1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        submitLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitLogin1ActionPerformed(evt);
            }
        });
        getContentPane().add(submitLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        textFieldPass1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textFieldPass1.setForeground(new java.awt.Color(153, 153, 153));
        textFieldPass1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldPass1ActionPerformed(evt);
            }
        });
        getContentPane().add(textFieldPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 170, 34));

        iconPass1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconPass.png"))); // NOI18N
        getContentPane().add(iconPass1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        IconAccount1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/accounts.png"))); // NOI18N
        getContentPane().add(IconAccount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        iconUser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LESlogo.png"))); // NOI18N
        getContentPane().add(iconUser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, 135));

        textFieldAccount1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        textFieldAccount1.setForeground(new java.awt.Color(153, 153, 153));
        textFieldAccount1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        textFieldAccount1.setToolTipText("");
        textFieldAccount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldAccount1ActionPerformed(evt);
            }
        });
        getContentPane().add(textFieldAccount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 170, 32));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo.setText("jLabel4");
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void forgotPass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forgotPass1ActionPerformed
        RecoverPasswordInterface objVentana = new RecoverPasswordInterface();
        objVentana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_forgotPass1ActionPerformed

    private void submitLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitLogin1ActionPerformed
        queryUser();
    }//GEN-LAST:event_submitLogin1ActionPerformed

    private void textFieldAccount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldAccount1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldAccount1ActionPerformed

    private void textFieldPass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldPass1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldPass1ActionPerformed


  public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginInterface().setVisible(true);
            }
        });
    }
  
  public void queryUser(){
      
         UserDao daoUser = new UserDao();        
         String identification = textFieldAccount1.getText();
         String validate = encryptSortPassword(textFieldPass1.getText());
         String password = validateEncryptionPassword(validate);
         boolean cheek = daoUser.conection(identification, password);
         if(cheek == true){
                 this.setVisible(false);
         }else{
                View message = new View();
                message.errorLogin();
         }    
  }
  public String encryptSortPassword(String password){
       
        String passwordEncrypt = "";

        for (int i=password.length()-1;i>=0;i--){
		passwordEncrypt = passwordEncrypt + password.charAt(i);          
        }

                return passwordEncrypt;
        }
         
  public String validateEncryptionPassword(String password){
      
      UserDao daoUser = new UserDao();  
      String identification = textFieldAccount1.getText();
      String encryptionPassword= daoUser.getData(identification, "SELECT user_password FROM users WHERE identification='", "user_password");
      String normalPassword=encryptSortPassword(encryptionPassword);
     if(normalPassword.equals(password)){
          System.out.println(normalPassword);
         String FinalnormalPassword=encryptSortPassword(password);
         return FinalnormalPassword;
        
     }else{
     return null;
    }
  }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconAccount1;
    private javax.swing.JButton forgotPass1;
    private javax.swing.JLabel iconPass1;
    private javax.swing.JLabel iconUser1;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JButton submitLogin1;
    private javax.swing.JTextField textFieldAccount1;
    private javax.swing.JPasswordField textFieldPass1;
    private javax.swing.JLabel textLogin1;
    // End of variables declaration//GEN-END:variables

}
