/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Statistics;

import Business.Business;
import Business.Markets.Market;
import Business.OrderCatalogs.Order;
import Business.OrderCatalogs.OrderItem;
import Business.SalesPerson.SalesPerson;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mansi
 */
public class StatisticalAnalysis {

    Business business;

    public StatisticalAnalysis(Business business) {
        this.business = business;
    }

    public double calculateTotalRevenue() {
        double totalRevenue = 0;
        for (Order order : business.getMasterOrderCatalog().getOrderList()) {

            totalRevenue += order.getOrderRevenue();

        }

        return totalRevenue;
    }

    public double totalTargetRevenue() {
        double totalTarget = 0.0;
        for (Order order : business.getMasterOrderCatalog().getOrderList()) {
            totalTarget += order.getTargetRevenue();
        }
        return totalTarget;
    }

    public double totalMarketRevenue(Market market) {
        double revenuePerMarket = 0;
        for (Order order : business.getMasterOrderCatalog().getOrderList()) {
            if (order.getCustomer().getMarket().equals(market)) {
                revenuePerMarket += order.getOrderRevenue();
            }

        }

        return revenuePerMarket;
    }

    public double totalTargetMarketRevenue(Market market) {
        double revenuePerMarket = 0;
        for (Order order : business.getMasterOrderCatalog().getOrderList()) {
            if (order.getCustomer().getMarket().equals(market)) {
                revenuePerMarket += order.getTargetRevenue();
            }

        }

        return revenuePerMarket;
    }

    public double topTenSalesPerson(Market market) {
        double revenuePerMarket = 0;
        for (Order order : business.getMasterOrderCatalog().getOrderList()) {
            if (order.getCustomer().getMarket().getMarketName().equals(market.getMarketName())) {
                revenuePerMarket += order.getOrderRevenue();
            }

        }

        return revenuePerMarket;
    }

    public Map<SalesPerson, Double> salesPerCommision(Market market) {
        double commision = 0;
        Map<SalesPerson, Double> map = new HashMap<>();
        for (Order order : business.getMasterOrderCatalog().getOrderList()) {
            if (order.getCustomer().getMarket().equals(market)) {

                if (map.containsKey(order.getSalesPerson())) {
                    double tempComm = map.get(order.getSalesPerson());
                    tempComm += order.getOrderRevenue();
                    map.put(order.getSalesPerson(), tempComm);

                } else {
                    map.put(order.getSalesPerson(), order.getOrderRevenue());
                }

                //  revenuePerMarket += order.totalRevenuePerOrder();
            }

        }

//        Object[] a = map.entrySet().toArray();
//        Arrays.sort(a, new Comparator() {
//            public int compare(Object o1, Object o2) {
//                return ((Map.Entry<String, Double>) o2).getValue()
//                        .compareTo(((Map.Entry<String, Double>) o1).getValue());
//            }
//        });
//        for (Object e : a) {
//            System.out.println(((Map.Entry<String, Integer>) e).getKey() + " : "
//                    + ((Map.Entry<String, Integer>) e).getValue());
//        }

        return map;
    }

//    public Map<SalesPerson, Integer> salesPerCommision() {
//        int commision = 0;
//        Map<SalesPerson, Integer> map = new HashMap<>();
//        for (Order order : business.getMasterOrderCatalog().getOrderList()) {
//            for (SalesPerson person : business.getSalesPersonDirectory().getSalesPersonList()) {
//                if (order.getSalesPerson().equals(person)) {
//                    for (OrderItem oi : order.getOrderItemList()) {
//                        if ((oi.getSellingPrice() * oi.getQuantity()) > (oi.getMarketOffer().getTargetPrice() * oi.getQuantity())) {
//                            commision += (int) (0.05 * (oi.getSellingPrice() * oi.getQuantity()));
//                            int achivedTarget = person.getAbove_target();
//                            person.setAbove_target(achivedTarget++);
//                        } else if ((oi.getSellingPrice() * oi.getQuantity()) < (oi.getMarketOffer().getTargetPrice() * oi.getQuantity())) {
//                            commision += 0;
//                            int belowTarget = person.getBelow_target();
//                            person.setBelow_target(belowTarget++);
//                        }
//                    }
//                    map.put(person, commision);
//                }
//            }
//        }
//
//        return map;
//    }

    public Map<SalesPerson, Integer> salesPersonBelowTotalOrder() {

        Map<SalesPerson, Integer> map = new HashMap<>();
        for (Order order : business.getMasterOrderCatalog().getOrderList()) {
            for (SalesPerson person : business.getSalesPersonDirectory().getSalesPersonList()) {
                if (order.getSalesPerson().equals(person)) {

                    if (order.sellingPricePerorder() < order.totalTargetPricePerorder()) {
                        int price = (int) person.getBelowTOtalOrder();
                        person.setBelowTOtalOrder(++price);
                        map.put(person, person.getBelowTOtalOrder());
                    }
                }

                
            }

        }
        System.out.println("Map for below total order");
        for(Map.Entry<SalesPerson, Integer> element : map.entrySet()){
            System.out.println("Key" + element.getKey() + "Value" + element.getValue());
        }
        return map;
    }
    public Map<SalesPerson, Integer> getSPaboveTargetSales() {

        Map<SalesPerson, Integer> map = new HashMap<>();
        for (Order order : business.getMasterOrderCatalog().getOrderList()) {
            if (order.sellingPricePerorder()> order.totalTargetPricePerorder()) {
                int achivedTarget = order.getSalesPerson().getAbove_target();
                order.getSalesPerson().setAbove_target(++achivedTarget);
            } else {

                int belowTarget = order.getSalesPerson().getBelow_target();
                order.getSalesPerson().setBelow_target(++belowTarget);
            }

            map.put(order.getSalesPerson(), order.getSalesPerson().getAbove_target());

        }
        System.out.println("Map for above total order");
         for(Map.Entry<SalesPerson, Integer> element : map.entrySet()){
            System.out.println("Key" + element.getKey() + "Value" + element.getValue());
        }
        return map;
    }
    public List<OrderItem> topThreeProducts() {
        List<OrderItem> tempList = new ArrayList<OrderItem>();
        for (Order order : business.getMasterOrderCatalog().getOrderList()) {
            for (OrderItem oi : order.getOrderItemList()) {
                if (oi.getSellingPrice() > oi.getMarketOffer().getTargetPrice()) {
                    tempList.add(oi);
                }

            }
        }
        Collections.sort(tempList, new Comparator<OrderItem>() {
            public int compare(OrderItem oi1, OrderItem oi2) {
                return Double.compare(oi2.getSellingPrice(), oi1.getSellingPrice());
            }
        });

        return tempList;
    }

}
