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
public class Customer {
    private String name;
    private String custId;

    public Customer(String custId, String name) {
        this.name = name;
        this.custId = custId;
    }
}