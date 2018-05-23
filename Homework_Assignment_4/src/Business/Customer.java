/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author vikram
 */
public class Customer {
    private String customerName;
    private String flightSerialNo;
    private String flightAirlinerName;
    private String departureLocation;
    private String arrivalLocation;
    private String timeOfDay;
    private int cost;
    private Date departureDate;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getFlightSerialNo() {
        return flightSerialNo;
    }

    public void setFlightSerialNo(String flightSerialNo) {
        this.flightSerialNo = flightSerialNo;
    }

    public String getFlightAirlinerName() {
        return flightAirlinerName;
    }

    public void setFlightAirlinerName(String flightAirlinerName) {
        this.flightAirlinerName = flightAirlinerName;
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public int getCost() {
        return cost;
    }

    public void setBookedSeats(int cost) {
        this.cost = cost;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }
}
