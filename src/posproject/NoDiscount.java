/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posproject;

/**
 *
 * @author eedgar
 */
public class NoDiscount implements DiscountStrategy{
    public double getDiscountPercentage(){
        return 0.00;
    }
}
