
package posproject;
/*
 * Author: Emma Edgar
 * 
 * The ChristmasInJulyDiscount class implements the DiscountStrategy interface.  It
 * holds the discount percentage and returns its value.
 */
public class ChristmasInJulyDiscount implements DiscountStrategy{
    private final double DISCOUNT_PERCENTAGE = .12;
    
    /*
     * Returns discount percentage
     */
    @Override
    public final double getDiscountPercentage(){
        return DISCOUNT_PERCENTAGE;
    }
    
}
