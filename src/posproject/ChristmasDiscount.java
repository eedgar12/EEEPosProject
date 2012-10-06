/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package posproject;

/**
 *
 * @author Toshiba laptop
 */
public class ChristmasDiscount implements DiscountStrategy{
    private static final double DISC_PERCENTAGE = 0.10;
    public double getDiscountPercentage(){
        return DISC_PERCENTAGE;
    }
    
}
