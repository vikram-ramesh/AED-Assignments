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
public class Credit_Card {
    //Creating fields for Credit Card Details
    String cardNumber;
    String issueDate;
    String expiryDate;
    String typeOfCard;
    String issuedByBank;
    
    
    //Getters and Setters for the fields.
    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getTypeOfCard() {
        return typeOfCard;
    }

    public void setTypeOfCard(String typeOfCard) {
        this.typeOfCard = typeOfCard;
    }

    public String getIssuedByBank() {
        return issuedByBank;
    }

    public void setIssuedByBank(String issuedByBank) {
        this.issuedByBank = issuedByBank;
    }
}
