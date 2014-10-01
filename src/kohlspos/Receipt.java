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
public class Receipt {
    private LineItem[] lineItems = new LineItem[0];
    private ReceiptConsoleOutput output;
    private Database db;
    private Customer customer;

    
    public Receipt(String custId, Database db, ReceiptConsoleOutput output){
        customer = db.getCustomerById(custId);
        this.db = db;
        this.output = output;
    }
    
    public void addToLineItems(String prodId, int qty) {
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = new LineItem(db.getProductById(prodId), qty);
        lineItems = tempItems;
    }

    public void output(){
        output.printCustomerInfo(customer);
    }
    
    
}
