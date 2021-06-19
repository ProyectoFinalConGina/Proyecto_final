/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Locale;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Demo Daniel
 */
public class Habitaciones extends javax.swing.JFrame {

    /**
     * Creates new form Habitaciones
     */
    public Habitaciones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GraficaTH = new javax.swing.JPanel();
        GraficaH = new javax.swing.JPanel();
        GraficaT = new javax.swing.JPanel();
        GraficaD = new javax.swing.JPanel();
        GraficaS = new javax.swing.JPanel();
        HO = new javax.swing.JTextField();
        TO = new javax.swing.JTextField();
        DO = new javax.swing.JTextField();
        SO = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        ST = new javax.swing.JLabel();
        DT = new javax.swing.JLabel();
        TT = new javax.swing.JLabel();
        HT = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(GraficaTH, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 500, 200));
        getContentPane().add(GraficaH, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 500, 200));
        getContentPane().add(GraficaT, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 500, 200));
        getContentPane().add(GraficaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 500, 200));
        getContentPane().add(GraficaS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 500, 200));

        HO.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        getContentPane().add(HO, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, 120, 30));

        TO.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        getContentPane().add(TO, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 120, 30));

        DO.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        getContentPane().add(DO, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 120, 30));

        SO.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        SO.setToolTipText("");
        SO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SOActionPerformed(evt);
            }
        });
        getContentPane().add(SO, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 120, 30));

        jButton5.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jButton5.setText("Tipo de H");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 130, 30));

        jButton2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton2.setText("Triple");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 130, 30));

        jButton3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton3.setText("Doble");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 130, 30));

        jButton4.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton4.setText("Hotel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 130, 30));

        jButton1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jButton1.setText("Sencilla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 130, 30));

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 30)); // NOI18N
        jLabel13.setText("Graficar");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 50));

        ST.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        ST.setText("10");
        getContentPane().add(ST, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 160, 30));

        DT.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        DT.setText("10");
        getContentPane().add(DT, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 160, 30));

        TT.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        TT.setText("10");
        getContentPane().add(TT, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 160, 30));

        HT.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        HT.setText("30");
        getContentPane().add(HT, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 160, 30));

        jLabel8.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel8.setText("En el hotel");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 160, 30));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel7.setText("Triple");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, 30));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel6.setText("Doble");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 160, 30));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel5.setText("Sencilla");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 160, 30));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel4.setText("Ocupadas");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 160, 30));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel3.setText("Totales");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, 160, 30));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 30)); // NOI18N
        jLabel2.setText("Habitaciones");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        GraficaS.setVisible(true);
        GraficaD.setVisible(false);
        GraficaT.setVisible(false);
        GraficaH.setVisible(false);
        GraficaTH.setVisible(false);
        
        int St = 10;
        int So = Integer.parseInt(SO.getText());
        int Li = St-So;
        
        DefaultPieDataset datos = new DefaultPieDataset();
        datos.setValue("Ocupadas", So);
        datos.setValue("Libres", Li);
        
        JFreeChart grafica_pastel = ChartFactory.createPieChart("Porcentaje de habitaciones sencillas ocupadas ", datos, true, true, false);
        
        ChartPanel panel = new ChartPanel(grafica_pastel);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension (400,200));
        
        GraficaS.setLayout(new BorderLayout ());
        GraficaS.add(panel, BorderLayout.NORTH);
        
        pack();
        repaint();   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        GraficaS.setVisible(false);
        GraficaD.setVisible(false);
        GraficaT.setVisible(false);
        GraficaTH.setVisible(false);
        GraficaH.setVisible(true);
        
        int Ht = 30;
        
        int So = Integer.parseInt(SO.getText());
        int Do = Integer.parseInt(DO.getText());
        int To = Integer.parseInt(TO.getText());
        int Ho = Integer.parseInt(HO.getText());
        
        int Oc = So+Do+To;
        int Li = Ht - Oc;
        
        float Foc = (Oc/30)*10;
        float Fli = (Li/30)*10;
        
        DefaultPieDataset datos = new DefaultPieDataset();
        datos.setValue(Fli+"% Libres", Li);
        datos.setValue(Foc+"% Ocupadas", Oc);
        
        JFreeChart grafica_pastel = ChartFactory.createPieChart("Porcentaje de habitaciones ocupadas en el Hotel", datos, true, true, false);
        
        ChartPanel panel = new ChartPanel(grafica_pastel);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension (400,200));
        
        GraficaH.setLayout(new BorderLayout ());
        GraficaH.add(panel, BorderLayout.NORTH);
        
        pack();
        repaint();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        GraficaS.setVisible(false);
        GraficaTH.setVisible(false);
        GraficaD.setVisible(true);
        GraficaT.setVisible(false);
        GraficaH.setVisible(false);
        
        int Dt = 10;
        int Do = Integer.parseInt(DO.getText());
        int Li = Dt - Do;
        
        DefaultPieDataset datos = new DefaultPieDataset();
        datos.setValue("Ocupadas", Do);
        datos.setValue("Libres", Li);
        
        JFreeChart grafica_pastel = ChartFactory.createPieChart("Porcentaje de habitaciones dobles ocupadas", datos, true, true, false);
        
        ChartPanel panel = new ChartPanel(grafica_pastel);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension (400,200));
        
        GraficaD.setLayout(new BorderLayout ());
        GraficaD.add(panel, BorderLayout.NORTH);
        
        pack();
        repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        GraficaS.setVisible(false);
        GraficaD.setVisible(false);
        GraficaT.setVisible(true);
        GraficaH.setVisible(false);
        GraficaTH.setVisible(false);
        
        int Tt = 10;
        int To = Integer.parseInt(TO.getText());
        int Li = Tt - To;
        
        DefaultPieDataset datos = new DefaultPieDataset();
        datos.setValue("Ocupadas", To);
        datos.setValue("Libres", Li);
        
        JFreeChart grafica_pastel = ChartFactory.createPieChart("Porcentaje de habitaciones triples ocupadas", datos, true, true, false);
        
        ChartPanel panel = new ChartPanel(grafica_pastel);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension (400,200));
        
        GraficaT.setLayout(new BorderLayout ());
        GraficaT.add(panel, BorderLayout.NORTH);
        
        pack();
        repaint();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        GraficaS.setVisible(false);
        GraficaD.setVisible(false);
        GraficaT.setVisible(false);
        GraficaH.setVisible(false);
        GraficaTH.setVisible(true);
        
        
        int St = 10;
        int Dt = 10;
        int Tt = 10;
        int Ht = 30;
        
        DefaultPieDataset datos = new DefaultPieDataset();
        datos.setValue("Sencillas", St);
        datos.setValue("Dobles", Dt);
        datos.setValue("Triples", Tt);
        
        JFreeChart grafica_pastel = ChartFactory.createPieChart("Porcentaje de habitaciones segun su tipo", datos, true, true, false);
        
        ChartPanel panel = new ChartPanel(grafica_pastel);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension (400,200));
        
        GraficaTH.setLayout(new BorderLayout ());
        GraficaTH.add(panel, BorderLayout.NORTH);
        
        pack();
        repaint();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void SOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SOActionPerformed

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
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Habitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Habitaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DO;
    private javax.swing.JLabel DT;
    private javax.swing.JPanel GraficaD;
    private javax.swing.JPanel GraficaH;
    private javax.swing.JPanel GraficaS;
    private javax.swing.JPanel GraficaT;
    private javax.swing.JPanel GraficaTH;
    private javax.swing.JTextField HO;
    private javax.swing.JLabel HT;
    private javax.swing.JTextField SO;
    private javax.swing.JLabel ST;
    private javax.swing.JTextField TO;
    private javax.swing.JLabel TT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
