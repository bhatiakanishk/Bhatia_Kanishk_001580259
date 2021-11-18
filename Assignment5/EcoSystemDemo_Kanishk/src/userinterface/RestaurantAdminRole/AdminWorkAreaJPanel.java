

package userinterface.RestaurantAdminRole;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;


public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private RestaurantDirectory restaurantDirectory;
    private EcoSystem system;
    private MenuDirectory menuDirectory;
    private OrderDirectory orderDirectory;
    private UserAccount account;
    private DeliveryManDirectory deliveryManDirectory;

    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer,UserAccount account, EcoSystem system, RestaurantDirectory restaurantDirectory,DeliveryManDirectory deliveryManDirectory,MenuDirectory menuDirectory, OrderDirectory orderDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.restaurantDirectory = restaurantDirectory;
        this.system = system;
        this.menuDirectory = menuDirectory;
        this.orderDirectory = orderDirectory;
        this.account = account;
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        userJButton.setText("Manage Restaurant Info");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 180, -1));

        manageEmployeeJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        manageEmployeeJButton.setText("Manage menu");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 180, -1));

        manageOrganizationJButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        manageOrganizationJButton.setText("Manage Orders");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 180, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Restaurant :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        ManageResturantInfoJPanel manageResturantInfoJPanel = new ManageResturantInfoJPanel(userProcessContainer,account, system, restaurantDirectory,menuDirectory);
        userProcessContainer.add(manageResturantInfoJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        ManageMenuJPanel manageMenuJPanel = new ManageMenuJPanel(userProcessContainer,account, system, restaurantDirectory,menuDirectory);
        userProcessContainer.add(manageMenuJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        ManageRestaurantOrderJPanel manageResturantInfoJPanel = new ManageRestaurantOrderJPanel(userProcessContainer,account, system, restaurantDirectory,deliveryManDirectory,menuDirectory,orderDirectory);
        userProcessContainer.add(manageResturantInfoJPanel);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    // End of variables declaration//GEN-END:variables
    
}
