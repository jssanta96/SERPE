/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;


public class VentanaCRUDUsuario extends javax.swing.JFrame {


    public VentanaCRUDUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanelMenu = new javax.swing.JPanel();
        jButtonInicio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonInicio1 = new javax.swing.JButton();
        jButtonInicio2 = new javax.swing.JButton();
        jButtonInicio3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelSolicitud = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButtonProyecto = new javax.swing.JButton();
        jButtonUsuario = new javax.swing.JButton();
        jButtonEquipo = new javax.swing.JButton();
        jLabelUsuarios = new javax.swing.JLabel();
        jLabelFondo2 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonInicio.setBackground(new java.awt.Color(102, 0, 0));
        jButtonInicio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonInicio.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicio.setText("INICIO");
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 161, 37));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bienvenido.png"))); // NOI18N
        jPanelMenu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jButtonInicio1.setBackground(new java.awt.Color(102, 0, 0));
        jButtonInicio1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonInicio1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicio1.setText("SOLICITAR EQUIPO");
        jButtonInicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicio1ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 40));

        jButtonInicio2.setBackground(new java.awt.Color(102, 0, 0));
        jButtonInicio2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonInicio2.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicio2.setText("MI PERFIL");
        jButtonInicio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicio2ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonInicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 161, 37));

        jButtonInicio3.setBackground(new java.awt.Color(102, 0, 0));
        jButtonInicio3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonInicio3.setForeground(new java.awt.Color(255, 255, 255));
        jButtonInicio3.setText("CONTACTENOS");
        jButtonInicio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicio3ActionPerformed(evt);
            }
        });
        jPanelMenu.add(jButtonInicio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 161, 37));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("NombreUsuario");
        jPanelMenu.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoGris.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanelMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 400));

        getContentPane().add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelSolicitud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoUnivallePeq.png"))); // NOI18N
        jPanelSolicitud.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLesPeq.png"))); // NOI18N
        jPanelSolicitud.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoLabPeq.png"))); // NOI18N
        jPanelSolicitud.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, -1));

        jButtonProyecto.setBackground(new java.awt.Color(102, 0, 0));
        jButtonProyecto.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonProyecto.setForeground(new java.awt.Color(255, 255, 255));
        jButtonProyecto.setText("CREAR");
        jButtonProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProyectoActionPerformed(evt);
            }
        });
        jPanelSolicitud.add(jButtonProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 120, 40));

        jButtonUsuario.setBackground(new java.awt.Color(102, 0, 0));
        jButtonUsuario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonUsuario.setText("LISTAR");
        jButtonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsuarioActionPerformed(evt);
            }
        });
        jPanelSolicitud.add(jButtonUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 120, 40));

        jButtonEquipo.setBackground(new java.awt.Color(102, 0, 0));
        jButtonEquipo.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButtonEquipo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEquipo.setText("ELIMINAR");
        jPanelSolicitud.add(jButtonEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 120, 40));

        jLabelUsuarios.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUsuarios.setForeground(new java.awt.Color(102, 102, 102));
        jLabelUsuarios.setText("USUARIOS");
        jPanelSolicitud.add(jLabelUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, -1, -1));

        jLabelFondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N
        jLabelFondo2.setText("jLabel4");
        jPanelSolicitud.add(jLabelFondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 400));

        getContentPane().add(jPanelSolicitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 380, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInicio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicio3ActionPerformed
    }//GEN-LAST:event_jButtonInicio3ActionPerformed

    private void jButtonInicio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicio2ActionPerformed
    }//GEN-LAST:event_jButtonInicio2ActionPerformed

    private void jButtonInicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicio1ActionPerformed
        VentanaSolicitud objVentana = new VentanaSolicitud();
        objVentana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonInicio1ActionPerformed

    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed
        VentanaInicial objVentana= new VentanaInicial();
        objVentana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonInicioActionPerformed

    private void jButtonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsuarioActionPerformed
    }//GEN-LAST:event_jButtonUsuarioActionPerformed

    private void jButtonProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProyectoActionPerformed
        VentanaUsuario objVentana = new VentanaUsuario();
        objVentana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonProyectoActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCRUDUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCRUDUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCRUDUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCRUDUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCRUDUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEquipo;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonInicio1;
    private javax.swing.JButton jButtonInicio2;
    private javax.swing.JButton jButtonInicio3;
    private javax.swing.JButton jButtonProyecto;
    private javax.swing.JButton jButtonUsuario;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFondo2;
    private javax.swing.JLabel jLabelUsuarios;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelSolicitud;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables
}
