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
public class NoDiscount implements DiscountStrategy{

    @Override
    public double getDiscount(double price, int qty) {
        return price;
    }



    
}
