
package posproject;
/*
 * Author: Emma Edgar
 * 
 * The HalfOffDiscount class implements the DiscountStrategy interface.  It
 * holds the discount percentage and returns its value.
 */
public class HalfOffDiscount implements DiscountStrategy{
    private final double DISCOUNT_PERCENTAGE = 0.5;
    
    /*
     * Returns discount percentage
     */
    @Override
    public final double getDiscountPercentage(){
        return DISCOUNT_PERCENTAGE;
    }
    
}
