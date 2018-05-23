/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author vikram
 */
public class Airliner {
    private String airlinerName;
    private String airlinerId;
    private String airlinerAddress;
    private int noOfFlights;
    


    public String getAirlinerId() {
        return airlinerId;
    }

    public void setAirlinerId(String airlinerId) {
        this.airlinerId = airlinerId;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public String getAirlinerAddress() {
        return airlinerAddress;
    }

    public void setAirlinerAddress(String airlinerAddress) {
        this.airlinerAddress = airlinerAddress;
    }

    public int getNoOfFlights() {
        return noOfFlights;
    }

    public void setNoOfFlights(int noOfFlights) {
        this.noOfFlights = noOfFlights;
    }
    
    @Override
    public String toString(){
        return airlinerName;
    }
    
}
