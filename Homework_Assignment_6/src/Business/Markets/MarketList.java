/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Markets;

import java.util.ArrayList;

/**
 *
 * @author Varun
 */
public class MarketList {
    private ArrayList<Market> marketList;

    public MarketList() {
    
    marketList = new ArrayList<Market>();
    }

    public ArrayList<Market> getMarketList() {
        return marketList;
    }

    public void setMarketList(ArrayList<Market> marketList) {
        this.marketList = marketList;
    }
    
    public Market addMarket(){
    Market market = new Market();
    marketList.add(market);
    return market;
    
    }
    
    public void removeMarket(Market market){
    marketList.remove(market);
    }
    
    
    }
    
    

