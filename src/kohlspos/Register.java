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
    private int qty;
    private String custId;
    private Database db;
    private ReceiptConsoleOutput output;
    private String prodId;
    

    public final void startNewSale(String custId, Database db, ReceiptConsoleOutput output){
        this.custId = custId;
        this.db = db;
        this.output = output;
    }
    
    public final void addItemToSale(String prodId, int qty){
        this.prodId = prodId;
        this.qty = qty;
    }
    
    public final void endSale(){
        
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public Database getDb() {
        return db;
    }

    public void setDb(Database db) {
        this.db = db;
    }

    public ReceiptConsoleOutput getOutput() {
        return output;
    }

    public void setOutput(ReceiptConsoleOutput output) {
        this.output = output;
    }

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }
    
}
