package Business;

import Business.Disease.Disease;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.Supplier.SupplierDirectory;
import Business.Vaccine.Vaccine;
import Business.Vaccine.VaccineCatalog;
import java.util.ArrayList;

/**
 *
 * @author vikram
 */
public class EcoSystem extends Organization {

    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private VaccineCatalog vaccineList;
    private SupplierDirectory sD;
//    private ArrayList<Disease> disease;

    public static EcoSystem getInstance() {
        if (business == null) {
            business = new EcoSystem();
        }
        return business;
    }

    private EcoSystem() {
        super(null);
        networkList = new ArrayList<>();
        vaccineList = new VaccineCatalog();
    }

    public VaccineCatalog getVaccine() {
        return vaccineList;
    }

    public void setVaccine(VaccineCatalog vaccineList) {
        this.vaccineList = vaccineList;
    }

    public VaccineCatalog getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(VaccineCatalog vaccineList) {
        this.vaccineList = vaccineList;
    }

    public SupplierDirectory getsD() {
        return sD;
    }

    public void setsD(SupplierDirectory sD) {
        this.sD = sD;
    }
    

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public Network createAndAddNetwork() {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList = new ArrayList<>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    public boolean checkIfUsernameIsUnique(String username) {

        if (!this.getUserAccountDirectory().checkIfUsernameIsUnique(username)) {
            return false;
        }

       

        return true;
    }
}