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
public class SeatList {
    private ArrayList<Seat> listOfSeats;

    public ArrayList<Seat> getListOfSeats() {
        return listOfSeats;
    }

    public void setListOfSeats(ArrayList<Seat> listOfSeats) {
        this.listOfSeats = listOfSeats;
    }
    
    public Seat AddSeat(){
        Seat seat = new Seat();
        listOfSeats.add(seat);
        return seat;
    }
}
