
package posproject;
/*
 * Author: Emma Edgar
 * 
 * The PercentOffDiscount class implements the DiscountStrategy interface.  It
 * holds the discount percentage and returns its value.
 */
public class PercentOffDiscount implements DiscountStrategy{
    private final double DISCOUNT_PERCENTAGE;

    /*
     * Constructor
     */
    public PercentOffDiscount(double DISCOUNT_PERCENTAGE) {
        //needs validation
        this.DISCOUNT_PERCENTAGE = DISCOUNT_PERCENTAGE;
    }
    
    /*
     * Returns discount percentage
     */
    @Override
    public final double getDiscountPercentage(){
        return DISCOUNT_PERCENTAGE;
    }
}
