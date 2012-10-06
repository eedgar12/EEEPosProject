
package posproject;
/*
 * Author: Emma Edgar
 * 
 */
public class PercentOffDiscount implements DiscountStrategy{
    private final double DISCOUNT_PERCENTAGE;

    /*
     * Constructor
     */
    public PercentOffDiscount(double DISCOUNT_PERCENTAGE) {
        this.DISCOUNT_PERCENTAGE = DISCOUNT_PERCENTAGE;
    }
    
    /*
     * Returns discount percentage
     */
    @Override
    public double getDiscountPercentage(){
        return DISCOUNT_PERCENTAGE;
    }
}
