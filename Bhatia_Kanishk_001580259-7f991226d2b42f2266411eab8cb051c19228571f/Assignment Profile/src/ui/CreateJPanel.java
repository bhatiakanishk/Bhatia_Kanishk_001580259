/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Image;
import java.io.File;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Product;
import java.util.regex.*;
import static java.util.regex.Pattern.matches;

/**
 *
 * @author kanis
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    Product product;
    
    public CreateJPanel(Product product) {
        initComponents();
        this.product=product;
        
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
        lblState = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblFAX = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblMed = new javax.swing.JLabel();
        lblHealth = new javax.swing.JLabel();
        lblBankAcc = new javax.swing.JLabel();
        lblLicenceNumber = new javax.swing.JLabel();
        lblVehID = new javax.swing.JLabel();
        lblLicencePlate = new javax.swing.JLabel();
        lblDeviceID = new javax.swing.JLabel();
        lblLinkedIn = new javax.swing.JLabel();
        lblIPAddress = new javax.swing.JLabel();
        lblUID = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        txtDateDay = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtFAX = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtMed = new javax.swing.JTextField();
        txtHealth = new javax.swing.JTextField();
        txtBankAcc = new javax.swing.JTextField();
        txtLicenceNumber = new javax.swing.JTextField();
        txtVehID = new javax.swing.JTextField();
        txtLicencePlate = new javax.swing.JTextField();
        txtDeviceID = new javax.swing.JTextField();
        txtLinkedIn = new javax.swing.JTextField();
        txtIP1 = new javax.swing.JTextField();
        txtUID = new javax.swing.JTextField();
        txtDateMonth = new javax.swing.JTextField();
        txtDateYear = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        txtIP2 = new javax.swing.JTextField();
        txtIP3 = new javax.swing.JTextField();
        txtIP4 = new javax.swing.JTextField();
        btnFile = new javax.swing.JButton();
        label = new javax.swing.JLabel();
        lblerror = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Create");

        lblName.setText("Name:");

        lblState.setText("State:");

        lblDOB.setText("Date of Birth: (DD/MM/YYY)");

        lblPhone.setText("Phone Number (10 digits):");

        lblFAX.setText("FAX (10 digits):");

        lblEmail.setText("Email:");

        lblSSN.setText("SSN (10 digits):");

        lblMed.setText("Medical Record Number (10 digits):");

        lblHealth.setText("Health Plan Number (10 digits):");

        lblBankAcc.setText("Bank Account (10 digits):");

        lblLicenceNumber.setText("Licence Number (10 digits):");

        lblVehID.setText("Vehicle ID (10 digits):");

        lblLicencePlate.setText("Licence Plate:");

        lblDeviceID.setText("Device ID (10 digits):");

        lblLinkedIn.setText("LinkedIn:");

        lblIPAddress.setText("IP Address:");

        lblUID.setText("Unique ID (10 digits):");

        lblPhoto.setText("Photo:");

        txtLicencePlate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicencePlateActionPerformed(evt);
            }
        });

        txtDateMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateMonthActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnFile.setText("Select File");
        btnFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUID)
                                    .addComponent(lblPhoto)
                                    .addComponent(lblName)
                                    .addComponent(lblState)
                                    .addComponent(lblDOB)
                                    .addComponent(lblPhone)
                                    .addComponent(lblEmail)
                                    .addComponent(lblSSN)
                                    .addComponent(lblMed)
                                    .addComponent(lblHealth)
                                    .addComponent(lblBankAcc)
                                    .addComponent(lblLicenceNumber)
                                    .addComponent(lblVehID)
                                    .addComponent(lblLicencePlate)
                                    .addComponent(lblDeviceID)
                                    .addComponent(lblLinkedIn)
                                    .addComponent(lblIPAddress)
                                    .addComponent(lblFAX))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnFile)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtPhone)
                                    .addComponent(txtState)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtIP1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIP2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIP3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIP4, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                                    .addComponent(txtName)
                                    .addComponent(txtFAX)
                                    .addComponent(txtEmail)
                                    .addComponent(txtSSN)
                                    .addComponent(txtMed)
                                    .addComponent(txtHealth)
                                    .addComponent(txtBankAcc)
                                    .addComponent(txtLicenceNumber)
                                    .addComponent(txtVehID)
                                    .addComponent(txtLicencePlate)
                                    .addComponent(txtDeviceID)
                                    .addComponent(txtLinkedIn)
                                    .addComponent(txtUID))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblerror, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblState)
                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDOB)
                            .addComponent(txtDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPhone)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblerror, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFAX)
                    .addComponent(txtFAX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSSN)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMed)
                    .addComponent(txtMed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHealth)
                    .addComponent(txtHealth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBankAcc)
                    .addComponent(txtBankAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicenceNumber)
                    .addComponent(txtLicenceNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVehID)
                    .addComponent(txtVehID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLicencePlate)
                    .addComponent(txtLicencePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeviceID)
                    .addComponent(txtDeviceID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLinkedIn)
                    .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIPAddress)
                    .addComponent(txtIP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUID)
                    .addComponent(txtUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoto)
                    .addComponent(btnFile))
                .addGap(18, 18, 18)
                .addComponent(label, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLicencePlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicencePlateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicencePlateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        product.setName(txtName.getText());
        product.setLocation(txtState.getText());
        product.setDateDay(Integer.parseInt(txtDateDay.getText()));
        product.setDateMonth(Integer.parseInt(txtDateMonth.getText()));
        product.setDateYear(Integer.parseInt(txtDateYear.getText()));
        product.setPhone(Integer.parseInt(txtPhone.getText()));
        product.setFax(Integer.parseInt(txtFAX.getText()));
        product.setEmail(txtEmail.getText());
        product.setSsn(Integer.parseInt(txtSSN.getText()));
        product.setMed(Integer.parseInt(txtMed.getText()));
        product.setHp(Integer.parseInt(txtHealth.getText()));
        product.setBa(Integer.parseInt(txtBankAcc.getText()));
        product.setLn(Integer.parseInt(txtLicenceNumber.getText()));
        product.setVid(Integer.parseInt(txtVehID.getText()));
        product.setLicence(txtLicencePlate.getText());
        product.setDid(Integer.parseInt(txtDeviceID.getText()));
        product.setLink(txtBankAcc.getText());
        product.setIp1(Integer.parseInt(txtIP1.getText()));
        product.setIp2(Integer.parseInt(txtIP2.getText()));
        product.setIp3(Integer.parseInt(txtIP3.getText()));
        product.setIp4(Integer.parseInt(txtIP4.getText()));
        product.setUid(Integer.parseInt(txtUID.getText()));
        
        /*String PATTERN = "^[a-zA-Z]{0,30}";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(txtName.getText());
        if(!match.matches()){
            lblerror.setText("Invalid Text");
        }
        else{
            lblerror.setText(null);
            product.setName(txtName.getText());
        }*/
        
        JOptionPane.showMessageDialog(this, "Profile Information Saved");
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtDateMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateMonthActionPerformed

    private void btnFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFileActionPerformed
        // TODO add your handling code here:
        
        JFileChooser fileChooser = new JFileChooser();

     //Limit type of file name extensions supported.
    FileNameExtensionFilter filter = new FileNameExtensionFilter("3 Extensions Supported", "jpg", "png", "jpeg");
    fileChooser.setFileFilter(filter);
    int selected = fileChooser.showOpenDialog(null);
    //check if open button has been clicked.
    if (selected == JFileChooser.APPROVE_OPTION) 
    {
        File file = fileChooser.getSelectedFile();
        //Get Path of the selected image.
        String getselectedImage = file.getAbsolutePath();
        //Display image path on Message Dialog
        JOptionPane.showMessageDialog(null, getselectedImage);
        ImageIcon imIco = new ImageIcon(getselectedImage);
        //make image fit on jlabel.
        Image imFit = imIco.getImage();
        Image imgFit = imFit.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        label.setIcon(new ImageIcon(imgFit));
    }
    }//GEN-LAST:event_btnFileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFile;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel label;
    private javax.swing.JLabel lblBankAcc;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDeviceID;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFAX;
    private javax.swing.JLabel lblHealth;
    private javax.swing.JLabel lblIPAddress;
    private javax.swing.JLabel lblLicenceNumber;
    private javax.swing.JLabel lblLicencePlate;
    private javax.swing.JLabel lblLinkedIn;
    private javax.swing.JLabel lblMed;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUID;
    private javax.swing.JLabel lblVehID;
    private javax.swing.JLabel lblerror;
    private javax.swing.JTextField txtBankAcc;
    private javax.swing.JTextField txtDateDay;
    private javax.swing.JTextField txtDateMonth;
    private javax.swing.JTextField txtDateYear;
    private javax.swing.JTextField txtDeviceID;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFAX;
    private javax.swing.JTextField txtHealth;
    private javax.swing.JTextField txtIP1;
    private javax.swing.JTextField txtIP2;
    private javax.swing.JTextField txtIP3;
    private javax.swing.JTextField txtIP4;
    private javax.swing.JTextField txtLicenceNumber;
    private javax.swing.JTextField txtLicencePlate;
    private javax.swing.JTextField txtLinkedIn;
    private javax.swing.JTextField txtMed;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtUID;
    private javax.swing.JTextField txtVehID;
    // End of variables declaration//GEN-END:variables
}