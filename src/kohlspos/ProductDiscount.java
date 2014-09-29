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
public class ProductDiscount {
    private DiscountStrategy discountStrategy;
    
    public ProductDiscount(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
    
    
}
