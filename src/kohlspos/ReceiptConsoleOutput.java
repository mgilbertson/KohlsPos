/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kohlspos;
import java.text.DecimalFormat;
/**
 *
 * @author Mitch
 */
public class ReceiptConsoleOutput {
    DecimalFormat df = new DecimalFormat("#.00");
    public void printCustomerInfo(Customer customer){
        System.out.println("Customer: " + customer.getName() + " || Customer ID: " + customer.getCustId());
        System.out.println("----------------------------------------------");
    }
    public void printLineItems(LineItem[] items){
        for (LineItem item : items){
            System.out.println("*** " + item.getProdDesc() + " ||  " + item.getProdId() + " || " 
                    + item.getCategory() + " ||  " + df.format(item.getItemTotal()));
            System.out.println("   ItemPrice: " + df.format(item.getProdPrice()) + " || Quantity: " + item.getQty() 
                    + "  You Save: " + df.format(item.getAmountSaved()));
        }
    }
    
    public void printTotals(double subTotal, double savingsTotal, double grandTotal){
        System.out.println("----------------------------------------------");
        System.out.println("SubTotal: " + df.format(subTotal));
        System.out.println("Tax: " + df.format((grandTotal - subTotal)));
        System.out.println("GrandTotal: $" + df.format(grandTotal));
        System.out.println("You saved: $" + df.format(savingsTotal));
    }
    
    public void printAll(Customer customer, LineItem[] items, double subTotal, double savingsTotal, double grandTotal){
        
        printCustomerInfo(customer);
        printLineItems(items);
        printTotals(subTotal, savingsTotal, grandTotal);
    }
}
