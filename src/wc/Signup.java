/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wc;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    static Connection conn=null;
    public Signup() {
        initComponents();
    }
    String cb;
    String url = "jdbc:oracle:thin:@workstation:1521:XE";
    String username = "raj";
    String password = "raj123";
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        User = new javax.swing.JTextField();
        Pass = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 0, 36)); // NOI18N
        jLabel1.setText("Sign Up");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(299, 39, 140, 50);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel2.setText("UserName/UserID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(126, 142, 210, 40);

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(126, 204, 90, 25);

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel4.setText("Re-enter Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(126, 280, 150, 25);

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        jLabel5.setText("Choose Role");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(126, 354, 120, 25);
        getContentPane().add(User);
        User.setBounds(400, 142, 140, 40);
        getContentPane().add(Pass);
        Pass.setBounds(400, 206, 140, 40);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(400, 280, 140, 40);

        jComboBox1.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Fan", "Spectator" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(451, 351, 89, 26);

        jButton1.setText("SIGNUP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 480, 200, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bg4.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 780, 670);

        setBounds(0, 0, 791, 686);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Object selectedItem = jComboBox1.getSelectedItem();
        cb = selectedItem.toString();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String usern=User.getText();
        String pass=Pass.getText();
        String rep=jTextField3.getText();
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(pass);
        boolean b = m.find();
        if(usern.length()>10 || pass.length()>10)
        {
            JOptionPane.showMessageDialog(this,"UserID Cant be more than 10 characters");
        }
        else if(usern.isEmpty()||pass.isEmpty()|| rep.isEmpty())
        {
             JOptionPane.showMessageDialog(this,"Dont Leave any field empty");
        }
        else if(!pass.equals(rep))
        {
            JOptionPane.showMessageDialog(this,"both pass dont match");
        }
        else if (!b)
            JOptionPane.showMessageDialog(this,"Please a Speacial Char in password");       
        else
        {
           
        try{
            Connection conn=DriverManager.getConnection(url,username,password);
            System.out.println(cb);
            Statement stmt3=conn.createStatement();
            ResultSet rs=stmt3.executeQuery("insert into users values('"+usern+"','"+pass+"','"+cb+"')");
            rs.next();
            Statement stmt4=conn.createStatement();
            ResultSet rs1=stmt4.executeQuery("insert into user_flag values('"+usern+"',"+0+")");
            rs1.next();
            rs.close();
            rs1.close();
            this.setVisible(false);
            Login l=new Login();
            l.setVisible(true);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Pass;
    private javax.swing.JTextField User;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
