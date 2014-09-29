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
public class Product {
    private int productUPC;
    private double price;
    private String prodDesc;
    private Category category; //optional, enum
    private DiscountStrategy discount;

    public Product(int productUPC, String prodDesc, double price, Category category, DiscountStrategy discount) {
        this.productUPC = productUPC;
        this.prodDesc = prodDesc;
        this.price = price;
        this.category = category;
        this.discount = discount;
    }

    public int getProductUPC() {
        return productUPC;
    }

    public void setProductUPC(int productUPC) {
        this.productUPC = productUPC;
    }

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

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }
    
    public void addDiscount(DiscountStrategy discount){
        
    }
    
    
}
