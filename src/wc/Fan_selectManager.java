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
import javax.swing.table.DefaultTableModel;
import wc.Fan_SelectStadium;

/**
 *
 * @author Pushkar
 */
public class Fan_selectManager extends javax.swing.JFrame {

    /**
     * Creates new form Fan_selectManager
     */
    static String user;
    static int cid;
    static int mid;
    public Fan_selectManager(String abc,int a) {
        user=abc;
        cid=a;
        initComponents();}
   String url = "jdbc:oracle:thin:@workstation:1521:XE";
    String username = "raj";
    String password = "raj123";
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        managerTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        managerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Manager ID", "Manager Name", "Country", "CIty"
            }
        ));
        jScrollPane1.setViewportView(managerTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(36, 77, 630, 261);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter Manager ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(190, 410, 162, 22);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(410, 400, 114, 41);

        jButton1.setText("CONTINUE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 490, 120, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Select Your Manager/Coach ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 11, 280, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/bg1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-6, -16, 730, 610);

        setBounds(0, 0, 724, 610);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        DefaultTableModel tb1=(DefaultTableModel)managerTable.getModel();
        String sql="select manager_id,manager_name,country,city from manager";
        
        try{
            Connection conn=DriverManager.getConnection(url,username,password);
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            tb1.setRowCount(0);
            while(rs.next()){
                Object row[]=new Object[4];
                row[0]=rs.getObject(1).toString();
                row[1]=rs.getObject(2).toString();
                row[2]=rs.getObject(3).toString();
                row[3]=rs.getObject(4).toString();
                tb1.addRow(row);
            }
            rs.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
       
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String chosen=jTextField1.getText();
        try{
            Connection conn=DriverManager.getConnection(url,username,password);
            Statement stmt1=conn.createStatement();
            Statement stmt2=conn.createStatement();
            Statement stmt3=conn.createStatement();
            //stmt1.executeQuery("insert into Club_Manager values("+cid+",'"+chosen+"')");
            //stmt2.execute("update Club set flag=0 where name='"+chosen+"'");
            ResultSet rs=stmt3.executeQuery("select manager_id from manager where manager_id="+chosen);
            rs.next();
            int mid=rs.getInt(1);
            this.setVisible(false);
            new Fan_SelectStadium(user,cid,mid).setVisible(true);
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
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
            java.util.logging.Logger.getLogger(Fan_selectManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fan_selectManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fan_selectManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fan_selectManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fan_selectManager(user,cid).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable managerTable;
    // End of variables declaration//GEN-END:variables
}
