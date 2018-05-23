/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

/**
 *
 * @author vikram
 */
public class Vaccine {
    private String vaccineName;
    private int vaccineId;
    private String diseaseName;
    private int availQuantity;
    private int reqQuantity;
    private static int counter = 1;

    public Vaccine() {
        vaccineId = counter;
        counter++;
    }

    public int getVaccineId() {
        return vaccineId;
    }
    
    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    public int getAvailQuantity() {
        return availQuantity;
    }

    public void setAvailQuantity(int availQuantity) {
        this.availQuantity = availQuantity;
    }

    public int getReqQuantity() {
        return reqQuantity;
    }

    public void setReqQuantity(int reqQuantity) {
        this.reqQuantity = reqQuantity;
    }
    
    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }
    
    @Override
    public String toString(){
        return vaccineName;
    }
}
