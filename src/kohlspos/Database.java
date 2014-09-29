/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlspos;
import java.util.Arrays;
/**
 *
 * @author Mitch
 */
public class Database {
    
    Product[] products = {
                new Product(1001, "blueJeans", 30.99, Category.PANTS, new FlatRateDiscount()),
                new Product(1002, "blackJeans", 30.99, Category.PANTS, new NoDiscount()),
                new Product(1003, "blueShirt", 25.99, Category.SHIRT, new PercentDiscount()),
                new Product(1004, "blueJeans", 30.99, Category.PANTS, new QuantityDiscount()),
            };
    
    public Product getProduct(int prodUpc){
        for(int i=0; i<products.length - 1; i++){
              if (products[i].getProductUPC() == prodUpc){
                return products[i];  
         }
              
        }
        return null;
    } 
}
