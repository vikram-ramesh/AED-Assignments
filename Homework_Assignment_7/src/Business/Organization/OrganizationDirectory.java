/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author vikram
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Clinic.getValue())){
            organization = new ClinicOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Provider.getValue())){
            organization = new ProviderOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Distributor.getValue())){
            organization = new DistributorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.CDCAD.getValue())){
            organization = new CDCADOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}