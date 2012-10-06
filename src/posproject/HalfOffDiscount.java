/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posproject;

/**
 *
 * @author eedgar
 */
public class HalfOffDiscount implements DiscountStrategy{
    
    @Override
    public double getDiscountPercentage(){
        return .5;
    }
    
}
