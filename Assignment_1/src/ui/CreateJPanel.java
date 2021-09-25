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
        txtdateMonth = new javax.swing.JTextField();
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
        txtdateDay = new javax.swing.JTextField();
        txtdateYear = new javax.swing.JTextField();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create Profile");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("Name:");

        lblLocation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLocation.setText("Location:");

        lblDOB.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDOB.setText("Date of Birth (MM/DD/YYY):");

        lblPhone.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhone.setText("Phone Number:");

        lblFAX.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFAX.setText("Fax Number:");

        lblEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEmail.setText("Email:");

        lblSSN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSSN.setText("Social Security Number:");

        lblMed.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMed.setText("Medical Record Number:");

        lblHealth.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHealth.setText("Health Plan Beneficiary Number:");

        lblBankAcc.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBankAcc.setText("Bank Account Number:");

        lblLicence.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLicence.setText("Licence Number:");

        lblVehID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblVehID.setText("Vehicle Identifier:");

        lblDevID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDevID.setText("Device Identifier:");

        lblLinkedIn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLinkedIn.setText("LinkedIn:");

        lblIP.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIP.setText("Internet Protocol Address:");

        lblUID.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUID.setText("Unique Identification:");

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
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

        txtdateYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdateYearActionPerformed(evt);
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
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDOB)
                    .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFAX, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblMed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addComponent(lblSSN, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBankAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblDevID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblVehID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addComponent(lblLicence, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIP, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUID, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVehID, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBankAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUID, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFAX, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMed, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLicence, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDevID, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtdateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtdateDay, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtdateYear)))
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave)
                            .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField17, txtBankAcc, txtDevID, txtEmail, txtFAX, txtHealth, txtIP, txtLicence, txtLinkedIn, txtLocation, txtMed, txtName, txtPhone, txtSSN, txtUID, txtVehID});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocation))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDOB)
                    .addComponent(txtdateDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdateYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhone))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFAX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFAX))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSSN))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMed))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHealth))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBankAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBankAcc))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLicence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLicence))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVehID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVehID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDevID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDevID))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLinkedIn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextField17, txtBankAcc, txtDevID, txtEmail, txtFAX, txtHealth, txtIP, txtLicence, txtLinkedIn, txtLocation, txtMed, txtName, txtPhone, txtSSN, txtUID, txtVehID, txtdateMonth});

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
        product.setDateDay(Integer.parseInt(txtdateDay.getText()));
        product.setDateMonth(Integer.parseInt(txtdateMonth.getText()));
        product.setDateYear(Integer.parseInt(txtdateYear.getText()));
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

    private void txtdateYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdateYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdateYearActionPerformed


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
    private javax.swing.JTextField txtdateDay;
    private javax.swing.JTextField txtdateMonth;
    private javax.swing.JTextField txtdateYear;
    // End of variables declaration//GEN-END:variables
}
