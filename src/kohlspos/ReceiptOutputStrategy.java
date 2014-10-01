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
public interface ReceiptOutputStrategy {
    public abstract void printAll(Customer customer, LineItem[] items, double subTotal, double savingsTotal, double grandTotal);
}
