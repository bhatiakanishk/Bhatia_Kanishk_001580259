/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/**
 *
 * @author kanis
 */
public class VitalSigns {
    
    public int res_rate;
    public int heart_rate;
    public int blood_press;
    public double weight_kg;
    public int age;
    public String date;

    public int getRes_rate() {
        return res_rate;
    }

    public void setRes_rate(int res_rate) {
        this.res_rate = res_rate;
    }

    public int getHeart_rate() {
        return heart_rate;
    }

    public void setHeart_rate(int heart_rate) {
        this.heart_rate = heart_rate;
    }

    public int getBlood_press() {
        return blood_press;
    }

    public void setBlood_press(int blood_press) {
        this.blood_press = blood_press;
    }

    public double getWeight_kg() {
        return weight_kg;
    }

    public void setWeight_kg(double weight_kg) {
        this.weight_kg = weight_kg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    @Override
	public String toString() {
		return "Vital_Signs [res_rate=" + res_rate + ", heart_rate=" + heart_rate + ", blood_press="
				+ blood_press + ", weight_kg=" + weight_kg + ", date=" + date
				+ "]";
	}
        public boolean isPatientNormal() {
			boolean check=false;
		       
		       switch(age){
		           case 1: 
		               if(res_rate>=30 && res_rate<=50 && 
		                  heart_rate>=120 && heart_rate<=160 &&
		                  blood_press>=50 && blood_press<=70 &&
		                  weight_kg>= 2 && weight_kg<= 3){
		                   
		                   check = true;
		               }else{
		                   check = false;
		               }    
		              break;
		            
		           case 2: 
		               if(res_rate>=20 && res_rate<=30 && 
		                  heart_rate>=80 && heart_rate<=140 &&
		                  blood_press>=70 && blood_press<=100 &&
		                  weight_kg>= 4 && weight_kg<= 10){
		                   
		                   check = true;
		               }else{
		                   check = false;
		               }    
		              break;
		           
		           case 3: 
		               if(res_rate>=20 && res_rate<=30 && 
		                  heart_rate>=80 && heart_rate<=130 &&
		                  blood_press>=80 && blood_press<=110 &&
		                  weight_kg>= 10 && weight_kg<= 14){
		                   
		                   check = true;
		               }else{
		                   check = false;
		               }    
		              break;  
		              
		           case 4: 
		               if(res_rate>=20 && res_rate<=30 && 
		                  heart_rate>=80 && heart_rate<=120 &&
		                  blood_press>=80 && blood_press<=110 &&
		                  weight_kg>= 14 && weight_kg<= 18){
		                   
		                   check = true;
		               }else{
		                   check = false;
		               }    
		              break;
		              
		           case 5: 
		               if(res_rate>=20 && res_rate<=30 && 
		                  heart_rate>=70 && heart_rate<=110 &&
		                  blood_press>=80 && blood_press<=120 &&
		                  weight_kg>= 20 && weight_kg<= 42){
		                   
		                   check = true;
		               }else{
		                   check = false;
		               }    
		              break;
		              
		           case 6: 
		               if(res_rate>=12 && res_rate<=20 && 
		                  heart_rate>=55 && heart_rate<=105 &&
		                  blood_press>=100 && blood_press<=120 &&
		                  weight_kg>= 50){
		                   
		                   check = true;
		               }else{
		                   check = false;
		               }    
		              break;  
		              
		           default:
		               System.out.println("Please select a valid age group.\n");
		   }
		       
		       if(check==true){
		           return true;
		       }else{
		           return false;
		       }
		     
		}
		
//Checks if entered vital sign is normal.
		public boolean isThisVitalSignNormal(String vsign) {
	        if (vsign.equalsIgnoreCase("RespiratoryRate")) {
	           switch (age) {
	               case 1:
	                   if (res_rate > 29 && res_rate < 51) {
	                       return true;
	                   } else {
	                       return false;
	                   }
	               case 2:
	                   if (res_rate > 19 && res_rate < 31) {
	                       return true;
	                   } else {
	                       return false;
	                   }
	               case 3:
	                   if (res_rate > 19 && res_rate < 31) {
	                       return true;
	                   } else {
	                       return false;
	                   }
	               case 4:
	                   if (res_rate > 19 && res_rate < 31) {
	                       return true;
	                   } else {
	                       return false;
	                   }
	               case 5:
	                   if (res_rate > 19 && res_rate < 31) {
	                       return true;
	                   } else {
	                       return false;
	                   }
	               case 6:
	                   if (res_rate > 11 && res_rate < 21) {
	                       return true;
	                   } else {
	                       return false;
	                   }
	               default:
	                   return false;
	           }
	       } else if (vsign.equalsIgnoreCase("HeartRate")) {
	           switch (age) {
	               case 1:
	                   if (heart_rate > 119 && heart_rate < 161) {
	                       return true;
	                   } else {
	                       return false;
	                   }
	               case 2:
	                   if (heart_rate > 79 && heart_rate < 141) {
	                       return true;
	                   } else {
	                       return false;
	                   }
	               case 3:
	                   if (heart_rate > 79 && heart_rate < 131) {
	                       return true;
	                   } else {
	                       return false;
	                   }
	               case 4:
	                   if (heart_rate > 79 && heart_rate < 121) {
	                       return true;
	                   } else {
	                       return false;
	                   }
	               case 5:
	                   if (heart_rate > 69 && heart_rate < 111) {
	                       return true;
	                   } else {
	                       return false;
	                   }
	               case 6:
	                   if (heart_rate > 54 && heart_rate < 106) {
	                       return true;
	                   } else {
	                       return false;
	                   }

	               default:
	                   return false;
	           }
	       } else if (vsign.equalsIgnoreCase("BloodPressure")) {
	           switch (age) {
	               case 1:
	                   if (blood_press > 49 && blood_press < 71) {
	                       return true;
	                   } else {
	                       return false;
	                   }
	               case 2:
	                   if (blood_press > 69 && blood_press < 101) {
	                       return true;
	                   } else {
	                       return false;
	                   }
	               case 3:
	                   if (blood_press > 79 && blood_press < 111) {
	                       return true;
	                   } else {
	                       return false;
	                   }
	               case 4:
	                   if (blood_press > 79 && blood_press < 111) {
	                       return true;
	                   } else {
	                       return false;
	                   }
	               case 5:
	                   if (blood_press > 79 && blood_press < 121) {
	                       return true;
	                   } else {
	                       return false;
	                   }
	               case 6:
	                   if (blood_press > 109 && blood_press < 121) {
	                       return true;
	                   } else {
	                       return false;
	                   }

	               default:
	                   return false;
	           }

	       } else if (vsign.equalsIgnoreCase("WeightKg")){
	           switch(age){
	           case 1: if (weight_kg>=2 && weight_kg<=3) 
	                   return true;
	                   else
	                   return false;
	           case 2: if (weight_kg>=4 && weight_kg<=10) 
	                   return true;
	                   else
	                   return false;
	           case 3: if (weight_kg>=10 && weight_kg<=14) 
	                   return true;
	                   else
	                   return false;
	           case 4: if (weight_kg>=14 && weight_kg<=18) 
	                   return true;
	                   else
	                   return false;
	           case 5: if (weight_kg>=20 && weight_kg<=42) 
	                   return true;
	                   else
	                   return false;
	           case 6: if (weight_kg>50) 
	                   return true;
	                   else
	                   return false;
	           
	           default: return false;
	       }
	       }
	       return false;
	    }

}
