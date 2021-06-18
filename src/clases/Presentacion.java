/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;

/**
 *
 * @author Pavilion
 */
public class Presentacion extends javax.swing.JFrame {

    /**
     * Creates new form Presentacion
     */
    public Presentacion() {
        initComponents();
        jTextAreaIntegrantes.setBackground(new Color(0,0,0,32));
        jTextAreaIntegrantes.setBorder(null);
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(null);
        jButtonSiguiente.setOpaque(false);
        jButtonSiguiente.setBackground(new Color(0,0,0,32));
    }
    //igregar imagenes cambio de tamaño de pixeles a 240 x 190
    //tabla para buscar cuarto y hospedante
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logouaa = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaIntegrantes = new javax.swing.JTextArea();
        jButtonSiguiente = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logouaa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/uaalogo1.png"))); // NOI18N
        getContentPane().add(logouaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 220, 120));

        jTextAreaIntegrantes.setEditable(false);
        jTextAreaIntegrantes.setColumns(20);
        jTextAreaIntegrantes.setFont(new java.awt.Font("Monospaced", 3, 14)); // NOI18N
        jTextAreaIntegrantes.setForeground(new java.awt.Color(255, 255, 255));
        jTextAreaIntegrantes.setRows(5);
        jTextAreaIntegrantes.setText("  Materia: Programacion lll\n\n  Integrantes:\n  Mario Azael Garcia Chavez\n  Alexis de Jesus Rodriguez Gonzalez\n  Noe Axel Macias Villalba\n  Daniel Delgado Cortes\n\n  Profersor: Georgina Salazar Partida\n  Fecha: 18 de Junio del 2021");
        jTextAreaIntegrantes.setBorder(null);
        jScrollPane1.setViewportView(jTextAreaIntegrantes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 320, 210));

        jButtonSiguiente.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButtonSiguiente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSiguiente.setText("Siguiente");
        jButtonSiguiente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 190, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        // TODO add your handling code here:
        Inicio ini=new Inicio();
        ini.setVisible(true);
        dispose();
        //redireccionamiento
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Presentacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Presentacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaIntegrantes;
    private javax.swing.JLabel logouaa;
    // End of variables declaration//GEN-END:variables
}
