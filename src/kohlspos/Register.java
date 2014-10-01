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
public class Register {
    private Receipt receipt;
    private Store store;
    private double subTotal;
    private double grandTotal;
    

    public final void startNewSale(String custId, Database db, ReceiptConsoleOutput output){
        receipt = new Receipt(custId, db, output);
    }
    
    public final void addItemToSale(String prodId, int qty){
        receipt.addToLineItems(prodId, qty);
    }
    
    public final void endSale(){
        receipt.output();
    }
    
}
