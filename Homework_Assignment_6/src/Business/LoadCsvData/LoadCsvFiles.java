/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LoadCsvData;

import Business.Business;
import Business.Customers.Customer;
import Business.Markets.Market;
import Business.Markets.MarketOffer;
import Business.SalesPerson.SalesPerson;
import Business.Supplier.Product;
import Business.Supplier.Supplier;
import Business.UserAccounts.UserAccount;
import java.io.File;
import java.io.IOException;
import javafx.scene.control.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

/**
 *
 * @author Varun
 */
public class LoadCsvFiles {
    
    public static Business loadCsv(Business business) throws IOException, BiffException {
        
        try{
        File f = new File("Assignment6_DataSheet1.xls");
        
        Workbook wb = Workbook.getWorkbook(f.getAbsoluteFile());
        
        // Loading the list of Suppliers
        Sheet s = wb.getSheet(0);
        int row= s.getRows();
        
        for (int i=1; i<row; i++){
            Supplier supplier = business.getSupplierDirectory().addSupplier();
                jxl.Cell c= s.getCell(1, i);
                jxl.Cell c1= s.getCell(2, i);
                jxl.Cell c2= s.getCell(3, i);
            supplier.setSupplierName(c.getContents());
                UserAccount user = business.getUserAccountDirectory().addUserAccount();
                user.setUsername(c1.getContents());
                user.setPassword(c2.getContents());
                user.setAccountStatus(true);
                user.setSupplier(supplier);
                user.setCustomer(null);
                user.setSalesPerson(null);
                user.setRole("Supplier");
            
                
        }
        // Loading Markets
        Sheet s2 = wb.getSheet(1);
        int row2= s2.getRows();
        
        for(int j= 1;j<row2;j++){
            jxl.Cell c= s2.getCell(1, j);
            Market market = business.getMarketList().addMarket();
            market.setMarketName(c.getContents());
            System.out.println(market.getMarketName());
            
        }
            
        // Loading each supplier products
        int i =2;
        try{
        
        for(Supplier sup : business.getSupplierDirectory().getSupplierList()){
            Sheet s1 = wb.getSheet(i);
            i++;System.out.println(i);
            int row1= s1.getRows();
            
            for(int j= 2;j<row1;j++){
                
                    jxl.Cell c= s1.getCell(1, j);
                    jxl.Cell c1= s1.getCell(2, j);
                    jxl.Cell c2= s1.getCell(3, j);
                    Product p = sup.getProductCatalog().addProduct();
                    p.setProductName(c.getContents());
                    p.setProductPrice(Double.parseDouble(c1.getContents()));
                    p.setAvailability(Integer.parseInt(c2.getContents()));
                    int l=4;
                    for(Market m : business.getMarketList().getMarketList()){
                        MarketOffer marketOffer = m.getMarketOfferCatalog().addMarketOffer();
                        jxl.Cell c3= s1.getCell(l, j);
                        jxl.Cell c4= s1.getCell(l+1, j);
                        jxl.Cell c5= s1.getCell(l+2, j);
                        marketOffer.setProduct(p);
                        marketOffer.setFloorPrice(Double.parseDouble(c3.getContents()));
                        marketOffer.setTargetPrice(Double.parseDouble(c4.getContents()));
                        marketOffer.setCeilingPrice(Double.parseDouble(c5.getContents()));
                        l+=3;
                        
                    }
                
            }
            

        }
        }catch(NumberFormatException e){
            System.out.println("Numberformat Exception");
        }
        
        // Loading Customers
        for(Market market1: business.getMarketList().getMarketList()){
            Sheet s3 = wb.getSheet(i);
            i++;
            int row1= s3.getRows();
            
            for(int j= 2;j<row1;j++){
                
                    jxl.Cell c= s3.getCell(1, j);
                    jxl.Cell c1= s3.getCell(2, j);
                    jxl.Cell c2= s3.getCell(3, j);
                    Customer customer = business.getCustomerDirectory().addCustomer();
                    customer.setName(c.getContents());
                    customer.setMarket(market1);
                    UserAccount user2 = business.getUserAccountDirectory().addUserAccount();
                    user2.setAccountStatus(true);
                    user2.setCustomer(customer);
                    user2.setSupplier(null);
                    user2.setSalesPerson(null);
                    user2.setUsername(c1.getContents());
                    user2.setPassword(c2.getContents());
                    user2.setRole("Customer");
            
                
            }        
        }
        // Loading Sales Persons
        Sheet s4 = wb.getSheet(14);
        int row3= s4.getRows();
            System.out.println(i);
        for(int j= 1;j<row3;j++){
            jxl.Cell c= s4.getCell(1, j);
            jxl.Cell c1= s4.getCell(2, j);
            jxl.Cell c2= s4.getCell(3, j);
            jxl.Cell c3= s4.getCell(4, j);
            SalesPerson salesPerson = business.getSalesPersonDirectory().addSalesPerson();
            salesPerson.setSalesPerFname(c.getContents());
            salesPerson.setSalesPerLname(c1.getContents());
            UserAccount user1 = business.getUserAccountDirectory().addUserAccount();
                user1.setUsername(c2.getContents());
                user1.setPassword(c3.getContents());
                user1.setAccountStatus(true);
                user1.setSalesPerson(salesPerson);
                user1.setSupplier(null);
                user1.setCustomer(null);
                user1.setRole("SalesPerson");
        }
        
        
     } catch (BiffException e) {
        e.printStackTrace();
        }
        return business;
        }
        
}
