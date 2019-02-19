/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import wc.Fan_selectClub;
import wc.admin_home;
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    //static String type="Fan";
    public Login() {
        //type=abc;
        initComponents();
    }
    String url = "jdbc:oracle:thin:@workstation:1521:XE";
    String username = "raj";
    String password = "raj123";
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 310, 130, 60);

        jButton2.setText("SIGN UP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(170, 310, 140, 60);

        jLabel3.setFont(new java.awt.Font("Yu Gothic Medium", 0, 30)); // NOI18N
        jLabel3.setText("FOOTBALL FANTASY LEAGUE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 40, 500, 49);

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(140, 170, 90, 25);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 250, 80, 25);

        jTextField1.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(350, 170, 140, 40);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(350, 240, 140, 40);

        jButton3.setText("ABOUT US");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(30, 410, 100, 23);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bg4.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(4, 4, 580, 450);

        setBounds(0, 0, 594, 492);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String user=jTextField1.getText();
        String pass=new String(jPasswordField1.getPassword());
        
        try{
            String driverName="oracle.jdbc.driver.OracleDriver";
            Class.forName(driverName);
            Connection conn=DriverManager.getConnection(url,username,password);
            Statement stmt=conn.createStatement();
            Statement stmt2=conn.createStatement();
            ResultSet rs0=stmt.executeQuery("select name,pass from users where name='"+user+"'"+"and pass='"+pass+"'");
            if(rs0.next())
            {
                JOptionPane.showMessageDialog(this,"Successful Login!!");
                ResultSet rs=stmt2.executeQuery("select role from users where name='"+user+"'");
                rs.next();
                String type=rs.getString(1);
                System.out.println(type);
                if(type.equals("Admin"))
                {
                    this.setVisible(false);
                    new admin_home().setVisible(true);
                }
                if(type.equals("Fan"))
                {
                    Statement stmt4=conn.createStatement();
                    ResultSet rs1=stmt4.executeQuery("select flag from user_flag where usr='"+user+"'");
                    rs1.next();
                    int fg=rs1.getInt(1);
                    rs1.close();
                    if(fg==0){
                    this.setVisible(false);
                    new Fan_selectClub(user).setVisible(true);
                }
                    else{
                        this.setVisible(false);
                        Statement stmt5=conn.createStatement();
                    ResultSet rs2=stmt5.executeQuery("select cid from User_Club where usid='"+user+"'");
                    rs2.next();
                    int tm=rs2.getInt(1);
                    rs2.close();
                    new Simulate(user,tm).setVisible(true);
                    }}
                if(type.equals("Spectator"))
                {
                    this.setVisible(false);
                    new spectator_home().setVisible(true);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Invalid Login.Try Again!");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Signup c=new Signup();
        this.setVisible(false);
        c.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            About_Us a=new About_Us();
            this.setVisible(false);
            a.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
