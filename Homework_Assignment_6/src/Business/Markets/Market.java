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
public class Market {
    
    private String marketName;
    private MarketOfferCatalog marketOfferCatalog;

    public Market() {
    marketOfferCatalog = new MarketOfferCatalog();
    }
    

    public String getMarketName() {
        return marketName;
    }

    public MarketOfferCatalog getMarketOfferCatalog() {
        return marketOfferCatalog;
    }

    public void setMarketOfferCatalog(MarketOfferCatalog marketOfferCatalog) {
        this.marketOfferCatalog = marketOfferCatalog;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }
    
    @Override
    public String toString(){
    return marketName;
    }
}
