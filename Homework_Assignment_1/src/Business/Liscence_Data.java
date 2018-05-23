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
public class Liscence_Data {
    //Creating fields for Liscence Data.
    String liscenceId;
    String expiryDate;
    String issueDate;
    String restriction;
    String stateIssued;

    //Getters and Setters for the fields.
    public String getLiscenceId() {
        return liscenceId;
    }

    public void setLiscenceId(String liscenceId) {
        this.liscenceId = liscenceId;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getRestriction() {
        return restriction;
    }

    public void setRestriction(String restriction) {
        this.restriction = restriction;
    }

    public String getStateIssued() {
        return stateIssued;
    }

    public void setStateIssued(String stateIssued) {
        this.stateIssued = stateIssued;
    }
}
