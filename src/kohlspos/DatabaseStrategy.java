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
public interface DatabaseStrategy {
    public abstract Product getProduct(String prodId);
    public abstract Customer getCustomer(String custId);
    public abstract Store getStore(String storeId);
}
