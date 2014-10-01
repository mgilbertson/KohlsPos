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
    private int requiredAmount;
    private double discountMultiplier;
    private double adjustedPrice;
    
    public QuantityDiscount(double discountMultiplier, int requiredAmount){
        this.requiredAmount = requiredAmount;
        this.discountMultiplier = discountMultiplier;
    }

    @Override
    public double getDiscount(double price, int qty) {
        if (qty == requiredAmount){
            adjustedPrice = price - (price * discountMultiplier);
        }
        return adjustedPrice;
    }

    
    
}
