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
    private int res_rate; //integer
    private int heart_rate; // integer
    private int sys_blood_press; //integer
    private double weight_kgs; //floating point
    private double weight_pounds; // floating point
    private int age; //integer
    private String date; // String
    
    
    
    public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

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

    public int getSys_blood_press() {
        return sys_blood_press;
    }

    public void setSys_blood_press(int sys_blood_press) {
        this.sys_blood_press = sys_blood_press;
    }


    public double getWeight_kgs() {
		return weight_kgs;
	}

	public void setWeight_kgs(double weight_kgs) {
		this.weight_kgs = weight_kgs;
	}

	public double getWeight_pounds() {
		return weight_pounds;
	}

	public void setWeight_pounds(double weight_pounds) {
		this.weight_pounds = weight_pounds;
	}

	public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

	@Override
	public String toString() {
		return "Vital_Signs [res_rate=" + res_rate + ", heart_rate=" + heart_rate + ", sys_blood_press="
				+ sys_blood_press + ", weight_kgs=" + weight_kgs + ", weight_pounds=" + weight_pounds + ", date=" + date
				+ "]";
	}
    
//Checks if all patient vitals all normal.
		public boolean isPatientNormal() {
			boolean check=false;
		       
		       switch(age){
		           case 1: 
		               if(res_rate>=30 && res_rate<=50 && 
		                  heart_rate>=120 && heart_rate<=160 &&
		                  sys_blood_press>=50 && sys_blood_press<=70 &&
		                  weight_kgs>= 2 && weight_kgs<= 3 &&
		                  weight_pounds >= 4.5 && weight_pounds <= 7){
		                   
		                   check = true;
		               }else{
		                   check = false;
		               }    
		              break;
		            
		           case 2: 
		               if(res_rate>=20 && res_rate<=30 && 
		                  heart_rate>=80 && heart_rate<=140 &&
		                  sys_blood_press>=70 && sys_blood_press<=100 &&
		                  weight_kgs>= 4 && weight_kgs<= 10 &&
		                  weight_pounds >= 9 && weight_pounds <= 22){
		                   
		                   check = true;
		               }else{
		                   check = false;
		               }    
		              break;
		           
		           case 3: 
		               if(res_rate>=20 && res_rate<=30 && 
		                  heart_rate>=80 && heart_rate<=130 &&
		                  sys_blood_press>=80 && sys_blood_press<=110 &&
		                  weight_kgs>= 10 && weight_kgs<= 14 &&
		                  weight_pounds >= 22 && weight_pounds <= 31){
		                   
		                   check = true;
		               }else{
		                   check = false;
		               }    
		              break;  
		              
		           case 4: 
		               if(res_rate>=20 && res_rate<=30 && 
		                  heart_rate>=80 && heart_rate<=120 &&
		                  sys_blood_press>=80 && sys_blood_press<=110 &&
		                  weight_kgs>= 14 && weight_kgs<= 18 &&
		                  weight_pounds >= 31 && weight_pounds <= 40){
		                   
		                   check = true;
		               }else{
		                   check = false;
		               }    
		              break;
		              
		           case 5: 
		               if(res_rate>=20 && res_rate<=30 && 
		                  heart_rate>=70 && heart_rate<=110 &&
		                  sys_blood_press>=80 && sys_blood_press<=120 &&
		                  weight_kgs>= 20 && weight_kgs<= 42 &&
		                  weight_pounds >= 41 && weight_pounds <= 92){
		                   
		                   check = true;
		               }else{
		                   check = false;
		               }    
		              break;
		              
		           case 6: 
		               if(res_rate>=12 && res_rate<=20 && 
		                  heart_rate>=55 && heart_rate<=105 &&
		                  sys_blood_press>=100 && sys_blood_press<=120 &&
		                  weight_kgs>= 50 &&
		                  weight_pounds >= 110 ){
		                   
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
	                   if (sys_blood_press > 49 && sys_blood_press < 71) {
	                       return true;
	                   } else {
	                       return false;
	                   }
	               case 2:
	                   if (sys_blood_press > 69 && sys_blood_press < 101) {
	                       return true;
	                   } else {
	                       return false;
	                   }
	               case 3:
	                   if (sys_blood_press > 79 && sys_blood_press < 111) {
	                       return true;
	                   } else {
	                       return false;
	                   }
	               case 4:
	                   if (sys_blood_press > 79 && sys_blood_press < 111) {
	                       return true;
	                   } else {
	                       return false;
	                   }
	               case 5:
	                   if (sys_blood_press > 79 && sys_blood_press < 121) {
	                       return true;
	                   } else {
	                       return false;
	                   }
	               case 6:
	                   if (sys_blood_press > 109 && sys_blood_press < 121) {
	                       return true;
	                   } else {
	                       return false;
	                   }

	               default:
	                   return false;
	           }

	       } else if (vsign.equalsIgnoreCase("WeightKg")){
	           switch(age){
	           case 1: if (weight_kgs>=2 && weight_kgs<=3) 
	                   return true;
	                   else
	                   return false;
	           case 2: if (weight_kgs>=4 && weight_kgs<=10) 
	                   return true;
	                   else
	                   return false;
	           case 3: if (weight_kgs>=10 && weight_kgs<=14) 
	                   return true;
	                   else
	                   return false;
	           case 4: if (weight_kgs>=14 && weight_kgs<=18) 
	                   return true;
	                   else
	                   return false;
	           case 5: if (weight_kgs>=20 && weight_kgs<=42) 
	                   return true;
	                   else
	                   return false;
	           case 6: if (weight_kgs>50) 
	                   return true;
	                   else
	                   return false;
	           
	           default: return false;
	       }
	       }
	       else if(vsign.equalsIgnoreCase("WeightLb")){
	           switch(age){
	           case 1: if (weight_pounds>=4.5 && weight_pounds<=7) 
	                   return true;
	                   else
	                   return false;
	           case 2: if (weight_pounds>=9 && weight_pounds<=12) 
	                   return true;
	                   else
	                   return false;
	           case 3: if (weight_pounds>=22 && weight_pounds<=31) 
	                   return true;
	                   else
	                   return false;
	           case 4: if (weight_pounds>=31 && weight_pounds<=40) 
	                   return true;
	                   else
	                   return false;
	           case 5: if (weight_pounds>=41 && weight_pounds<=92) 
	                   return true;
	                   else
	                   return false;
	           case 6: if (weight_pounds>110) 
	                   return true;
	                   else
	                   return false;
	           
	           default: return false;
	       }
	       }
	       return false;
	   
	    }

}
