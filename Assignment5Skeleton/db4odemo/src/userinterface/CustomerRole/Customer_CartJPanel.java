/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
import Business.Restaurant.Cart;
import Business.Restaurant.Order;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author isham.
 */
public class Customer_CartJPanel extends javax.swing.JPanel {

    /**
     * Creates new form Customer_CartJPanel
     */
    
    UserAccount usrAcc;
    EcoSystem ecosystem;
    RestaurantDirectory rd;
    CustomerDirectory cd;
    Customer customer;
    int count = 0;
    private JPanel userProcessContainer;
    public Customer_CartJPanel(JPanel userProcessContainer, Customer cstmr,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.customer = cstmr;
        this.ecosystem = system;
        populateTable();
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
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        btnOrder = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Cart");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Restaurant", "Item"
            }
        ));
        jScrollPane1.setViewportView(cartTable);

        btnOrder.setText("Place Order");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 134, Short.MAX_VALUE)
                .addComponent(btnOrder)
                .addGap(130, 130, 130))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOrder)
                .addContainerGap(11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        CardLayout crdLyt = (CardLayout) userProcessContainer.getLayout();
        crdLyt.show(userProcessContainer,"Customer");
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        // TODO add your handling code here:
        ArrayList<Cart> cartList = customer.getCart();
        ArrayList<Order> orders = customer.getPreviousOrders();
        Order order;

        for(Cart cm: cartList)
        {
            order = new Order();
            order.setItm(cm.getItem());
            order.setRestaurant(cm.getRestaurant());
            order.setEntryDT(LocalDateTime.now());
            orders.add(order);
        }
        cartList.clear();

        DefaultTableModel dx = (DefaultTableModel) cartTable.getModel();
        dx.setRowCount(0);

        JOptionPane.showMessageDialog(this, "Order placed");
    }//GEN-LAST:event_btnOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnOrder;
    private javax.swing.JTable cartTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        DefaultTableModel tm = (DefaultTableModel) cartTable.getModel();
            tm.setRowCount(0);
        
        ArrayList<Cart> cart = customer.getCart();
        for(Cart cm : cart)
        {
            String[] row = {cm.getRestaurant(),cm.getItem()};
            tm.addRow(row);
            
        }
        
        cartTable.setModel(tm);
    }
}
