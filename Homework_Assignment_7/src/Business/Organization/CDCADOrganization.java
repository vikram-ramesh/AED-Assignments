/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CDCOrderADRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vikram
 */
public class CDCADOrganization extends Organization{

    public CDCADOrganization() {
        super(Organization.Type.CDCAD.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CDCOrderADRole());
        return roles;
    }
}
