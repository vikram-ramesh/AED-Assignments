/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author vikram
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (null != type)switch (type) {
            case Clinic:
                enterprise = new ClinicEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case Distributor:
                enterprise = new DistributorEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            case Provider:
                enterprise = new ProviderEnterprise(name);
                enterpriseList.add(enterprise);
                break;
            default:
                break;
        }
        return enterprise;
    }
    
}
