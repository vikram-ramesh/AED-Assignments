/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ClinicRole;
import Business.Role.ProviderRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vikram
 */
public class ClinicOrganization extends Organization{

    private Inventory inventory;
    public ClinicOrganization() {
        super(Organization.Type.Clinic.getValue());
        inventory = new Inventory();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ClinicRole());
        return roles;
    }
     
}