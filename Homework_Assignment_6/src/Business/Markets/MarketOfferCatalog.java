/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Markets;

import Business.Supplier.Product;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mansi
 */
public class MarketOfferCatalog {
    List<MarketOffer> marketOfferList;
    public MarketOfferCatalog(){
        marketOfferList = new ArrayList<MarketOffer>();
    }

    public List<MarketOffer> getMarketOfferList() {
        return marketOfferList;
    }

    public void setMarketOfferList(List<MarketOffer> marketOfferList) {
        this.marketOfferList = marketOfferList;
    }
    
  public MarketOffer addMarketOffer(){
        MarketOffer marketOffer = new MarketOffer();
        marketOfferList.add(marketOffer);
        
        return marketOffer;
    }
     public  MarketOffer searchMarketOffer(MarketOffer mOffer){
        for(MarketOffer mO :marketOfferList  ){
            if(mO.getProduct().getProductModelNumber() == mOffer.getProduct().getProductModelNumber()){
                return mO;
            }
        }
        return null;
    }
    public void removeMarketOffer(MarketOffer mOffer){
        marketOfferList.remove(mOffer);
    }
    
}
