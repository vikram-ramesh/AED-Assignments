/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import javax.swing.ImageIcon;

/**
 *
 * @author vikram
 */
public class Person {
    //Creating fields for Person Data.
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String emailId;
    private String phoneNumber;
    public ImageIcon icon;
    
    //Initializing objects to link classes with Person Class.
    public Address address;
    public Credit_Card creditCard;
    public Financial_Accounts financialAccounts;
    public Liscence_Data liscenceData;
    public Spouse spouse;
    
    //Constructor for Person Class.
    public Person() {   
        //Creating the objects for the classes.
        address = new Address();
        creditCard = new Credit_Card();
        financialAccounts = new Financial_Accounts();
        liscenceData = new Liscence_Data();
        spouse = new Spouse();
    }

    //Creating Getters and Setters for the Fields.
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Credit_Card getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(Credit_Card creditCard) {
        this.creditCard = creditCard;
    }

    public Financial_Accounts getFinancialAccounts() {
        return financialAccounts;
    }

    public void setFinancialAccounts(Financial_Accounts financialAccounts) {
        this.financialAccounts = financialAccounts;
    }

    public Liscence_Data getLiscenceData() {
        return liscenceData;
    }

    public void setLiscenceData(Liscence_Data liscenceData) {
        this.liscenceData = liscenceData;
    }

    public void setSpouse(Spouse spouse) {
        this.spouse = spouse;
    }
    
    public Spouse getSpouse(){
        return spouse;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public ImageIcon getIcon() {
        return icon;
    }

    public void setIcon(ImageIcon icon) {
        this.icon = icon;
    }
                            
}
