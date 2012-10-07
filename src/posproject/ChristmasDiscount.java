
package posproject;
/*
 * Author: Emma Edgar
 * 
 * The ChristmasDiscount class implements the DiscountStrategy interface.  It
 * holds the discount percentage and returns its value.
 */
public class ChristmasDiscount implements DiscountStrategy{
    private final double DISCOUNT_PERCENTAGE = 0.10;
    
    /*
     * Returns discount percentage
     */
    @Override
    public final double getDiscountPercentage(){
        return DISCOUNT_PERCENTAGE;
    }
    
}
