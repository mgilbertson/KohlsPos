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
public class KohlsPos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiscountGroup[] addDiscount = {
                new DiscountStrategy(new FlatRateDiscount()) {};
            };
        
    }
    
}
