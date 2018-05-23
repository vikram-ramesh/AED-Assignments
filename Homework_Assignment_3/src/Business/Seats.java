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
public class Seats {
    
    //private int seatValue;
    private String seatType;

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }
//    public int getSeatValue() {
//        return seatValue;
//    }
//
//    public void setSeatValue(int seatValue) {
//        this.seatValue = seatValue;
//    }
    
    
    public int value(){
        int seatValue = 0;
            if (getSeatType().equals("Window")) {
                seatValue=200;
            }
            else if (getSeatType().equals("Middle")) {
            seatValue = 150;
        }
            else if (getSeatType().equals("Aisle")) {
            seatValue = 100;
        }
        return seatValue;
        
    }
}
