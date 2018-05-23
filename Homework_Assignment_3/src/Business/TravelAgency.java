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
public class TravelAgency {
    Airliner airliner;
    CustomerDirectory customerDirectory;
    MasterSchedule masterSchedule;
    Seats seat;
    public TravelAgency(){
        airliner =new Airliner();
        customerDirectory = new CustomerDirectory();
        masterSchedule = new MasterSchedule();
        seat = new Seats();
    }

    public Airliner getAirliner() {
        return airliner;
    }

    public void setAirliner(Airliner airliner) {
        this.airliner = airliner;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public MasterSchedule getMasterSchedule() {
        return masterSchedule;
    }

    public void setMasterSchedule(MasterSchedule masterSchedule) {
        this.masterSchedule = masterSchedule;
    }

    public Seats getSeat() {
        return seat;
    }

    public void setSeat(Seats seat) {
        this.seat = seat;
    }
}
