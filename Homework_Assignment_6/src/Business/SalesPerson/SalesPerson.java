/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SalesPerson;

import Business.OrderCatalogs.MasterOrderCatalog;

/**
 *
 * @author mansi
 */
public class SalesPerson {
    
    private String SalesPerFname;
    private String SalesPerLname;
    private int salesPersonId;
    private static int count;
    private double totalSalesCommission =0.0;
    private MasterOrderCatalog orderCatalog;
    
    private int above_target;
    private int below_target;
    private int belowTOtalOrder;

    public int getBelowTOtalOrder() {
        return belowTOtalOrder;
    }

    public void setBelowTOtalOrder(int belowTOtalOrder) {
        this.belowTOtalOrder = belowTOtalOrder;
    }

    public int getAbove_target() {
        return above_target;
    }

    public void setAbove_target(int above_target) {
        this.above_target = above_target;
    }

    public int getBelow_target() {
        return below_target;
    }

    public void setBelow_target(int below_target) {
        this.below_target = below_target;
    }
    public SalesPerson(){
        count ++ ;
        salesPersonId = count;
    }

    public int getSalesPersonId() {
        return salesPersonId;
    }

   

    @Override
    public String toString() {
        return SalesPerFname;
    }

    public String getSalesPerFname() {
        return SalesPerFname;
    }

    public void setSalesPerFname(String SalesPerFname) {
        this.SalesPerFname = SalesPerFname;
    }

    public String getSalesPerLname() {
        return SalesPerLname;
    }

    public void setSalesPerLname(String SalesPerLname) {
        this.SalesPerLname = SalesPerLname;
    }

    public MasterOrderCatalog getOrderCatalog() {
        return orderCatalog;
    }

    public void setOrderCatalog(MasterOrderCatalog orderCatalog) {
        this.orderCatalog = orderCatalog;
    }

    public double getTotalSalesCommission() {
        return totalSalesCommission;
    }

    public void setTotalSalesCommission(double totalSalesCommission) {
        this.totalSalesCommission += totalSalesCommission;
    }
    
    
}
