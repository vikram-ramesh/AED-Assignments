/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vikram
 */
public class FlightDirectory {
    
    ArrayList<Flight> flightList;

    public FlightDirectory() {
        flightList = new ArrayList<Flight>();
    }

    public ArrayList<Flight> getFlightList() {
        return flightList;
    }

    public void setFlightList(ArrayList<Flight> flightList) {
        this.flightList = flightList;
    }
    
    public Flight addFlight(){
        Flight flight = new Flight();
        flightList.add(flight);
        return flight;
    }
    
    public void deleteFlight(Flight flight){
        flightList.remove(flight); 
    }
    
    public ArrayList<Flight> searchFlight(String departureLocation, String arrivalLocation){
        ArrayList<Flight> result = new ArrayList<Flight>();
        for (Flight flight: flightList) {
            if (departureLocation.equals("") && arrivalLocation.equals("")) {
                result.add(flight);
            }
            if (flight.getDepartureLocation().equals(departureLocation) && flight.getArrivalLocation().equals(arrivalLocation)) {
                result.add(flight);
            }
        }
        return result;
    }
    
    
//    public ArrayList<Flight> searchFlight(String preferredTime){
//        ArrayList<Flight> result = new ArrayList<Flight>();
//        for (Flight flight: flightList) {
//            if (flight.getTimeOfDay().equals(preferredTime)) {
//                result.add(flight);
//            }
//        }
//        return result;
//    }
    
}
