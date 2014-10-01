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
public class FakeDatabase implements DatabaseStrategy{
    
    private Customer[] customers = {
        new Customer("C1001", "John Smith"),
        new Customer("C1002", "Bob Jones ")
    };
    
    private Product[] products = {
        new Product("P1001", "blueJeans ", 30.99, Category.PANTS, new FlatRateDiscount(2)),
        new Product("P1002", "blackJeans", 30.99, Category.PANTS, new NoDiscount()),
        new Product("P1003", "blueShirt ", 25.99, Category.SHIRT, new PercentDiscount(.1)),
        new Product("P1004", "blackShirt", 30.99, Category.SHIRT, new QuantityDiscount(.25, 2)),
    };
    
    private Store[] stores = {
        new Store("S1001", .05),
        new Store("S1002", .1)
    };
    

    @Override
    public Product getProduct(String prodId) {
        for (Product product : products) {
            if (prodId.equals(product.getProdId())) {
                return product;
            }
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public Customer getCustomer(String custId){
        for (Customer customer : customers) {
            if (custId.equals(customer.getCustId())) {
                return customer;
            }
        }
        throw new IllegalArgumentException();
    }
    
    @Override
    public Store getStore(String storeId){
        for (Store store : stores){
            if (storeId.equals(store.getStoreId())){
                return store;
            }
        }
        throw new IllegalArgumentException();
    }
    
    
     
}
