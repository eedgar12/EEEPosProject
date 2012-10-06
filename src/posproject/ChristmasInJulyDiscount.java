
package posproject;
/*
 * Author: Emma Edgar
 * 
 */
public class ChristmasInJulyDiscount implements DiscountStrategy{
    private final double DISCOUNT_PERCENTAGE = .12;
    
    /*
     * Returns discount percentage
     */
    @Override
    public double getDiscountPercentage(){
        return DISCOUNT_PERCENTAGE;
    }
    
}
