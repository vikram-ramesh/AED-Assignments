/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrderCatalogs;

import Business.Markets.MarketOffer;
import Business.Supplier.Product;

/**
 *
 * @author vikram
 */
public class OrderItem {
    private int quantity;
    private double sellingPrice;
    private MarketOffer marketOffer;

    public MarketOffer getMarketOffer() {
        return marketOffer;
    }

    public void setMarketOffer(MarketOffer marketOffer) {
        this.marketOffer = marketOffer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    
    @Override
    public String toString(){
        return marketOffer.getProduct().getProductName();
    }
}
