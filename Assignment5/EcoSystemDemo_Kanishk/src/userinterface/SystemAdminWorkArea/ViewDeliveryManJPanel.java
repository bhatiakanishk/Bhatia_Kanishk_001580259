/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ViewDeliveryManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDeliveryManJPanel
     */
    public JPanel container;
    public DeliveryMan deliveryMan;
    public DeliveryManDirectory deliveryManDirectory;
    public ViewDeliveryManJPanel(JPanel container,DeliveryMan deliveryMan,DeliveryManDirectory deliveryManDirectory) {
        initComponents();
        this.container = container;
        this.deliveryMan = deliveryMan;
        this.deliveryManDirectory = deliveryManDirectory;
        
        deliveryManIdTextField.setText(deliveryMan.getDeliveryId());
        deliveryManNameTextField.setText(deliveryMan.getName());
        deliveryManPhoneTextField.setText(deliveryMan.getPhoneNo());
        deliveryManIdTextField.setEditable(false);
        deliveryManNameTextField.setEditable(false);
        deliveryManPhoneTextField.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        deliveryManIdTextField = new javax.swing.JTextField();
        deliveryManNameTextField = new javax.swing.JTextField();
        deliveryManPhoneTextField = new javax.swing.JTextField();
        editBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();

        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Edit Delivery Man");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Delivery Man Id:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Name:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Contact number:");

        editBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveBtn.setText("Save Changes");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1)
                        .addContainerGap(326, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(deliveryManNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 214, Short.MAX_VALUE)
                                    .addComponent(deliveryManIdTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(deliveryManPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(editBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(saveBtn)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(deliveryManIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(deliveryManNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(deliveryManPhoneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn)
                    .addComponent(saveBtn))
                .addContainerGap(139, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        deliveryManNameTextField.setEditable(true);
        deliveryManPhoneTextField.setEditable(true);
    }//GEN-LAST:event_editBtnActionPerformed

    
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String id = deliveryManIdTextField.getText();
        String name = deliveryManNameTextField.getText();
        String phone = deliveryManPhoneTextField.getText();
        
            deliveryManDirectory.updateDeliveryMan(id,name,phone);
            JOptionPane.showMessageDialog(null, "Delivery man details updated!");
            deliveryManNameTextField.setEditable(false);
            deliveryManPhoneTextField.setEditable(false);
    }//GEN-LAST:event_saveBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageDeliveryJPanel manageDeliveryJPanel = (ManageDeliveryJPanel) component;
        manageDeliveryJPanel.populate();
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField deliveryManIdTextField;
    private javax.swing.JTextField deliveryManNameTextField;
    private javax.swing.JTextField deliveryManPhoneTextField;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
