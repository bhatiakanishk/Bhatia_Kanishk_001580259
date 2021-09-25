/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import model.Product;

/**
 *
 * @author kanis
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     * @param product
     */
    
    Product product;
    public CreateJPanel(Product product) {
        initComponents();
        this.product = product;
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblFAX = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblMed = new javax.swing.JLabel();
        lblHealth = new javax.swing.JLabel();
        lblBankAcc = new javax.swing.JLabel();
        lblLicence = new javax.swing.JLabel();
        lblVehID = new javax.swing.JLabel();
        lblDevID = new javax.swing.JLabel();
        lblLinkedIn = new javax.swing.JLabel();
        lblIP = new javax.swing.JLabel();
        lblUID = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        txtFAX = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtHealth = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtMed = new javax.swing.JTextField();
        txtBankAcc = new javax.swing.JTextField();
        txtVehID = new javax.swing.JTextField();
        txtDevID = new javax.swing.JTextField();
        txtLinkedIn = new javax.swing.JTextField();
        txtLicence = new javax.swing.JTextField();
        txtUID = new javax.swing.JTextField();
        txtIP = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Profile");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name:");

        lblLocation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLocation.setText("Location:");

        lblDOB.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDOB.setText("Date of Birth:");

        lblPhone.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhone.setText("Phone Number:");

        lblFAX.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFAX.setText("Fax Number:");

        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmail.setText("Email:");

        lblSSN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSSN.setText("Social Security Number:");

        lblMed.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMed.setText("Medical Record Number:");

        lblHealth.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHealth.setText("Health Plan Beneficiary Number:");

        lblBankAcc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBankAcc.setText("Bank Account Number:");

        lblLicence.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLicence.setText("Licence Number:");

        lblVehID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVehID.setText("Vehicle Identifier:");

        lblDevID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDevID.setText("Device Identifier:");

        lblLinkedIn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLinkedIn.setText("LinkedIn:");

        lblIP.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIP.setText("Internet Protocol Address:");

        lblUID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUID.setText("Unique Identification:");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("jLabel17");

        txtLocation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocationActionPerformed(evt);
            }
        });

        txtHealth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHealthActionPerformed(evt);
            }
        });

        txtMed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMedActionPerformed(evt);
            }
        });

        txtBankAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBankAccActionPerformed(evt);
            }
        });

        txtVehID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehIDActionPerformed(evt);
            }
        });

        txtDevID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDevIDActionPerformed(evt);
            }
        });

        txtLinkedIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLinkedInActionPerformed(evt);
            }
        });

        txtLicence.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicenceActionPerformed(evt);
            }
        });

        txtUID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUIDActionPerformed(evt);
            }
        });

        txtIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIPActionPerformed(evt);
            }
        });

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBankAcc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLicence, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVehID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLocation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDevID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDOB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLinkedIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFAX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSSN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHealth, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVehID, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDevID, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLocation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(txtName)
                            .addComponent(txtDOB)
                            .addComponent(txtPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFAX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(txtHealth)
                            .addComponent(txtSSN)
                            .addComponent(txtMed, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtBankAcc, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(txtLinkedIn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(txtLicence, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtUID, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(txtIP, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(219, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocation)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDOB)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFAX)
                    .addComponent(txtFAX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSSN)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMed)
                    .addComponent(txtMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHealth)
                    .addComponent(txtHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBankAcc)
                    .addComponent(txtBankAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicence)
                    .addComponent(txtLicence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVehID)
                    .addComponent(txtVehID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDevID)
                    .addComponent(txtDevID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLinkedIn)
                    .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIP)
                    .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUID)
                    .addComponent(txtUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(29, 29, 29))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtHealthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHealthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHealthActionPerformed

    private void txtMedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMedActionPerformed

    private void txtBankAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBankAccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBankAccActionPerformed

    private void txtVehIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehIDActionPerformed

    private void txtDevIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDevIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDevIDActionPerformed

    private void txtLinkedInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLinkedInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLinkedInActionPerformed

    private void txtLicenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicenceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicenceActionPerformed

    private void txtUIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUIDActionPerformed

    private void txtIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIPActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void txtLocationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocationActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        product.setName(txtName.getText());
        product.setLocation(txtLocation.getText());
        product.setDob(txtDOB.getText());
        product.setPhone(Integer.parseInt(txtPhone.getText())); 
        product.setFax(Integer.parseInt(txtFAX.getText()));
        product.setEmail(txtEmail.getText());
        product.setSsn(Integer.parseInt(txtSSN.getText()));
        product.setMed(Integer.parseInt(txtMed.getText()));
        product.setHp(Integer.parseInt(txtHealth.getText()));
        product.setBa(Integer.parseInt(txtBankAcc.getText()));
        product.setLn(Integer.parseInt(txtLicence.getText()));
        product.setVid(Integer.parseInt(txtVehID.getText()));
        product.setDid(Integer.parseInt(txtDevID.getText()));
        product.setLink(txtLinkedIn.getText());
        product.setIp(Integer.parseInt(txtIP.getText()));
        product.setUid(Integer.parseInt(txtUID.getText()));
        

        
        
        
       JOptionPane.showMessageDialog(this, "Profile Information Saved");
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JLabel lblBankAcc;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDevID;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFAX;
    private javax.swing.JLabel lblHealth;
    private javax.swing.JLabel lblIP;
    private javax.swing.JLabel lblLicence;
    private javax.swing.JLabel lblLinkedIn;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblMed;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUID;
    private javax.swing.JLabel lblVehID;
    private javax.swing.JTextField txtBankAcc;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtDevID;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFAX;
    private javax.swing.JTextField txtHealth;
    private javax.swing.JTextField txtIP;
    private javax.swing.JTextField txtLicence;
    private javax.swing.JTextField txtLinkedIn;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMed;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtUID;
    private javax.swing.JTextField txtVehID;
    // End of variables declaration//GEN-END:variables
}
