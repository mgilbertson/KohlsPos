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
public class FlatRateDiscount implements DiscountStrategy{
    
    private double discountAmount = 2;
    private Product product;
    private double adjustedPrice;


    @Override
    public double getDiscount(double price, int qty) {
        adjustedPrice = price - discountAmount;
        return adjustedPrice;
    }

    
    
    
    
    
}
