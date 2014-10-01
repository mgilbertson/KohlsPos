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
public class PercentDiscount implements DiscountStrategy {
    private double discountPercent = .1;
    private double adjustedPrice;

    @Override
    public double getDiscount(double price, int qty) {
        adjustedPrice = price - (price * discountPercent);
        return adjustedPrice;
    }



    
}
