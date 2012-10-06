
package posproject;
/*
 * Author: Emma Edgar
 * 
 */
public class HalfOffDiscount implements DiscountStrategy{
    private final double DISCOUNT_PERCENTAGE = 0.5;
    
    /*
     * Returns discount percentage
     */
    @Override
    public double getDiscountPercentage(){
        return DISCOUNT_PERCENTAGE;
    }
    
}
