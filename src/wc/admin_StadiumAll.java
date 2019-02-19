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

/**
 *
 * @author Mahe
 */
public class admin_StadiumAll extends javax.swing.JFrame {

    /**
     * Creates new form admin_StadiumAll
     */
    public admin_StadiumAll() {
        initComponents();
    }
String url = "jdbc:oracle:thin:@workstation:1521:XE";
    String username = "raj";
    String password = "raj123";
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Stadium ID", "Stadium Name", "Capacity", "Country"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(180, 20, 540, 170);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(300, 230, 80, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(300, 270, 80, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(300, 310, 80, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(300, 350, 80, 30);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(150, 230, 90, 30);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(150, 270, 90, 30);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(150, 310, 90, 30);
        getContentPane().add(jTextField8);
        jTextField8.setBounds(150, 350, 90, 30);

        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField9);
        jTextField9.setBounds(440, 230, 100, 30);

        jLabel1.setFont(new java.awt.Font("Broadway", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADD");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 200, 70, 30);

        jLabel2.setFont(new java.awt.Font("Broadway", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("UPDATE");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 200, 110, 30);

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setFont(new java.awt.Font("Broadway", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("DELETE");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(440, 190, 170, 40);

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(310, 400, 70, 30);

        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(170, 400, 80, 30);

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(460, 280, 110, 30);

        jLabel5.setForeground(new java.awt.Color(0, 204, 204));
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 40, 34, 14);

        jButton4.setBackground(new java.awt.Color(0, 153, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Save And GO BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(440, 410, 280, 50);

        jLabel4.setBackground(new java.awt.Color(204, 204, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 0));
        jLabel4.setText("Stadium ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 220, 100, 60);

        jLabel7.setBackground(new java.awt.Color(204, 204, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Stadium Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 260, 120, 60);

        jLabel8.setBackground(new java.awt.Color(204, 204, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Capacity");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 290, 100, 60);

        jLabel9.setBackground(new java.awt.Color(204, 204, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jLabel9.setText("Country");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 340, 90, 60);

        jLabel6.setBackground(new java.awt.Color(204, 204, 0));
        jLabel6.setForeground(new java.awt.Color(255, 204, 204));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Football-stadium.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 760, 500);

        setBounds(0, 0, 771, 503);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String Sid=jTextField9.getText();
        int flag=0;
        String sql;
        try{
            Connection conn=DriverManager.getConnection(url,username,password);
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select stadium_id from stadium");
            while(rs.next()){
                Object row[]=new Object[1];
                row[0]=rs.getObject(1).toString();
                if(row[0].equals(Sid)){
                    sql="delete from stadium where stadium_id='"+Sid+"'";
                    stmt.execute(sql);
                    JOptionPane.showMessageDialog(this,"DELETE DONE..SUCCESSFULLY!");
                    flag=1;
                    break;
                }
            }
            rs.close();
            if(flag==0){                        
            JOptionPane.showMessageDialog(this,"Stadium ID NOT FOUND.");
            }
            DefaultTableModel tb1=(DefaultTableModel)jTable1.getModel();
            sql="select * from stadium";
            ResultSet r=stmt.executeQuery(sql);
            tb1.setRowCount(0);
            while(r.next()){
                Object row[]=new Object[4];
                row[0]=r.getObject(1).toString();
                row[1]=r.getObject(2).toString();
                row[2]=r.getObject(3).toString();
                row[3]=r.getObject(4).toString();
                tb1.addRow(row);
            }
            r.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        DefaultTableModel tb1=(DefaultTableModel)jTable1.getModel();
        String sql="select * from stadium ";
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
                //System.out.println("LL");
            }
            rs.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Sid=jTextField1.getText();
        String Sname=jTextField2.getText();
        String Scapacity=jTextField3.getText();
        String Scountry=jTextField4.getText();
        int flag=0;
        String sql;
        try{
            Connection conn=DriverManager.getConnection(url,username,password);
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select stadium_id from stadium");
            while(rs.next()){
                Object row[]=new Object[1];
                row[0]=rs.getObject(1).toString();
                if(row[0].equals(Sid)){
                    JOptionPane.showMessageDialog(this,"ERROR:Stadium ID VIOLATION.");
                    flag=1;
                    break;
                }
            }
            rs.close();
            if(flag==0){
         sql="insert into stadium values('"+Sid+"','"+Sname+"','"+Scapacity+"','"+Scountry+"')";
         stmt.execute(sql);                        
            JOptionPane.showMessageDialog(this,"NEW Stadium ADDED!!");
            }
            DefaultTableModel tb1=(DefaultTableModel)jTable1.getModel();
            sql="select * from stadium order by stadium_id";
            ResultSet r=stmt.executeQuery(sql);
            tb1.setRowCount(0);
            while(r.next()){
                Object row[]=new Object[4];
                row[0]=r.getObject(1).toString();
                row[1]=r.getObject(2).toString();
                row[2]=r.getObject(3).toString();
                row[3]=r.getObject(4).toString();
                tb1.addRow(row);
            }
            r.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        /*if(flag==0){
7         sql="insert into stadium values('"+Sid+"','"+Sname+"','"+Scapacity+"','"+Scountry+"')";
        try{
            Connection conn=DriverManager.getConnection(url,username,password);
            Statement stmt=conn.createStatement();
            stmt.execute(sql);                        
            JOptionPane.showMessageDialog(this,"NEW Stadium ADDED!!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
            
        }
  }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String Sid=jTextField5.getText();
        String Sname=jTextField6.getText();
        String Scapacity=jTextField7.getText();
        String Scountry=jTextField8.getText();
        int flag=0;
        String sql;
        
        try{
            Connection conn=DriverManager.getConnection(url,username,password);
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select stadium_id from stadium");
            while(rs.next()){
                Object row[]=new Object[1];
                row[0]=rs.getObject(1).toString();
                if(row[0].equals(Sid)){                   
                    stmt.execute("update stadium set stadium_name='"+Sname+"',capacity="+Scapacity+",country='"+Scountry+"'  where stadium_id="+Sid);
                    JOptionPane.showMessageDialog(null,"SUCCESSFUL","DONE!",JOptionPane.INFORMATION_MESSAGE);
                    flag=1;
                    break;
                }
            }
            rs.close();
            if(flag==0){
         JOptionPane.showMessageDialog(null,"UNSUCCESSFUL","Invalid Stadium ID !",JOptionPane.INFORMATION_MESSAGE);
  }
            DefaultTableModel tb1=(DefaultTableModel)jTable1.getModel();
            sql="select * from stadium";
            ResultSet r=stmt.executeQuery(sql);
            tb1.setRowCount(0);
            while(r.next()){
                Object row[]=new Object[4];
                row[0]=r.getObject(1).toString();
                row[1]=r.getObject(2).toString();
                row[2]=r.getObject(3).toString();
                row[3]=r.getObject(4).toString();
                tb1.addRow(row);
            }
            r.close();
            
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
           
                                          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        admin_home c=new admin_home();
        this.setVisible(false);
        c.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

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
            java.util.logging.Logger.getLogger(admin_StadiumAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_StadiumAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_StadiumAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_StadiumAll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_StadiumAll().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
