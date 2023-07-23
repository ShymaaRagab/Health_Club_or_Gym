/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AllGui;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

import javax.swing.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import AllClasses.*;


public class Admin_Manage_Price extends javax.swing.JFrame {

  
    
    public Admin_Manage_Price() {
        initComponents();
    }

  
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        plan_gold = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        plan_platinum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        plan_diamond = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        showTable = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        plan_silver = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        plan_gold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plan_goldActionPerformed(evt);
            }
        });
        plan_gold.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                plan_goldKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Current Billing Systems");

        plan_platinum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plan_platinumActionPerformed(evt);
            }
        });
        plan_platinum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                plan_platinumKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Change Silver Pricing");

        plan_diamond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plan_diamondActionPerformed(evt);
            }
        });
        plan_diamond.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                plan_diamondKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Change Gold Pricing");

        jButton1.setText("Update Plan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Change Platinum Pricing");

        jButton5.setText("Update Plan");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Change Daimond Pricing");

        jButton6.setText("Update Plan");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        showTable.setText("Show");
        showTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTableActionPerformed(evt);
            }
        });

        jButton7.setText("Update Plan");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        Back.setText("Go Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Manage Prices");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plan", "Number of Months", "Prices"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        plan_silver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plan_silverActionPerformed(evt);
            }
        });
        plan_silver.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                plan_silverKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(plan_platinum, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(79, 79, 79)
                                    .addComponent(plan_diamond, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(plan_gold, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(plan_silver, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showTable, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)
                        .addComponent(jButton5)
                        .addComponent(jButton6)
                        .addComponent(jButton7)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(showTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(plan_silver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(plan_gold, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plan_platinum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(plan_diamond, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jButton7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plan_goldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plan_goldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plan_goldActionPerformed

    private void plan_goldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_plan_goldKeyTyped
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c))){
            evt.consume();
        }
    }//GEN-LAST:event_plan_goldKeyTyped

    private void plan_platinumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plan_platinumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plan_platinumActionPerformed

    private void plan_platinumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_plan_platinumKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c))){
            evt.consume();
        }
    }//GEN-LAST:event_plan_platinumKeyTyped

    private void plan_diamondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plan_diamondActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plan_diamondActionPerformed

    private void plan_diamondKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_plan_diamondKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c))){
            evt.consume();
        }
    }//GEN-LAST:event_plan_diamondKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(plan_silver.getText().isEmpty()){
            Masseges.showErrorDialog(AllClasses.Masseges.errorEmptyField);
        }else{
            try{
                Price addPrice = new planPrice();
                addPrice.changePrice(1, Integer.parseInt(plan_silver.getText()));
                Masseges.showInformationDialog("Update Succesfully");
            }catch (SQLException ex) {
                AllClasses.Masseges.showErrorDialog(AllClasses.Masseges.errorUpdatingDatabase);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if(plan_gold.getText().isEmpty()){
            Masseges.showErrorDialog(AllClasses.Masseges.errorEmptyField);
        }else{
            try{
                 Price addPrice = new planPrice();
                addPrice.changePrice(2, Integer.parseInt(plan_gold.getText()));
                Masseges.showInformationDialog("Update Succesfully");
            }catch (SQLException ex) {
                Masseges.showErrorDialog(AllClasses.Masseges.errorUpdatingDatabase);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if(plan_platinum.getText().isEmpty()){
            Masseges.showErrorDialog(AllClasses.Masseges.errorEmptyField);
        }else{
            try{
                 Price addPrice = new planPrice();
                addPrice.changePrice(3, Integer.parseInt(plan_platinum.getText()));
                Masseges.showInformationDialog("Update Succesfully");
            }catch (SQLException ex) {
                Masseges.showErrorDialog(AllClasses.Masseges.errorUpdatingDatabase);
            }
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void showTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTableActionPerformed
        // TODO add your handling code here:
        try{
            planPrice showPrice = new planPrice();
            ArrayList<String> price = showPrice.showPrices();
            int priceCounter = 0;
            String[] columnsName = {"Plan", "Number of Months","Prices"};
            String[][] data = new String [(price.size())/3][3];
            for (int i = 0 ; i<data.length ; i++){
                for(int j=0 ; j<3 ; j++){
                    if(i == 0 && j == 0){
                        data[i][j] = "Silver (1 Month)";
                        priceCounter++;
                        continue;
                    }
                    if(i == 1 && j == 0){
                        data[i][j] = "Gold (3 Months)";
                        priceCounter++;
                        continue;
                    }
                    if(i == 2 && j == 0){
                        data[i][j] = "Platinum (6 Months)";
                        priceCounter++;
                        continue;
                    }
                    if(i == 3 && j == 0){
                        data[i][j] = "Daimond (12 Months)";
                        priceCounter++;
                        continue;
                    }
                    data[i][j] = price.get(priceCounter);
                    priceCounter++;
                }
            }
            DefaultTableModel model = new DefaultTableModel(data, columnsName);
            table.setModel(model);
            table.setDefaultEditor(Object.class, null);
        } catch (SQLException ex) {
            Logger.getLogger(Admin_Manage_Price.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_showTableActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if(plan_diamond.getText().isEmpty()){
            AllClasses.Masseges.showErrorDialog(AllClasses.Masseges.errorEmptyField);
        }else{
            try{
                 planPrice addPrice = new planPrice();
                addPrice.changePrice(4, Integer.parseInt(plan_diamond.getText()));
                //AllClasses.adminTasks.getInstance().changePrice(4,Integer.parseInt(plan_diamond.getText()));
                AllClasses.Masseges.showInformationDialog("Update Succesfully");
            }catch (SQLException ex) {
                AllClasses.Masseges.showErrorDialog(AllClasses.Masseges.errorUpdatingDatabase);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        Admin adminPage = new Admin();
        AllClasses.CenterFrame.setCenterScreen(this,adminPage);
    }//GEN-LAST:event_BackActionPerformed

    private void plan_silverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plan_silverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_plan_silverActionPerformed

    private void plan_silverKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_plan_silverKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(!(Character.isDigit(c))){
            evt.consume();
        }
    }//GEN-LAST:event_plan_silverKeyTyped

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
            java.util.logging.Logger.getLogger(Admin_Manage_Price.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Manage_Price.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Manage_Price.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Manage_Price.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Manage_Price().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField plan_diamond;
    private javax.swing.JTextField plan_gold;
    private javax.swing.JTextField plan_platinum;
    private javax.swing.JTextField plan_silver;
    private javax.swing.JButton showTable;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
