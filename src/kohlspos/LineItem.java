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
public class LineItem {
    private int qty;
    private Product product;
    private double discountedPrice;

    public LineItem(Product product, int qty) {
        this.product = product;
        this.qty = qty;
        this.discountedPrice = product.getPrice() - product.getDiscount(qty);
    }
    public double getDiscount() {
        return product.getDiscount(qty);
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
