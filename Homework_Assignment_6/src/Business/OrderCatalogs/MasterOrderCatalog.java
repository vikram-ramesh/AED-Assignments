/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.OrderCatalogs;

import Business.Markets.Market;
import java.util.ArrayList;

/**
 *
 * @author vikram
 */
public class MasterOrderCatalog {

    private ArrayList<Order> orderList;

    public MasterOrderCatalog() {
        orderList = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    }

    public Order addOrder(Order o) {
        orderList.add(o);
        return o;
    }

    public void removeOrder(Order o) {
        orderList.remove(o);
    }

    public double totalRevenueOrderCatalog() {
        double revenuePerOrderInCatalog = 0;
        for (Order order : orderList) {

            revenuePerOrderInCatalog += order.getOrderRevenue();

        }

        return revenuePerOrderInCatalog;
    }
    
    
    
     public double totalRevenueMArketRevenue(Market market) {
        double revenuePerMarket = 0;
        for (Order order : orderList) {
            if (order.getCustomer().getMarket().getMarketName().equals(market.getMarketName())){
                revenuePerMarket += order.getOrderRevenue();
            }
            

        }

        return revenuePerMarket;
    }

}
