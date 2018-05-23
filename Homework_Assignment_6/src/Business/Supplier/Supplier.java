/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Supplier;

/**
 *
 * @author mansi
 */
public class Supplier {
    private String supplierName;
    private static int count =0;
    private int supplierId;
    private ProductCatalog productCatalog; 
    
    public Supplier() {
    productCatalog = new ProductCatalog();
    count++;
    supplierId = count;
    }
    
    

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public ProductCatalog getProductCatalog() {
        return productCatalog;
    }

    public void setProductCatalog(ProductCatalog productCatalog) {
        this.productCatalog = productCatalog;
    }

    public int getSupplierId() {
        return supplierId;
    }
    
    
    
    @Override
    public String toString() {
        return supplierName; //To change body of generated methods, choose Tools | Templates.
    }
}
