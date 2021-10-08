/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Cars;

/**
 *
 * @author kanis
 */
public class Main extends javax.swing.JFrame {
    
    Cars cars;
    ArrayList<Cars> carlist;
    String header[] = new String[] {"Manufacturer","Model","Year","Seats","SrNo","City","Certificate","Available"};
    DefaultTableModel dtm;
    int row;
    int col;

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        
        cars = new Cars();
        carlist= new ArrayList<>();
        dtm = new DefaultTableModel(header,0);
        tblView2.setModel(dtm);
        this.setLocationRelativeTo(null); //Set Interface to center
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblManufacturer = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblSeats = new javax.swing.JLabel();
        lblSrNo = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblCertificate = new javax.swing.JLabel();
        lblAvailable = new javax.swing.JLabel();
        txtManufacturer = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtSeats = new javax.swing.JTextField();
        txtSrNo = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtCertificate = new javax.swing.JTextField();
        txtAvailable = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnSearchA = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblView2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();

        jLabel3.setText("Model:");

        jLabel9.setText("Valid Maintenance Certificate (Yes/No):");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblManufacturer.setText("Manufacturer:");

        lblModel.setText("Model:");

        lblYear.setText("Year:");

        lblSeats.setText("Number of seats:");

        lblSrNo.setText("Serial Number:");

        lblCity.setText("City:");

        lblCertificate.setText("Valid Maintenance Certificate (Yes/No):");

        lblAvailable.setText("Car Available (Yes/No):");

        txtYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtYearActionPerformed(evt);
            }
        });

        txtSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatsActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnSearchA.setText("Search A");
        btnSearchA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchAActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addGap(18, 18, 18)
                .addComponent(btnSearchA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnUpdate)
                    .addComponent(btnSearch)
                    .addComponent(btnSearchA))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblManufacturer)
                    .addComponent(lblModel)
                    .addComponent(lblYear)
                    .addComponent(lblSeats)
                    .addComponent(lblSrNo)
                    .addComponent(lblCity)
                    .addComponent(lblCertificate)
                    .addComponent(lblAvailable))
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtManufacturer)
                    .addComponent(txtModel)
                    .addComponent(txtYear)
                    .addComponent(txtSeats)
                    .addComponent(txtSrNo)
                    .addComponent(txtCity)
                    .addComponent(txtCertificate)
                    .addComponent(txtAvailable, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblManufacturer)
                            .addComponent(txtManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModel)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYear)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSeats)
                    .addComponent(txtSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSrNo)
                    .addComponent(txtSrNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCertificate)
                    .addComponent(txtCertificate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailable)
                    .addComponent(txtAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblView2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Manufacturer", "Model", "Year", "Number of Seats", "Serial Number", "City", "Maintenance Certificate", "Car Available"
            }
        ));
        tblView2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblView2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblView2);

        tblView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Manufacturer", "Model", "Year", "Number of Seats", "Serial Number", "City", "Maintenance Certificate", "Car Available"
            }
        ));
        tblView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblViewMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblView);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(259, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(304, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtYearActionPerformed

    private void txtSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatsActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        
        String manufacturer = txtManufacturer.getText();
        String model = txtModel.getText();
        int year = Integer.parseInt(txtYear.getText());
        int seats = Integer.parseInt(txtSeats.getText());
        String srno = txtSrNo.getText();
        String city = txtCity.getText();
        String certificate = txtCertificate.getText();
        String available = txtAvailable.getText();
        carlist.add(new Cars(manufacturer, model, year, seats, srno, city, certificate, available));
        dtm.setRowCount(0);
        for(int i=0; i<carlist.size();i++){
            Object[] objs = {carlist.get(i).manufacturer, carlist.get(i).model, carlist.get(i).year, carlist.get(i).seats, carlist.get(i).srno, carlist.get(i).city, carlist.get(i).certificate, carlist.get(i).available};
            dtm.addRow(objs);
        }
        
        JOptionPane.showMessageDialog(this, "Information Added");
        clearField();
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Delete this data", "Delete", dialogButton);
        if(dialogResult == 0){
            dtm.removeRow(row);
            carlist.remove(row);
            dtm.setRowCount(0);
            for(int i = 0; i < carlist.size();i++){
                Object[] objs = {carlist.get(i).manufacturer, carlist.get(i).model, carlist.get(i).year, carlist.get(i).seats, carlist.get(i).srno, carlist.get(i).city, carlist.get(i).certificate, carlist.get(i).available};
                dtm.addRow(objs);
            }
            clearField();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        String updatemanufacturer = txtManufacturer.getText();
        String updatemodel = txtModel.getText();
        int updateyear = Integer.parseInt(txtYear.getText());
        int updateseats = Integer.parseInt(txtSeats.getText());
        String updatesrno = txtSrNo.getText();
        String updatecity = txtCity.getText();
        String updatecertificate = txtCertificate.getText();
        String updateavailable = txtAvailable.getText();
        
        carlist.get(row).manufacturer = updatemanufacturer;
        carlist.get(row).model = updatemodel;
        carlist.get(row).year = updateyear;
        carlist.get(row).seats = updateseats;
        carlist.get(row).srno = updatesrno;
        carlist.get(row).city = updatecity;
        carlist.get(row).certificate = updatecertificate;
        carlist.get(row).available = updateavailable;
        dtm.setRowCount(0); //Reset table and populate
        for(int i = 0; i < carlist.size();i++){
                Object[] objs = {carlist.get(i).manufacturer, carlist.get(i).model, carlist.get(i).year, carlist.get(i).seats, carlist.get(i).srno, carlist.get(i).city, carlist.get(i).certificate, carlist.get(i).available};
                dtm.addRow(objs);
            }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        String input = JOptionPane.showInputDialog(this, "Search Car Manufacturer");
        for(int i = 0; i<carlist.size();i++){
            if(carlist.get(i).manufacturer.equalsIgnoreCase(input)){
                JOptionPane.showMessageDialog(btnSearch, "Found", "Search Car",2);
                txtManufacturer.setText(carlist.get(i).manufacturer);
                txtModel.setText(carlist.get(i).model);
                txtYear.setText(String.valueOf(carlist.get(i).year));
                txtSeats.setText(String.valueOf(carlist.get(i).seats));
                txtSrNo.setText(carlist.get(i).srno);
                txtCity.setText(carlist.get(i).city);
                txtCertificate.setText(carlist.get(i).certificate);
                txtAvailable.setText(carlist.get(i).available);
            }
            return;
        }
        JOptionPane.showMessageDialog(btnSearch, "Not Found", "Search Car", 2);
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tblView2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblView2MouseClicked
        // TODO add your handling code here:
        row = tblView2.getSelectedRow();
        col = tblView2.getSelectedColumn();
        System.out.println(row + "" + col);
        txtManufacturer.setText(dtm.getValueAt(row, 0).toString());
        txtModel.setText(dtm.getValueAt(row, 1).toString());
        txtYear.setText(dtm.getValueAt(row, 2).toString());
        txtSeats.setText(dtm.getValueAt(row, 3).toString());
        txtSrNo.setText(dtm.getValueAt(row, 4).toString());
        txtCity.setText(dtm.getValueAt(row, 5).toString());
        txtCertificate.setText(dtm.getValueAt(row, 6).toString());
        txtAvailable.setText(dtm.getValueAt(row, 7).toString());
        
        
    }//GEN-LAST:event_tblView2MouseClicked

    private void btnSearchAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchAActionPerformed
        // TODO add your handling code here:
        /*ViewJFrame viewJFrame = new ViewJFrame();
        viewJFrame.setVisible(true);
        viewJFrame.pack();
        viewJFrame.setLocationRelativeTo(null);
        viewJFrame.setDefaultCloseOperation(ViewJFrame.DISPOSE_ON_CLOSE);*/
        
        String input = JOptionPane.showInputDialog(this, "Search model Manufacturer");
        for(int i = 0; i<carlist.size();i++){
            if(carlist.get(i).model.equalsIgnoreCase(input)){
                JOptionPane.showMessageDialog(btnSearchA, "Found", "Search Model",2);
                txtManufacturer.setText(carlist.get(i).manufacturer);
                txtModel.setText(carlist.get(i).model);
                txtYear.setText(String.valueOf(carlist.get(i).year));
                txtSeats.setText(String.valueOf(carlist.get(i).seats));
                txtSrNo.setText(carlist.get(i).srno);
                txtCity.setText(carlist.get(i).city);
                txtCertificate.setText(carlist.get(i).certificate);
                txtAvailable.setText(carlist.get(i).available);
            }
            return;
        }
        JOptionPane.showMessageDialog(btnSearchA, "Not Found", "Search Car", 2);
        
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
        
        
    }//GEN-LAST:event_btnSearchAActionPerformed

    private void tblViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblViewMouseClicked
        // TODO add your handling code here:
        row = tblView.getSelectedRow();
        col = tblView.getSelectedColumn();
        System.out.println(row + "" + col);
        txtManufacturer.setText(dtm.getValueAt(row, 0).toString());
        txtModel.setText(dtm.getValueAt(row, 1).toString());
        txtYear.setText(dtm.getValueAt(row, 2).toString());
        txtSeats.setText(dtm.getValueAt(row, 3).toString());
        txtSrNo.setText(dtm.getValueAt(row, 4).toString());
        txtCity.setText(dtm.getValueAt(row, 5).toString());
        txtCertificate.setText(dtm.getValueAt(row, 6).toString());
        txtAvailable.setText(dtm.getValueAt(row, 7).toString());
        
=======
        row = t
>>>>>>> parent of 7f99122 (Update Main.java)
=======
        row = t
>>>>>>> parent of 7f99122 (Update Main.java)
=======
        row = t
>>>>>>> parent of 7f99122 (Update Main.java)
=======
        row = t
>>>>>>> parent of 7f99122 (Update Main.java)
    }//GEN-LAST:event_tblViewMouseClicked
    
    private void clearField() {
        
        txtManufacturer.requestFocus();
        txtManufacturer.setText("");
        txtModel.setText("");
        txtYear.setText("");
        txtSeats.setText("");
        txtSrNo.setText("");
        txtCity.setText("");
        txtCertificate.setText("");
        txtAvailable.setText("");
        
    }
    
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchA;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAvailable;
    private javax.swing.JLabel lblCertificate;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblManufacturer;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lblSrNo;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTable tblView;
    private javax.swing.JTable tblView2;
    private javax.swing.JTextField txtAvailable;
    private javax.swing.JTextField txtCertificate;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtManufacturer;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtSeats;
    private javax.swing.JTextField txtSrNo;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    
}
