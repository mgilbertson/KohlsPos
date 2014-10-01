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
    private Store store;
    public double subTotal;
    public double grandTotal;
    public double savingsTotal;

    
    public Receipt(String custId, String storeId, Database db, ReceiptConsoleOutput output){
        customer = db.getCustomer(custId);
        store = db.getStore(storeId);
        this.db = db;
        this.output = output;
    }
    
    public void addToLineItems(String prodId, int qty) {
        // needs validation
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = new LineItem(db.getProduct(prodId), qty);
        lineItems = tempItems;
    }
    
    public void calculateTotals(){
        for (LineItem lineItem : lineItems) {
            subTotal += lineItem.getItemTotal();
            savingsTotal += lineItem.getAmountSaved();
        }
        
        grandTotal = subTotal + (subTotal * store.getTaxPercent());
    }

    public void outputReceipt(){
        calculateTotals();
        output.printAll(customer, lineItems, subTotal, savingsTotal, grandTotal);
    }
    
    
}
