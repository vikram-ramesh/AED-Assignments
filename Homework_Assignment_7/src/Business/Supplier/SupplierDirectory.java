/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import java.util.ArrayList;

/**
 *
 * @author vikram
 */
public class SupplierDirectory {
    private ArrayList<Supplier> supplierList;

    public ArrayList<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(ArrayList<Supplier> supplierList) {
        this.supplierList = supplierList;
    }
    
    public Supplier addSupplier(){
        Supplier s = new Supplier();
        supplierList.add(s);
        return s;
                
    }
}
