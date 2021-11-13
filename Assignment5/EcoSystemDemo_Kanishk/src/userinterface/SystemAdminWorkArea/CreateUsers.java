/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;
import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DB4OUtil.DB4OUtil;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.MainJFrame;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
/**
 *
 * @author kanishk
 */

public class CreateUsers extends javax.swing.JPanel {

    /**
     * Creates new form CreateUsers
     */
    EcoSystem ecosystem;
    JPanel userProcessContainer;
    RestaurantDirectory rstdir;
    Restaurant rst;
    UserAccount usracc;
    Customer cst;
    DeliveryMan dlvrymn;
    CustomerDirectory cstdir;
    DeliveryManDirectory dlvrymndir;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    public CreateUsers(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
        this.ecosystem = system;
       this.userProcessContainer = userProcessContainer;
       
       if(ecosystem.getRestaurantDirectory() == null)
           ecosystem.setRestaurantDirectory(new RestaurantDirectory());
       
       if(ecosystem.getCustomerDirectory() == null)
           ecosystem.setCustomerDirectory(new CustomerDirectory());
       
       if(ecosystem.getDeliveryManDirectory() == null)
           ecosystem.setDeliveryManDirectory(new DeliveryManDirectory());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnCreateUser = new javax.swing.JButton();
        roleCmb = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPasswd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtRstrntName = new javax.swing.JTextField();

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Restaurant name:");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add New User");

        btnCreateUser.setText("Create User");
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        roleCmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Restaurant (Admin)", "Customer", "Delivery Man" }));
        roleCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleCmbActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Username:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Password:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Role:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCreateUser)
                                    .addComponent(roleCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtName)
                                    .addComponent(txtUName)
                                    .addComponent(txtPasswd)
                                    .addComponent(txtRstrntName))))
                        .addGap(0, 62, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel7});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(roleCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtRstrntName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreateUser)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.show(userProcessContainer,"Sysadmin");
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        // TODO add your handling code here:
        UserAccountDirectory usersList = ecosystem.getUserAccountDirectory();
        String role = (String) roleCmb.getSelectedItem();
        Employee employee = new Employee();
        employee.setName(txtName.getText());
        boolean userDoNotExists = true;
        ArrayList<UserAccount> users = usersList.getUserAccountList();
        for(UserAccount ua : users)
        {
            if(ua.getUsername().equals(txtUName.getText()))
            userDoNotExists = false;
        }

        if(userDoNotExists)
        {
                switch (role) {
                    //Create Restaurant Admin user
                    case "Restaurant (Admin)":
                    usersList.createUserAccount(txtUName.getText(),txtPasswd.getText(), employee, new AdminRole());
                    usracc = usersList.getUserAccount(txtUName.getText());
                    rst = new Restaurant(usracc);
                    rst.setName(txtRstrntName.getText());
                    rstdir = ecosystem.getRestaurantDirectory();
                    rstdir.addRestaurant(rst);
                    ecosystem.setRestaurantDirectory(rstdir);
                    break;
                    //Create Customer User
                    case "Customer":
                    usersList.createUserAccount(txtUName.getText(),txtPasswd.getText(), employee, new CustomerRole());
                    usracc = usersList.getUserAccount(txtUName.getText());
                    cst = new Customer(usracc);
                    cstdir = ecosystem.getCustomerDirectory();
                    cstdir.addCustomer(cst);
                    break;
                    //Create Delivery Man User
                    case "Delivery Man":
                    usersList.createUserAccount(txtUName.getText(),txtPasswd.getText(), employee, new DeliverManRole());
                    usracc = usersList.getUserAccount(txtUName.getText());
                    dlvrymn = new DeliveryMan(usracc);
                    dlvrymndir = ecosystem.getDeliveryManDirectory();
                    dlvrymndir.addDeliveryDir(dlvrymn);
                    break;
                    default:
                    break;
                }

                JOptionPane.showMessageDialog(this,"User created");
                txtUName.setText("");
                txtPasswd.setText("");
                txtName.setText("");
                txtRstrntName.setText("");
        }
        else
        JOptionPane.showMessageDialog(this,"This user already exist. Please create a new user.");
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void roleCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleCmbActionPerformed
        // TODO add your handling code here:
        if(roleCmb.getSelectedItem().equals("Restaurant Admin")){
        txtRstrntName.setEnabled(true);
        txtRstrntName.setEditable(true);
        txtRstrntName.setBackground(Color.white);
        }
    }//GEN-LAST:event_roleCmbActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> roleCmb;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPasswd;
    private javax.swing.JTextField txtRstrntName;
    private javax.swing.JTextField txtUName;
    // End of variables declaration//GEN-END:variables
}
