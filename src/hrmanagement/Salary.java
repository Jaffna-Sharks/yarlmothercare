/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrmanagement;

import Extras.Validation;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DELL
 */
public class Salary extends javax.swing.JFrame {

   // private static void setModel(TableModel resultSetToTableModel) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
   // }

    /**
     * Creates new form Salary
     */
     Connection con;
     String idl;
     boolean type,basic;
    
    public Salary() {
        initComponents();
        s_basic.setText("");
        s_month.setText("");
       //  txt_medical.setText("");
       //  txt_meal.setText("");
        // txt_Travel.setText("");
         //txt_wel.setText("");
          txt_epf.setText("");
         txt_etf.setText("");
        // cm_month.setText("select");
         //txt_Atot.setText("");
        // txt_total.setText("");
         txt_net.setText("");
         
         
        
       try
        {
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/yarlmothercare","root","");
            //JOptionPane.showMessageDialog(null,"connected with "+con.toString());
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"not connect to server and message is"+e.getMessage());
        }
        
        String sql = "SELECT * FROM salary";
      /*  
        try
        {
            Statement stat = con.createStatement();
            ResultSet res = stat.executeQuery("SELECT * FROM `salary`");
            
            Salary.setModel(DbUtils.resultSetToTableModel(res));
 
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
 

  */
           
 

        
        
        
     
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cm_month = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        bt_submit = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        emp_idl = new javax.swing.JTextField();
        txt_basic = new javax.swing.JTextField();
        txt_over = new javax.swing.JTextField();
        txt_net = new javax.swing.JTextField();
        txt_epf = new javax.swing.JTextField();
        txt_etf = new javax.swing.JTextField();
        bt_search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        la_namel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        la_designationl = new javax.swing.JLabel();
        la_contactnumberl = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        la_emaill = new javax.swing.JLabel();
        s_basic = new javax.swing.JLabel();
        s_month = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setBackground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel1.setText("Employee Id");

        jLabel13.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel13.setText("Month");

        cm_month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" }));

        jLabel15.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel15.setText("Basic Salary");

        jLabel21.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel21.setText("Over Time");

        jLabel34.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel34.setText("EPF");

        jLabel35.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel35.setText("ETF");

        jLabel43.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 51, 51));
        jLabel43.setText("Net Salary");

        bt_submit.setBackground(new java.awt.Color(0, 0, 153));
        bt_submit.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        bt_submit.setText("Submit");
        bt_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_submitActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 153));
        jButton5.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jButton5.setText("Cancel");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel12.setText("Salary Details");

        txt_basic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_basicActionPerformed(evt);
            }
        });

        bt_search.setBackground(new java.awt.Color(0, 0, 153));
        bt_search.setText("Search");
        bt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_searchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel2.setText("Employee name");

        la_namel.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        la_namel.setText("Employee name");

        jLabel3.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel3.setText("Employee designation");

        jLabel4.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel4.setText("Employee ContactNumber");

        la_designationl.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        la_designationl.setText("Employee designation");

        la_contactnumberl.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        la_contactnumberl.setText("Employee ContactNumber");

        jLabel5.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel5.setText("Employee Email");

        la_emaill.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        la_emaill.setText("Employee Email");

        s_basic.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        s_basic.setForeground(new java.awt.Color(255, 51, 51));
        s_basic.setText("Error");

        s_month.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        s_month.setForeground(new java.awt.Color(255, 51, 51));
        s_month.setText("Error");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(371, 371, 371)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_net, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_etf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_epf, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_over, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bt_submit)
                                    .addComponent(jButton5))
                                .addGap(123, 123, 123))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(la_emaill)
                                    .addComponent(la_namel)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(emp_idl, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(74, 74, 74)
                                        .addComponent(bt_search))
                                    .addComponent(la_designationl)
                                    .addComponent(la_contactnumberl)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cm_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txt_basic, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(s_basic, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                            .addComponent(s_month, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(132, 132, 132))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel12))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(emp_idl, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_search))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(la_namel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(la_designationl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(la_contactnumberl))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(la_emaill))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt_basic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s_basic))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cm_month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(s_month))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21)
                            .addComponent(txt_over, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(txt_epf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(txt_etf, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(txt_net, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(137, 137, 137))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_submit)
                        .addGap(45, 45, 45)
                        .addComponent(jButton5)
                        .addGap(194, 194, 194))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        // TODO add your handling code here:  OverView ov =new OverView();
        OverView ov =new OverView();
        ov.show();
        this.hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bt_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_submitActionPerformed
        check();
        double basic;
        boolean output = false;
      try
        {
            basic=Integer.parseInt(txt_basic.getText());
            output=true;
        }
        catch(NumberFormatException ex)
        {
            s_basic.setText("Input basic amount");
            output=false;
        }
        if(cm_month.getSelectedIndex()<1 || txt_basic.getText().equals("") || output==false)
       {     
               if(cm_month.getSelectedIndex()<1)
                {
                 s_month.setText("Select the month");
                }
               else
                {
                s_month.setText("");
                }
           
                JOptionPane.showMessageDialog(null, "Input all values");
        
      }
        else
          {        
        double tot=0;
        double epf=0;
        double etf=0;
        double ov=900;
        
        
        
        basic=Integer.parseInt(txt_basic.getText());
        epf=((12.00/100.00)*basic);
         txt_epf.setText(""+epf);
        etf=((3.00/100.00)*basic);
         txt_etf.setText(""+etf);
         
         txt_over.setText(""+ov);
    
        
        
        
        tot=((basic+ov)-((etf+epf)));
        
        
        txt_net.setText(""+tot);
        JOptionPane.showMessageDialog(null,"" +"Successfuly added");
        
       
        
          
        
        
            
          }             
        
    }//GEN-LAST:event_bt_submitActionPerformed

    private void txt_basicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_basicActionPerformed
       
    }//GEN-LAST:event_txt_basicActionPerformed

    private void bt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_searchActionPerformed
        // TODO add your handling code here:
        
        String id=emp_idl.getText().toString();
        if(emp_idl.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Input some value");
        }
        else
        {
            String sql1 = "SELECT * FROM employee where `idEmployee`='"+emp_idl.getText()+"'";
            try
            {

                Statement statement1 = con.createStatement();
                ResultSet result = statement1.executeQuery(sql1);

                //int count = 0;
                if (result.next())
                { 
                    la_namel.setText(result.getString(2)+" "+result.getString(3));
                    la_designationl.setText(result.getString(18));
                    la_contactnumberl.setText(result.getString(8));
                    la_emaill.setText(result.getString(9));
                    //bt_submit.setEnabled(true);
                }   
                else
                {
                    bt_submit.setEnabled(false);
                    JOptionPane.showMessageDialog(null, "User Not found");
                }
            }
            catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
                    
        
    }//GEN-LAST:event_bt_searchActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         s_basic.setText("");
         txt_basic.setText("");
         emp_idl.setText("");
         cm_month.setSelectedIndex(0);
         txt_over.setText("");
         s_month.setText("");
         txt_epf.setText("");
         txt_etf.setText("");
         la_namel.setText("");
         la_designationl.setText("");
         la_contactnumberl.setText("");
         la_emaill.setText("");
         txt_net.setText("");        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Salary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Salary().setVisible(true);
            }
        });
    }
    
    public void check()
    {
        if(cm_month.getSelectedIndex()<1)
        {
            type=false;
            s_month.setText("Select a month");
        }
        else
        {
            type=true;
            s_month.setText("");
        }
        
        if(txt_basic.getText().equals(""))
        {
            s_basic.setText("Input your basic salary");
            basic=false;
        }
        else
        {
            basic =true;
            s_basic.setText("");
        }
     
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_search;
    private javax.swing.JButton bt_submit;
    private javax.swing.JComboBox<String> cm_month;
    private javax.swing.JTextField emp_idl;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel la_contactnumberl;
    private javax.swing.JLabel la_designationl;
    private javax.swing.JLabel la_emaill;
    private javax.swing.JLabel la_namel;
    private javax.swing.JLabel s_basic;
    private javax.swing.JLabel s_month;
    private javax.swing.JTextField txt_basic;
    private javax.swing.JTextField txt_epf;
    private javax.swing.JTextField txt_etf;
    private javax.swing.JTextField txt_net;
    private javax.swing.JTextField txt_over;
    // End of variables declaration//GEN-END:variables
}
