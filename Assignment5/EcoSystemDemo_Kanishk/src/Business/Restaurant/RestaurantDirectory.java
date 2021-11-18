/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;
import Business.EcoSystem;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author kanishk
 */
public class RestaurantDirectory {
    private ArrayList<Restaurant> restaurantDirectory;

    public RestaurantDirectory() throws IOException{
        restaurantDirectory = new ArrayList<Restaurant>();
    }
    
    public ArrayList<Restaurant> getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(ArrayList<Restaurant> restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }
    
    public Restaurant add(String managerName,String name, String phone, String address){
       Restaurant restaurant = new Restaurant("R"+(restaurantDirectory.size()+1),managerName, name, phone, address);
       restaurantDirectory.add(restaurant);
       return restaurant;
    }
    
    public void deleteRestaurant(int index,EcoSystem system){
        restaurantDirectory.remove(index);
    }
    
    public Restaurant getRestaurantId(int index){
        return restaurantDirectory.get(index);
    }

    public String getRestName(String restaurantId) {
        for(Restaurant restaurant: restaurantDirectory){
            if(restaurant.getRestaurantId().equalsIgnoreCase(restaurantId)){
                return restaurant.getName();
            }
        }
        return "";
    }
    
    public Restaurant getRestaurant(String id){
        for(Restaurant restaurant: restaurantDirectory){
            if(restaurant.getRestaurantId().equalsIgnoreCase(id)){
                return restaurant;
            }
        }
        return null;
    }
    
    public boolean isPhoneUnique(String phone){
        for(Restaurant restaurant: restaurantDirectory){
            if(restaurant.getPhoneNo().equalsIgnoreCase(phone)){
                return false;
            }
        }
        return true;
    }
}
