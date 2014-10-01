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
    
    private Customer[] customers = {
        new Customer("C1001", "John Smith"),
        new Customer("C1002", "Bob Jones ")
    };
    
    private Product[] products = {
        new Product("P1001", "blueJeans ", 30.99, Category.PANTS, new FlatRateDiscount()),
        new Product("P1002", "blackJeans", 30.99, Category.PANTS, new NoDiscount()),
        new Product("P1003", "blueShirt ", 25.99, Category.SHIRT, new PercentDiscount()),
        new Product("P1004", "blackShirt", 30.99, Category.SHIRT, new QuantityDiscount()),
    };
    
    private Store[] stores = {
        new Store("S1001", .05),
        new Store("S1002", .1)
    };
    

    public Product getProduct(String prodId) {
        for (Product product : products) {
            if (prodId.equals(product.getProdId())) {
                return product;
            }
        }
        throw new IllegalArgumentException();
    }
    
    public Customer getCustomer(String custId){
        for (Customer customer : customers) {
            if (custId.equals(customer.getCustId())) {
                return customer;
            }
        }
        throw new IllegalArgumentException();
    }
    
    public Store getStore(String storeId){
        for (Store store : stores){
            if (storeId.equals(store.getStoreId())){
                return store;
            }
        }
        throw new IllegalArgumentException();
    }
    
    
     
}
