/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Account;

/**
 *
 * @author vinay
 */
public class ViewAccountJPanel extends javax.swing.JPanel {

    private final JPanel UserProcessContainer;
    private final Account account;

    /**
     * Creates new form ViewAccountJPanel
     */
    ViewAccountJPanel(JPanel UserProcessContainer, Account account) {
        initComponents();
        this.UserProcessContainer = UserProcessContainer;
        this.account = account;
        populateAccountDetails();
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRoutingNumber = new javax.swing.JTextField();
        txtAccountNumber = new javax.swing.JTextField();
        txtBankName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View Account");
        add(jLabel1);
        jLabel1.setBounds(6, 15, 888, 17);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Routing Number : ");
        add(jLabel2);
        jLabel2.setBounds(110, 72, 150, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Bank Name :");
        add(jLabel3);
        jLabel3.setBounds(110, 168, 150, 30);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Account Number :");
        add(jLabel4);
        jLabel4.setBounds(110, 120, 150, 30);

        txtRoutingNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRoutingNumber.setEnabled(false);
        add(txtRoutingNumber);
        txtRoutingNumber.setBounds(352, 76, 200, 23);

        txtAccountNumber.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtAccountNumber.setEnabled(false);
        txtAccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountNumberActionPerformed(evt);
            }
        });
        add(txtAccountNumber);
        txtAccountNumber.setBounds(352, 124, 200, 23);

        txtBankName.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtBankName.setEnabled(false);
        txtBankName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBankNameActionPerformed(evt);
            }
        });
        add(txtBankName);
        txtBankName.setBounds(352, 172, 200, 23);

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(6, 50, 98, 34);

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave);
        btnSave.setBounds(360, 220, 72, 23);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(450, 220, 73, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAccountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountNumberActionPerformed

    private void txtBankNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBankNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBankNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        UserProcessContainer.remove(this);
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);
        
        Component component = UserProcessContainer.getComponent(UserProcessContainer.getComponentCount() - 1);
        if(component instanceof ManageAccountJPanel manageAccountPanel) {
            manageAccountPanel.populateTable();
        }
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtAccountNumber.setEnabled(true);
        txtRoutingNumber.setEnabled(true);
        txtBankName.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        account.setRoutingNumber(txtRoutingNumber.getText());
        account.setAccountNumber(txtAccountNumber.getText());
        account.setBankName(txtBankName.getText());

        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);

        JOptionPane.showMessageDialog(null, "Account Updated Successfully!");
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtAccountNumber;
    private javax.swing.JTextField txtBankName;
    private javax.swing.JTextField txtRoutingNumber;
    // End of variables declaration//GEN-END:variables

    private void populateAccountDetails() {
        txtAccountNumber.setText(account.getAccountNumber());
        txtRoutingNumber.setText(account.getRoutingNumber());
        txtBankName.setText(account.getBankName());
    }
}