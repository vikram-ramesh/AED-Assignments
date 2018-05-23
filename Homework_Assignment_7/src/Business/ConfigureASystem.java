package Business;

import Business.Disease.Disease;
import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.Vaccine.Vaccine;
import Business.Vaccine.VaccineCatalog;
import java.util.ArrayList;

/**
 *
 * @author vikram
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("1", "1", employee, new SystemAdminRole());
        
        //for (int i = 0; i < 10; i++) {
            VaccineCatalog vaccineCatalog = new VaccineCatalog();
            vaccineCatalog.addVaccine().setVaccineName("aijd");
            vaccineCatalog.addVaccine().setDiseaseName("nwfi");
            vaccineCatalog.addVaccine().setAvailQuantity(10);
            vaccineCatalog.addVaccine().setReqQuantity(0);
        //}
        
        
        
        ArrayList<Disease> diseaseCatalog = new ArrayList<Disease>();
        Disease d = new Disease();
        
        
        return system;
    }
    
}
