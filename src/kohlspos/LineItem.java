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
    private double itemTotal;
    private double amountSaved;

    public LineItem(Product product, int qty) {
        discountedPrice = product.getDiscount(qty);
        itemTotal = qty * discountedPrice;
        amountSaved = ((product.getPrice()*qty) - itemTotal);
        this.product = product;
        this.qty = qty;
    }
    
    public double getDiscountPrice(){
        return discountedPrice;
    }
    
    public double getProdPrice(){
        return product.getPrice();
    }
    
    public String getProdDesc(){
        return product.getProdDesc();
    }
    
    public String getProdId(){
        return product.getProdId();
    }
    
    public int getQty(){
        return qty;
    }
    
    public Category getCategory(){
        return product.getCategory();
    }

    public double getItemTotal() {
        return itemTotal;
    }

    public double getAmountSaved() {
        return amountSaved;
    }
    
    

}
