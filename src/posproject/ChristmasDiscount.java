
package posproject;
/*
 * Author: Emma Edgar
 * 
 */
public class ChristmasDiscount implements DiscountStrategy{
    private final double DISCOUNT_PERCENTAGE = 0.10;
    
    /*
     * Returns discount percentage
     */
    @Override
    public double getDiscountPercentage(){
        return DISCOUNT_PERCENTAGE;
    }
    
}
