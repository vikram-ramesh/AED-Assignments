/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccounts;

import Business.Customers.Customer;
import Business.SalesPerson.SalesPerson;
import Business.Supplier.Supplier;
import static sun.security.krb5.Confounder.bytes;
import sun.security.krb5.internal.crypto.Aes256;

/**
 *
 * @author Varun
 */
public class UserAccount {
    String username;
    String password;
    String role;
    private Boolean accountStatus;
    private Supplier supplier;
    private Customer customer;
    private SalesPerson salesPerson;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password; 
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Boolean getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(Boolean accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public SalesPerson getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(SalesPerson salesPerson) {
        this.salesPerson = salesPerson;
    }
    @Override
    public String toString(){
    return username;
    }
    
    
}
    
    

