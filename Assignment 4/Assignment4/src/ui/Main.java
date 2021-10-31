/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.util.regex.*;  
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.VitalSigns;
import java.util.List;
import model.City;
import model.Community;
import model.Encounter;
import model.House;
import model.Patient;
import model.Patient_Directory;
import model.Person;
import model.Person_Directory;
import java.util.ArrayList;

/**
 *
 * @author kanis
 */
public class Main extends javax.swing.JFrame {
    
    ArrayList<VitalSigns> vslist; //Main ArrayList
    ArrayList<VitalSigns> queryRes; //Temporary ArryList
    ArrayList<VitalSigns> newList; //Temporary ArryList
    
    String header[] = new String[] {"Temperature","Blood Pressure","Pulse","Age","Date"}; //Table Header
    DefaultTableModel dtm; //View Table
    DefaultTableModel dtm2; //Search Table
    int row;
    int col;
    String rbtn1;
    String rbtn2;
    String rbtn3;
    String rbtn4;    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        Patient_Directory pd = new Patient_Directory();
        vslist= new ArrayList<>();
        queryRes=new ArrayList<>();
        dtm = new DefaultTableModel(header,0);
        tblView.setModel(dtm);
        dtm2 = new DefaultTableModel(header,0);
        //tblSearch.setModel(dtm2);
        this.setLocationRelativeTo(null); //Set Interface to center
    }
    
    private void clearField() {
        txtRespiratoryRate.requestFocus();
        txtRespiratoryRate.setText("");
        txtBloodPressure.setText("");
        txtHeartRate.setText("");
        txtWeight.setText("");
        txtDate.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        lblRespiratoryRate = new javax.swing.JLabel();
        lblBloodPressure = new javax.swing.JLabel();
        lblHeartRate = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtBloodPressure = new javax.swing.JTextField();
        txtRespiratoryRate = new javax.swing.JTextField();
        txtHeartRate = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblView = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtLastName = new javax.swing.JTextField();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        lblFirstName1 = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        txtContactNo = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRespiratoryRate.setText("Respiratory Rate:");

        lblBloodPressure.setText("Blood Pressure:");

        lblHeartRate.setText("Heart Rate:");

        lblWeight.setText("Weight:");

        lblDate.setText("Date:");

        tblView.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Temperature", "Blood Pressure", "Pulse", "Age", "Date"
            }
        ));
        tblView.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblViewMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblView);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblFirstName.setText("First Name:");

        lblLastName.setText("Last Name:");

        lblFirstName1.setText("Contact Number:");

        lblZipCode.setText("Zip Code:");

        lblAge.setText("Age:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRespiratoryRate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFirstName1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFirstName)
                            .addComponent(txtLastName)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAge)
                                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(txtRespiratoryRate)
                                    .addComponent(txtWeight)
                                    .addComponent(txtDate)
                                    .addComponent(txtHeartRate)
                                    .addComponent(txtZipCode)
                                    .addComponent(txtContactNo))))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDelete)
                            .addComponent(btnUpdate))
                        .addGap(592, 592, 592))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAdd, btnDelete, btnUpdate});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblBloodPressure, lblDate, lblFirstName, lblFirstName1, lblHeartRate, lblLastName, lblRespiratoryRate, lblWeight, lblZipCode});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFirstName)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName)
                            .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFirstName1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZipCode)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDate))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRespiratoryRate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRespiratoryRate, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBloodPressure)
                    .addComponent(txtBloodPressure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHeartRate)
                    .addComponent(txtHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 170, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        Patient_Directory pd = new Patient_Directory();
        Patient pat = new Patient();
        VitalSigns vs = new VitalSigns();
        if(txtFirstName.getText().isEmpty() || txtLastName.getText().isEmpty() || txtContactNo.getText().isEmpty() ||txtZipCode.getText().isEmpty() || txtRespiratoryRate.getText().isEmpty()|| txtBloodPressure.getText().isEmpty()|| txtHeartRate.getText().isEmpty()|| txtWeight.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Don't leave empty","Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                String firstName = txtFirstName.getText();
                String lastName = txtLastName.getText();
                String contact = txtContactNo.getText();
                String zipcode = txtZipCode.getText();
                int respiratoryrate = Integer.parseInt(txtRespiratoryRate.getText());
                int bloodpressure = Integer.parseInt(txtBloodPressure.getText());
                int heartrate = Integer.parseInt(txtHeartRate.getText());
                double weight = Double.parseDouble(txtWeight.getText());
                String date = txtDate.getText();
                int age = Integer.parseInt(txtAge.getText());
                
                pat.setFirstName(firstName);
		pat.setLastName(lastName);
		pat.setContact(contact);
		pat.setZipcode(zipcode);
                
                vs.setAge(age);
		vs.setDate(date);
		vs.setRes_rate(respiratoryrate);
		vs.setHeart_rate(heartrate);
		vs.setBlood_press(bloodpressure); 
		vs.setWeight_kg(weight);
                
                //Create Encounter for vs1
		Encounter en = new Encounter(vs);
		//Add en1 to patient 1 encounter list
		pat.Enclist.add(en);
		//Add patient 1 to patient directory
		pd.addPatient(pat);
                
                JOptionPane.showMessageDialog(this, "Information Added");
                clearField();
            }catch (Exception e){
                e.printStackTrace();
            }
        } 
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        /*int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Delete this data", "Delete", dialogButton);
        if(dialogResult == 0){
            dtm.removeRow(row);
            vslist.remove(row);
            dtm.setRowCount(0);
            for(int i = 0; i < vslist.size();i++){
                Object[] objs = {vslist.get(i).temperature, vslist.get(i).bloodpressure, vslist.get(i).pulse, vslist.get(i).age};
                dtm.addRow(objs);
            }
            clearField();
        }*/
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        /*String updatetemperature = txtTemperature.getText();
        String updatebloodpressure = txtBloodPressure.getText();
        String updatepulse = txtPulse.getText();
        String updateage = txtAge.getText();
        String updatedate = txtDate.getText();
        
        vslist.get(row).temperature = updatetemperature;
        vslist.get(row).bloodpressure = updatebloodpressure;
        vslist.get(row).pulse = updatepulse;
        vslist.get(row).age = updateage;
                
        dtm.setRowCount(0); //Reset table and populate
        for(int i = 0; i < vslist.size();i++){
                Object[] objs = {vslist.get(i).temperature, vslist.get(i).bloodpressure, vslist.get(i).pulse, vslist.get(i).age};
                dtm.addRow(objs);
            }*/
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblViewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblViewMouseClicked
        // TODO add your handling code here:
        row = tblView.getSelectedRow();
        col = tblView.getSelectedColumn();
        System.out.println(row + "" + col);
        txtRespiratoryRate.setText(dtm.getValueAt(row, 0).toString());
        txtBloodPressure.setText(dtm.getValueAt(row, 1).toString());
        txtHeartRate.setText(dtm.getValueAt(row, 2).toString());
        txtWeight.setText(dtm.getValueAt(row, 3).toString());
    }//GEN-LAST:event_tblViewMouseClicked
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
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblBloodPressure;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblFirstName1;
    private javax.swing.JLabel lblHeartRate;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblRespiratoryRate;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTable tblView;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtBloodPressure;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHeartRate;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtRespiratoryRate;
    private javax.swing.JTextField txtWeight;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
