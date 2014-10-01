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
public class ReceiptConsoleOutput {
    
    public void printCustomerInfo(Customer customer){
        System.out.println("Customer: " + customer.getName() + " || Customer ID: " + customer.getCustId());
    }
    public void printLineItems(LineItem[] items){
        
    }
}
