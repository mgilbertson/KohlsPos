/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlspos;

/**
 *
 * @author Mitch
 */
public class Store {
    private String storeId;
    private double taxPercent;

    public Store(String storeId, double taxPercent) {
        this.storeId = storeId;
        this.taxPercent = taxPercent;
    }
    
    public String getStoreId(){
        return storeId;
    }
    
    public double getTaxPercent(){
        return taxPercent;
    }
    
    
}
