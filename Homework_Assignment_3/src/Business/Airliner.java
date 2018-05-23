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
    
    ArrayList<Airplane> airplaneList;
    Seats seat ;
    
        
    public Airliner() {
        airplaneList = new ArrayList<Airplane>();
    }
    
    public ArrayList<Airplane> getAirplaneList() {
        return airplaneList;
    }

    public void setAirplaneList(ArrayList<Airplane> airplaneList) {
        this.airplaneList = airplaneList;
    }

    public Airplane addAirplanes() {
       Airplane airplane = new Airplane();
        airplaneList.add(airplane);
        return airplane; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
