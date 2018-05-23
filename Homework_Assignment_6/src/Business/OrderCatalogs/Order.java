/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrderCatalogs;

import Business.Customers.Customer;
import Business.Markets.Market;
import Business.Markets.MarketOffer;
import Business.Supplier.Product;
import Business.SalesPerson.SalesPerson;
import java.util.ArrayList;

/**
 *
 * @author vikram
 */
public class Order {

    private ArrayList<OrderItem> orderItemList;
    private int orderNumber;

    private String dateStarted;
    private String dateCompleted;
    private Customer customer;
    private SalesPerson salesPerson;
    private static int count = 0;
    private double orderCommission;

    public Order() {
        count++;
        orderNumber = count;
        orderItemList = new ArrayList<OrderItem>();
    }

    public SalesPerson getSalesPerson() {
        return salesPerson;
    }

    public void setSalesPerson(SalesPerson salesPerson) {
        this.salesPerson = salesPerson;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderItem addOrderItem(MarketOffer marketOffer, int q, int price) {
        OrderItem orderItem = new OrderItem();
        orderItem.setMarketOffer(marketOffer);
        orderItem.setQuantity(q);
        orderItem.setSellingPrice(price);
        orderItemList.add(orderItem);
        return orderItem;
    }

    public void removeOrderItem(OrderItem o) {
        orderItemList.remove(o);
    }

    public String getDateStarted() {
        return dateStarted;
    }

    public void setDateStarted(String dateStarted) {
        this.dateStarted = dateStarted;
    }

    public String getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(String dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getOrderRevenue() {
        double orderRevenue = 0;
        for (OrderItem orderItem : orderItemList) {
            orderRevenue += (orderItem.getQuantity() *((orderItem.getSellingPrice())
                    - (orderItem.getMarketOffer().getProduct().getProductPrice())));

        }

        return orderRevenue;
    }
    
    public double getTargetRevenue() {
        double targetRevenue = 0;
        for (OrderItem orderItem : orderItemList) {
            targetRevenue += (orderItem.getQuantity() *((orderItem.getMarketOffer().getTargetPrice())
                    - (orderItem.getMarketOffer().getProduct().getProductPrice())));

        }

        return targetRevenue;
    }
    
    public int sellingPricePerorder() {
        int sellingPricePerorder = 0;
        for (OrderItem orderItem : orderItemList) {
            int totalProQuantity = orderItem.getQuantity();
            sellingPricePerorder += totalProQuantity * (orderItem.getSellingPrice());
                   

        }

        return sellingPricePerorder;
    }
     public int totalTargetPricePerorder() {
        int totalTargetPricePerorder = 0;
        for (OrderItem orderItem : orderItemList) {
            int totalProQuantity = orderItem.getQuantity();
            totalTargetPricePerorder += totalProQuantity * (orderItem.getMarketOffer().getTargetPrice());
                   

        }

        return totalTargetPricePerorder;
    }
     
     
//     public double totalRevenuePerMArket(Market market) {
//        double revenuePerOrder = 0;
//          
//        for (OrderItem orderItem : orderItemList) {
//           
//            int totalProQuantity = orderItem.getQuantity();
//            revenuePerOrder += (totalProQuantity * (orderItem.getSellingPrice()
//                    - orderItem.getMarketOffer().getProduct().getProductPrice()));
//
//        }
//
//        return revenuePerOrder;
//    }

    public double getOrderCommission() {
        return orderCommission;
    }

    public void setOrderCommission(double orderCommission) {
        this.orderCommission = orderCommission;
    }

    @Override
    public String toString(){
    return String.valueOf(orderNumber);
    }
}
