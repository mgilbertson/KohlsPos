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
    
    Customer[] customers = {
        new Customer("C1001", "John Smith"),
        new Customer("C1002", "Bob Jones")
    };
    
    
    Product[] products = {
                new Product("P1001", "blueJeans", 30.99, Category.PANTS, new FlatRateDiscount()),
                new Product("P1002", "blackJeans", 30.99, Category.PANTS, new NoDiscount()),
                new Product("P1003", "blueShirt", 25.99, Category.SHIRT, new PercentDiscount()),
                new Product("P1004", "blackShirt", 30.99, Category.SHIRT, new QuantityDiscount()),
            };
    
    public Product getProduct(String prodId){
        for(int i=0; i<products.length - 1; i++){
              if (products[i].getProdId().equals(prodId)){
                return products[i];  
         }
              
        }
        return null;
    } 
}
