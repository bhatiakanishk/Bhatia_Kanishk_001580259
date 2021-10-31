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
public class Main {
    public static void main(String[] args){
        Patient_Directory pd = new Patient_Directory();
		//Total Patients = 9
		//Patients with abnormal vitals = 5
		//Total Houses = 4
		//Total Communities = 2
		//Total City = 1
		
		//Step 1 : Creating patients.
		
		// Patient 1: Newborn, Vitals Signs normal.
		Patient pat1 = new Patient();
		// Setting Person details.
		pat1.setFirstname("Lee");
		pat1.setLastname("Amber");
		pat1.setContactno(3878765876L);
		pat1.setZipcode(02120);
		VitalSigns vs1 = new VitalSigns();
		// Setting Vital Signs.
		vs1.setAge(1);
		vs1.setDate("22/02/22");
		vs1.setRes_rate(37);
		vs1.setHeart_rate(130);
		vs1.setSys_blood_press(56);
		vs1.setWeight_kgs(2.4);
		vs1.setWeight_pounds(5.2);
		Encounter en1 = new Encounter(vs1);
		pat1.Enclist.add(en1);
		pd.addPatient(pat1);

		
		// Patient 2: Toddler, Vitals Signs normal.
		Patient pat2 = new Patient();
		// Setting Person details.
		pat2.setFirstname("Davis");
		pat2.setLastname("Brady");
		pat2.setContactno(8264858746L);
		pat2.setZipcode(02120);
		VitalSigns vs2 = new VitalSigns();
		// Setting Vital Signs.
		vs2.setAge(3);
		vs2.setDate("25/03/17");
		vs2.setRes_rate(27);
		vs2.setHeart_rate(120);
		vs2.setSys_blood_press(93);
		vs2.setWeight_kgs(12.4);
		vs2.setWeight_pounds(24.9);
		Encounter en2 = new Encounter(vs2);
		pat2.Enclist.add(en2);
		pd.addPatient(pat2);

		
		// Patient 3: Adult, Vitals Signs abnormal.
		Patient pat3 = new Patient();
		// Setting Person details.
		pat3.setFirstname("Val");
		pat3.setLastname("Clara");
		pat3.setContactno(8826578746L);
		pat3.setZipcode(02120);
		VitalSigns vs3 = new VitalSigns();
		// Setting Vital Signs.
		vs3.setAge(6);
		vs3.setDate("21/11/92");
		vs3.setRes_rate(17);
		vs3.setHeart_rate(120);
		vs3.setSys_blood_press(122);
		vs3.setWeight_kgs(89);
		vs3.setWeight_pounds(124);
		Encounter en3 = new Encounter(vs3);
		pat3.Enclist.add(en3);
		pd.addPatient(pat3);

		
		// Patient 4: Adult, Vitals Signs abnormal.
		Patient pat4 = new Patient();
		// Setting Person details.
		pat4.setFirstname("Aggie");
		pat4.setLastname("Norris");
		pat4.setContactno(3878765876L);
		pat4.setZipcode(02120);
		VitalSigns vs4 = new VitalSigns();
		// Setting Vital Signs.
		vs4.setAge(6);
		vs4.setDate("08/07/91");
		vs4.setRes_rate(37);
		vs4.setHeart_rate(130);
		vs4.setSys_blood_press(143);
		vs4.setWeight_kgs(120);
		vs4.setWeight_pounds(210);
		Encounter en4 = new Encounter(vs4);
		pat4.Enclist.add(en4);
		pd.addPatient(pat4);

		
		// Patient 5: School Age, Vitals Signs normal.
		Patient pat5 = new Patient();
		// Setting Person details.
		pat5.setFirstname("Rona");
		pat5.setLastname("Addilyn");
		pat5.setContactno(8264858746L);
		pat5.setZipcode(02120);
		VitalSigns vs5 = new VitalSigns();
		// Setting Vital Signs.
		vs5.setAge(5);
		vs5.setDate("25/12/13");
		vs5.setRes_rate(27);
		vs5.setHeart_rate(101);
		vs5.setSys_blood_press(112);
		vs5.setWeight_kgs(31);
		vs5.setWeight_pounds(84);
		Encounter en5 = new Encounter(vs5);
		pat5.Enclist.add(en5);
		pd.addPatient(pat5);

		
		// Patient 6: Pre-Schooler, Vitals Signs abnormal.
		Patient pat6 = new Patient();
		// Setting Person details.
		pat6.setFirstname("Freddy");
		pat6.setLastname("Hal");
		pat6.setContactno(8826578746L);
		pat6.setZipcode(02120);
		VitalSigns vs6 = new VitalSigns();
		// Setting Vital Signs.
		vs6.setAge(4);
		vs6.setDate("29/03/18");
		vs6.setRes_rate(31);
		vs6.setHeart_rate(90);
		vs6.setSys_blood_press(130);
		vs6.setWeight_kgs(16);
		vs6.setWeight_pounds(32);
		Encounter en6 = new Encounter(vs6);
		pat6.Enclist.add(en6);
		pd.addPatient(pat6);

		
		// Patient 7: Adult, Vitals Signs abnormal.
		Patient pat7 = new Patient();
		// Setting Person details.
		pat7.setFirstname("Colin");
		pat7.setLastname("Laurence");
		pat7.setContactno(3878765876L);
		pat7.setZipcode(02122);
		VitalSigns vs7 = new VitalSigns();
		// Setting Vital Signs.
		vs7.setAge(6);
		vs7.setDate("01/10/95");
		vs7.setRes_rate(37);
		vs7.setHeart_rate(130);
		vs7.setSys_blood_press(56);
		vs7.setWeight_kgs(100);
		vs7.setWeight_pounds(210);
		Encounter en7 = new Encounter(vs7);
		pat7.Enclist.add(en7);
		pd.addPatient(pat7);

		
		// Patient 8: Adult, Vitals Signs normal.
		Patient pat8 = new Patient();
		// Setting Person details.
		pat8.setFirstname("Elicia");
		pat8.setLastname("Hayes");
		pat8.setContactno(8264027746L);
		pat8.setZipcode(02122);
		VitalSigns vs8 = new VitalSigns();
		// Setting Vital Signs.
		vs8.setAge(6);
		vs8.setDate("12/05/90");
		vs8.setRes_rate(15);
		vs8.setHeart_rate(76);
		vs8.setSys_blood_press(115);
		vs8.setWeight_kgs(65);
		vs8.setWeight_pounds(112);
		Encounter en8 = new Encounter(vs8);
		pat8.Enclist.add(en8);
		pd.addPatient(pat8);

		
		// Patient 9: School Age, Vitals Signs abnormal.
		Patient pat9 = new Patient();
		// Setting Person details.
		pat9.setFirstname("Jasmyn");
		pat9.setLastname("Jan");
		pat9.setContactno(8873218746L);
		pat9.setZipcode(02122);
		VitalSigns vs9 = new VitalSigns();
		// Setting Vital Signs.
		vs9.setAge(5);
		vs9.setDate("17/08/14");
		vs9.setRes_rate(25);
		vs9.setHeart_rate(117);
		vs9.setSys_blood_press(122);
		vs9.setWeight_kgs(60);
		vs9.setWeight_pounds(110);
		Encounter en9 = new Encounter(vs9);
		pat9.Enclist.add(en9);
		pd.addPatient(pat9);
		
		
		//Step 2 : Creating new Houses and assigning patients to those houses.
		
		//House 1
        House house1 = new House();
        house1.prsn.add(pat1);
        house1.prsn.add(pat2);

        //House 2
        House house2 = new House();
        house2.prsn.add(pat3);
        house2.prsn.add(pat4);
        house2.prsn.add(pat5);

        //House 3
        House house3 = new House();
        house3.prsn.add(pat6);
        house3.prsn.add(pat7);

        //House 4
        House house4 = new House();
        house4.prsn.add(pat8);
        house4.prsn.add(pat9);
        
        
        //Step 3 : Creating new communities and assigning houses to these communities.
        Community comm1 = new Community();
        comm1.houses.add(house1);
        comm1.houses.add(house2);

        Community comm2 = new Community();
        comm2.houses.add(house3);
        comm2.houses.add(house4);
        
        //Step 4 : Creating new city and assigning community to this city.
        City city = new City();
        city.cmty.add(comm1);
        city.cmty.add(comm2);

        int comm1cnt = 0;
            for (House h : comm1.houses) {
                for (Person p : h.prsn) {
                    Patient pat = (Patient) p;
                    
                    if (!pat.Enclist.get(pat.Enclist.size() - 1).evs.isThisVitalSignNormal("BloodPressure")) {
                        comm1cnt++;
                       System.out.println("Patient with Abnormal Blood Pressure: " + pat);
                    }

                }
            }
            
        System.out.println("Count of patients with abnormal blood pressure for first comunity is: " + comm1cnt);
        
        
        int comm2cnt= 0;
        for (House h : comm2.houses) {
                for (Person p : h.prsn) {
                    Patient pat = (Patient) p;
                    if (!pat.Enclist.get(pat.Enclist.size() - 1).evs.isThisVitalSignNormal("BloodPressure")) {
                        comm2cnt++;
                        System.out.println("patient with Abnormal Blood Pressure: " + pat);
                    }
                }
            }
        System.out.println("Count of patients with abnormal blood pressure for second comunity is: " + comm2cnt);
        
        int cityab = comm1cnt + comm2cnt;
        System.out.println("Total number of patients with abnormal blood pressure in the entire city is: " + cityab);
    }
    
}
