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
public class Airplanes {
    private String serialNo;
    private String modelNo;
    private String manufacturer;
    private int yearOfManufacture;
    private int numberOfSeats;
    private String maintaineneceCertificate;
    private String airport;
    private Date departureDate;
    private Date catalogUpdatedDate;

    public Date getCatalogUpdatedDate() {
        return catalogUpdatedDate;
    }

    public void setCatalogUpdatedDate(Date catalogUpdatedDate) {
        this.catalogUpdatedDate = catalogUpdatedDate;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getModelNo() {
        return modelNo;
    }

    public void setModelNo(String modelNo) {
        this.modelNo = modelNo;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public String getMaintaineneceCertificate() {
        return maintaineneceCertificate;
    }

    public void setMaintaineneceCertificate(String maintaineneceCertificate) {
        this.maintaineneceCertificate = maintaineneceCertificate;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

                
    @Override
    public String toString(){
        return this.serialNo;
    }
         
}
