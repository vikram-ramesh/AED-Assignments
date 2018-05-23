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
public class Product {
   private String productName;
    private double productPrice;
    private int productModelNumber;
    private int availability;
    
    private static int count =0;
    
    public Product() {
    count++;
    productModelNumber = count;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductModelNumber() {
        return productModelNumber;
    }

    public void setProductModelNumber(int productModelNumber) {
        this.productModelNumber = productModelNumber;
    }
    
        public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
    
    @Override
    public String toString() {
        return productName; //To change body of generated methods, choose Tools | Templates.
    }

    
    

}
