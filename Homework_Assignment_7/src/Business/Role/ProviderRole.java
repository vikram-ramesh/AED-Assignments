/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.CDCOrderADRole.CDCOrderADWorkAreaJPanel;
import javax.swing.JPanel;
import userinterface.ProviderRole.ProviderWorkAreaJPanel;

/**
 *
 * @author vikram
 */
public class ProviderRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business,Network network) {
        return new ProviderWorkAreaJPanel(userProcessContainer, account, organization, business,network);
    }
}
