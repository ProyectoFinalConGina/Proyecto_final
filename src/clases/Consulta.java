/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;

/**
 *
 * @author Mario Garcia
 */
public class Consulta extends javax.swing.JFrame {

    /**
     * Creates new form Consulta
     */
    public Consulta() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        jButtonGaleria.setOpaque(false);
        jButtonGaleria.setBackground(new Color(0,0,0,32));
        jButtonRegresar.setOpaque(false);
        jButtonRegresar.setBackground(new Color(0,0,0,32));
        jButtonBuscarClientes.setOpaque(false);
        jButtonBuscarClientes.setBackground(new Color(0,0,0,32));
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonGaleria = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jButtonBuscarClientes = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logoh1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 150));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2.setText("Consulta");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 190, 50));

        jButtonGaleria.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButtonGaleria.setForeground(new java.awt.Color(255, 255, 255));
        jButtonGaleria.setText("Galeria");
        jButtonGaleria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGaleria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGaleriaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGaleria, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 170, 50));

        jButtonRegresar.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jButtonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegresar.setText("<- Regresar");
        jButtonRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 130, 30));

        jButtonBuscarClientes.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButtonBuscarClientes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBuscarClientes.setText("Buscar Clientes");
        jButtonBuscarClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBuscarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarClientesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 200, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 449));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        // TODO add your handling code here:
        Menu men = new Menu();
        men.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonGaleriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGaleriaActionPerformed
        // TODO add your handling code here:
        Galeria1 g1 = new Galeria1();
        g1.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonGaleriaActionPerformed

    private void jButtonBuscarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarClientesActionPerformed

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
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButtonBuscarClientes;
    private javax.swing.JButton jButtonGaleria;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
