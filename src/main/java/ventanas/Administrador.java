/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.sql.*;
import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;

public class Administrador extends javax.swing.JFrame {
    
    String user;
    String nombre_usuario;
    public static int sesion_usuario;

    /**
     * Creates new form Administrador
     */
    public Administrador() {
        initComponents();
        user = Login.user;
        sesion_usuario = 1;
        
        setResizable(false);
        setSize(670, 465);
        setTitle("Administrador - Sesión de " + user);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        ImageIcon fondoPantalla = new ImageIcon("src/main/java/images/wallpaper.jpg");
        Icon icono = new ImageIcon(fondoPantalla.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(), jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
        jLabel_Wallpaper.setIcon(icono);
        this.repaint();
        
        try {
            Connection cn = Conexion.conectar();
            PreparedStatement pst = cn.prepareStatement(
                    "select nombre_usuario from usuarios where username =?");
            pst.setString(1, user);
            ResultSet rs = pst.executeQuery();
            
            if (rs.next()) {
                nombre_usuario = rs.getString("nombre_usuario");
                jLabel_NombreUsuario.setText("Bienvenido " + nombre_usuario);
            }
            
        } catch (SQLException e) {
            System.err.print("Error en conexion desde la interfaz Administrador");
        }
        
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("src/main/java/images/icono.png");
        setIconImage(miIcono);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_NombreUsuario = new javax.swing.JLabel();
        jButton_RegistrarUsuario = new javax.swing.JButton();
        jButton_GestionarUsuario = new javax.swing.JButton();
        jButton_Creatividad = new javax.swing.JButton();
        jButton_GestordeDatos = new javax.swing.JButton();
        jButton_Tecnico = new javax.swing.JButton();
        jButton_AcercaDe = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_NombreUsuario.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel_NombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_NombreUsuario.setText("jLabel1");
        getContentPane().add(jLabel_NombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton_RegistrarUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Manuel\\Documents\\NetBeansProjects\\DataSystem\\src\\main\\java\\images\\addUser.png")); // NOI18N
        jButton_RegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistrarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_RegistrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 120, 100));

        jButton_GestionarUsuario.setIcon(new javax.swing.ImageIcon("C:\\Users\\Manuel\\Documents\\NetBeansProjects\\DataSystem\\src\\main\\java\\images\\informationuser.png")); // NOI18N
        jButton_GestionarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GestionarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_GestionarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 120, 100));

        jButton_Creatividad.setIcon(new javax.swing.ImageIcon("C:\\Users\\Manuel\\Documents\\NetBeansProjects\\DataSystem\\src\\main\\java\\images\\creatividad.png")); // NOI18N
        jButton_Creatividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CreatividadActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Creatividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(495, 70, 120, 100));

        jButton_GestordeDatos.setIcon(new javax.swing.ImageIcon("C:\\Users\\Manuel\\Documents\\NetBeansProjects\\DataSystem\\src\\main\\java\\images\\capturista.png")); // NOI18N
        jButton_GestordeDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GestordeDatosActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_GestordeDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 120, 100));

        jButton_Tecnico.setIcon(new javax.swing.ImageIcon("C:\\Users\\Manuel\\Documents\\NetBeansProjects\\DataSystem\\src\\main\\java\\images\\tecnico.png")); // NOI18N
        jButton_Tecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TecnicoActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Tecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 120, 100));

        jButton_AcercaDe.setIcon(new javax.swing.ImageIcon("C:\\Users\\Manuel\\Documents\\NetBeansProjects\\DataSystem\\src\\main\\java\\images\\4260937.jpg")); // NOI18N
        jButton_AcercaDe.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton_AcercaDe.setMaximumSize(new java.awt.Dimension(64, 64));
        jButton_AcercaDe.setMinimumSize(new java.awt.Dimension(64, 64));
        jButton_AcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AcercaDeActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_AcercaDe, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 250, 120, 100));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar usuario");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 170, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestionar usuarios");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Creatividad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 170, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Panel vista Gestor de datos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Acerca de");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Panel vista Técnico");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Desarrollado por Manuel Sánchez ®");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, -1, 20));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_GestionarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GestionarUsuarioActionPerformed
        new GestionarUsuarios().setVisible(true);
    }//GEN-LAST:event_jButton_GestionarUsuarioActionPerformed

    private void jButton_RegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistrarUsuarioActionPerformed
        new RegistrarUsuarios().setVisible(true);
    }//GEN-LAST:event_jButton_RegistrarUsuarioActionPerformed

    private void jButton_CreatividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CreatividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_CreatividadActionPerformed

    private void jButton_GestordeDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GestordeDatosActionPerformed
        new GestordeDatos().setVisible(true);
    }//GEN-LAST:event_jButton_GestordeDatosActionPerformed

    private void jButton_TecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TecnicoActionPerformed
        new Tecnico().setVisible(true);
    }//GEN-LAST:event_jButton_TecnicoActionPerformed

    private void jButton_AcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AcercaDeActionPerformed
        new AcercaDe().setVisible(true);
    }//GEN-LAST:event_jButton_AcercaDeActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Administrador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AcercaDe;
    private javax.swing.JButton jButton_Creatividad;
    private javax.swing.JButton jButton_GestionarUsuario;
    private javax.swing.JButton jButton_GestordeDatos;
    private javax.swing.JButton jButton_RegistrarUsuario;
    private javax.swing.JButton jButton_Tecnico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_NombreUsuario;
    private javax.swing.JLabel jLabel_Wallpaper;
    // End of variables declaration//GEN-END:variables
}
