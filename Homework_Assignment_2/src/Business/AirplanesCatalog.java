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
public class AirplanesCatalog {
    private ArrayList<Airplanes> airplanesCatalog;

    public AirplanesCatalog() { 
        airplanesCatalog = new ArrayList<Airplanes>();
    }

    public ArrayList<Airplanes> getAirplanesCatalog() {
        return airplanesCatalog;
    }

    public void setAirplanesCatalog(ArrayList<Airplanes> airplanesCatalog) {
        this.airplanesCatalog = airplanesCatalog;
    }
    public Airplanes addAirplanes() {
        Airplanes airplanes = new Airplanes();
        airplanesCatalog.add(airplanes);
        return airplanes;
    }
    
    public void deleteAirplanes(Airplanes air){
        airplanesCatalog.remove(air);
    }
    
}
