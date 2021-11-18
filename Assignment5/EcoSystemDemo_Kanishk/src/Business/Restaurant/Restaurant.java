/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;
/**
 *
 * @author kanishk
 */
public class Restaurant {
    private String restaurantId;
    private String name;
    private String phoneNo;
    private String address;
    private String managerName;

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public Restaurant(String restaurantId, String name, String phoneNo, String address, String managerName) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
        this.managerName = managerName;
    }
}
