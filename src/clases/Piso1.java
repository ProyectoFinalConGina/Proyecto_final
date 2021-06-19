/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;

/**
 *
 * @author Mario Garcia
 */
public class Piso1 extends javax.swing.JFrame {
    public static int num;
    /**
     * Creates new form Piso1
     */
    MySqlConn objConn=new MySqlConn();
    
    public Piso1(MySqlConn conn){
        this.objConn=objConn;
        initComponents(); 
    }
    
    
    public Piso1() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        jButtonSeleccionar.setOpaque(false);
        jButtonSeleccionar.setBackground(new Color(0,0,0,32));
        
        
        List<Clientes> lista = new ArrayList<Clientes>();

        try{
            Statement st = objConn.conn.createStatement();
            String query1 = "select * from clientes";
            ResultSet rs = st.executeQuery(query1);
            String nombre1, ciudad1, tipo1, fechasalida1, fechaentrada1;
            int total1, habitacion1;
            lista.removeAll(lista);
            while(rs.next()){
                nombre1 = rs.getString("nombre");
                ciudad1 = rs.getString("ciudad");
                tipo1 = rs.getString("tipo");        
                fechasalida1 = rs.getString("fechasalida");
                fechaentrada1 = rs.getString("fechaentrada");
                total1 = rs.getInt("total");
                habitacion1 = rs.getInt("habitacion");
                
                if(habitacion1==101){
                    h101.setEnabled(false);
                }
                if(habitacion1==102){
                    h102.setEnabled(false);
                }
                if(habitacion1==103){
                    h103.setEnabled(false);
                }
                if(habitacion1==104){
                    h104.setEnabled(false);
                }
                if(habitacion1==105){
                    h105.setEnabled(false);
                }
                if(habitacion1==106){
                    h106.setEnabled(false);
                }
                if(habitacion1==107){
                    h107.setEnabled(false);
                }
                if(habitacion1==108){
                    h108.setEnabled(false);
                }
                if(habitacion1==109){
                    h109.setEnabled(false);
                }
                if(habitacion1==110){
                    h110.setEnabled(false);
                }
                if(habitacion1==111){
                    h111.setEnabled(false);
                }
                if(habitacion1==112){
                    h112.setEnabled(false);
                }
                if(habitacion1==113){
                    h113.setEnabled(false);
                }
                if(habitacion1==114){
                    h114.setEnabled(false);
                }
                if(habitacion1==115){
                    h115.setEnabled(false);
                }
                if(habitacion1==201){
                    h201.setEnabled(false);
                }
                if(habitacion1==202){
                    h202.setEnabled(false);
                }
                if(habitacion1==203){
                    h203.setEnabled(false);
                }
                if(habitacion1==204){
                    h204.setEnabled(false);
                }
                if(habitacion1==205){
                    h205.setEnabled(false);
                }
                if(habitacion1==206){
                    h206.setEnabled(false);
                }
                if(habitacion1==207){
                    h207.setEnabled(false);
                }
                if(habitacion1==208){
                    h208.setEnabled(false);
                }
                if(habitacion1==209){
                    h209.setEnabled(false);
                }
                if(habitacion1==210){
                    h210.setEnabled(false);
                }
                if(habitacion1==211){
                    h211.setEnabled(false);
                }
                if(habitacion1==212){
                    h212.setEnabled(false);
                }
                if(habitacion1==213){
                    h213.setEnabled(false);
                }
                if(habitacion1==214){
                    h214.setEnabled(false);
                }
                if(habitacion1==215){
                    h215.setEnabled(false);
                }
                
                
                Clientes c;
                c = new Clientes(nombre1, ciudad1, tipo1,total1,fechasalida1, fechaentrada1, habitacion1);
                
                lista.add(c);
            }
            
        }catch(SQLException sqle){
            System.out.println("Error SQL....." + sqle);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botones = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        h101 = new javax.swing.JRadioButton();
        h102 = new javax.swing.JRadioButton();
        h103 = new javax.swing.JRadioButton();
        h104 = new javax.swing.JRadioButton();
        h105 = new javax.swing.JRadioButton();
        h106 = new javax.swing.JRadioButton();
        h107 = new javax.swing.JRadioButton();
        h108 = new javax.swing.JRadioButton();
        h109 = new javax.swing.JRadioButton();
        h110 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        h111 = new javax.swing.JRadioButton();
        h112 = new javax.swing.JRadioButton();
        h113 = new javax.swing.JRadioButton();
        h114 = new javax.swing.JRadioButton();
        h115 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        h201 = new javax.swing.JRadioButton();
        h206 = new javax.swing.JRadioButton();
        h211 = new javax.swing.JRadioButton();
        h202 = new javax.swing.JRadioButton();
        h207 = new javax.swing.JRadioButton();
        h212 = new javax.swing.JRadioButton();
        h203 = new javax.swing.JRadioButton();
        h208 = new javax.swing.JRadioButton();
        h213 = new javax.swing.JRadioButton();
        h204 = new javax.swing.JRadioButton();
        h209 = new javax.swing.JRadioButton();
        h214 = new javax.swing.JRadioButton();
        h205 = new javax.swing.JRadioButton();
        h210 = new javax.swing.JRadioButton();
        h215 = new javax.swing.JRadioButton();
        jButtonSeleccionar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setText("Piso 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 100, 50));

        jLabel2.setText("Habitacion 101 *S");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel3.setText("Habitacion 102 *S");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jLabel4.setText("Habitacion 103 *S");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jLabel5.setText("Habitacion 104 *S");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        jLabel6.setText("Habitacion 105 *S");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, -1, -1));

        jLabel7.setText("Habitacion 106 *D");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel8.setText("Habitacion 107 *D");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        jLabel9.setText("Habitacion 108 *D");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        jLabel10.setText("Habitacion 109 *D");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        jLabel11.setText("Habitacion 110 *D");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, -1));

        jLabel12.setText("Habitacion 111 *T");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel13.setText("Habitacion 112 *T");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        jLabel14.setText("Habitacion 113 *T");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, 10));

        jLabel15.setText("Habitacion 114 *T");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jLabel16.setText("Habitacion 115 *T");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, -1, -1));

        botones.add(h101);
        getContentPane().add(h101, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        botones.add(h102);
        getContentPane().add(h102, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, -1));

        botones.add(h103);
        getContentPane().add(h103, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        botones.add(h104);
        getContentPane().add(h104, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 90, -1, -1));

        botones.add(h105);
        getContentPane().add(h105, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 90, -1, -1));

        botones.add(h106);
        getContentPane().add(h106, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, -1));

        botones.add(h107);
        getContentPane().add(h107, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        botones.add(h108);
        getContentPane().add(h108, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        botones.add(h109);
        getContentPane().add(h109, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));

        botones.add(h110);
        getContentPane().add(h110, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, -1, -1));

        jLabel17.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel17.setText("Piso 2");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 90, 30));

        botones.add(h111);
        getContentPane().add(h111, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        botones.add(h112);
        getContentPane().add(h112, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, -1, -1));

        botones.add(h113);
        getContentPane().add(h113, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        botones.add(h114);
        getContentPane().add(h114, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, -1, -1));

        botones.add(h115);
        h115.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h115ActionPerformed(evt);
            }
        });
        getContentPane().add(h115, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, -1, -1));

        jLabel18.setText("Habitacion 201 *S");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel19.setText("Habitacion 202 *S");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        jLabel20.setText("Habitacion 203 *S");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

        jLabel21.setText("Habitacion 204 *S");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, -1, -1));

        jLabel22.setText("Habitacion 205 *S");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 270, -1, -1));

        jLabel23.setText("Habitacion 206 *D");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel24.setText("Habitacion 207 *D");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, -1, -1));

        jLabel25.setText("Habitacion 208 *D");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        jLabel26.setText("Habitacion 209 *D");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, -1, -1));

        jLabel27.setText("Habitacion 210 *D");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, -1, -1));

        jLabel28.setText("Habitacion 211 *T");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel29.setText("Habitacion 212 *T");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        jLabel30.setText("Habitacion 213 *T");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        jLabel31.setText("Habitacion 214 *T");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, -1, -1));

        jLabel32.setText("Habitacion 215 *T");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, -1, -1));

        botones.add(h201);
        h201.setText(null);
        getContentPane().add(h201, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        botones.add(h206);
        h206.setText(null);
        getContentPane().add(h206, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        botones.add(h211);
        h211.setText(null);
        getContentPane().add(h211, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, -1, -1));

        botones.add(h202);
        h202.setText(null);
        getContentPane().add(h202, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        botones.add(h207);
        h207.setText(null);
        getContentPane().add(h207, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, -1));

        botones.add(h212);
        h212.setText(null);
        getContentPane().add(h212, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        botones.add(h203);
        h203.setText(null);
        getContentPane().add(h203, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, -1, -1));

        botones.add(h208);
        h208.setText(null);
        getContentPane().add(h208, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        botones.add(h213);
        h213.setText(null);
        getContentPane().add(h213, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, -1, -1));

        botones.add(h204);
        h204.setText(null);
        getContentPane().add(h204, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 290, -1, -1));

        botones.add(h209);
        h209.setText(null);
        getContentPane().add(h209, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, -1));

        botones.add(h214);
        h214.setText(null);
        getContentPane().add(h214, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 390, -1, -1));

        botones.add(h205);
        h205.setText(null);
        getContentPane().add(h205, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, -1, -1));

        botones.add(h210);
        h210.setText(null);
        getContentPane().add(h210, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, -1, -1));

        botones.add(h215);
        h215.setText(null);
        getContentPane().add(h215, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 390, -1, -1));

        jButtonSeleccionar.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jButtonSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSeleccionar.setText("Seleccionar");
        jButtonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSeleccionarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 160, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        fondo.setText(null);
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void h115ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h115ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_h115ActionPerformed

    private void jButtonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSeleccionarActionPerformed
        // TODO add your handling code here:
        
        if(h101.isSelected()){
          num=101;  
        }
        if(h102.isSelected()){
          num=102;  
        }
        if(h103.isSelected()){
          num=103;  
        }
        if(h104.isSelected()){
          num=104;  
        }
        if(h105.isSelected()){
          num=105;  
        }
        if(h106.isSelected()){
          num=106;  
        }
        if(h107.isSelected()){
          num=107;  
        }
        if(h108.isSelected()){
          num=108;  
        }
        if(h109.isSelected()){
          num=109;  
        }
        if(h110.isSelected()){
          num=110;  
        }
        if(h111.isSelected()){
          num=111;  
        }
        if(h112.isSelected()){
          num=112;  
        }
        if(h113.isSelected()){
          num=113;  
        }
        if(h114.isSelected()){
          num=114;  
        }
        if(h115.isSelected()){
          num=115;  
        }
        if(h201.isSelected()){
          num=210;  
        }
        if(h202.isSelected()){
          num=202;  
        }
        if(h203.isSelected()){
          num=203;  
        }
        if(h204.isSelected()){
          num=204;  
        }
        if(h205.isSelected()){
          num=205;  
        }
        if(h206.isSelected()){
          num=206;  
        }
        if(h207.isSelected()){
          num=207;  
        }
        if(h208.isSelected()){
          num=208;  
        }
        if(h209.isSelected()){
          num=209;  
        }
        if(h210.isSelected()){
          num=210;  
        }
        if(h211.isSelected()){
          num=211;  
        }
        if(h212.isSelected()){
          num=212;  
        }
        if(h213.isSelected()){
          num=213;  
        }
        if(h214.isSelected()){
          num=214;  
        }
        if(h215.isSelected()){
          num=215;  
        }
        
        
        
        dispose();
    }//GEN-LAST:event_jButtonSeleccionarActionPerformed

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
            java.util.logging.Logger.getLogger(Piso1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Piso1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Piso1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Piso1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Piso1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.ButtonGroup botones;
    private javax.swing.JLabel fondo;
    public static javax.swing.JRadioButton h101;
    private javax.swing.JRadioButton h102;
    private javax.swing.JRadioButton h103;
    private javax.swing.JRadioButton h104;
    private javax.swing.JRadioButton h105;
    private javax.swing.JRadioButton h106;
    private javax.swing.JRadioButton h107;
    private javax.swing.JRadioButton h108;
    private javax.swing.JRadioButton h109;
    private javax.swing.JRadioButton h110;
    private javax.swing.JRadioButton h111;
    private javax.swing.JRadioButton h112;
    private javax.swing.JRadioButton h113;
    private javax.swing.JRadioButton h114;
    private javax.swing.JRadioButton h115;
    private javax.swing.JRadioButton h201;
    private javax.swing.JRadioButton h202;
    private javax.swing.JRadioButton h203;
    private javax.swing.JRadioButton h204;
    private javax.swing.JRadioButton h205;
    private javax.swing.JRadioButton h206;
    private javax.swing.JRadioButton h207;
    private javax.swing.JRadioButton h208;
    private javax.swing.JRadioButton h209;
    private javax.swing.JRadioButton h210;
    private javax.swing.JRadioButton h211;
    private javax.swing.JRadioButton h212;
    private javax.swing.JRadioButton h213;
    private javax.swing.JRadioButton h214;
    private javax.swing.JRadioButton h215;
    private javax.swing.JButton jButtonSeleccionar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}
