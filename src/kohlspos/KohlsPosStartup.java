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
public class KohlsPosStartup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Register register = new Register("S1001");
       
       //start a new sale
       //add items to sale
       //end sale - print receipt
       
       //repeat above for each new sale
       
        register.startNewSale("C1001", new FakeDatabase(), new ReceiptConsoleOutput());
        register.addItemToSale("P1004", 2);
        register.addItemToSale("P1003", 1);
        register.endSale();
        
        register.startNewSale("C1002", new FakeDatabase(), new ReceiptConsoleOutput());
        register.addItemToSale("P1001", 4);
        register.addItemToSale("P1002", 1);
        register.endSale();
        
        
    }
    
}
