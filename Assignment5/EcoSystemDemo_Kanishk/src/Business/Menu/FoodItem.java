/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Menu;
import java.awt.image.BufferedImage;

/**
 *
 * @author kanishk
 */
public class FoodItem {
    
    private String itemId;
    private String restaurantId;
    private String itemName;
    private double price;

    public FoodItem(String itemId, String restaurantId, String itemName, double price) {
        this.itemId = itemId;
        this.restaurantId = restaurantId;
        this.itemName = itemName;

        this.price = price;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
