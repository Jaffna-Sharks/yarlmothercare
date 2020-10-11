/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalhomepage;


import finance_management.MainMenu;
import In_patient.inPatient_management;
import Inventory.inv_home;
import maternity.MaternityGUI;
import pms.opd.opdGUI;

import Pharmacy.Main;

import Lab_management.lab_home;
import Lab_management.scanning;
import hrmanagement.OverView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;
import vehicle.management.system.Vehicle;



public class HomePage extends javax.swing.JFrame {

    public HomePage() {
        initComponents();
        showTime();
    }

    
    public void set_previlege(String type){
        if(type.equals("admin")){
             
        
        }
        else if(type.equals("rep")){
            
             lab.setEnabled(false);
            inv.setEnabled(false);
            hr.setEnabled(false);
           
            pha.setEnabled(false);
                bf.setEnabled(false);
                
            
        }
        else if(type.equals("hr")){
            opd.setEnabled(false);
            inp.setEnabled(false);
            mat.setEnabled(false);
             lab.setEnabled(false);
           
            pha.setEnabled(false);
                bf.setEnabled(false);
            
            
        }
        else if(type.equals("phar")){
            opd.setEnabled(false);
            inp.setEnabled(false);
            mat.setEnabled(false);
             lab.setEnabled(false);
            inv.setEnabled(false);
            hr.setEnabled(false);
            tra.setEnabled(false);
            bf.setEnabled(false);
            
            
            
        }
        else if(type.equals("lab_assist")){
            opd.setEnabled(false);
            inp.setEnabled(false);
            mat.setEnabled(false);
           
            inv.setEnabled(false);
            hr.setEnabled(false);
            tra.setEnabled(false);
            pha.setEnabled(false);
                bf.setEnabled(false);
            
        }
        else if(type.equals("opd")){
          
            inp.setEnabled(false);
            mat.setEnabled(false);
             lab.setEnabled(false);
            inv.setEnabled(false);
            hr.setEnabled(false);
            tra.setEnabled(false);
            pha.setEnabled(false);
                bf.setEnabled(false);
        }
        else if (type.equals("vcl")){
            opd.setEnabled(false);
            inp.setEnabled(false);
            mat.setEnabled(false);
             lab.setEnabled(false);
            inv.setEnabled(false);
            hr.setEnabled(false);
          
            pha.setEnabled(false);
                bf.setEnabled(false);
            
        }
        else{
        
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        opd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        mat = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tra = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        bf = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        pha = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        hr = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        inv = new javax.swing.JButton();
        lab = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        inp = new javax.swing.JButton();
        time = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(1050, 620, 150, 40);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalhomepage/opd.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 150, 60, 60);

        opd.setBackground(new java.awt.Color(255, 255, 255));
        opd.setText("OPD");
        opd.setPreferredSize(new java.awt.Dimension(200, 30));
        opd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opdActionPerformed(evt);
            }
        });
        getContentPane().add(opd);
        opd.setBounds(70, 220, 200, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalhomepage/maternity.jpg"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 280, 60, 60);

        mat.setBackground(new java.awt.Color(255, 255, 255));
        mat.setText("MATERNITY");
        mat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matActionPerformed(evt);
            }
        });
        getContentPane().add(mat);
        mat.setBounds(10, 350, 190, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalhomepage/doctor.jpg"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(140, 410, 60, 60);

        tra.setBackground(new java.awt.Color(255, 255, 255));
        tra.setText("TRANSPORT");
        tra.setPreferredSize(new java.awt.Dimension(200, 30));
        tra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                traActionPerformed(evt);
            }
        });
        getContentPane().add(tra);
        tra.setBounds(70, 490, 200, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalhomepage/finance.jpg"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(360, 470, 60, 60);

        bf.setBackground(new java.awt.Color(255, 255, 255));
        bf.setText("FINANCE");
        bf.setPreferredSize(new java.awt.Dimension(200, 30));
        bf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfActionPerformed(evt);
            }
        });
        getContentPane().add(bf);
        bf.setBounds(290, 550, 200, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalhomepage/pharmacy.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(540, 410, 60, 60);

        pha.setBackground(new java.awt.Color(255, 255, 255));
        pha.setText("PHARMACY");
        pha.setPreferredSize(new java.awt.Dimension(200, 30));
        pha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phaActionPerformed(evt);
            }
        });
        getContentPane().add(pha);
        pha.setBounds(500, 490, 200, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalhomepage/hr.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(350, 280, 60, 60);

        hr.setBackground(new java.awt.Color(255, 255, 255));
        hr.setText("HUMAN RESOURCES");
        hr.setPreferredSize(new java.awt.Dimension(200, 30));
        hr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hrActionPerformed(evt);
            }
        });
        getContentPane().add(hr);
        hr.setBounds(280, 350, 200, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalhomepage/inventory.jpg"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(630, 270, 60, 60);

        inv.setBackground(new java.awt.Color(255, 255, 255));
        inv.setText("INVENTORY");
        inv.setPreferredSize(new java.awt.Dimension(200, 30));
        inv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invActionPerformed(evt);
            }
        });
        getContentPane().add(inv);
        inv.setBounds(560, 350, 200, 30);

        lab.setBackground(new java.awt.Color(255, 255, 255));
        lab.setText("LABORATORY");
        lab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labActionPerformed(evt);
            }
        });
        getContentPane().add(lab);
        lab.setBounds(490, 220, 200, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalhomepage/lab.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(570, 140, 60, 60);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalhomepage/InPatient.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(360, 80, 60, 60);

        inp.setBackground(new java.awt.Color(255, 255, 255));
        inp.setText("IN PATIENT");
        inp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inpActionPerformed(evt);
            }
        });
        getContentPane().add(inp);
        inp.setBounds(290, 150, 200, 30);

        time.setEditable(false);
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });
        getContentPane().add(time);
        time.setBounds(1100, 70, 100, 30);
        time.getAccessibleContext().setAccessibleParent(time);

        date.setEditable(false);
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        getContentPane().add(date);
        date.setBounds(1100, 120, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalhomepage/big-data-healthcare.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-160, -40, 1450, 890);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void phaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phaActionPerformed
        // TODO add your handling code here:
        Main m = new Main();
        this.dispose();
        m.setVisible(true);
    }//GEN-LAST:event_phaActionPerformed

    private void opdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opdActionPerformed
        // TODO add your handling code here:
        this.dispose();
        opdGUI op = new opdGUI();
        op.setVisible(true);
    }//GEN-LAST:event_opdActionPerformed

    private void inpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inpActionPerformed
        
        this.setVisible(false);
        inPatient_management Im=new inPatient_management();
        Im.setVisible(true);
        
    }//GEN-LAST:event_inpActionPerformed

    private void invActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invActionPerformed
        // TODO add your handling code here:
        this.dispose();
       inv_home ih = new inv_home();
        ih.setVisible(true);
    }//GEN-LAST:event_invActionPerformed

    private void bfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfActionPerformed
        // TODO add your handling code here:
       this.dispose();
      MainMenu mm = new MainMenu();
      mm.setVisible(true);
    }//GEN-LAST:event_bfActionPerformed

    private void traActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_traActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Vehicle v = new Vehicle();
        v.setVisible(true);
    }//GEN-LAST:event_traActionPerformed

    private void labActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labActionPerformed
        // TODO add your handling code here:
        this.dispose();
        lab_home lh = new lab_home();
        lh.setVisible(true);
    }//GEN-LAST:event_labActionPerformed

    private void hrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hrActionPerformed
        // TODO add your handling code here:
      this.dispose();
      OverView ov = new OverView();
      ov.setVisible(true);
    }//GEN-LAST:event_hrActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       LogIn li=new LogIn();
       li.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void matActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MaternityGUI ma = new MaternityGUI();
        ma.setVisible(true);
    }//GEN-LAST:event_matActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
      showTime();
    }//GEN-LAST:event_timeActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed
 public void showTime(){
        new Timer(0,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                SimpleDateFormat b = new SimpleDateFormat("yyyy/mm/dd");
                
                time.setText(s.format(d));
                date.setText(b.format(d));
            }
        }).start();
 }
    /**}
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bf;
    private javax.swing.JTextField date;
    private javax.swing.JButton hr;
    private javax.swing.JButton inp;
    private javax.swing.JButton inv;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton lab;
    private javax.swing.JButton mat;
    private javax.swing.JButton opd;
    private javax.swing.JButton pha;
    private javax.swing.JTextField time;
    private javax.swing.JButton tra;
    // End of variables declaration//GEN-END:variables
}
