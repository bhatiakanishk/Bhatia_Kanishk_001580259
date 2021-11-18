/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;
import Business.EcoSystem;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
/**
 *
 * @author kanishk
 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliveryManDirectory;

    public DeliveryManDirectory(){
        deliveryManDirectory = new ArrayList<DeliveryMan>();
    }
    
    public ArrayList<DeliveryMan> getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(ArrayList<DeliveryMan> deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public DeliveryMan add(String name, String phone){
        DeliveryMan deliveryMan = new DeliveryMan("D"+(deliveryManDirectory.size()+1),name,phone);
        deliveryManDirectory.add(deliveryMan);
        return deliveryMan;
    }
    
    public void deleteDeliveryMan(int index,EcoSystem system){
        deliveryManDirectory.remove(index);
    }
    
    public DeliveryMan getDeliveryManId(int index){
        return deliveryManDirectory.get(index);
    }
    
    public boolean isPhoneUnique(String phone){
        for(DeliveryMan deliveryMan: deliveryManDirectory){
            if(deliveryMan.getPhoneNo().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
    
    public void updateDeliveryMan(String id,String name,String phone){
        for(DeliveryMan deliveryMan: deliveryManDirectory){
            if(deliveryMan.getDeliveryId().equalsIgnoreCase(id)){
                deliveryMan.setName(name);
                deliveryMan.setPhoneNo(phone);
            }
        }
    }
    
    public DeliveryMan getDeliveryMan(String id){
        for(DeliveryMan deliveryMan: deliveryManDirectory){
            if(deliveryMan.getDeliveryId().equalsIgnoreCase(id)){
                return deliveryMan;
            }
        }
        return null;
    }
}
