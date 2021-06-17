/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author Pavilion
 */
public class Ingresar extends javax.swing.JFrame {

    /**
     * Creates new form Ingresar
     */
     MySqlConn objConn=new MySqlConn();
    
    public Ingresar(MySqlConn conn){
        this.objConn=objConn;
        initComponents();
    }
    public Ingresar() {
        initComponents();
        jTextFieldUsuario.setBorder(null);
        jTextFieldUsuario.setOpaque(false);
        jTextFieldUsuario.setBackground(new Color(0,0,0,48));
        jPasswordFieldContraseña.setBorder(null);
        jPasswordFieldContraseña.setOpaque(false);
        jPasswordFieldContraseña.setBackground(new Color (0,0,0,48));
        jButtonAceptar.setOpaque(false);
        jButtonAceptar.setBackground(new Color(0,0,0,32));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldContraseña = new javax.swing.JPasswordField();
        jButtonAceptar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoh1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 140, 140));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 28)); // NOI18N
        jLabel1.setText("Ingresar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 160, 60));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setText("Usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 140, 60));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 140, 60));

        jTextFieldUsuario.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jTextFieldUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 240, 40));

        jPasswordFieldContraseña.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jPasswordFieldContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jPasswordFieldContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 240, 40));

        jButtonAceptar.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButtonAceptar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 180, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 449));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
        // TODO add your handling code here:
        String usuario,password,query;
        usuario=this.jTextFieldUsuario.getText().trim();
        query="select * from users where usuario = "+"'"+usuario+"'";
        this.objConn.Consult(query);
        try{
            String contraseñaMySql=this.objConn.rs.getString(3);
            char[] passw=this.jPasswordFieldContraseña.getPassword();
            password=new String(passw);
            String contraseñaencriptada=DigestUtils.md5Hex(password);
            if(contraseñaMySql.equals(contraseñaencriptada)){
                JOptionPane.showMessageDialog(this, "Bienvenido " +
                    this.objConn.rs.getString(2)+" al sistema");
                    Menu men =  new Menu();
                    men.setVisible(true);
                    dispose();
            }else
                JOptionPane.showMessageDialog(this, "Error en la constraseña");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, "No existe la cuenta");
            System.out.println("No existe la cuenta");
        }
        
    }//GEN-LAST:event_jButtonAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordFieldContraseña;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
