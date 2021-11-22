/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

public class DeliveryMan {
    private String deliveryId;
    private String name;
    private String phoneNo;
    private String address;

    public DeliveryMan(String deliveryId, String name, String phoneNo, String address) {
        this.deliveryId = deliveryId;
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
    }
    
    public String getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(String deliveryId) {
        this.deliveryId = deliveryId;
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
        
}
