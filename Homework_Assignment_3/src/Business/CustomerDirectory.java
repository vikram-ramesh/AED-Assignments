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
public class CustomerDirectory {
    ArrayList<Customer> customerDirectory ;
    
    public CustomerDirectory(){
    customerDirectory = new ArrayList<Customer>();
}

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public Customer addCustomer(){
        Customer customer = new Customer();
        customerDirectory.add(customer);
        return customer;
    }
    
}
