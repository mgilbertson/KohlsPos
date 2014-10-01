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
public class QuantityDiscount implements DiscountStrategy {
    private int requiredAmount = 2;
    private double discountMultiplier = .25;
    private double adjustedPrice = 0;

    @Override
    public double getDiscount(double price, int qty) {
        if (qty == requiredAmount){
            adjustedPrice = price - (price * discountMultiplier);
        }
        return adjustedPrice;
    }

    
    
}
