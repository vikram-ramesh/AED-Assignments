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
public class Financial_Accounts {
    //Creating fields for Financial Accounts details.
    String checkingsAccNumber;
    String savingsAccNumber;
    String checkingsAccCreationDate;
    String savingsAccCreationDate;
    String checkingsAccStatus;
    String savingsAccStatus;

    //Getters and Setters for the fields.
    public String getCheckingsAccNumber() {
        return checkingsAccNumber;
    }

    public void setCheckingsAccNumber(String checkingsAccNumber) {
        this.checkingsAccNumber = checkingsAccNumber;
    }

    public String getSavingsAccNumber() {
        return savingsAccNumber;
    }

    public void setSavingsAccNumber(String savingsAccNumber) {
        this.savingsAccNumber = savingsAccNumber;
    }

    public String getCheckingsAccCreationDate() {
        return checkingsAccCreationDate;
    }

    public void setCheckingsAccCreationDate(String checkingsAccCreationDate) {
        this.checkingsAccCreationDate = checkingsAccCreationDate;
    }

    public String getSavingsAccCreationDate() {
        return savingsAccCreationDate;
    }

    public void setSavingsAccCreationDate(String savingsAccCreationDate) {
        this.savingsAccCreationDate = savingsAccCreationDate;
    }

    public String getCheckingsAccStatus() {
        return checkingsAccStatus;
    }

    public void setCheckingsAccStatus(String checkingsAccStatus) {
        this.checkingsAccStatus = checkingsAccStatus;
    }

    public String getSavingsAccStatus() {
        return savingsAccStatus;
    }

    public void setSavingsAccStatus(String savingsAccStatus) {
        this.savingsAccStatus = savingsAccStatus;
    }
}
