/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vikram
 */
public class SupplierDirectory {
    private List<Supplier> supplierList;
    
    public SupplierDirectory() {
    
        supplierList = new ArrayList<Supplier>();
    }

    public List<Supplier> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(List<Supplier> supplierList) {
        this.supplierList = supplierList;
    }
    
    public Supplier addSupplier(){
        Supplier s = new Supplier();
        supplierList.add(s);
        return s;
    }
    
    public void removeSupplier(Supplier s){
        supplierList.remove(s);
    }
    
    public Supplier searchSupplier(String keyword){
        for (Supplier supplier : supplierList) {
            if(supplier.getSupplierName().equals(keyword)){
                return supplier;
            }
        }
        return null;
    }
}
