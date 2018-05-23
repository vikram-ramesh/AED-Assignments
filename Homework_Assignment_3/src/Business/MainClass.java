/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vikram
 */
public class MainClass {
    static TravelAgency trAgency = new TravelAgency();
    public static void main(String[] args) {
        int flightBA =0;
        int flightAI = 0;
        int britishAirways = 0;
        int airIndia = 0;
        int travelAgencyRevenue = 0;
        
        String csvFile = "Airplanes.csv";
        BufferedReader br = null;
        String line = " ";
        String cvsSplitBy = ","; 
        try {

            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] airplaneElement = line.split(cvsSplitBy);
                Airplane airplane = trAgency.airliner.addAirplanes();
                Customer customer = trAgency.customerDirectory.addCustomer();
                
                customer.setName(airplaneElement[0]);
                customer.setPhoneNumber(airplaneElement[1]);
                airplane.setSeriaNo(airplaneElement[2]);
                airplane.setAirplaneName(airplaneElement[3]);
                SimpleDateFormat date = new SimpleDateFormat("dd-mm-yyyy");
                try {
                    trAgency.masterSchedule.setDate(date.parse(airplaneElement[4]));
                } catch (ParseException ex) {
                    Logger.getLogger(TravelAgency.class.getName()).log(Level.SEVERE, null, ex);
                }
                trAgency.seat.setSeatType(airplaneElement[5]);
                
                int seatValue = trAgency.seat.value();
                for (Airplane a: trAgency.airliner.getAirplaneList()) {
                    if (airplane.getAirplaneName().equals("BA") && airplane.getSerialNo().equals("BA101")) {
                        flightBA+=seatValue;
                    }
                    if (airplane.getAirplaneName().equals("BA")) {  
                        britishAirways+=seatValue;
                    }
                    if (airplane.getAirplaneName().equals("AI")) {
                        airIndia+=seatValue;
                    }
                }
                
            }
            travelAgencyRevenue+=britishAirways+airIndia;
            
            System.out.println("British Airways - BA101 =$"+ flightBA);
            System.out.println("British Airways Revenue =$" + britishAirways);
            System.out.println("Travel Agency Revenue =$"+ travelAgencyRevenue);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
