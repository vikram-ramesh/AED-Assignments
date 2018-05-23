/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessPackage.BusinessConfiguration;

import BusinessPackage.Business;
import BusinessPackage.Person;
import BusinessPackage.PersonDirectory;
import BusinessPackage.UserAccount;
import BusinessPackage.UserAccountDirectory;

/**
 *
 * @author vikram
 */
public class ConfigureABusiness {
    public static Business Initialize(String n){
        
        Business b = new Business(n);
        //Person p = b.getPersonDirectory().addPerson();
        //UserAccountDirectory uad = ;
        
//        p.setFirstName("Ann");
//        p.setLastName("Wells");        
//        Person person1 = b.getPersonDirectory().findPersonByLastName("Wells");
//        if (person1!= null) {
//            UserAccount ua = b.getUserAccountDirectory().newUserAccount();
//            
//            person1.setUserAccount(ua);
//            ua.setUserName("anna");
//            ua.setPassword("pwd");
//            ua.setStatus("Active");
//            ua.setRole("Human Resources");
//        }
        
        
        Person p = b.getPersonDirectory().addPerson();
        p.setFirstName("John");
        p.setLastName("Brown");
        Person person2 = b.getPersonDirectory().findPersonByLastName("Brown");
        if (person2!= null) {
            UserAccount ua = b.getUserAccountDirectory().newUserAccount();
            
            person2.setUserAccount(ua);
            ua.setUserName("jadam");
            ua.setPassword("pwd");
            ua.setStatus("Active");
            ua.setRole("System Admin");
        }
       
        
        return b;
        
    }
}
