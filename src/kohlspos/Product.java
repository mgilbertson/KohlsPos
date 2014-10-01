/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kohlspos;

/**
 * This class represents a simulation of a product in a retail sales
 * organization - responsibilities
 *
 * NOTE: JavaDoc documentation is incomplete. Need to fix!! - warnings
 *
 * @author Mitch, emailAddress(optional)
 * @version 1.00
 */
public class Product {

    private String prodId;
    private double price;
    private String prodDesc;
    private Category category; //optional, enum
    //strategy component (DIP compliant)
    private DiscountStrategy discount;
    private int minProdIdCharacters = 2;

    public Product(String prodId, String prodDesc, double price, Category category, DiscountStrategy discount) {
        this.prodId = prodId;
        this.prodDesc = prodDesc;
        this.price = price;
        this.category = category;
        this.discount = discount;
    }

    public String getProdId() {
        return prodId;
    }
    
    /**
     * Sets the id, which is the unique primary key of this item. this method is not yet validated
     * @param prodId - the unique identifier for this product.
     * @throws IllegalArguementException if productId is null or less than 2 characters
     */
    public final void setProdId(final String prodId) {
        //needs validation
        if(prodId == null || prodId.length() < 2){
            throw new IllegalArgumentException();
        }
        this.prodId = prodId;
    }

    /**
     * Gets the description
     * @return - returns a description
     */
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProdDesc() {
        return prodDesc;
    }

    public void setProdDesc(String prodDesc) {
        this.prodDesc = prodDesc;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public double getDiscount(int qty) {
        return discount.getDiscount(price, qty);
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }

    public void addDiscount(DiscountStrategy discount) {

    }

}
