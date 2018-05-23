/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author vikram
 */
public class Airplane {
    private String serialNo;
    private String airplaneName;
//    private int totalSeats;
//    private int seatsAssigned;
//    private String airport;
      
    public String getSerialNo() {
        return serialNo;
    }

    public void setSeriaNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getAirplaneName() {
        return airplaneName;
    }

    public void setAirplaneName(String airplaneName) {
        this.airplaneName = airplaneName;
    }
    
}
