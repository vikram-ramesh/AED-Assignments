/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SalesPerson;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansi
 */
public class SalesPersonDirectory {
    List<SalesPerson> salesPersonList; 
    public  SalesPersonDirectory (){
        salesPersonList = new ArrayList<>();
    }

    public List<SalesPerson> getSalesPersonList() {
        return salesPersonList;
    }

    public void setSalesPersonList(List<SalesPerson> salesPersonList) {
        this.salesPersonList = salesPersonList;
    }
    
    public SalesPerson addSalesPerson(){
        SalesPerson saleP = new SalesPerson();
        salesPersonList.add(saleP);
        
        return saleP;
    }
     public SalesPerson searchSalesPerson(int id){
        for(SalesPerson saleP :salesPersonList  ){
            if(saleP.getSalesPersonId() == id){
                return saleP;
            }
        }
        
        
        return null;
    }
    public void removeSalesPerson(SalesPerson saleP){
        salesPersonList.remove(saleP);
    }
}
