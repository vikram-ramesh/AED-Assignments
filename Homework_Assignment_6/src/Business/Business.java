/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.SalesPerson.SalesPersonDirectory;
import Business.Customers.CustomerDirectory;
import Business.Markets.MarketList;
import Business.OrderCatalogs.MasterOrderCatalog;
import Business.Supplier.SupplierDirectory;
import Business.UserAccounts.UserAccountDirectory;


/**
 *
 * @author mansi
 */
public class Business {
    private SupplierDirectory supplierDirectory ;
    private UserAccountDirectory userAccountDirectory;
    private CustomerDirectory customerDirectory;
    private SalesPersonDirectory salesPersonDirectory;
    private MasterOrderCatalog masterOrderCatalog;
    private MarketList marketList;

    public MarketList getMarketList() {
        return marketList;
    }

    public void setMarketList(MarketList marketList) {
        this.marketList = marketList;
    }

    public MasterOrderCatalog getMasterOrderCatalog() {
        return masterOrderCatalog;
    }

    public void setMasterOrderCatalog(MasterOrderCatalog masterOrderCatalog) {
        this.masterOrderCatalog = masterOrderCatalog;
    }

    public Business() {
        supplierDirectory = new SupplierDirectory();
        userAccountDirectory = new UserAccountDirectory();
        customerDirectory = new CustomerDirectory();
        salesPersonDirectory = new SalesPersonDirectory();
        masterOrderCatalog = new MasterOrderCatalog();
        marketList = new MarketList();
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public SalesPersonDirectory getSalesPersonDirectory() {
        return salesPersonDirectory;
    }

    public void setSalesPersonDirectory(SalesPersonDirectory salesPersonDirectory) {
        this.salesPersonDirectory = salesPersonDirectory;
    }
      
    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
    
    
    
    
}
