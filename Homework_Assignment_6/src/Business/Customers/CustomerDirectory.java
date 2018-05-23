/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customers;

import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public class CustomerDirectory {
    private ArrayList<Customer> customerList;

    public CustomerDirectory() {
    customerList = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer addCustomer(){
    Customer c = new Customer();
    customerList.add(c);
    return c;
    }
    
    public void removeCustomer(Customer cust){
    customerList.remove(cust);
    }
    
}
