/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Product;

/**
 *
 * @author kanis
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
   Product product;
    public ViewJPanel(Product product) {
        initComponents();
        
        this.product=product;
        displayProduct();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIP1 = new javax.swing.JTextField();
        txtUID = new javax.swing.JTextField();
        lblUID = new javax.swing.JLabel();
        txtDateMonth = new javax.swing.JTextField();
        txtDateYear = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtIP2 = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        txtIP3 = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtDateDay = new javax.swing.JTextField();
        txtIP4 = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtFAX = new javax.swing.JTextField();
        lblFAX = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        lblSSN = new javax.swing.JLabel();
        txtMed = new javax.swing.JTextField();
        lblMed = new javax.swing.JLabel();
        txtHealth = new javax.swing.JTextField();
        lblHealth = new javax.swing.JLabel();
        txtBankAcc = new javax.swing.JTextField();
        lblBankAcc = new javax.swing.JLabel();
        txtLicenceNumber = new javax.swing.JTextField();
        lblLicenceNumber = new javax.swing.JLabel();
        txtVehID = new javax.swing.JTextField();
        lblVehID = new javax.swing.JLabel();
        txtLicencePlate = new javax.swing.JTextField();
        lblLicencePlate = new javax.swing.JLabel();
        txtDeviceID = new javax.swing.JTextField();
        lblDeviceID = new javax.swing.JLabel();
        txtLinkedIn = new javax.swing.JTextField();
        lblLinkedIn = new javax.swing.JLabel();
        lblIPAddress = new javax.swing.JLabel();
        lbllicense = new javax.swing.JLabel();

        lblUID.setText("Unique ID:");

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View");

        lblName.setText("Name:");

        lblState.setText("State:");

        lblDOB.setText("Date of Birth:");

        lblPhone.setText("Phone Number:");

        lblFAX.setText("FAX:");

        lblEmail.setText("Email:");

        lblSSN.setText("SSN:");

        lblMed.setText("Medical Record Number:");

        lblHealth.setText("Health Plan Number:");

        lblBankAcc.setText("Bank Account:");

        lblLicenceNumber.setText("Licence Number:");

        lblVehID.setText("Vehicle ID:");

        txtLicencePlate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicencePlateActionPerformed(evt);
            }
        });

        lblLicencePlate.setText("Licence Plate:");

        lblDeviceID.setText("Device ID:");

        lblLinkedIn.setText("LinkedIn:");

        lblIPAddress.setText("IP Address:");

        lbllicense.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbllicense.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "License", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_BOTTOM));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMed)
                                    .addComponent(lblHealth))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMed)
                                    .addComponent(txtHealth, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblSSN)
                                    .addGap(161, 161, 161)
                                    .addComponent(txtSSN)
                                    .addGap(10, 10, 10))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblEmail)
                                    .addGap(155, 155, 155)
                                    .addComponent(txtEmail))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblFAX)
                                    .addGap(163, 163, 163)
                                    .addComponent(txtFAX))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblName)
                                        .addComponent(lblState)
                                        .addComponent(lblDOB)
                                        .addComponent(lblPhone))
                                    .addGap(103, 103, 103)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtName)
                                        .addComponent(txtState)
                                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBankAcc)
                                    .addComponent(lblLicenceNumber)
                                    .addComponent(lblVehID)
                                    .addComponent(lblLicencePlate)
                                    .addComponent(lblDeviceID)
                                    .addComponent(lblLinkedIn)
                                    .addComponent(lblIPAddress)
                                    .addComponent(lblUID))
                                .addGap(97, 97, 97)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtLinkedIn, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDeviceID, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLicencePlate, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtVehID, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtLicenceNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtBankAcc))
                                        .addGap(92, 92, 92))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbllicense, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtUID, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(txtIP1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtIP2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(txtIP3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(18, 18, 18)
                                        .addComponent(txtIP4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(108, 108, 108)))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDOB)
                    .addComponent(txtDateDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDateMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDateYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(lbllicense, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtLicencePlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicencePlateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicencePlateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUID;
    private javax.swing.JLabel lblVehID;
    private javax.swing.JLabel lbllicense;
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

    private void displayProduct() {
         
        txtName.setText(product.getName());
        txtState.setText(product.getLocation());
        txtDateDay.setText(String.valueOf(product.getDateDay()));
        txtDateMonth.setText(String.valueOf(product.getDateMonth()));
        txtDateYear.setText(String.valueOf(product.getDateYear()));
        txtPhone.setText(String.valueOf(product.getPhone()));
        txtFAX.setText(String.valueOf(product.getFax()));
        txtEmail.setText(String.valueOf(product.getEmail()));
        txtSSN.setText(String.valueOf(product.getSsn()));
        txtMed.setText(String.valueOf(product.getMed()));
        txtHealth.setText(String.valueOf(product.getHp()));
        txtBankAcc.setText(String.valueOf(product.getBa()));
        txtLicenceNumber.setText(String.valueOf(product.getLn()));
        txtVehID.setText(String.valueOf(product.getVid()));
        txtLicencePlate.setText(product.getLicence());
        txtDeviceID.setText(String.valueOf(product.getDid()));
        txtLinkedIn.setText(product.getLink());
        txtIP1.setText(String.valueOf(product.getIp1()));
        txtIP2.setText(String.valueOf(product.getIp2()));
        txtIP3.setText(String.valueOf(product.getIp3()));
        txtIP4.setText(String.valueOf(product.getIp4()));
        txtUID.setText(String.valueOf(product.getUid()));
        
        
        
        /*ImageIcon imgicn = new ImageIcon(product.getSelectedImagePath());  
        //Creating an image using the specfied file path and setting image size using ScaledInstance.
        Image img = imgicn.getImage().getScaledInstance(lbllicense.getWidth(), lbllicense.getHeight(), Image.SCALE_SMOOTH);
        //Setting the image to label lbllicense.
        lbllicense.setIcon(new ImageIcon(img));*/
    }
}
